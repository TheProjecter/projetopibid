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
@Table(name = "bolsista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bolsista.findAll", query = "SELECT b FROM Bolsista b"),
    @NamedQuery(name = "Bolsista.findById", query = "SELECT b FROM Bolsista b WHERE b.id = :id"),
    @NamedQuery(name = "Bolsista.findByMatricula", query = "SELECT b FROM Bolsista b WHERE b.matricula = :matricula"),
    @NamedQuery(name = "Bolsista.findByNome", query = "SELECT b FROM Bolsista b WHERE b.nome = :nome"),
    @NamedQuery(name = "Bolsista.findByEmail1", query = "SELECT b FROM Bolsista b WHERE b.email1 = :email1"),
    @NamedQuery(name = "Bolsista.findByEmail2", query = "SELECT b FROM Bolsista b WHERE b.email2 = :email2"),
    @NamedQuery(name = "Bolsista.findByTel", query = "SELECT b FROM Bolsista b WHERE b.tel = :tel"),
    @NamedQuery(name = "Bolsista.findByCel", query = "SELECT b FROM Bolsista b WHERE b.cel = :cel"),
    @NamedQuery(name = "Bolsista.findByEndereco", query = "SELECT b FROM Bolsista b WHERE b.endereco = :endereco")})
public class Bolsista implements Serializable {
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
    @ManyToMany(mappedBy = "bolsistaCollection")
    private Collection<Tarefa> tarefaCollection;
    @JoinTable(name = "bolsista_tarefa", joinColumns = {
        @JoinColumn(name = "bolsista_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "tarefa_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<Tarefa> tarefaCollection1;
    @JoinColumn(name = "TipoSituacao_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tiposituacao tipoSituacaoid;
    @JoinColumn(name = "PROJETO_id", referencedColumnName = "id")
    @ManyToOne
    private Projeto pROJETOid;

    public Bolsista() {
    }

    public Bolsista(Integer id) {
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

    @XmlTransient
    public Collection<Tarefa> getTarefaCollection() {
        return tarefaCollection;
    }

    public void setTarefaCollection(Collection<Tarefa> tarefaCollection) {
        this.tarefaCollection = tarefaCollection;
    }

    @XmlTransient
    public Collection<Tarefa> getTarefaCollection1() {
        return tarefaCollection1;
    }

    public void setTarefaCollection1(Collection<Tarefa> tarefaCollection1) {
        this.tarefaCollection1 = tarefaCollection1;
    }

    public Tiposituacao getTipoSituacaoid() {
        return tipoSituacaoid;
    }

    public void setTipoSituacaoid(Tiposituacao tipoSituacaoid) {
        this.tipoSituacaoid = tipoSituacaoid;
    }

    public Projeto getPROJETOid() {
        return pROJETOid;
    }

    public void setPROJETOid(Projeto pROJETOid) {
        this.pROJETOid = pROJETOid;
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
        if (!(object instanceof Bolsista)) {
            return false;
        }
        Bolsista other = (Bolsista) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Bolsista[ id=" + id + " ]";
    }
    
}
