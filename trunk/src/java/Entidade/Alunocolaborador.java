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
@Table(name = "alunocolaborador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alunocolaborador.findAll", query = "SELECT a FROM Alunocolaborador a"),
    @NamedQuery(name = "Alunocolaborador.findById", query = "SELECT a FROM Alunocolaborador a WHERE a.id = :id"),
    @NamedQuery(name = "Alunocolaborador.findByMatricula", query = "SELECT a FROM Alunocolaborador a WHERE a.matricula = :matricula"),
    @NamedQuery(name = "Alunocolaborador.findByNome", query = "SELECT a FROM Alunocolaborador a WHERE a.nome = :nome"),
    @NamedQuery(name = "Alunocolaborador.findByEmail1", query = "SELECT a FROM Alunocolaborador a WHERE a.email1 = :email1"),
    @NamedQuery(name = "Alunocolaborador.findByEmail2", query = "SELECT a FROM Alunocolaborador a WHERE a.email2 = :email2"),
    @NamedQuery(name = "Alunocolaborador.findByTel", query = "SELECT a FROM Alunocolaborador a WHERE a.tel = :tel"),
    @NamedQuery(name = "Alunocolaborador.findByCel", query = "SELECT a FROM Alunocolaborador a WHERE a.cel = :cel"),
    @NamedQuery(name = "Alunocolaborador.findByEndereco", query = "SELECT a FROM Alunocolaborador a WHERE a.endereco = :endereco"),
    @NamedQuery(name = "Alunocolaborador.findBySituacao", query = "SELECT a FROM Alunocolaborador a WHERE a.situacao = :situacao")})
public class Alunocolaborador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "matricula")
    private String matricula;
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
    @Column(name = "situacao")
    private Boolean situacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alunocolaborador")
    private Collection<AlunocolaboradorHasAtividade> alunocolaboradorHasAtividadeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alunocolaborador")
    private Collection<ProjetoHasAlunocolaborador> projetoHasAlunocolaboradorCollection;

    public Alunocolaborador() {
    }

    public Alunocolaborador(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @XmlTransient
    public Collection<AlunocolaboradorHasAtividade> getAlunocolaboradorHasAtividadeCollection() {
        return alunocolaboradorHasAtividadeCollection;
    }

    public void setAlunocolaboradorHasAtividadeCollection(Collection<AlunocolaboradorHasAtividade> alunocolaboradorHasAtividadeCollection) {
        this.alunocolaboradorHasAtividadeCollection = alunocolaboradorHasAtividadeCollection;
    }

    @XmlTransient
    public Collection<ProjetoHasAlunocolaborador> getProjetoHasAlunocolaboradorCollection() {
        return projetoHasAlunocolaboradorCollection;
    }

    public void setProjetoHasAlunocolaboradorCollection(Collection<ProjetoHasAlunocolaborador> projetoHasAlunocolaboradorCollection) {
        this.projetoHasAlunocolaboradorCollection = projetoHasAlunocolaboradorCollection;
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
        if (!(object instanceof Alunocolaborador)) {
            return false;
        }
        Alunocolaborador other = (Alunocolaborador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Alunocolaborador[ id=" + id + " ]";
    }
    
}
