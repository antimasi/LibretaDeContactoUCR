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
import libretadecontactossedeguanacaste.Modelos.Correos;

/**
 *
 * @author KURISUTIAN
 */
public class ConexionConCorreos {
    
     Conexion Conexion;
    
    public ConexionConCorreos() 
    {
        Conexion=new Conexion();
    }
    
    public String InsertarCorreo(Correos elCorreo)
    {
          Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        String registro=null;
        
        try {
            
             String consulta="INSERT INTO Correos (Correo,IdContacto) VALUES (?,?)" ;
             PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
             pstm.setString(1,elCorreo.getCorreo());
             pstm.setInt(2,elCorreo.getIdcontacto());
            pstm.execute();
            pstm.close();
                  
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           
        }
        return registro;
    }
    
    public List<Correos> ObtenerCorreos(int idContacto)
    {
              
        List<Correos> laListaDeCorreos= new ArrayList();
        Correos elCorreo;
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Correos where IdContacto="+idContacto);
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               elCorreo= new Correos();
               elCorreo.setIdcorreo(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               elCorreo.setCorreo(resultadoDeLaConsulta.getString(2));
               elCorreo.setIdcontacto(Integer.parseInt(resultadoDeLaConsulta.getString(3)));
               
               laListaDeCorreos.add(elCorreo);
            }
           
        } catch (Exception e) {
        }
        return laListaDeCorreos;
    }
}
