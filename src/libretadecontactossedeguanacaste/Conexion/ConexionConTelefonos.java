/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import libretadecontactossedeguanacaste.Modelos.Instancias;
import libretadecontactossedeguanacaste.Modelos.Telefonos;

/**
 *
 * @author KURISUTIAN
 */
public class ConexionConTelefonos {
    
     Conexion Conexion;
    
    public ConexionConTelefonos() 
    {
        Conexion=new Conexion();
    }
    
    public String InsertarTelefono(Telefonos elTelefono)
    {
          Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        String registro=null;
        
        try {
            
             String consulta="INSERT INTO Telefonos (Telefono,IdContacto) VALUES (?,?)" ;
             PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
             pstm.setString(1,elTelefono.getTelefono());
             pstm.setInt(2,elTelefono.getIdcontacto());
            pstm.execute();
            pstm.close();
                  
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           
        }
        return registro;
    }
    
    public List<Telefonos> ObtenerTelefonos(int idContacto)
    {
              
        List<Telefonos> laListaDeTelefonos= new ArrayList();
        Telefonos elTelefono;
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Telefonos where IdContacto="+idContacto);
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               elTelefono= new Telefonos();
               elTelefono.setIdtelefono(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               elTelefono.setTelefono(resultadoDeLaConsulta.getString(2));
               elTelefono.setIdcontacto(Integer.parseInt(resultadoDeLaConsulta.getString(3)));
               
               
               laListaDeTelefonos.add(elTelefono);
            }
           
        } catch (Exception e) {
        }
        return laListaDeTelefonos;
    }
    
}
