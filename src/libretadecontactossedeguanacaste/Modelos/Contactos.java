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
@Table(name = "CONTACTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactos.findAll", query = "SELECT c FROM Contactos c"),
    @NamedQuery(name = "Contactos.findByIdcontacto", query = "SELECT c FROM Contactos c WHERE c.idcontacto = :idcontacto"),
    @NamedQuery(name = "Contactos.findByContacto", query = "SELECT c FROM Contactos c WHERE c.contacto = :contacto")})
public class Contactos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCONTACTO")
    private Integer idcontacto;
    @Column(name = "CONTACTO")
    private String contacto;
    @JoinColumn(name = "IDCARRERA", referencedColumnName = "IDCARRERA")
    @ManyToOne(optional = false)
    private int idcarrera;
    @JoinColumn(name = "IDDEPARTAMENTO", referencedColumnName = "IDDEPARTAMENTO")
    @ManyToOne(optional = false)
    private int iddepartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontacto")
    private List<Telefonos> telefonosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontacto")
    private List<Correos> correosList;
     @ManyToOne(optional = false)
    private int esDelSistema;

    public int getEsDelSistema() {
        return esDelSistema;
    }

    public void setEsDelSistema(int esDelSistema) {
        this.esDelSistema = esDelSistema;
    }

    public Contactos() {
    }

    public Contactos(Integer idcontacto) {
        this.idcontacto = idcontacto;
    }

    public Integer getIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(Integer idcontacto) {
        this.idcontacto = idcontacto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    @XmlTransient
    public List<Telefonos> getTelefonosList() {
        return telefonosList;
    }

    public void setTelefonosList(List<Telefonos> telefonosList) {
        this.telefonosList = telefonosList;
    }

    @XmlTransient
    public List<Correos> getCorreosList() {
        return correosList;
    }

    public void setCorreosList(List<Correos> correosList) {
        this.correosList = correosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontacto != null ? idcontacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contactos)) {
            return false;
        }
        Contactos other = (Contactos) object;
        if ((this.idcontacto == null && other.idcontacto != null) || (this.idcontacto != null && !this.idcontacto.equals(other.idcontacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getContacto();
    }
    
}
