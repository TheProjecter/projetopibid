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
@Table(name = "alunocolaborador_has_atividade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlunocolaboradorHasAtividade.findAll", query = "SELECT a FROM AlunocolaboradorHasAtividade a"),
    @NamedQuery(name = "AlunocolaboradorHasAtividade.findByAlunoColaboradorid", query = "SELECT a FROM AlunocolaboradorHasAtividade a WHERE a.alunocolaboradorHasAtividadePK.alunoColaboradorid = :alunoColaboradorid"),
    @NamedQuery(name = "AlunocolaboradorHasAtividade.findByATIVIDADEid", query = "SELECT a FROM AlunocolaboradorHasAtividade a WHERE a.alunocolaboradorHasAtividadePK.aTIVIDADEid = :aTIVIDADEid")})
public class AlunocolaboradorHasAtividade implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AlunocolaboradorHasAtividadePK alunocolaboradorHasAtividadePK;
    @JoinColumn(name = "ATIVIDADE_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Atividade atividade;
    @JoinColumn(name = "AlunoColaborador_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alunocolaborador alunocolaborador;

    public AlunocolaboradorHasAtividade() {
    }

    public AlunocolaboradorHasAtividade(AlunocolaboradorHasAtividadePK alunocolaboradorHasAtividadePK) {
        this.alunocolaboradorHasAtividadePK = alunocolaboradorHasAtividadePK;
    }

    public AlunocolaboradorHasAtividade(int alunoColaboradorid, int aTIVIDADEid) {
        this.alunocolaboradorHasAtividadePK = new AlunocolaboradorHasAtividadePK(alunoColaboradorid, aTIVIDADEid);
    }

    public AlunocolaboradorHasAtividadePK getAlunocolaboradorHasAtividadePK() {
        return alunocolaboradorHasAtividadePK;
    }

    public void setAlunocolaboradorHasAtividadePK(AlunocolaboradorHasAtividadePK alunocolaboradorHasAtividadePK) {
        this.alunocolaboradorHasAtividadePK = alunocolaboradorHasAtividadePK;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Alunocolaborador getAlunocolaborador() {
        return alunocolaborador;
    }

    public void setAlunocolaborador(Alunocolaborador alunocolaborador) {
        this.alunocolaborador = alunocolaborador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alunocolaboradorHasAtividadePK != null ? alunocolaboradorHasAtividadePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlunocolaboradorHasAtividade)) {
            return false;
        }
        AlunocolaboradorHasAtividade other = (AlunocolaboradorHasAtividade) object;
        if ((this.alunocolaboradorHasAtividadePK == null && other.alunocolaboradorHasAtividadePK != null) || (this.alunocolaboradorHasAtividadePK != null && !this.alunocolaboradorHasAtividadePK.equals(other.alunocolaboradorHasAtividadePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.AlunocolaboradorHasAtividade[ alunocolaboradorHasAtividadePK=" + alunocolaboradorHasAtividadePK + " ]";
    }
    
}
