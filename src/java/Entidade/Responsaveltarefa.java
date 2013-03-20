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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jp
 */
@Entity
@Table(name = "responsaveltarefa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsaveltarefa.findAll", query = "SELECT r FROM Responsaveltarefa r"),
    @NamedQuery(name = "Responsaveltarefa.findByIdresponsaveltarefa", query = "SELECT r FROM Responsaveltarefa r WHERE r.idresponsaveltarefa = :idresponsaveltarefa")})
public class Responsaveltarefa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idresponsaveltarefa")
    private Integer idresponsaveltarefa;

    public Responsaveltarefa() {
    }

    public Responsaveltarefa(Integer idresponsaveltarefa) {
        this.idresponsaveltarefa = idresponsaveltarefa;
    }

    public Integer getIdresponsaveltarefa() {
        return idresponsaveltarefa;
    }

    public void setIdresponsaveltarefa(Integer idresponsaveltarefa) {
        this.idresponsaveltarefa = idresponsaveltarefa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idresponsaveltarefa != null ? idresponsaveltarefa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsaveltarefa)) {
            return false;
        }
        Responsaveltarefa other = (Responsaveltarefa) object;
        if ((this.idresponsaveltarefa == null && other.idresponsaveltarefa != null) || (this.idresponsaveltarefa != null && !this.idresponsaveltarefa.equals(other.idresponsaveltarefa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.Responsaveltarefa[ idresponsaveltarefa=" + idresponsaveltarefa + " ]";
    }
    
}
