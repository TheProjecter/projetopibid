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
@Table(name = "coordenador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coordenador.findAll", query = "SELECT c FROM Coordenador c"),
    @NamedQuery(name = "Coordenador.findById", query = "SELECT c FROM Coordenador c WHERE c.id = :id"),
    @NamedQuery(name = "Coordenador.findByNome", query = "SELECT c FROM Coordenador c WHERE c.nome = :nome"),
    @NamedQuery(name = "Coordenador.findByEmail1", query = "SELECT c FROM Coordenador c WHERE c.email1 = :email1"),
    @NamedQuery(name = "Coordenador.findByEmail2", query = "SELECT c FROM Coordenador c WHERE c.email2 = :email2"),
    @NamedQuery(name = "Coordenador.findByTel", query = "SELECT c FROM Coordenador c WHERE c.tel = :tel"),
    @NamedQuery(name = "Coordenador.findByCel", query = "SELECT c FROM Coordenador c WHERE c.cel = :cel"),
    @NamedQuery(name = "Coordenador.findByLink", query = "SELECT c FROM Coordenador c WHERE c.link = :link")})
public class Coordenador implements Serializable {
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
    @Column(name = "link")
    private String link;
    @OneToMany(mappedBy = "cOORDENADORid")
    private Collection<Projeto> projetoCollection;

    public Coordenador() {
    }

    public Coordenador(Integer id) {
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @XmlTransient
    public Collection<Projeto> getProjetoCollection() {
        return projetoCollection;
    }

    public void setProjetoCollection(Collection<Projeto> projetoCollection) {
        this.projetoCollection = projetoCollection;
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
        if (!(object instanceof Coordenador)) {
            return false;
        }
        Coordenador other = (Coordenador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Coordenador[ id=" + id + " ]";
    }
    
}
