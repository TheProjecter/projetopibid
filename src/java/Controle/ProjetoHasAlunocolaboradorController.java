package Controle;

import Entidade.ProjetoHasAlunocolaborador;
import Controle.util.JsfUtil;
import Controle.util.PaginationHelper;
import Bean.ProjetoHasAlunocolaboradorFacade;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

@ManagedBean(name = "projetoHasAlunocolaboradorController")
@SessionScoped
public class ProjetoHasAlunocolaboradorController implements Serializable {

    private ProjetoHasAlunocolaborador current;
    private DataModel items = null;
    @EJB
    private Bean.ProjetoHasAlunocolaboradorFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public ProjetoHasAlunocolaboradorController() {
    }

    public ProjetoHasAlunocolaborador getSelected() {
        if (current == null) {
            current = new ProjetoHasAlunocolaborador();
            current.setProjetoHasAlunocolaboradorPK(new Entidade.ProjetoHasAlunocolaboradorPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private ProjetoHasAlunocolaboradorFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {
                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (ProjetoHasAlunocolaborador) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new ProjetoHasAlunocolaborador();
        current.setProjetoHasAlunocolaboradorPK(new Entidade.ProjetoHasAlunocolaboradorPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ProjetoHasAlunocolaboradorCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (ProjetoHasAlunocolaborador) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ProjetoHasAlunocolaboradorUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (ProjetoHasAlunocolaborador) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ProjetoHasAlunocolaboradorDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    @FacesConverter(forClass = ProjetoHasAlunocolaborador.class)
    public static class ProjetoHasAlunocolaboradorControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ProjetoHasAlunocolaboradorController controller = (ProjetoHasAlunocolaboradorController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "projetoHasAlunocolaboradorController");
            return controller.ejbFacade.find(getKey(value));
        }

        Entidade.ProjetoHasAlunocolaboradorPK getKey(String value) {
            Entidade.ProjetoHasAlunocolaboradorPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new Entidade.ProjetoHasAlunocolaboradorPK();
            key.setPROJETOid(Integer.parseInt(values[0]));
            key.setAlunoColaboradorid(Integer.parseInt(values[1]));
            return key;
        }

        String getStringKey(Entidade.ProjetoHasAlunocolaboradorPK value) {
            StringBuffer sb = new StringBuffer();
            sb.append(value.getPROJETOid());
            sb.append(SEPARATOR);
            sb.append(value.getAlunoColaboradorid());
            return sb.toString();
        }

        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof ProjetoHasAlunocolaborador) {
                ProjetoHasAlunocolaborador o = (ProjetoHasAlunocolaborador) object;
                return getStringKey(o.getProjetoHasAlunocolaboradorPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + ProjetoHasAlunocolaborador.class.getName());
            }
        }
    }
}
