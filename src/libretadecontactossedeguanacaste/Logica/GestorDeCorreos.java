/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Logica;

import java.util.List;
import libretadecontactossedeguanacaste.Conexion.ConexionConCorreos;
import libretadecontactossedeguanacaste.Modelos.Correos;

/**
 *
 * @author KURISUTIAN
 */
public class GestorDeCorreos {
     ConexionConCorreos accesoABaseDeDatos;
    
    public void IngresarCorreo(Correos elCorreo)
    {
               
     accesoABaseDeDatos= new ConexionConCorreos();
     accesoABaseDeDatos.InsertarCorreo(elCorreo);
    }
    
    public List<Correos> ObtenerLosCorreos(int idContacto)
    {
         accesoABaseDeDatos= new ConexionConCorreos();
        List<Correos> ConexionConCorreos= accesoABaseDeDatos.ObtenerCorreos(idContacto);
        return ConexionConCorreos;
        
    }  
}
