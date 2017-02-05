/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Conexion;
import libretadecontactossedeguanacaste.Modelos.Instancias;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author KURISUTIAN
 */
public class ConexionConInstancias {

    Conexion Conexion;
    
    public ConexionConInstancias() 
    {
        Conexion=new Conexion();
    }
    
    public String InsertarInstancia(Instancias instancia)
    {
          Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        String registro=null;
        
        try {
            
             String consulta="INSERT INTO Instancias (Instancia) VALUES ('"+instancia.getInstancia()+"')" ;
            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
            pstm.execute();
            pstm.close();
                  
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           
        }
        return registro;
    }
    
    public List<Instancias> ObtenerInstancias()
    {
              
        List<Instancias> laListaDeInstancias= new ArrayList();
        Instancias laInstancia;
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Instancias");
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               laInstancia= new Instancias();
               laInstancia.setIdinstancia(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               laInstancia.setInstancia(resultadoDeLaConsulta.getString(2));
               
               laListaDeInstancias.add(laInstancia);
            }
           
        } catch (Exception e) {
        }
        return laListaDeInstancias;
    }
    
     public void ModificarInstancia(Instancias laInstancia)
    {
              
        
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
       
            String consulta="Update Instancias set Instancia=? where IdInstancia=?";
            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
            
          
          pstm.setString(1,laInstancia.getInstancia());
          pstm.setInt(2,laInstancia.getIdinstancia());
          
            pstm.execute();
            pstm.close();
           
           
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
       
        
    }
    
    
}
