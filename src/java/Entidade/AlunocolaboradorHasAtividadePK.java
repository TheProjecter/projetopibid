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
public class AlunocolaboradorHasAtividadePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "AlunoColaborador_id")
    private int alunoColaboradorid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ATIVIDADE_id")
    private int aTIVIDADEid;

    public AlunocolaboradorHasAtividadePK() {
    }

    public AlunocolaboradorHasAtividadePK(int alunoColaboradorid, int aTIVIDADEid) {
        this.alunoColaboradorid = alunoColaboradorid;
        this.aTIVIDADEid = aTIVIDADEid;
    }

    public int getAlunoColaboradorid() {
        return alunoColaboradorid;
    }

    public void setAlunoColaboradorid(int alunoColaboradorid) {
        this.alunoColaboradorid = alunoColaboradorid;
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
        hash += (int) alunoColaboradorid;
        hash += (int) aTIVIDADEid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlunocolaboradorHasAtividadePK)) {
            return false;
        }
        AlunocolaboradorHasAtividadePK other = (AlunocolaboradorHasAtividadePK) object;
        if (this.alunoColaboradorid != other.alunoColaboradorid) {
            return false;
        }
        if (this.aTIVIDADEid != other.aTIVIDADEid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.AlunocolaboradorHasAtividadePK[ alunoColaboradorid=" + alunoColaboradorid + ", aTIVIDADEid=" + aTIVIDADEid + " ]";
    }
    
}
