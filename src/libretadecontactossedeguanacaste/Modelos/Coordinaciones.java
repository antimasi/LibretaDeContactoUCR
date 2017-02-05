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
@Table(name = "COORDINACIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coordinaciones.findAll", query = "SELECT c FROM Coordinaciones c"),
    @NamedQuery(name = "Coordinaciones.findByIdcoordinacion", query = "SELECT c FROM Coordinaciones c WHERE c.idcoordinacion = :idcoordinacion"),
    @NamedQuery(name = "Coordinaciones.findByCoordinacion", query = "SELECT c FROM Coordinaciones c WHERE c.coordinacion = :coordinacion")})
public class Coordinaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCOORDINACION")
    private Integer idcoordinacion;
    @Column(name = "COORDINACION")
    private String coordinacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcoordinacion")
    private List<Carreras> carrerasList;

    public Coordinaciones() {
    }

    public Coordinaciones(Integer idcoordinacion) {
        this.idcoordinacion = idcoordinacion;
    }

    public Integer getIdcoordinacion() {
        return idcoordinacion;
    }

    public void setIdcoordinacion(Integer idcoordinacion) {
        this.idcoordinacion = idcoordinacion;
    }

    public String getCoordinacion() {
        return coordinacion;
    }

    public void setCoordinacion(String coordinacion) {
        this.coordinacion = coordinacion;
    }

    @XmlTransient
    public List<Carreras> getCarrerasList() {
        return carrerasList;
    }

    public void setCarrerasList(List<Carreras> carrerasList) {
        this.carrerasList = carrerasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcoordinacion != null ? idcoordinacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coordinaciones)) {
            return false;
        }
        Coordinaciones other = (Coordinaciones) object;
        if ((this.idcoordinacion == null && other.idcoordinacion != null) || (this.idcoordinacion != null && !this.idcoordinacion.equals(other.idcoordinacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getCoordinacion();
    }
    
}
