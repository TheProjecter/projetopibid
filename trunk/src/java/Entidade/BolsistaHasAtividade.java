/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marinho
 */
@Entity
@Table(name = "bolsista_has_atividade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BolsistaHasAtividade.findAll", query = "SELECT b FROM BolsistaHasAtividade b"),
    @NamedQuery(name = "BolsistaHasAtividade.findByBOLSISTAid", query = "SELECT b FROM BolsistaHasAtividade b WHERE b.bolsistaHasAtividadePK.bOLSISTAid = :bOLSISTAid"),
    @NamedQuery(name = "BolsistaHasAtividade.findByATIVIDADEid", query = "SELECT b FROM BolsistaHasAtividade b WHERE b.bolsistaHasAtividadePK.aTIVIDADEid = :aTIVIDADEid")})
public class BolsistaHasAtividade implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BolsistaHasAtividadePK bolsistaHasAtividadePK;
    @JoinColumn(name = "BOLSISTA_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Bolsista bolsista;
    @JoinColumn(name = "ATIVIDADE_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Atividade atividade;

    public BolsistaHasAtividade() {
    }

    public BolsistaHasAtividade(BolsistaHasAtividadePK bolsistaHasAtividadePK) {
        this.bolsistaHasAtividadePK = bolsistaHasAtividadePK;
    }

    public BolsistaHasAtividade(int bOLSISTAid, int aTIVIDADEid) {
        this.bolsistaHasAtividadePK = new BolsistaHasAtividadePK(bOLSISTAid, aTIVIDADEid);
    }

    public BolsistaHasAtividadePK getBolsistaHasAtividadePK() {
        return bolsistaHasAtividadePK;
    }

    public void setBolsistaHasAtividadePK(BolsistaHasAtividadePK bolsistaHasAtividadePK) {
        this.bolsistaHasAtividadePK = bolsistaHasAtividadePK;
    }

    public Bolsista getBolsista() {
        return bolsista;
    }

    public void setBolsista(Bolsista bolsista) {
        this.bolsista = bolsista;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bolsistaHasAtividadePK != null ? bolsistaHasAtividadePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BolsistaHasAtividade)) {
            return false;
        }
        BolsistaHasAtividade other = (BolsistaHasAtividade) object;
        if ((this.bolsistaHasAtividadePK == null && other.bolsistaHasAtividadePK != null) || (this.bolsistaHasAtividadePK != null && !this.bolsistaHasAtividadePK.equals(other.bolsistaHasAtividadePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.BolsistaHasAtividade[ bolsistaHasAtividadePK=" + bolsistaHasAtividadePK + " ]";
    }
    
}
