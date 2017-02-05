/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Logica;

import java.util.ArrayList;
import java.util.List;
import libretadecontactossedeguanacaste.Modelos.Carreras;

import libretadecontactossedeguanacaste.Conexion.ConexionConCarreras;
import libretadecontactossedeguanacaste.Modelos.Departamentos;
/**
 *
 * @author KURISUTIAN
 */
public class GestorDeCarreras {
   
    ConexionConCarreras accesoABaseDeDatos;
    
    public void IngresarCarrera(Carreras laCarrera)
    {
               
     accesoABaseDeDatos= new ConexionConCarreras();
     accesoABaseDeDatos.InsertarCarrera(laCarrera);
    }
    
    public List<Carreras> ObtenerLasCarreras()
    {
         accesoABaseDeDatos= new ConexionConCarreras();
        List<Carreras> ConexionConCarrerases= accesoABaseDeDatos.ObtenerCarreras();
        return ConexionConCarrerases;
        
    }  
    
      public List<Carreras> ObtenerLaListaDeCarrerasOrdenada()
{
      List<Carreras> laListaDeCarreras=new ArrayList<>();
      
      for (Carreras laCarrera : ObtenerLasCarreras()) 
      {
          if (laCarrera.getCarrera().contains("-")) {
              laListaDeCarreras.add(laCarrera);
          }
        
      }
        for (Carreras laCarrera : ObtenerLasCarreras()) 
        {
          if (!(laCarrera.getCarrera().contains("-"))) {
              laListaDeCarreras.add(laCarrera);
          }
        
        }
      
    
      return laListaDeCarreras;
}
     public void ModificarCarrera(Carreras laCarrera)
    {
       accesoABaseDeDatos= new ConexionConCarreras();
       accesoABaseDeDatos.ModificarCarrera(laCarrera);
    }
}
