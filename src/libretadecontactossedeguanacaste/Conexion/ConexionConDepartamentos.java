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
import libretadecontactossedeguanacaste.Modelos.Departamentos;
import libretadecontactossedeguanacaste.Modelos.Instancias;

/**
 *
 * @author KURISUTIAN
 */
public class ConexionConDepartamentos {
    
    Conexion Conexion;
    
    public ConexionConDepartamentos() 
    {
        Conexion=new Conexion();
    }
    
    public String InsertarDepartamentos( Departamentos elDepartamento)
    {
          Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        String registro=null;
      
        try {
            
            String consulta="INSERT INTO Departamentos (Departamento,IdInstancia) VALUES (?,?)";
            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
          pstm.setString(1,elDepartamento.getDepartamento());
          pstm.setInt(2,elDepartamento.getIdinstancia());
            pstm.execute();
            pstm.close();
                  
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           
        }
        return registro;
    }
    
    public List<Departamentos> ObtenerDepartamentos()
    {
              
        List<Departamentos> laListaDeDepartamentos= new ArrayList();
        Departamentos elDepartamento;
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Departamentos");
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               elDepartamento = new Departamentos();
               elDepartamento.setIddepartamento(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               elDepartamento.setDepartamento(resultadoDeLaConsulta.getString(2));
               elDepartamento.setIdinstancia(Integer.parseInt(resultadoDeLaConsulta.getString(3)));
               
               laListaDeDepartamentos.add(elDepartamento);
            }
           
        } catch (Exception e) {
        }
        return laListaDeDepartamentos;
    }
    
      public Departamentos BuscarDepartamento(int IdDepartamento)
    {
              
       
        Departamentos elDepartamento=null;
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Departamentos where IdDepartmento="+IdDepartamento);
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               elDepartamento = new Departamentos();
               elDepartamento.setIddepartamento(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               elDepartamento.setDepartamento(resultadoDeLaConsulta.getString(2));
               elDepartamento.setIdinstancia(Integer.parseInt(resultadoDeLaConsulta.getString(3)));
               
               
            }
           
        } catch (Exception e) {
        }
        return elDepartamento;
    }
    
    public void ModificarDepartamentos(Departamentos elDepartamento)
    {
              
        
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
       
            String consulta="Update Departamentos set IdInstancia=?,Departamento=? where IdDepartamento=?";
            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
            
          pstm.setInt(1,elDepartamento.getIdinstancia());
          pstm.setString(2,elDepartamento.getDepartamento());
          pstm.setInt(3,elDepartamento.getIddepartamento());
          
            pstm.execute();
            pstm.close();
           
           
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
       
        
    }
    
}
