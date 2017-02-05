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
import libretadecontactossedeguanacaste.Modelos.Contactos;

/**
 *
 * @author KURISUTIAN
 */
public class ConexionConContactos {
    
    Conexion Conexion;
    
    public ConexionConContactos() 
    {
        Conexion=new Conexion();
    }
    
    public String InsertarCarrera( Contactos elContacto)
    {
          Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        String registro=null;
      
        try {
            
            String consulta="INSERT INTO Contactos (Contacto,IdCarrera,IdDepartamento,EsDelSistema) VALUES (?,?,?,?)";
            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
          pstm.setString(1,elContacto.getContacto());
          pstm.setInt(2,elContacto.getIdcarrera());
           pstm.setInt(3,elContacto.getIddepartamento());
            pstm.setInt(4,elContacto.getEsDelSistema());
            pstm.execute();
            pstm.close();
                  
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           
        }
        return registro;
    }
    
    public List<Contactos> ObtenerContactos()
    {
              
        List<Contactos> laListaDeDepartamentos= new ArrayList();
        Contactos elContacto;
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Contactos");
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               elContacto = new Contactos();
               elContacto.setIdcontacto(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               elContacto.setContacto(resultadoDeLaConsulta.getString(2));
               elContacto.setIdcarrera(Integer.parseInt(resultadoDeLaConsulta.getString(3)));
               elContacto.setIddepartamento(Integer.parseInt(resultadoDeLaConsulta.getString(4)));
               elContacto.setEsDelSistema(Integer.parseInt(resultadoDeLaConsulta.getString(5)));
               
               laListaDeDepartamentos.add(elContacto);
            }
           
        } catch (Exception e) {
        }
        return laListaDeDepartamentos;
    }
    public List<Contactos> ObtenerContactosPorCarreras(int idCarrera)
    {
              
        List<Contactos> laListaDeDepartamentos= new ArrayList();
        Contactos elContacto;
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Contactos Where IdCarrera="+idCarrera);
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               elContacto = new Contactos();
               elContacto.setIdcontacto(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               elContacto.setContacto(resultadoDeLaConsulta.getString(2));
               elContacto.setIdcarrera(Integer.parseInt(resultadoDeLaConsulta.getString(3)));
               elContacto.setIddepartamento(Integer.parseInt(resultadoDeLaConsulta.getString(4)));
               elContacto.setEsDelSistema(Integer.parseInt(resultadoDeLaConsulta.getString(5)));
               
               laListaDeDepartamentos.add(elContacto);
            }
           
        } catch (Exception e) {
        }
        return laListaDeDepartamentos;
    }
    public List<Contactos> ObtenerContactosPorDepartamento(int idDepartamento)
    {
              
        List<Contactos> laListaDeDepartamentos= new ArrayList();
        Contactos elContacto;
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Contactos Where IdDepartamento="+idDepartamento);
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               elContacto = new Contactos();
               elContacto.setIdcontacto(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               elContacto.setContacto(resultadoDeLaConsulta.getString(2));
               elContacto.setIdcarrera(Integer.parseInt(resultadoDeLaConsulta.getString(3)));
               elContacto.setIddepartamento(Integer.parseInt(resultadoDeLaConsulta.getString(4)));
                elContacto.setEsDelSistema(Integer.parseInt(resultadoDeLaConsulta.getString(5)));
               laListaDeDepartamentos.add(elContacto);
            }
           
        } catch (Exception e) {
        }
        return laListaDeDepartamentos;
    }
     public List<Contactos> ObtenerContactosEnEspecifico(int idDepartamento,int idCarrera)
    {
              
        List<Contactos> laListaDeContactos= new ArrayList();
        Contactos elContacto;
        try {
          Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
          PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select*from Contactos Where IdDepartamento="+
          idDepartamento+"and IdCarrera="+idCarrera);
          ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
               elContacto = new Contactos();
               elContacto.setIdcontacto(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               elContacto.setContacto(resultadoDeLaConsulta.getString(2));
               elContacto.setIdcarrera(Integer.parseInt(resultadoDeLaConsulta.getString(3)));
               elContacto.setIddepartamento(Integer.parseInt(resultadoDeLaConsulta.getString(4)));
                elContacto.setEsDelSistema(Integer.parseInt(resultadoDeLaConsulta.getString(5)));
               laListaDeContactos.add(elContacto);
            }
           
        } catch (Exception e) {
        }
        return laListaDeContactos;
    }
      public Contactos BuscarContacto(String nombre)
    {
              
        
        Contactos elContacto= new Contactos();
        try {
          Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
          PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("select * from Contactos where Contacto="+nombre);
          ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
         
               elContacto.setIdcontacto(Integer.parseInt(resultadoDeLaConsulta.getString(1)));
               elContacto.setContacto(resultadoDeLaConsulta.getString(2));
               elContacto.setIdcarrera(Integer.parseInt(resultadoDeLaConsulta.getString(3)));
               elContacto.setIddepartamento(Integer.parseInt(resultadoDeLaConsulta.getString(4)));
               elContacto.setEsDelSistema(Integer.parseInt(resultadoDeLaConsulta.getString(5)));
               
           
        } catch (Exception e) {
        }
        return elContacto;
    }
      
      public void ModificarContacto(Contactos elContacto)
    {
              
        
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
       
            String consulta="Update Contactos set Contacto=?,IdCarrera=?,IdDepartamento=? where IdContacto=?";
            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
            
          
          pstm.setString(1,elContacto.getContacto());
          pstm.setInt(2,elContacto.getIdcarrera());
          pstm.setInt(3,elContacto.getIddepartamento());
          pstm.setInt(4,elContacto.getIdcontacto());
                    
            pstm.execute();
            pstm.close();
           
           
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
       
        
    }
}
