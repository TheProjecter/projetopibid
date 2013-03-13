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
@Table(name = "supervisor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supervisor.findAll", query = "SELECT s FROM Supervisor s"),
    @NamedQuery(name = "Supervisor.findById", query = "SELECT s FROM Supervisor s WHERE s.id = :id"),
    @NamedQuery(name = "Supervisor.findByNome", query = "SELECT s FROM Supervisor s WHERE s.nome = :nome"),
    @NamedQuery(name = "Supervisor.findByEmail1", query = "SELECT s FROM Supervisor s WHERE s.email1 = :email1"),
    @NamedQuery(name = "Supervisor.findByEmail2", query = "SELECT s FROM Supervisor s WHERE s.email2 = :email2"),
    @NamedQuery(name = "Supervisor.findByTel", query = "SELECT s FROM Supervisor s WHERE s.tel = :tel"),
    @NamedQuery(name = "Supervisor.findByCel", query = "SELECT s FROM Supervisor s WHERE s.cel = :cel"),
    @NamedQuery(name = "Supervisor.findByEndereco", query = "SELECT s FROM Supervisor s WHERE s.endereco = :endereco"),
    @NamedQuery(name = "Supervisor.findBySituacao", query = "SELECT s FROM Supervisor s WHERE s.situacao = :situacao")})
public class Supervisor implements Serializable {
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
    @Column(name = "situacao")
    private Boolean situacao;
    @JoinColumn(name = "PROJETO_id", referencedColumnName = "id")
    @ManyToOne
    private Projeto pROJETOid;
    @JoinColumn(name = "idEscola", referencedColumnName = "id")
    @ManyToOne
    private Escola idEscola;
    @OneToMany(mappedBy = "sUPERVISORid")
    private Collection<Atividade> atividadeCollection;

    public Supervisor() {
    }

    public Supervisor(Integer id) {
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

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Projeto getPROJETOid() {
        return pROJETOid;
    }

    public void setPROJETOid(Projeto pROJETOid) {
        this.pROJETOid = pROJETOid;
    }

    public Escola getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(Escola idEscola) {
        this.idEscola = idEscola;
    }

    @XmlTransient
    public Collection<Atividade> getAtividadeCollection() {
        return atividadeCollection;
    }

    public void setAtividadeCollection(Collection<Atividade> atividadeCollection) {
        this.atividadeCollection = atividadeCollection;
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
        if (!(object instanceof Supervisor)) {
            return false;
        }
        Supervisor other = (Supervisor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Supervisor[ id=" + id + " ]";
    }
    
}
