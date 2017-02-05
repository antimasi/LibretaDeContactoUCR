/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Logica;

import java.util.List;
import libretadecontactossedeguanacaste.Conexion.ConexionConTelefonos;
import libretadecontactossedeguanacaste.Modelos.Telefonos;

/**
 *
 * @author KURISUTIAN
 */
public class GestorDeTelefonos {
     ConexionConTelefonos accesoABaseDeDatos;
    
    public void IngresarTelefono(Telefonos elTelefono)
    {
               
     accesoABaseDeDatos= new ConexionConTelefonos();
     accesoABaseDeDatos.InsertarTelefono(elTelefono);
    }
    
    public List<Telefonos> ObtenerLosTelefonos(int idContacto)
    {
         accesoABaseDeDatos= new ConexionConTelefonos();
        List<Telefonos> ConexionConTelefonos= accesoABaseDeDatos.ObtenerTelefonos(idContacto);
        return ConexionConTelefonos;
        
    }  
}
