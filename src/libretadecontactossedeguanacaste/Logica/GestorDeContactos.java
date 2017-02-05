/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Logica;

import java.util.List;
import libretadecontactossedeguanacaste.Conexion.ConexionConContactos;
import libretadecontactossedeguanacaste.Modelos.Contactos;

/**
 *
 * @author KURISUTIAN
 */
public class GestorDeContactos {
    ConexionConContactos accesoABaseDeDatos;
    
    public void IngresarDepartamentos(Contactos elContacto)
    {
               
     accesoABaseDeDatos= new ConexionConContactos();
     accesoABaseDeDatos.InsertarCarrera(elContacto);
    }
    
    public List<Contactos> ObtenerLasContactos()
    {
         accesoABaseDeDatos= new ConexionConContactos();
        List<Contactos> ConexionConContactos= accesoABaseDeDatos.ObtenerContactos();
        return ConexionConContactos;
        
    }  
    public List<Contactos> ObtenerLasContactosPorCarrera(int idCarrera)
    {
         accesoABaseDeDatos= new ConexionConContactos();
        List<Contactos> ConexionConContactos= accesoABaseDeDatos.ObtenerContactosPorCarreras(idCarrera);
        return ConexionConContactos;
        
    }  
       public List<Contactos> ObtenerLasContactosPorDepartamentos(int idDepartamento)
    {
         accesoABaseDeDatos= new ConexionConContactos();
        List<Contactos> ConexionConContactos= accesoABaseDeDatos.ObtenerContactosPorCarreras(idDepartamento);
        return ConexionConContactos;
        
    }  
        public List<Contactos> ObtenerLasContactosEnEspecifico(int idDepartamento, int idCarrera)
    {
         accesoABaseDeDatos= new ConexionConContactos();
        List<Contactos> ConexionConContactos= accesoABaseDeDatos.ObtenerContactosEnEspecifico(idDepartamento, idCarrera);
        return ConexionConContactos;
        
    }  
           public Contactos BuscarContacto(String nombreContacto)
    {
         accesoABaseDeDatos= new ConexionConContactos();
        Contactos ConexionConContactos= accesoABaseDeDatos.BuscarContacto(nombreContacto);
        return ConexionConContactos;
        
    }  
           
           public void ModificarContacto(Contactos elContacto)
           {
             accesoABaseDeDatos= new ConexionConContactos();
             accesoABaseDeDatos.ModificarContacto(elContacto);
           }
}
