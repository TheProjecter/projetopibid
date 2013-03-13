/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Entidade.Alunocolaborador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Marinho
 */
@Stateless
public class AlunocolaboradorFacade extends AbstractFacade<Alunocolaborador> {
    @PersistenceContext(unitName = "outroUFRAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlunocolaboradorFacade() {
        super(Alunocolaborador.class);
    }
    
}
