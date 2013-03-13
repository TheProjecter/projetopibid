/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Entidade.Entidade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Marinho
 */
@Stateless
public class EntidadeFacade extends AbstractFacade<Entidade> {
    @PersistenceContext(unitName = "outroUFRAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntidadeFacade() {
        super(Entidade.class);
    }
    
}
