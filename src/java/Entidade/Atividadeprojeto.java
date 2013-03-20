/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jp
 */
@Entity
@Table(name = "atividadeprojeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atividadeprojeto.findAll", query = "SELECT a FROM Atividadeprojeto a"),
    @NamedQuery(name = "Atividadeprojeto.findById", query = "SELECT a FROM Atividadeprojeto a WHERE a.id = :id"),
    @NamedQuery(name = "Atividadeprojeto.findByAtividade", query = "SELECT a FROM Atividadeprojeto a WHERE a.atividade = :atividade"),
    @NamedQuery(name = "Atividadeprojeto.findByMesInicio", query = "SELECT a FROM Atividadeprojeto a WHERE a.mesInicio = :mesInicio"),
    @NamedQuery(name = "Atividadeprojeto.findByMesFinal", query = "SELECT a FROM Atividadeprojeto a WHERE a.mesFinal = :mesFinal")})
public class Atividadeprojeto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "atividade")
    private String atividade;
    @Size(max = 45)
    @Column(name = "mesInicio")
    private String mesInicio;
    @Size(max = 45)
    @Column(name = "mesFinal")
    private String mesFinal;
    @JoinColumn(name = "projeto_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Projeto projetoId;

    public Atividadeprojeto() {
    }

    public Atividadeprojeto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Projeto getProjetoId() {
        return projetoId;
    }

    public void setProjetoId(Projeto projetoId) {
        this.projetoId = projetoId;
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
        if (!(object instanceof Atividadeprojeto)) {
            return false;
        }
        Atividadeprojeto other = (Atividadeprojeto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Atividadeprojeto[ id=" + id + " ]";
    }
    
}
