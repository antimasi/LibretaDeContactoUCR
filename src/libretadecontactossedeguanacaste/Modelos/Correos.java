/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Modelos;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author KURISUTIAN
 */
@Entity
@Table(name = "CORREOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Correos.findAll", query = "SELECT c FROM Correos c"),
    @NamedQuery(name = "Correos.findByIdcorreo", query = "SELECT c FROM Correos c WHERE c.idcorreo = :idcorreo"),
    @NamedQuery(name = "Correos.findByCorreo", query = "SELECT c FROM Correos c WHERE c.correo = :correo")})
public class Correos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCORREO")
    private Integer idcorreo;
    @Column(name = "CORREO")
    private String correo;
    @JoinColumn(name = "IDCONTACTO", referencedColumnName = "IDCONTACTO")
    @ManyToOne(optional = false)
    private int idcontacto;

    public Correos() {
    }

    public Correos(Integer idcorreo) {
        this.idcorreo = idcorreo;
    }

    public Integer getIdcorreo() {
        return idcorreo;
    }

    public void setIdcorreo(Integer idcorreo) {
        this.idcorreo = idcorreo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(int idcontacto) {
        this.idcontacto = idcontacto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcorreo != null ? idcorreo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Correos)) {
            return false;
        }
        Correos other = (Correos) object;
        if ((this.idcorreo == null && other.idcorreo != null) || (this.idcorreo != null && !this.idcorreo.equals(other.idcorreo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getCorreo();
    }
    
}
