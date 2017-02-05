/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Logica;
import java.util.List;
import javax.swing.JOptionPane;
import libretadecontactossedeguanacaste.Conexion.Conexion;
import libretadecontactossedeguanacaste.Conexion.ConexionConInstancias;
import libretadecontactossedeguanacaste.Modelos.Departamentos;
import libretadecontactossedeguanacaste.Modelos.Instancias;


public class GestorDeInstancias {
    ConexionConInstancias accesoABaseDeDatos;
    GestorDeDepartamentos gestorDeDepartamentos=new GestorDeDepartamentos();
            
    public void IngresarInstancia(Instancias laNuevaInstancia)
    {
               
     accesoABaseDeDatos= new ConexionConInstancias();
     accesoABaseDeDatos.InsertarInstancia(laNuevaInstancia);        
    }
    
    public List<Instancias> ObtenerLasInstancias()
    {
         accesoABaseDeDatos= new ConexionConInstancias();
        List<Instancias> laListaDeinstancias= accesoABaseDeDatos.ObtenerInstancias();
        return laListaDeinstancias;
        
    }
    
    public int ObtenerIdInstancia(String nombreInstancia)
    {
        int idInstancia=0;
        
      for (Instancias laInstancia : ObtenerLasInstancias()) {
        if(laInstancia.getInstancia().equalsIgnoreCase(nombreInstancia))
        {
            JOptionPane.showMessageDialog(null, laInstancia.getInstancia());
            idInstancia=laInstancia.getIdinstancia();
        }
    }  
        
       return idInstancia; 
    }
    
    public void ModificarInstanciaSinDepartamento(String nombreDeLaInstancia,String nuevoNombre)
    {
        Departamentos elDepartamento=new Departamentos();
                
        
        for (Departamentos departameto : gestorDeDepartamentos.ObtenerLosDepartamentos()) {
            
            if (departameto.getDepartamento().equalsIgnoreCase("--"+nombreDeLaInstancia)) {
                elDepartamento.setIddepartamento(departameto.getIddepartamento());
                  elDepartamento.setDepartamento("--"+nuevoNombre);
                    elDepartamento.setIdinstancia(departameto.getIdinstancia());
                    JOptionPane.showMessageDialog(null, "lo encontro "+elDepartamento.getDepartamento() );
            
            }
        }
        
         
           gestorDeDepartamentos.ModificarDepartamento(elDepartamento);
     
    }
    
    
     public void ModificarInstancia(Instancias laInstancias)
    {
       accesoABaseDeDatos= new ConexionConInstancias();
       accesoABaseDeDatos.ModificarInstancia(laInstancias);
       
    }
    
   
  
}
