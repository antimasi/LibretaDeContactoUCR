/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Logica;


import java.util.ArrayList;
import java.util.List;
import libretadecontactossedeguanacaste.Conexion.ConexionConDepartamentos;
import libretadecontactossedeguanacaste.Modelos.Departamentos;


/**
 *
 * @author KURISUTIAN
 */
public class GestorDeDepartamentos {
   
    ConexionConDepartamentos accesoABaseDeDatos;
    
    public void IngresarDepartamentos(Departamentos elDepartamento)
    {
               
     accesoABaseDeDatos= new ConexionConDepartamentos();
     accesoABaseDeDatos.InsertarDepartamentos(elDepartamento);        
    }
    
    public List<Departamentos> ObtenerLosDepartamentos()
    {
         accesoABaseDeDatos= new ConexionConDepartamentos();
        List<Departamentos> laListaDeDepartamentos= accesoABaseDeDatos.ObtenerDepartamentos();
        return laListaDeDepartamentos;
        
    }
    
    public List<Departamentos> ObtenerLaListaDeDepartamentosOrdenada()
{
      List<Departamentos> laListaDeDepartamentos=new ArrayList<>();
      
      for (Departamentos elDepartamento : ObtenerLosDepartamentos()) 
      {
          if (elDepartamento.getDepartamento().contains("-")) {
              laListaDeDepartamentos.add(elDepartamento);
          }
        
      }
        for (Departamentos elDepartamento : ObtenerLosDepartamentos()) 
        {
          if (!(elDepartamento.getDepartamento().contains("-"))) {
              laListaDeDepartamentos.add(elDepartamento);
          }
        
        }
      
    
      return laListaDeDepartamentos;
}
    public void ModificarDepartamento(Departamentos elDepartamento)
    {
       accesoABaseDeDatos= new ConexionConDepartamentos();
       accesoABaseDeDatos.ModificarDepartamentos(elDepartamento);
    }
    public Departamentos BuscarDepartamento(Departamentos elDepartamento)
    {
       accesoABaseDeDatos= new ConexionConDepartamentos();
      return accesoABaseDeDatos.BuscarDepartamento(elDepartamento.getIddepartamento());  
    }
}
