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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CARRERAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carreras.findAll", query = "SELECT c FROM Carreras c"),
    @NamedQuery(name = "Carreras.findByIdcarrera", query = "SELECT c FROM Carreras c WHERE c.idcarrera = :idcarrera"),
    @NamedQuery(name = "Carreras.findByCarrera", query = "SELECT c FROM Carreras c WHERE c.carrera = :carrera")})
public class Carreras implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCARRERA")
    private Integer idcarrera;
    @Column(name = "CARRERA")
    private String carrera;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcarrera")
    private List<Contactos> contactosList;
    @JoinColumn(name = "IDCOORDINACION", referencedColumnName = "IDCOORDINACION")
    @ManyToOne(optional = false)
    private int idcoordinacion;

    public Carreras() {
    }

    public Carreras(Integer idcarrera) {
        this.idcarrera = idcarrera;
    }

    public Integer getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(Integer idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @XmlTransient
    public List<Contactos> getContactosList() {
        return contactosList;
    }

    public void setContactosList(List<Contactos> contactosList) {
        this.contactosList = contactosList;
    }

    public int getIdcoordinacion() {
        return idcoordinacion;
    }

    public void setIdcoordinacion(int idcoordinacion) {
        this.idcoordinacion = idcoordinacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcarrera != null ? idcarrera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carreras)) {
            return false;
        }
        Carreras other = (Carreras) object;
        if ((this.idcarrera == null && other.idcarrera != null) || (this.idcarrera != null && !this.idcarrera.equals(other.idcarrera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return carrera;
    }
    
}
