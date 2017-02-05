/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.GUI;
import javax.swing.JOptionPane;
import libretadecontactossedeguanacaste.Logica.GestorDeCarreras;
import libretadecontactossedeguanacaste.Logica.GestorDeCoordinaciones;
import libretadecontactossedeguanacaste.Logica.GestorDeDepartamentos;
import libretadecontactossedeguanacaste.Logica.GestorDeInstancias;
import libretadecontactossedeguanacaste.Modelos.Carreras;
import libretadecontactossedeguanacaste.Modelos.Coordinaciones;
import libretadecontactossedeguanacaste.Modelos.Departamentos;
import libretadecontactossedeguanacaste.Modelos.Instancias;

/**
 *
 * @author KURISUTIAN
 */
public class AgregarCoordinacion extends javax.swing.JFrame {

    GestorDeCoordinaciones gestorDeCoordinaciones=new GestorDeCoordinaciones();
    GestorDeCarreras gestorDeCarreras=new GestorDeCarreras();
    
    
    /**
     * Creates new form AgregarCoordinacion
     */
    public AgregarCoordinacion() {
        initComponents();
        LlenarListaDeCoordinaciones();
    }

     private void LlenarListaDeCoordinaciones()
    {
                
                  
         JListaDeCoordinaciones.setListData(gestorDeCoordinaciones.ObtenerLasCoordinaciones().toArray());
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modificar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListaDeCoordinaciones = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtCoordinacion = new javax.swing.JTextField();
        AgregarNuevaInstancia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Agregue una nueva coordinación");

        JListaDeCoordinaciones.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        JListaDeCoordinaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PresionDeClick(evt);
            }
        });
        jScrollPane1.setViewportView(JListaDeCoordinaciones);

        jLabel1.setText("Selecione una coordinación");

        AgregarNuevaInstancia.setText("Agregar");
        AgregarNuevaInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNuevaInstanciaActionPerformed(evt);
            }
        });

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
                                .addComponent(txtCoordinacion)
                                .addGap(23, 23, 23))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(AgregarNuevaInstancia))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)))
                                .addGap(0, 32, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCoordinacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgregarNuevaInstancia)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Modificar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jButton3))))
                    .addComponent(jScrollPane1))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarNuevaInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNuevaInstanciaActionPerformed

        if(SiElNombreExiste(txtCoordinacion.getText()))
        {
            JOptionPane.showMessageDialog(null, "El nombre de la instancia ya esta registrado");

        }else if(txtCoordinacion.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "no debe dejar el nombre vacio");

        }else
        {

            Coordinaciones laNuevaCoordinacion=new Coordinaciones();

            laNuevaCoordinacion.setCoordinacion(txtCoordinacion.getText());
            gestorDeCoordinaciones.IngresarCoordinacion(laNuevaCoordinacion);
            IngresarCoordinacionSinCarrera(txtCoordinacion.getText());

        }

        LlenarListaDeCoordinaciones();
    }//GEN-LAST:event_AgregarNuevaInstanciaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
      
        if(SiElNombreExiste(txtCoordinacion.getText()) )
        {
            JOptionPane.showMessageDialog(null, "El nombre de la coordinación ya esta registrado");
              
        }else if(txtCoordinacion.getText().equalsIgnoreCase(""))
        {
           JOptionPane.showMessageDialog(null, "no debe dejar el nombre vacio");
             
        }else if(JListaDeCoordinaciones.isSelectionEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Debe selecionar una coordinación para modificar");
            
        }else
        {
           
            
            Coordinaciones laNuevaCoordinacion=(Coordinaciones)JListaDeCoordinaciones.getSelectedValue();
            String elNombreViiejo=laNuevaCoordinacion.getCoordinacion();
             int acepto=JOptionPane.showConfirmDialog(null, "desea modificar el registro"+laNuevaCoordinacion.getCoordinacion());
             
       if(acepto==JOptionPane.YES_OPTION){
        laNuevaCoordinacion.setCoordinacion(txtCoordinacion.getText());
        laNuevaCoordinacion.setIdcoordinacion(ObtenerIdCoordinacion());
        
        gestorDeCoordinaciones.ModificarCoordinaciones(laNuevaCoordinacion);
       }else{JOptionPane.showMessageDialog(null, "No se modifico el registro");}
        }
        txtCoordinacion.setText("");
        
        
        LlenarListaDeCoordinaciones();  
    }//GEN-LAST:event_ModificarActionPerformed

      public void ObtenerDatos(){
  Coordinaciones laCoordinacion=new Coordinaciones();
  
        try {
          laCoordinacion=(Coordinaciones)JListaDeCoordinaciones.getSelectedValue();
          
        } catch (Exception e) {
        }
  
  txtCoordinacion.setText(laCoordinacion.getCoordinacion());
          
    
    }
    
    
    private void PresionDeClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresionDeClick
        ObtenerDatos();
    }//GEN-LAST:event_PresionDeClick

    
    
        public Integer ObtenerIdCoordinacion(){
Integer idCoordinacion;
 Coordinaciones laCoordinacion=(Coordinaciones)JListaDeCoordinaciones.getSelectedValue();

idCoordinacion=laCoordinacion.getIdcoordinacion();
return idCoordinacion;
}
 

    
    public void IngresarCoordinacionSinCarrera(String NombreCoordinacion)
    {
       
         
        Carreras laCarrera=new Carreras();
      
        laCarrera.setCarrera("--"+NombreCoordinacion);
        laCarrera.setIdcoordinacion(gestorDeCoordinaciones.ObtenerIdCoordinacion(NombreCoordinacion));
        
        gestorDeCarreras.IngresarCarrera(laCarrera);

        
        
        
    }
     private boolean SiElNombreExiste(String Nombre)
{
    boolean Existe=false;
  
   
    for (Coordinaciones laCoordinacion : gestorDeCoordinaciones.ObtenerLasCoordinaciones()) {
        try {
            if(laCoordinacion.getCoordinacion().equalsIgnoreCase(Nombre))
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
            java.util.logging.Logger.getLogger(AgregarCoordinacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCoordinacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCoordinacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCoordinacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCoordinacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarNuevaInstancia;
    private javax.swing.JList JListaDeCoordinaciones;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCoordinacion;
    // End of variables declaration//GEN-END:variables
}