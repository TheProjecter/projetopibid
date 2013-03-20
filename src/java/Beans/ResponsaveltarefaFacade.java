/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entidade.Responsaveltarefa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jp
 */
@Stateless
public class ResponsaveltarefaFacade extends AbstractFacade<Responsaveltarefa> {
    @PersistenceContext(unitName = "TestePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResponsaveltarefaFacade() {
        super(Responsaveltarefa.class);
    }
    
}
