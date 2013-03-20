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
 * @author jp
 */
@Entity
@Table(name = "escola")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Escola.findAll", query = "SELECT e FROM Escola e"),
    @NamedQuery(name = "Escola.findById", query = "SELECT e FROM Escola e WHERE e.id = :id"),
    @NamedQuery(name = "Escola.findByNome", query = "SELECT e FROM Escola e WHERE e.nome = :nome"),
    @NamedQuery(name = "Escola.findByEndereco", query = "SELECT e FROM Escola e WHERE e.endereco = :endereco"),
    @NamedQuery(name = "Escola.findByEsfera", query = "SELECT e FROM Escola e WHERE e.esfera = :esfera"),
    @NamedQuery(name = "Escola.findByNomeDiretor", query = "SELECT e FROM Escola e WHERE e.nomeDiretor = :nomeDiretor"),
    @NamedQuery(name = "Escola.findByNomeViceDiretorManha", query = "SELECT e FROM Escola e WHERE e.nomeViceDiretorManha = :nomeViceDiretorManha"),
    @NamedQuery(name = "Escola.findByNomeViceDiretorTarde", query = "SELECT e FROM Escola e WHERE e.nomeViceDiretorTarde = :nomeViceDiretorTarde"),
    @NamedQuery(name = "Escola.findByNomeViceDiretorNoite", query = "SELECT e FROM Escola e WHERE e.nomeViceDiretorNoite = :nomeViceDiretorNoite"),
    @NamedQuery(name = "Escola.findByTel", query = "SELECT e FROM Escola e WHERE e.tel = :tel"),
    @NamedQuery(name = "Escola.findByEmail", query = "SELECT e FROM Escola e WHERE e.email = :email"),
    @NamedQuery(name = "Escola.findByEmaiDiretor", query = "SELECT e FROM Escola e WHERE e.emaiDiretor = :emaiDiretor"),
    @NamedQuery(name = "Escola.findByEmailViceManha", query = "SELECT e FROM Escola e WHERE e.emailViceManha = :emailViceManha"),
    @NamedQuery(name = "Escola.findByEmailViceTarde", query = "SELECT e FROM Escola e WHERE e.emailViceTarde = :emailViceTarde"),
    @NamedQuery(name = "Escola.findByEmailViceNoite", query = "SELECT e FROM Escola e WHERE e.emailViceNoite = :emailViceNoite")})
public class Escola implements Serializable {
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
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 45)
    @Column(name = "esfera")
    private String esfera;
    @Size(max = 45)
    @Column(name = "nomeDiretor")
    private String nomeDiretor;
    @Size(max = 45)
    @Column(name = "nomeViceDiretorManha")
    private String nomeViceDiretorManha;
    @Size(max = 45)
    @Column(name = "nomeViceDiretorTarde")
    private String nomeViceDiretorTarde;
    @Size(max = 45)
    @Column(name = "nomeViceDiretorNoite")
    private String nomeViceDiretorNoite;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "emaiDiretor")
    private String emaiDiretor;
    @Size(max = 45)
    @Column(name = "emailViceManha")
    private String emailViceManha;
    @Size(max = 45)
    @Column(name = "emailViceTarde")
    private String emailViceTarde;
    @Size(max = 45)
    @Column(name = "EmailViceNoite")
    private String emailViceNoite;
    @OneToMany(mappedBy = "idEscola")
    private Collection<Supervisor> supervisorCollection;
    @JoinColumn(name = "TipoSituacao_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tiposituacao tipoSituacaoid;

    public Escola() {
    }

    public Escola(Integer id) {
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEsfera() {
        return esfera;
    }

    public void setEsfera(String esfera) {
        this.esfera = esfera;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getNomeViceDiretorManha() {
        return nomeViceDiretorManha;
    }

    public void setNomeViceDiretorManha(String nomeViceDiretorManha) {
        this.nomeViceDiretorManha = nomeViceDiretorManha;
    }

    public String getNomeViceDiretorTarde() {
        return nomeViceDiretorTarde;
    }

    public void setNomeViceDiretorTarde(String nomeViceDiretorTarde) {
        this.nomeViceDiretorTarde = nomeViceDiretorTarde;
    }

    public String getNomeViceDiretorNoite() {
        return nomeViceDiretorNoite;
    }

    public void setNomeViceDiretorNoite(String nomeViceDiretorNoite) {
        this.nomeViceDiretorNoite = nomeViceDiretorNoite;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmaiDiretor() {
        return emaiDiretor;
    }

    public void setEmaiDiretor(String emaiDiretor) {
        this.emaiDiretor = emaiDiretor;
    }

    public String getEmailViceManha() {
        return emailViceManha;
    }

    public void setEmailViceManha(String emailViceManha) {
        this.emailViceManha = emailViceManha;
    }

    public String getEmailViceTarde() {
        return emailViceTarde;
    }

    public void setEmailViceTarde(String emailViceTarde) {
        this.emailViceTarde = emailViceTarde;
    }

    public String getEmailViceNoite() {
        return emailViceNoite;
    }

    public void setEmailViceNoite(String emailViceNoite) {
        this.emailViceNoite = emailViceNoite;
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
        if (!(object instanceof Escola)) {
            return false;
        }
        Escola other = (Escola) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Escola[ id=" + id + " ]";
    }
    
}
