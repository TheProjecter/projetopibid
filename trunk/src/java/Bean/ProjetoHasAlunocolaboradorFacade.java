/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Entidade.ProjetoHasAlunocolaborador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Marinho
 */
@Stateless
public class ProjetoHasAlunocolaboradorFacade extends AbstractFacade<ProjetoHasAlunocolaborador> {
    @PersistenceContext(unitName = "outroUFRAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProjetoHasAlunocolaboradorFacade() {
        super(ProjetoHasAlunocolaborador.class);
    }
    
}
