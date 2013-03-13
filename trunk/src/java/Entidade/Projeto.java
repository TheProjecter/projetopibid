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
    @NamedQuery(name = "Projeto.findByAtividade", query = "SELECT p FROM Projeto p WHERE p.atividade = :atividade"),
    @NamedQuery(name = "Projeto.findByMesInicio", query = "SELECT p FROM Projeto p WHERE p.mesInicio = :mesInicio"),
    @NamedQuery(name = "Projeto.findByMesFinal", query = "SELECT p FROM Projeto p WHERE p.mesFinal = :mesFinal"),
    @NamedQuery(name = "Projeto.findBySituacao", query = "SELECT p FROM Projeto p WHERE p.situacao = :situacao"),
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
    @Column(name = "atividade")
    private String atividade;
    @Size(max = 45)
    @Column(name = "mesInicio")
    private String mesInicio;
    @Size(max = 45)
    @Column(name = "MesFinal")
    private String mesFinal;
    @Column(name = "situacao")
    private Boolean situacao;
    @Size(max = 45)
    @Column(name = "proposta")
    private String proposta;
    @JoinColumn(name = "COORDENADOR_id", referencedColumnName = "id")
    @ManyToOne
    private Coordenador cOORDENADORid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projeto")
    private Collection<ProjetoHasProfessorcolaborador> projetoHasProfessorcolaboradorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projeto")
    private Collection<ProjetoHasAlunocolaborador> projetoHasAlunocolaboradorCollection;
    @OneToMany(mappedBy = "pROJETOid")
    private Collection<Bolsista> bolsistaCollection;
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

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(String mesInicio) {
        this.mesInicio = mesInicio;
    }

    public String getMesFinal() {
        return mesFinal;
    }

    public void setMesFinal(String mesFinal) {
        this.mesFinal = mesFinal;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }

    public Coordenador getCOORDENADORid() {
        return cOORDENADORid;
    }

    public void setCOORDENADORid(Coordenador cOORDENADORid) {
        this.cOORDENADORid = cOORDENADORid;
    }

    @XmlTransient
    public Collection<ProjetoHasProfessorcolaborador> getProjetoHasProfessorcolaboradorCollection() {
        return projetoHasProfessorcolaboradorCollection;
    }

    public void setProjetoHasProfessorcolaboradorCollection(Collection<ProjetoHasProfessorcolaborador> projetoHasProfessorcolaboradorCollection) {
        this.projetoHasProfessorcolaboradorCollection = projetoHasProfessorcolaboradorCollection;
    }

    @XmlTransient
    public Collection<ProjetoHasAlunocolaborador> getProjetoHasAlunocolaboradorCollection() {
        return projetoHasAlunocolaboradorCollection;
    }

    public void setProjetoHasAlunocolaboradorCollection(Collection<ProjetoHasAlunocolaborador> projetoHasAlunocolaboradorCollection) {
        this.projetoHasAlunocolaboradorCollection = projetoHasAlunocolaboradorCollection;
    }

    @XmlTransient
    public Collection<Bolsista> getBolsistaCollection() {
        return bolsistaCollection;
    }

    public void setBolsistaCollection(Collection<Bolsista> bolsistaCollection) {
        this.bolsistaCollection = bolsistaCollection;
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
        return getTitulo();
    }
    
}
