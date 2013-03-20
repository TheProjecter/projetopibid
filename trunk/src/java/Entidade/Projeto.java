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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
 * @author jp
 */
@Entity
@Table(name = "projeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projeto.findAll", query = "SELECT p FROM Projeto p"),
    @NamedQuery(name = "Projeto.findById", query = "SELECT p FROM Projeto p WHERE p.id = :id"),
    @NamedQuery(name = "Projeto.findByNomeInstituicao", query = "SELECT p FROM Projeto p WHERE p.nomeInstituicao = :nomeInstituicao"),
    @NamedQuery(name = "Projeto.findByTitulo", query = "SELECT p FROM Projeto p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "Projeto.findByDataInicio", query = "SELECT p FROM Projeto p WHERE p.dataInicio = :dataInicio"),
    @NamedQuery(name = "Projeto.findByDataConclusao", query = "SELECT p FROM Projeto p WHERE p.dataConclusao = :dataConclusao"),
    @NamedQuery(name = "Projeto.findByCursoVinculado", query = "SELECT p FROM Projeto p WHERE p.cursoVinculado = :cursoVinculado"),
    @NamedQuery(name = "Projeto.findByAcaoPrevista", query = "SELECT p FROM Projeto p WHERE p.acaoPrevista = :acaoPrevista"),
    @NamedQuery(name = "Projeto.findByResultadoPretendido", query = "SELECT p FROM Projeto p WHERE p.resultadoPretendido = :resultadoPretendido"),
    @NamedQuery(name = "Projeto.findByProposta", query = "SELECT p FROM Projeto p WHERE p.proposta = :proposta")})
public class Projeto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "nomeInstituicao")
    private String nomeInstituicao;
    @Size(max = 45)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 45)
    @Column(name = "dataInicio")
    private String dataInicio;
    @Size(max = 45)
    @Column(name = "DataConclusao")
    private String dataConclusao;
    @Size(max = 45)
    @Column(name = "CursoVinculado")
    private String cursoVinculado;
    @Size(max = 45)
    @Column(name = "AcaoPrevista")
    private String acaoPrevista;
    @Size(max = 45)
    @Column(name = "ResultadoPretendido")
    private String resultadoPretendido;
    @Size(max = 45)
    @Column(name = "proposta")
    private String proposta;
    @JoinTable(name = "projeto_alunocolaborador", joinColumns = {
        @JoinColumn(name = "PROJETO_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "AlunoColaborador_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Alunocolaborador> alunocolaboradorCollection;
    @ManyToMany(mappedBy = "projetoCollection")
    private Collection<Professorcolaborador> professorcolaboradorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projetoId")
    private Collection<Atividadeprojeto> atividadeprojetoCollection;
    @OneToMany(mappedBy = "pROJETOid")
    private Collection<Bolsista> bolsistaCollection;
    @JoinColumn(name = "TipoSituacao_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tiposituacao tipoSituacaoid;
    @JoinColumn(name = "COORDENADOR_id", referencedColumnName = "id")
    @ManyToOne
    private Coordenador cOORDENADORid;
    @OneToMany(mappedBy = "pROJETOid")
    private Collection<Supervisor> supervisorCollection;

    public Projeto() {
    }

    public Projeto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getCursoVinculado() {
        return cursoVinculado;
    }

    public void setCursoVinculado(String cursoVinculado) {
        this.cursoVinculado = cursoVinculado;
    }

    public String getAcaoPrevista() {
        return acaoPrevista;
    }

    public void setAcaoPrevista(String acaoPrevista) {
        this.acaoPrevista = acaoPrevista;
    }

    public String getResultadoPretendido() {
        return resultadoPretendido;
    }

    public void setResultadoPretendido(String resultadoPretendido) {
        this.resultadoPretendido = resultadoPretendido;
    }

    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }

    @XmlTransient
    public Collection<Alunocolaborador> getAlunocolaboradorCollection() {
        return alunocolaboradorCollection;
    }

    public void setAlunocolaboradorCollection(Collection<Alunocolaborador> alunocolaboradorCollection) {
        this.alunocolaboradorCollection = alunocolaboradorCollection;
    }

    @XmlTransient
    public Collection<Professorcolaborador> getProfessorcolaboradorCollection() {
        return professorcolaboradorCollection;
    }

    public void setProfessorcolaboradorCollection(Collection<Professorcolaborador> professorcolaboradorCollection) {
        this.professorcolaboradorCollection = professorcolaboradorCollection;
    }

    @XmlTransient
    public Collection<Atividadeprojeto> getAtividadeprojetoCollection() {
        return atividadeprojetoCollection;
    }

    public void setAtividadeprojetoCollection(Collection<Atividadeprojeto> atividadeprojetoCollection) {
        this.atividadeprojetoCollection = atividadeprojetoCollection;
    }

    @XmlTransient
    public Collection<Bolsista> getBolsistaCollection() {
        return bolsistaCollection;
    }

    public void setBolsistaCollection(Collection<Bolsista> bolsistaCollection) {
        this.bolsistaCollection = bolsistaCollection;
    }

    public Tiposituacao getTipoSituacaoid() {
        return tipoSituacaoid;
    }

    public void setTipoSituacaoid(Tiposituacao tipoSituacaoid) {
        this.tipoSituacaoid = tipoSituacaoid;
    }

    public Coordenador getCOORDENADORid() {
        return cOORDENADORid;
    }

    public void setCOORDENADORid(Coordenador cOORDENADORid) {
        this.cOORDENADORid = cOORDENADORid;
    }

    @XmlTransient
    public Collection<Supervisor> getSupervisorCollection() {
        return supervisorCollection;
    }

    public void setSupervisorCollection(Collection<Supervisor> supervisorCollection) {
        this.supervisorCollection = supervisorCollection;
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
        if (!(object instanceof Projeto)) {
            return false;
        }
        Projeto other = (Projeto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Projeto[ id=" + id + " ]";
    }
    
}
