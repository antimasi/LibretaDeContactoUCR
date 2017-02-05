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
import libretadecontactossedeguanacaste.Modelos.Coordinaciones;

/**
 *
 * @author KURISUTIAN
 */
public class ConexionConCoordinacion {
    
    Conexion Conexion;
    
    public ConexionConCoordinacion() 
    {
        Conexion=new Conexion();
    }
    
    public String InsertarCoordinaciones( Coordinaciones laCoordinacion)
    {
          Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        String registro=null;
      
        try {
            
            String consulta="INSERT INTO Coordinaciones (Coordinacion) VALUES (?)";
            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
          pstm.setString(1,laCoordinacion.getCoordinacion());
          
            pstm.execute();
            pstm.close();
                  
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           
        }
        return registro;
    }
    
    public List<Coordinaciones> ObtenerCoordinaciones()
    {
              
        List<Coordinaciones> laListaDeDepartamentos= new ArrayList();
        Coordinaciones laCoordinacion;
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Coordinaciones");
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               laCoordinacion = new Coordinaciones();
               laCoordinacion.setIdcoordinacion(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               laCoordinacion.setCoordinacion(resultadoDeLaConsulta.getString(2));
               
               laListaDeDepartamentos.add(laCoordinacion);
            }
           
        } catch (Exception e) {
        }
        return laListaDeDepartamentos;
    }
    
     public void ModificarCoordinacion(Coordinaciones laCoordinacion)
    {
              
        
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
       
            String consulta="Update Coordinaciones set Coordinacion=? where IdCoordinacion=?";
            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
            
          
          pstm.setString(1,laCoordinacion.getCoordinacion());
          pstm.setInt(2,laCoordinacion.getIdcoordinacion());
          
            pstm.execute();
            pstm.close();
           
           
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
       
        
    }
}
