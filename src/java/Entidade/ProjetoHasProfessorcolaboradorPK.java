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
public class ProjetoHasProfessorcolaboradorPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROJETO_id")
    private int pROJETOid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProfessorColaborador_id")
    private int professorColaboradorid;

    public ProjetoHasProfessorcolaboradorPK() {
    }

    public ProjetoHasProfessorcolaboradorPK(int pROJETOid, int professorColaboradorid) {
        this.pROJETOid = pROJETOid;
        this.professorColaboradorid = professorColaboradorid;
    }

    public int getPROJETOid() {
        return pROJETOid;
    }

    public void setPROJETOid(int pROJETOid) {
        this.pROJETOid = pROJETOid;
    }

    public int getProfessorColaboradorid() {
        return professorColaboradorid;
    }

    public void setProfessorColaboradorid(int professorColaboradorid) {
        this.professorColaboradorid = professorColaboradorid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pROJETOid;
        hash += (int) professorColaboradorid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjetoHasProfessorcolaboradorPK)) {
            return false;
        }
        ProjetoHasProfessorcolaboradorPK other = (ProjetoHasProfessorcolaboradorPK) object;
        if (this.pROJETOid != other.pROJETOid) {
            return false;
        }
        if (this.professorColaboradorid != other.professorColaboradorid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.ProjetoHasProfessorcolaboradorPK[ pROJETOid=" + pROJETOid + ", professorColaboradorid=" + professorColaboradorid + " ]";
    }
    
}
