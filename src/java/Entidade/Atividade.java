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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marinho
 */
@Entity
@Table(name = "atividade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atividade.findAll", query = "SELECT a FROM Atividade a"),
    @NamedQuery(name = "Atividade.findById", query = "SELECT a FROM Atividade a WHERE a.id = :id"),
    @NamedQuery(name = "Atividade.findByTitulo", query = "SELECT a FROM Atividade a WHERE a.titulo = :titulo"),
    @NamedQuery(name = "Atividade.findByDescricao", query = "SELECT a FROM Atividade a WHERE a.descricao = :descricao"),
    @NamedQuery(name = "Atividade.findByDataCadastro", query = "SELECT a FROM Atividade a WHERE a.dataCadastro = :dataCadastro"),
    @NamedQuery(name = "Atividade.findByDataPrevisaoInicio", query = "SELECT a FROM Atividade a WHERE a.dataPrevisaoInicio = :dataPrevisaoInicio"),
    @NamedQuery(name = "Atividade.findByDataPrecisaoConclusao", query = "SELECT a FROM Atividade a WHERE a.dataPrecisaoConclusao = :dataPrecisaoConclusao"),
    @NamedQuery(name = "Atividade.findByDataEfetivaConclusao", query = "SELECT a FROM Atividade a WHERE a.dataEfetivaConclusao = :dataEfetivaConclusao"),
    @NamedQuery(name = "Atividade.findByResponsavel", query = "SELECT a FROM Atividade a WHERE a.responsavel = :responsavel"),
    @NamedQuery(name = "Atividade.findBySituacao", query = "SELECT a FROM Atividade a WHERE a.situacao = :situacao"),
    @NamedQuery(name = "Atividade.findByObservacao", query = "SELECT a FROM Atividade a WHERE a.observacao = :observacao")})
public class Atividade implements Serializable {
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
    @Column(name = "situacao")
    private String situacao;
    @Size(max = 45)
    @Column(name = "observacao")
    private String observacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atividade")
    private Collection<BolsistaHasAtividade> bolsistaHasAtividadeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atividade")
    private Collection<AlunocolaboradorHasAtividade> alunocolaboradorHasAtividadeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atividade")
    private Collection<ProfessorcolaboradorHasAtividade> professorcolaboradorHasAtividadeCollection;
    @JoinColumn(name = "SUPERVISOR_id", referencedColumnName = "id")
    @ManyToOne
    private Supervisor sUPERVISORid;

    public Atividade() {
    }

    public Atividade(Integer id) {
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @XmlTransient
    public Collection<BolsistaHasAtividade> getBolsistaHasAtividadeCollection() {
        return bolsistaHasAtividadeCollection;
    }

    public void setBolsistaHasAtividadeCollection(Collection<BolsistaHasAtividade> bolsistaHasAtividadeCollection) {
        this.bolsistaHasAtividadeCollection = bolsistaHasAtividadeCollection;
    }

    @XmlTransient
    public Collection<AlunocolaboradorHasAtividade> getAlunocolaboradorHasAtividadeCollection() {
        return alunocolaboradorHasAtividadeCollection;
    }

    public void setAlunocolaboradorHasAtividadeCollection(Collection<AlunocolaboradorHasAtividade> alunocolaboradorHasAtividadeCollection) {
        this.alunocolaboradorHasAtividadeCollection = alunocolaboradorHasAtividadeCollection;
    }

    @XmlTransient
    public Collection<ProfessorcolaboradorHasAtividade> getProfessorcolaboradorHasAtividadeCollection() {
        return professorcolaboradorHasAtividadeCollection;
    }

    public void setProfessorcolaboradorHasAtividadeCollection(Collection<ProfessorcolaboradorHasAtividade> professorcolaboradorHasAtividadeCollection) {
        this.professorcolaboradorHasAtividadeCollection = professorcolaboradorHasAtividadeCollection;
    }

    public Supervisor getSUPERVISORid() {
        return sUPERVISORid;
    }

    public void setSUPERVISORid(Supervisor sUPERVISORid) {
        this.sUPERVISORid = sUPERVISORid;
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
        if (!(object instanceof Atividade)) {
            return false;
        }
        Atividade other = (Atividade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Atividade[ id=" + id + " ]";
    }
    
}
