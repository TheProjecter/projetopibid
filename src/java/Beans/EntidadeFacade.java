/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entidade.Entidade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jp
 */
@Stateless
public class EntidadeFacade extends AbstractFacade<Entidade> {
    @PersistenceContext(unitName = "TestePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntidadeFacade() {
        super(Entidade.class);
    }
    
}
