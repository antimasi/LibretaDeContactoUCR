/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Modelos;

import java.io.Serializable;
import java.util.List;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author KURISUTIAN
 */
@Entity
@Table(name = "INSTANCIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instancias.findAll", query = "SELECT i FROM Instancias i"),
    @NamedQuery(name = "Instancias.findByIdinstancia", query = "SELECT i FROM Instancias i WHERE i.idinstancia = :idinstancia"),
    @NamedQuery(name = "Instancias.findByInstancia", query = "SELECT i FROM Instancias i WHERE i.instancia = :instancia")})
public class Instancias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDINSTANCIA")
    private Integer idinstancia;
    @Basic(optional = false)
    @Column(name = "INSTANCIA")
    private String instancia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idinstancia")
    private List<Departamentos> departamentosList;

    public Instancias() {
    }

    public Instancias(Integer idinstancia) {
        this.idinstancia = idinstancia;
    }

    public Instancias(Integer idinstancia, String instancia) {
        this.idinstancia = idinstancia;
        this.instancia = instancia;
    }

    public Integer getIdinstancia() {
        return idinstancia;
    }

    public void setIdinstancia(Integer idinstancia) {
        this.idinstancia = idinstancia;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    @XmlTransient
    public List<Departamentos> getDepartamentosList() {
        return departamentosList;
    }

    public void setDepartamentosList(List<Departamentos> departamentosList) {
        this.departamentosList = departamentosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinstancia != null ? idinstancia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instancias)) {
            return false;
        }
        Instancias other = (Instancias) object;
        if ((this.idinstancia == null && other.idinstancia != null) || (this.idinstancia != null && !this.idinstancia.equals(other.idinstancia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return instancia;
    }
    
}
