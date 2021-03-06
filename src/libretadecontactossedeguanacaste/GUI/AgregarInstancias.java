/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.GUI;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import libretadecontactossedeguanacaste.Modelos.Instancias;
import libretadecontactossedeguanacaste.Modelos.Departamentos;
import libretadecontactossedeguanacaste.Logica.GestorDeInstancias;
import libretadecontactossedeguanacaste.Logica.GestorDeDepartamentos;

/**
 *
 * @author KURISUTIAN
 */
public class AgregarInstancias extends javax.swing.JFrame {


private GestorDeInstancias GestorDeInstancias;
private GestorDeDepartamentos GestorDeDeartamentos;
    /**
     * Creates new form AgregarInstancias
     */
    public AgregarInstancias() {
        initComponents();
        LlenarListaDeInstancias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void LlenarListaDeInstancias()
    {
                
         GestorDeInstancias= new GestorDeInstancias();         
         JListaDeInstancias.setListData(GestorDeInstancias.ObtenerLasInstancias().toArray());
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JListaDeInstancias = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        AgregarNuevaInstancia = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtInstancia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        JListaDeInstancias.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        JListaDeInstancias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PresionDelClick(evt);
            }
        });
        jScrollPane1.setViewportView(JListaDeInstancias);

        jLabel1.setText("Selecione una instancia");

        AgregarNuevaInstancia.setText("Agregar");
        AgregarNuevaInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNuevaInstanciaActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");

        jLabel2.setText("Agregue una nueva Instancia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Modificar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInstancia)
                                .addGap(23, 23, 23))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(AgregarNuevaInstancia))
                                    .addComponent(jLabel2))
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(txtInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgregarNuevaInstancia)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Modificar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarNuevaInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNuevaInstanciaActionPerformed
     
          if(SiElNombreExiste(txtInstancia.getText()))
        {
            JOptionPane.showMessageDialog(null, "El nombre de la instancia ya esta registrado");
              
        }else if(txtInstancia.getText().equalsIgnoreCase(""))
        {
           JOptionPane.showMessageDialog(null, "no debe dejar el nombre vacio");
             
        }else
        {
        
        
        Instancias laNuevaInstancia=new Instancias();
           
        laNuevaInstancia.setInstancia(txtInstancia.getText());
        GestorDeInstancias.IngresarInstancia(laNuevaInstancia);
         IngresarInstanciaSinDepartamento(txtInstancia.getText());
        
        }
        
             
        LlenarListaDeInstancias();
    }//GEN-LAST:event_AgregarNuevaInstanciaActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
       
        if(SiElNombreExiste(txtInstancia.getText()) )
        {
            JOptionPane.showMessageDialog(null, "El nombre del departamento ya esta registrado");
              
        }else if(txtInstancia.getText().equalsIgnoreCase(""))
        {
           JOptionPane.showMessageDialog(null, "no debe dejar el nombre vacio");
             
        }else if(JListaDeInstancias.isSelectionEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Debe selecionar un departamento para modificar");
            
        }else
        {
           
            
            Instancias laInstanciaAModificar=(Instancias)JListaDeInstancias.getSelectedValue();
            String nombreDeLaInstancia=laInstanciaAModificar.getInstancia();
             int acepto=JOptionPane.showConfirmDialog(null, "desea modificar el registro "+laInstanciaAModificar.getInstancia());
             
       if(acepto==JOptionPane.YES_OPTION){
        laInstanciaAModificar.setInstancia(txtInstancia.getText());
        laInstanciaAModificar.setIdinstancia(ObtenerIdInstancia());
        
        GestorDeInstancias.ModificarInstancia(laInstanciaAModificar);
        GestorDeInstancias.ModificarInstanciaSinDepartamento(nombreDeLaInstancia,txtInstancia.getText());
        
       }else{JOptionPane.showMessageDialog(null, "No se modifico el registro");}
        }
        txtInstancia.setText("");
        
        
        LlenarListaDeInstancias();   
    }//GEN-LAST:event_ModificarActionPerformed

     public void ObtenerDatos(){
  Instancias laInstancia=new Instancias();
  
        try {
          laInstancia=(Instancias)JListaDeInstancias.getSelectedValue();
          
        } catch (Exception e) {
        }
  
  txtInstancia.setText(laInstancia.getInstancia());
          
    
    }
    
    private void PresionDelClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresionDelClick
        ObtenerDatos();
    }//GEN-LAST:event_PresionDelClick

        public Integer ObtenerIdInstancia(){
Integer idInstancia;
 Instancias laInstancia=(Instancias)JListaDeInstancias.getSelectedValue();

idInstancia=laInstancia.getIdinstancia();
return idInstancia;
}
 
    
    
    
    public void IngresarInstanciaSinDepartamento(String NombreInstancia)
    {
         GestorDeInstancias=new GestorDeInstancias();
         GestorDeDeartamentos=new GestorDeDepartamentos();
         
        Departamentos elNuevoDepartamento=new Departamentos();
      
        elNuevoDepartamento.setDepartamento("--"+NombreInstancia);
        elNuevoDepartamento.setIdinstancia(GestorDeInstancias.ObtenerIdInstancia(NombreInstancia));
        
        GestorDeDeartamentos.IngresarDepartamentos(elNuevoDepartamento);

        
        
        
    }
        private boolean SiElNombreExiste(String Nombre)
{
    boolean Existe=false;
   GestorDeInstancias GestorDeInstancias=new GestorDeInstancias(); 
   
    for (Instancias laInstancia : GestorDeInstancias.ObtenerLasInstancias()) {
        try {
            if(laInstancia.getInstancia().equalsIgnoreCase(Nombre))
        {
            Existe=true;
        }
        } catch (NullPointerException e) {
            //JOptionPane.showMessageDialog(null, "el campo esta nulo");
        }
        
    }
   
   
   
   return Existe;
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarInstancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarInstancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarInstancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarInstancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarInstancias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarNuevaInstancia;
    private javax.swing.JList JListaDeInstancias;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInstancia;
    // End of variables declaration//GEN-END:variables
}
