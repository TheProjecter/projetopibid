/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jp
 */
@Entity
@Table(name = "tiposituacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposituacao.findAll", query = "SELECT t FROM Tiposituacao t"),
    @NamedQuery(name = "Tiposituacao.findById", query = "SELECT t FROM Tiposituacao t WHERE t.id = :id"),
    @NamedQuery(name = "Tiposituacao.findBySituacao", query = "SELECT t FROM Tiposituacao t WHERE t.situacao = :situacao")})
public class Tiposituacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "situacao")
    private String situacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSituacaoid")
    private Collection<Bolsista> bolsistaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSituacaoid")
    private Collection<Projeto> projetoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSituacaoid")
    private Collection<Supervisor> supervisorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSituacaoid")
    private Collection<Professorcolaborador> professorcolaboradorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSituacaoid")
    private Collection<Escola> escolaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSituacaoid")
    private Collection<Tarefa> tarefaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoSituacaoid")
    private Collection<Alunocolaborador> alunocolaboradorCollection;

    public Tiposituacao() {
    }

    public Tiposituacao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @XmlTransient
    public Collection<Bolsista> getBolsistaCollection() {
        return bolsistaCollection;
    }

    public void setBolsistaCollection(Collection<Bolsista> bolsistaCollection) {
        this.bolsistaCollection = bolsistaCollection;
    }

    @XmlTransient
    public Collection<Projeto> getProjetoCollection() {
        return projetoCollection;
    }

    public void setProjetoCollection(Collection<Projeto> projetoCollection) {
        this.projetoCollection = projetoCollection;
    }

    @XmlTransient
    public Collection<Supervisor> getSupervisorCollection() {
        return supervisorCollection;
    }

    public void setSupervisorCollection(Collection<Supervisor> supervisorCollection) {
        this.supervisorCollection = supervisorCollection;
    }

    @XmlTransient
    public Collection<Professorcolaborador> getProfessorcolaboradorCollection() {
        return professorcolaboradorCollection;
    }

    public void setProfessorcolaboradorCollection(Collection<Professorcolaborador> professorcolaboradorCollection) {
        this.professorcolaboradorCollection = professorcolaboradorCollection;
    }

    @XmlTransient
    public Collection<Escola> getEscolaCollection() {
        return escolaCollection;
    }

    public void setEscolaCollection(Collection<Escola> escolaCollection) {
        this.escolaCollection = escolaCollection;
    }

    @XmlTransient
    public Collection<Tarefa> getTarefaCollection() {
        return tarefaCollection;
    }

    public void setTarefaCollection(Collection<Tarefa> tarefaCollection) {
        this.tarefaCollection = tarefaCollection;
    }

    @XmlTransient
    public Collection<Alunocolaborador> getAlunocolaboradorCollection() {
        return alunocolaboradorCollection;
    }

    public void setAlunocolaboradorCollection(Collection<Alunocolaborador> alunocolaboradorCollection) {
        this.alunocolaboradorCollection = alunocolaboradorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposituacao)) {
            return false;
        }
        Tiposituacao other = (Tiposituacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Tiposituacao[ id=" + id + " ]";
    }
    
}
