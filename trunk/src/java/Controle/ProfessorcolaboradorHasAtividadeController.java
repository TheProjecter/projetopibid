package Controle;

import Entidade.ProfessorcolaboradorHasAtividade;
import Controle.util.JsfUtil;
import Controle.util.PaginationHelper;
import Bean.ProfessorcolaboradorHasAtividadeFacade;

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

@ManagedBean(name = "professorcolaboradorHasAtividadeController")
@SessionScoped
public class ProfessorcolaboradorHasAtividadeController implements Serializable {

    private ProfessorcolaboradorHasAtividade current;
    private DataModel items = null;
    @EJB
    private Bean.ProfessorcolaboradorHasAtividadeFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public ProfessorcolaboradorHasAtividadeController() {
    }

    public ProfessorcolaboradorHasAtividade getSelected() {
        if (current == null) {
            current = new ProfessorcolaboradorHasAtividade();
            current.setProfessorcolaboradorHasAtividadePK(new Entidade.ProfessorcolaboradorHasAtividadePK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private ProfessorcolaboradorHasAtividadeFacade getFacade() {
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
        current = (ProfessorcolaboradorHasAtividade) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new ProfessorcolaboradorHasAtividade();
        current.setProfessorcolaboradorHasAtividadePK(new Entidade.ProfessorcolaboradorHasAtividadePK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ProfessorcolaboradorHasAtividadeCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (ProfessorcolaboradorHasAtividade) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ProfessorcolaboradorHasAtividadeUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (ProfessorcolaboradorHasAtividade) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ProfessorcolaboradorHasAtividadeDeleted"));
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

    @FacesConverter(forClass = ProfessorcolaboradorHasAtividade.class)
    public static class ProfessorcolaboradorHasAtividadeControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ProfessorcolaboradorHasAtividadeController controller = (ProfessorcolaboradorHasAtividadeController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "professorcolaboradorHasAtividadeController");
            return controller.ejbFacade.find(getKey(value));
        }

        Entidade.ProfessorcolaboradorHasAtividadePK getKey(String value) {
            Entidade.ProfessorcolaboradorHasAtividadePK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new Entidade.ProfessorcolaboradorHasAtividadePK();
            key.setProfessorColaboradorid(Integer.parseInt(values[0]));
            key.setATIVIDADEid(Integer.parseInt(values[1]));
            return key;
        }

        String getStringKey(Entidade.ProfessorcolaboradorHasAtividadePK value) {
            StringBuffer sb = new StringBuffer();
            sb.append(value.getProfessorColaboradorid());
            sb.append(SEPARATOR);
            sb.append(value.getATIVIDADEid());
            return sb.toString();
        }

        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof ProfessorcolaboradorHasAtividade) {
                ProfessorcolaboradorHasAtividade o = (ProfessorcolaboradorHasAtividade) object;
                return getStringKey(o.getProfessorcolaboradorHasAtividadePK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + ProfessorcolaboradorHasAtividade.class.getName());
            }
        }
    }
}
