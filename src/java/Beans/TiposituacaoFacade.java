/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entidade.Tiposituacao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jp
 */
@Stateless
public class TiposituacaoFacade extends AbstractFacade<Tiposituacao> {
    @PersistenceContext(unitName = "TestePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TiposituacaoFacade() {
        super(Tiposituacao.class);
    }
    
}
