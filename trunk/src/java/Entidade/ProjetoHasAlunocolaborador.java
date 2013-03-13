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
@Table(name = "projeto_has_alunocolaborador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjetoHasAlunocolaborador.findAll", query = "SELECT p FROM ProjetoHasAlunocolaborador p"),
    @NamedQuery(name = "ProjetoHasAlunocolaborador.findByPROJETOid", query = "SELECT p FROM ProjetoHasAlunocolaborador p WHERE p.projetoHasAlunocolaboradorPK.pROJETOid = :pROJETOid"),
    @NamedQuery(name = "ProjetoHasAlunocolaborador.findByAlunoColaboradorid", query = "SELECT p FROM ProjetoHasAlunocolaborador p WHERE p.projetoHasAlunocolaboradorPK.alunoColaboradorid = :alunoColaboradorid")})
public class ProjetoHasAlunocolaborador implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProjetoHasAlunocolaboradorPK projetoHasAlunocolaboradorPK;
    @JoinColumn(name = "PROJETO_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Projeto projeto;
    @JoinColumn(name = "AlunoColaborador_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alunocolaborador alunocolaborador;

    public ProjetoHasAlunocolaborador() {
    }

    public ProjetoHasAlunocolaborador(ProjetoHasAlunocolaboradorPK projetoHasAlunocolaboradorPK) {
        this.projetoHasAlunocolaboradorPK = projetoHasAlunocolaboradorPK;
    }

    public ProjetoHasAlunocolaborador(int pROJETOid, int alunoColaboradorid) {
        this.projetoHasAlunocolaboradorPK = new ProjetoHasAlunocolaboradorPK(pROJETOid, alunoColaboradorid);
    }

    public ProjetoHasAlunocolaboradorPK getProjetoHasAlunocolaboradorPK() {
        return projetoHasAlunocolaboradorPK;
    }

    public void setProjetoHasAlunocolaboradorPK(ProjetoHasAlunocolaboradorPK projetoHasAlunocolaboradorPK) {
        this.projetoHasAlunocolaboradorPK = projetoHasAlunocolaboradorPK;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
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
        hash += (projetoHasAlunocolaboradorPK != null ? projetoHasAlunocolaboradorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjetoHasAlunocolaborador)) {
            return false;
        }
        ProjetoHasAlunocolaborador other = (ProjetoHasAlunocolaborador) object;
        if ((this.projetoHasAlunocolaboradorPK == null && other.projetoHasAlunocolaboradorPK != null) || (this.projetoHasAlunocolaboradorPK != null && !this.projetoHasAlunocolaboradorPK.equals(other.projetoHasAlunocolaboradorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.ProjetoHasAlunocolaborador[ projetoHasAlunocolaboradorPK=" + projetoHasAlunocolaboradorPK + " ]";
    }
    
}
