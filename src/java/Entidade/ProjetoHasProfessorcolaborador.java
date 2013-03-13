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
@Table(name = "projeto_has_professorcolaborador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjetoHasProfessorcolaborador.findAll", query = "SELECT p FROM ProjetoHasProfessorcolaborador p"),
    @NamedQuery(name = "ProjetoHasProfessorcolaborador.findByPROJETOid", query = "SELECT p FROM ProjetoHasProfessorcolaborador p WHERE p.projetoHasProfessorcolaboradorPK.pROJETOid = :pROJETOid"),
    @NamedQuery(name = "ProjetoHasProfessorcolaborador.findByProfessorColaboradorid", query = "SELECT p FROM ProjetoHasProfessorcolaborador p WHERE p.projetoHasProfessorcolaboradorPK.professorColaboradorid = :professorColaboradorid")})
public class ProjetoHasProfessorcolaborador implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProjetoHasProfessorcolaboradorPK projetoHasProfessorcolaboradorPK;
    @JoinColumn(name = "PROJETO_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Projeto projeto;
    @JoinColumn(name = "ProfessorColaborador_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Professorcolaborador professorcolaborador;

    public ProjetoHasProfessorcolaborador() {
    }

    public ProjetoHasProfessorcolaborador(ProjetoHasProfessorcolaboradorPK projetoHasProfessorcolaboradorPK) {
        this.projetoHasProfessorcolaboradorPK = projetoHasProfessorcolaboradorPK;
    }

    public ProjetoHasProfessorcolaborador(int pROJETOid, int professorColaboradorid) {
        this.projetoHasProfessorcolaboradorPK = new ProjetoHasProfessorcolaboradorPK(pROJETOid, professorColaboradorid);
    }

    public ProjetoHasProfessorcolaboradorPK getProjetoHasProfessorcolaboradorPK() {
        return projetoHasProfessorcolaboradorPK;
    }

    public void setProjetoHasProfessorcolaboradorPK(ProjetoHasProfessorcolaboradorPK projetoHasProfessorcolaboradorPK) {
        this.projetoHasProfessorcolaboradorPK = projetoHasProfessorcolaboradorPK;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Professorcolaborador getProfessorcolaborador() {
        return professorcolaborador;
    }

    public void setProfessorcolaborador(Professorcolaborador professorcolaborador) {
        this.professorcolaborador = professorcolaborador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projetoHasProfessorcolaboradorPK != null ? projetoHasProfessorcolaboradorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjetoHasProfessorcolaborador)) {
            return false;
        }
        ProjetoHasProfessorcolaborador other = (ProjetoHasProfessorcolaborador) object;
        if ((this.projetoHasProfessorcolaboradorPK == null && other.projetoHasProfessorcolaboradorPK != null) || (this.projetoHasProfessorcolaboradorPK != null && !this.projetoHasProfessorcolaboradorPK.equals(other.projetoHasProfessorcolaboradorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.ProjetoHasProfessorcolaborador[ projetoHasProfessorcolaboradorPK=" + projetoHasProfessorcolaboradorPK + " ]";
    }
    
}
