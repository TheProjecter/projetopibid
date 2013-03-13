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
public class ProfessorcolaboradorHasAtividadePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProfessorColaborador_id")
    private int professorColaboradorid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ATIVIDADE_id")
    private int aTIVIDADEid;

    public ProfessorcolaboradorHasAtividadePK() {
    }

    public ProfessorcolaboradorHasAtividadePK(int professorColaboradorid, int aTIVIDADEid) {
        this.professorColaboradorid = professorColaboradorid;
        this.aTIVIDADEid = aTIVIDADEid;
    }

    public int getProfessorColaboradorid() {
        return professorColaboradorid;
    }

    public void setProfessorColaboradorid(int professorColaboradorid) {
        this.professorColaboradorid = professorColaboradorid;
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
        hash += (int) professorColaboradorid;
        hash += (int) aTIVIDADEid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfessorcolaboradorHasAtividadePK)) {
            return false;
        }
        ProfessorcolaboradorHasAtividadePK other = (ProfessorcolaboradorHasAtividadePK) object;
        if (this.professorColaboradorid != other.professorColaboradorid) {
            return false;
        }
        if (this.aTIVIDADEid != other.aTIVIDADEid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.ProfessorcolaboradorHasAtividadePK[ professorColaboradorid=" + professorColaboradorid + ", aTIVIDADEid=" + aTIVIDADEid + " ]";
    }
    
}
