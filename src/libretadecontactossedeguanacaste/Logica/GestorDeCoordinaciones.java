/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Logica;

import java.util.List;
import javax.swing.JOptionPane;
import libretadecontactossedeguanacaste.Conexion.ConexionConCoordinacion;
import libretadecontactossedeguanacaste.Modelos.Carreras;
import libretadecontactossedeguanacaste.Modelos.Coordinaciones;

/**
 *
 * @author KURISUTIAN
 */
public class GestorDeCoordinaciones {

    ConexionConCoordinacion accesoABaseDeDatos;
    GestorDeCarreras gestorDeCarreras=new GestorDeCarreras();

    public void IngresarCoordinacion(Coordinaciones laCoordinaciones) {

        accesoABaseDeDatos = new ConexionConCoordinacion();
        accesoABaseDeDatos.InsertarCoordinaciones(laCoordinaciones);
    }

    public List<Coordinaciones> ObtenerLasCoordinaciones() {
        accesoABaseDeDatos = new ConexionConCoordinacion();
        List<Coordinaciones> ConexionConCoordinacion = accesoABaseDeDatos.ObtenerCoordinaciones();
        return ConexionConCoordinacion;

    }
    
     public int ObtenerIdCoordinacion(String nombreCoordinacion)
    {
        int idInstancia=0;
        
      for (Coordinaciones laCoordinacion : ObtenerLasCoordinaciones()) {
        if(laCoordinacion.getCoordinacion().equalsIgnoreCase(nombreCoordinacion))
        {
            
            idInstancia=laCoordinacion.getIdcoordinacion();
        }
    }  
        
       return idInstancia; 
    }
    
     public void ModificarICoordinacionSinCarrera(String nombreDeLaCarrera,String nuevoNombre)
    {
        Carreras laCarrera=new Carreras();
                
        
        for (Carreras carrera : gestorDeCarreras.ObtenerLasCarreras()) {
            
            if (carrera.getCarrera().equalsIgnoreCase("--"+nombreDeLaCarrera)) {
                laCarrera.setIdcarrera(carrera.getIdcarrera());
                  laCarrera.setCarrera("--"+nuevoNombre);
                    laCarrera.setIdcoordinacion(carrera.getIdcoordinacion());
                   
            
            }
        }
        
         
           gestorDeCarreras.ModificarCarrera(laCarrera);
     
    }
    
    
     public void ModificarCoordinaciones(Coordinaciones laCoordinacion)
    {
       accesoABaseDeDatos= new ConexionConCoordinacion();
       accesoABaseDeDatos.ModificarCoordinacion(laCoordinacion);
       
    }
     
    
}
