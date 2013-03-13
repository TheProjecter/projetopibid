/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Entidade.AlunocolaboradorHasAtividade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Marinho
 */
@Stateless
public class AlunocolaboradorHasAtividadeFacade extends AbstractFacade<AlunocolaboradorHasAtividade> {
    @PersistenceContext(unitName = "outroUFRAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlunocolaboradorHasAtividadeFacade() {
        super(AlunocolaboradorHasAtividade.class);
    }
    
}
