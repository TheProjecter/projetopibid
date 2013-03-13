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
@Table(name = "professorcolaborador_has_atividade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfessorcolaboradorHasAtividade.findAll", query = "SELECT p FROM ProfessorcolaboradorHasAtividade p"),
    @NamedQuery(name = "ProfessorcolaboradorHasAtividade.findByProfessorColaboradorid", query = "SELECT p FROM ProfessorcolaboradorHasAtividade p WHERE p.professorcolaboradorHasAtividadePK.professorColaboradorid = :professorColaboradorid"),
    @NamedQuery(name = "ProfessorcolaboradorHasAtividade.findByATIVIDADEid", query = "SELECT p FROM ProfessorcolaboradorHasAtividade p WHERE p.professorcolaboradorHasAtividadePK.aTIVIDADEid = :aTIVIDADEid")})
public class ProfessorcolaboradorHasAtividade implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProfessorcolaboradorHasAtividadePK professorcolaboradorHasAtividadePK;
    @JoinColumn(name = "ProfessorColaborador_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Professorcolaborador professorcolaborador;
    @JoinColumn(name = "ATIVIDADE_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Atividade atividade;

    public ProfessorcolaboradorHasAtividade() {
    }

    public ProfessorcolaboradorHasAtividade(ProfessorcolaboradorHasAtividadePK professorcolaboradorHasAtividadePK) {
        this.professorcolaboradorHasAtividadePK = professorcolaboradorHasAtividadePK;
    }

    public ProfessorcolaboradorHasAtividade(int professorColaboradorid, int aTIVIDADEid) {
        this.professorcolaboradorHasAtividadePK = new ProfessorcolaboradorHasAtividadePK(professorColaboradorid, aTIVIDADEid);
    }

    public ProfessorcolaboradorHasAtividadePK getProfessorcolaboradorHasAtividadePK() {
        return professorcolaboradorHasAtividadePK;
    }

    public void setProfessorcolaboradorHasAtividadePK(ProfessorcolaboradorHasAtividadePK professorcolaboradorHasAtividadePK) {
        this.professorcolaboradorHasAtividadePK = professorcolaboradorHasAtividadePK;
    }

    public Professorcolaborador getProfessorcolaborador() {
        return professorcolaborador;
    }

    public void setProfessorcolaborador(Professorcolaborador professorcolaborador) {
        this.professorcolaborador = professorcolaborador;
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
        hash += (professorcolaboradorHasAtividadePK != null ? professorcolaboradorHasAtividadePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfessorcolaboradorHasAtividade)) {
            return false;
        }
        ProfessorcolaboradorHasAtividade other = (ProfessorcolaboradorHasAtividade) object;
        if ((this.professorcolaboradorHasAtividadePK == null && other.professorcolaboradorHasAtividadePK != null) || (this.professorcolaboradorHasAtividadePK != null && !this.professorcolaboradorHasAtividadePK.equals(other.professorcolaboradorHasAtividadePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.ProfessorcolaboradorHasAtividade[ professorcolaboradorHasAtividadePK=" + professorcolaboradorHasAtividadePK + " ]";
    }
    
}
