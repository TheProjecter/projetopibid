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
public class ProjetoHasAlunocolaboradorPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROJETO_id")
    private int pROJETOid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AlunoColaborador_id")
    private int alunoColaboradorid;

    public ProjetoHasAlunocolaboradorPK() {
    }

    public ProjetoHasAlunocolaboradorPK(int pROJETOid, int alunoColaboradorid) {
        this.pROJETOid = pROJETOid;
        this.alunoColaboradorid = alunoColaboradorid;
    }

    public int getPROJETOid() {
        return pROJETOid;
    }

    public void setPROJETOid(int pROJETOid) {
        this.pROJETOid = pROJETOid;
    }

    public int getAlunoColaboradorid() {
        return alunoColaboradorid;
    }

    public void setAlunoColaboradorid(int alunoColaboradorid) {
        this.alunoColaboradorid = alunoColaboradorid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pROJETOid;
        hash += (int) alunoColaboradorid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjetoHasAlunocolaboradorPK)) {
            return false;
        }
        ProjetoHasAlunocolaboradorPK other = (ProjetoHasAlunocolaboradorPK) object;
        if (this.pROJETOid != other.pROJETOid) {
            return false;
        }
        if (this.alunoColaboradorid != other.alunoColaboradorid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.ProjetoHasAlunocolaboradorPK[ pROJETOid=" + pROJETOid + ", alunoColaboradorid=" + alunoColaboradorid + " ]";
    }
    
}
