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
@Table(name = "DEPARTAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamentos.findAll", query = "SELECT d FROM Departamentos d"),
    @NamedQuery(name = "Departamentos.findByIddepartamento", query = "SELECT d FROM Departamentos d WHERE d.iddepartamento = :iddepartamento"),
    @NamedQuery(name = "Departamentos.findByDepartamento", query = "SELECT d FROM Departamentos d WHERE d.departamento = :departamento")})
public class Departamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDDEPARTAMENTO")
    private Integer iddepartamento;
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddepartamento")
    private List<Contactos> contactosList;
    @JoinColumn(name = "IDINSTANCIA", referencedColumnName = "IDINSTANCIA")
    @ManyToOne(optional = false)
    private Integer idinstancia;

    public Departamentos() {
    }

    public Departamentos(Integer iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public Integer getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Integer iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @XmlTransient
    public List<Contactos> getContactosList() {
        return contactosList;
    }

    public void setContactosList(List<Contactos> contactosList) {
        this.contactosList = contactosList;
    }

    public int  getIdinstancia() {
        return idinstancia;
    }

    public void setIdinstancia(int  idinstancia) {
        this.idinstancia = idinstancia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddepartamento != null ? iddepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamentos)) {
            return false;
        }
        Departamentos other = (Departamentos) object;
        if ((this.iddepartamento == null && other.iddepartamento != null) || (this.iddepartamento != null && !this.iddepartamento.equals(other.iddepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getDepartamento();
    }
    
}
