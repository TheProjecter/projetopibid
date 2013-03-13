/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Entidade.Escola;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Marinho
 */
@Stateless
public class EscolaFacade extends AbstractFacade<Escola> {
    @PersistenceContext(unitName = "outroUFRAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EscolaFacade() {
        super(Escola.class);
    }
    
}
