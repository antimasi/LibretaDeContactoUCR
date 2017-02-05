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
import libretadecontactossedeguanacaste.Modelos.Carreras;

/**
 *
 * @author KURISUTIAN
 */
public class ConexionConCarreras {
    
    Conexion Conexion;
    
    public ConexionConCarreras() 
    {
        Conexion=new Conexion();
    }
    
    public String InsertarCarrera( Carreras laCarrera)
    {
          Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        String registro=null;
      
        try {
                        String consulta="INSERT INTO Carreras (Carrera,IdCoordinacion) VALUES (?,?)";
            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
          pstm.setString(1,laCarrera.getCarrera());
          pstm.setInt(2,laCarrera.getIdcoordinacion());
            pstm.execute();
            pstm.close();
                  
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           
        }
        return registro;
    }
    
    public List<Carreras> ObtenerCarreras()
    {
              
        List<Carreras> laListaDeDepartamentos= new ArrayList();
        Carreras laCarrera;
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Carreras");
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               laCarrera = new Carreras();
               laCarrera.setIdcarrera(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               laCarrera.setCarrera(resultadoDeLaConsulta.getString(2));
               laCarrera.setIdcoordinacion(Integer.parseInt(resultadoDeLaConsulta.getString(3)));
               
               laListaDeDepartamentos.add(laCarrera);
            }
           
        } catch (Exception e) {
        }
        return laListaDeDepartamentos;
    }
    
    public void ModificarCarrera(Carreras laCarrera)
    {
              
        
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
       
            String consulta="Update Carreras set Carrera=?, idCoordinacion=? where IdCarrera=?";
            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
            
          
          pstm.setString(1,laCarrera.getCarrera());
          pstm.setInt(2,laCarrera.getIdcoordinacion());
          pstm.setInt(3,laCarrera.getIdcarrera());          
            pstm.execute();
            pstm.close();
           
           
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
       
        
    }
}
