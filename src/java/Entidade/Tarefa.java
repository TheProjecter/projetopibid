/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jp
 */
@Entity
@Table(name = "tarefa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarefa.findAll", query = "SELECT t FROM Tarefa t"),
    @NamedQuery(name = "Tarefa.findById", query = "SELECT t FROM Tarefa t WHERE t.id = :id"),
    @NamedQuery(name = "Tarefa.findByTitulo", query = "SELECT t FROM Tarefa t WHERE t.titulo = :titulo"),
    @NamedQuery(name = "Tarefa.findByDescricao", query = "SELECT t FROM Tarefa t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "Tarefa.findByDataCadastro", query = "SELECT t FROM Tarefa t WHERE t.dataCadastro = :dataCadastro"),
    @NamedQuery(name = "Tarefa.findByDataPrevisaoInicio", query = "SELECT t FROM Tarefa t WHERE t.dataPrevisaoInicio = :dataPrevisaoInicio"),
    @NamedQuery(name = "Tarefa.findByDataPrecisaoConclusao", query = "SELECT t FROM Tarefa t WHERE t.dataPrecisaoConclusao = :dataPrecisaoConclusao"),
    @NamedQuery(name = "Tarefa.findByDataEfetivaConclusao", query = "SELECT t FROM Tarefa t WHERE t.dataEfetivaConclusao = :dataEfetivaConclusao"),
    @NamedQuery(name = "Tarefa.findByResponsavel", query = "SELECT t FROM Tarefa t WHERE t.responsavel = :responsavel"),
    @NamedQuery(name = "Tarefa.findByObservacao", query = "SELECT t FROM Tarefa t WHERE t.observacao = :observacao")})
public class Tarefa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 45)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 45)
    @Column(name = "dataCadastro")
    private String dataCadastro;
    @Size(max = 45)
    @Column(name = "DataPrevisaoInicio")
    private String dataPrevisaoInicio;
    @Size(max = 45)
    @Column(name = "DataPrecisaoConclusao")
    private String dataPrecisaoConclusao;
    @Size(max = 45)
    @Column(name = "DataEfetivaConclusao")
    private String dataEfetivaConclusao;
    @Size(max = 45)
    @Column(name = "Responsavel")
    private String responsavel;
    @Size(max = 45)
    @Column(name = "observacao")
    private String observacao;
    @JoinTable(name = "tarefa_professorcolaborador", joinColumns = {
        @JoinColumn(name = "tarefa_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "professorcolaborador_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Professorcolaborador> professorcolaboradorCollection;
    @ManyToMany(mappedBy = "tarefaCollection")
    private Collection<Alunocolaborador> alunocolaboradorCollection;
    @JoinTable(name = "bolsista_atividade", joinColumns = {
        @JoinColumn(name = "ATIVIDADE_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "BOLSISTA_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Bolsista> bolsistaCollection;
    @ManyToMany(mappedBy = "tarefaCollection1")
    private Collection<Bolsista> bolsistaCollection1;
    @JoinTable(name = "professorcolaborador_atividade", joinColumns = {
        @JoinColumn(name = "ATIVIDADE_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "ProfessorColaborador_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Professorcolaborador> professorcolaboradorCollection1;
    @ManyToMany(mappedBy = "tarefaCollection1")
    private Collection<Alunocolaborador> alunocolaboradorCollection1;
    @ManyToMany(mappedBy = "tarefaCollection")
    private Collection<Supervisor> supervisorCollection;
    @JoinColumn(name = "TipoSituacao_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tiposituacao tipoSituacaoid;

    public Tarefa() {
    }

    public Tarefa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataPrevisaoInicio() {
        return dataPrevisaoInicio;
    }

    public void setDataPrevisaoInicio(String dataPrevisaoInicio) {
        this.dataPrevisaoInicio = dataPrevisaoInicio;
    }

    public String getDataPrecisaoConclusao() {
        return dataPrecisaoConclusao;
    }

    public void setDataPrecisaoConclusao(String dataPrecisaoConclusao) {
        this.dataPrecisaoConclusao = dataPrecisaoConclusao;
    }

    public String getDataEfetivaConclusao() {
        return dataEfetivaConclusao;
    }

    public void setDataEfetivaConclusao(String dataEfetivaConclusao) {
        this.dataEfetivaConclusao = dataEfetivaConclusao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @XmlTransient
    public Collection<Professorcolaborador> getProfessorcolaboradorCollection() {
        return professorcolaboradorCollection;
    }

    public void setProfessorcolaboradorCollection(Collection<Professorcolaborador> professorcolaboradorCollection) {
        this.professorcolaboradorCollection = professorcolaboradorCollection;
    }

    @XmlTransient
    public Collection<Alunocolaborador> getAlunocolaboradorCollection() {
        return alunocolaboradorCollection;
    }

    public void setAlunocolaboradorCollection(Collection<Alunocolaborador> alunocolaboradorCollection) {
        this.alunocolaboradorCollection = alunocolaboradorCollection;
    }

    @XmlTransient
    public Collection<Bolsista> getBolsistaCollection() {
        return bolsistaCollection;
    }

    public void setBolsistaCollection(Collection<Bolsista> bolsistaCollection) {
        this.bolsistaCollection = bolsistaCollection;
    }

    @XmlTransient
    public Collection<Bolsista> getBolsistaCollection1() {
        return bolsistaCollection1;
    }

    public void setBolsistaCollection1(Collection<Bolsista> bolsistaCollection1) {
        this.bolsistaCollection1 = bolsistaCollection1;
    }

    @XmlTransient
    public Collection<Professorcolaborador> getProfessorcolaboradorCollection1() {
        return professorcolaboradorCollection1;
    }

    public void setProfessorcolaboradorCollection1(Collection<Professorcolaborador> professorcolaboradorCollection1) {
        this.professorcolaboradorCollection1 = professorcolaboradorCollection1;
    }

    @XmlTransient
    public Collection<Alunocolaborador> getAlunocolaboradorCollection1() {
        return alunocolaboradorCollection1;
    }

    public void setAlunocolaboradorCollection1(Collection<Alunocolaborador> alunocolaboradorCollection1) {
        this.alunocolaboradorCollection1 = alunocolaboradorCollection1;
    }

    @XmlTransient
    public Collection<Supervisor> getSupervisorCollection() {
        return supervisorCollection;
    }

    public void setSupervisorCollection(Collection<Supervisor> supervisorCollection) {
        this.supervisorCollection = supervisorCollection;
    }

    public Tiposituacao getTipoSituacaoid() {
        return tipoSituacaoid;
    }

    public void setTipoSituacaoid(Tiposituacao tipoSituacaoid) {
        this.tipoSituacaoid = tipoSituacaoid;
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
        if (!(object instanceof Tarefa)) {
            return false;
        }
        Tarefa other = (Tarefa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Tarefa[ id=" + id + " ]";
    }
    
}
