/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author KURISUTIAN
 */
public class Conexion {

    public Conexion() 
    {
    }
  public Connection CrearBD(){
     
   Connection Conexion= null;
      try{
     
         Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        
         Conexion = DriverManager.getConnection("jdbc:derby:.\\Libreta de contactos\\Derby.DB;create=true");
         if (Conexion!=null){
           
            try {
            PreparedStatement pstm = Conexion.prepareStatement(new TablasDeLaBaseDeDatos().TablaInstancias());
            pstm.execute();
            pstm.close();
            
            PreparedStatement pstm2 = Conexion.prepareStatement(new TablasDeLaBaseDeDatos().TablaDepartamento());
            pstm2.execute();
            pstm2.close();
             PreparedStatement pstm3 = Conexion.prepareStatement(new TablasDeLaBaseDeDatos().TablaCoordinacion());
            pstm3.execute();
            pstm3.close();
            PreparedStatement pstm4 = Conexion.prepareStatement(new TablasDeLaBaseDeDatos().TablaCarreras());
            pstm4.execute();
            pstm4.close(); 
             PreparedStatement pstm5 = Conexion.prepareStatement(new TablasDeLaBaseDeDatos().TablaContactos());
            pstm5.execute();
            pstm5.close();
             PreparedStatement pstm6 = Conexion.prepareStatement(new TablasDeLaBaseDeDatos().TablaTelefonos());
            pstm6.execute();
            pstm6.close();
             PreparedStatement pstm7 = Conexion.prepareStatement(new TablasDeLaBaseDeDatos().TablaCorreos());
            pstm7.execute();
            pstm7.close();
           JOptionPane.showMessageDialog(null,"BD Creada correctamente");
        } catch (SQLException ex) {
          
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
         }
      }catch(SQLException e){
       JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }
       return Conexion;
    
  }


public Connection ObtenerConexion()
    {
    Connection Conexion= null;
    try{
    
         Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        
         Conexion = DriverManager.getConnection("jdbc:derby:.\\Libreta de contactos\\Derby.DB");
         if (Conexion!=null){
          
         }
      }catch(SQLException e){
       JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }
       return Conexion;
    }
}
