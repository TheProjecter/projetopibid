/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entidade.Sequence;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jp
 */
@Stateless
public class SequenceFacade extends AbstractFacade<Sequence> {
    @PersistenceContext(unitName = "TestePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SequenceFacade() {
        super(Sequence.class);
    }
    
}
