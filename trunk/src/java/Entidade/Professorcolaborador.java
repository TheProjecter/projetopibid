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
 * @author Marinho
 */
@Entity
@Table(name = "professorcolaborador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professorcolaborador.findAll", query = "SELECT p FROM Professorcolaborador p"),
    @NamedQuery(name = "Professorcolaborador.findById", query = "SELECT p FROM Professorcolaborador p WHERE p.id = :id"),
    @NamedQuery(name = "Professorcolaborador.findByNome", query = "SELECT p FROM Professorcolaborador p WHERE p.nome = :nome"),
    @NamedQuery(name = "Professorcolaborador.findByEmail1", query = "SELECT p FROM Professorcolaborador p WHERE p.email1 = :email1"),
    @NamedQuery(name = "Professorcolaborador.findByEmail2", query = "SELECT p FROM Professorcolaborador p WHERE p.email2 = :email2"),
    @NamedQuery(name = "Professorcolaborador.findByTel", query = "SELECT p FROM Professorcolaborador p WHERE p.tel = :tel"),
    @NamedQuery(name = "Professorcolaborador.findByCel", query = "SELECT p FROM Professorcolaborador p WHERE p.cel = :cel"),
    @NamedQuery(name = "Professorcolaborador.findByEndereco", query = "SELECT p FROM Professorcolaborador p WHERE p.endereco = :endereco"),
    @NamedQuery(name = "Professorcolaborador.findByInstituicao", query = "SELECT p FROM Professorcolaborador p WHERE p.instituicao = :instituicao"),
    @NamedQuery(name = "Professorcolaborador.findBySituacao", query = "SELECT p FROM Professorcolaborador p WHERE p.situacao = :situacao")})
public class Professorcolaborador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "nome")
    private String nome;
    @Size(max = 45)
    @Column(name = "email1")
    private String email1;
    @Size(max = 45)
    @Column(name = "email2")
    private String email2;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    @Size(max = 45)
    @Column(name = "cel")
    private String cel;
    @Size(max = 45)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 45)
    @Column(name = "instituicao")
    private String instituicao;
    @Column(name = "situacao")
    private Boolean situacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professorcolaborador")
    private Collection<ProjetoHasProfessorcolaborador> projetoHasProfessorcolaboradorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professorcolaborador")
    private Collection<ProfessorcolaboradorHasAtividade> professorcolaboradorHasAtividadeCollection;

    public Professorcolaborador() {
    }

    public Professorcolaborador(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @XmlTransient
    public Collection<ProjetoHasProfessorcolaborador> getProjetoHasProfessorcolaboradorCollection() {
        return projetoHasProfessorcolaboradorCollection;
    }

    public void setProjetoHasProfessorcolaboradorCollection(Collection<ProjetoHasProfessorcolaborador> projetoHasProfessorcolaboradorCollection) {
        this.projetoHasProfessorcolaboradorCollection = projetoHasProfessorcolaboradorCollection;
    }

    @XmlTransient
    public Collection<ProfessorcolaboradorHasAtividade> getProfessorcolaboradorHasAtividadeCollection() {
        return professorcolaboradorHasAtividadeCollection;
    }

    public void setProfessorcolaboradorHasAtividadeCollection(Collection<ProfessorcolaboradorHasAtividade> professorcolaboradorHasAtividadeCollection) {
        this.professorcolaboradorHasAtividadeCollection = professorcolaboradorHasAtividadeCollection;
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
        if (!(object instanceof Professorcolaborador)) {
            return false;
        }
        Professorcolaborador other = (Professorcolaborador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Professorcolaborador[ id=" + id + " ]";
    }
    
}
