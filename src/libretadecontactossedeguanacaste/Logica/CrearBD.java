/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Logica;
import  libretadecontactossedeguanacaste.Conexion.Conexion;
/**
 *
 * @author KURISUTIAN
 */
public class CrearBD {

    public CrearBD() {
    }
    
    public void CrearLaBaseDeDatos()
    {
        Conexion laConexion= new Conexion();
        laConexion.CrearBD();
      
                
    }
    
   
}
