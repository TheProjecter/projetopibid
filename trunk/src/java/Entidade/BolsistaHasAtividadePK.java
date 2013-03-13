/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Marinho
 */
@Embeddable
public class BolsistaHasAtividadePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "BOLSISTA_id")
    private int bOLSISTAid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ATIVIDADE_id")
    private int aTIVIDADEid;

    public BolsistaHasAtividadePK() {
    }

    public BolsistaHasAtividadePK(int bOLSISTAid, int aTIVIDADEid) {
        this.bOLSISTAid = bOLSISTAid;
        this.aTIVIDADEid = aTIVIDADEid;
    }

    public int getBOLSISTAid() {
        return bOLSISTAid;
    }

    public void setBOLSISTAid(int bOLSISTAid) {
        this.bOLSISTAid = bOLSISTAid;
    }

    public int getATIVIDADEid() {
        return aTIVIDADEid;
    }

    public void setATIVIDADEid(int aTIVIDADEid) {
        this.aTIVIDADEid = aTIVIDADEid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) bOLSISTAid;
        hash += (int) aTIVIDADEid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BolsistaHasAtividadePK)) {
            return false;
        }
        BolsistaHasAtividadePK other = (BolsistaHasAtividadePK) object;
        if (this.bOLSISTAid != other.bOLSISTAid) {
            return false;
        }
        if (this.aTIVIDADEid != other.aTIVIDADEid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.BolsistaHasAtividadePK[ bOLSISTAid=" + bOLSISTAid + ", aTIVIDADEid=" + aTIVIDADEid + " ]";
    }
    
}
