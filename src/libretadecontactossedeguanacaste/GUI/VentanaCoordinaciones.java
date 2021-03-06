/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.GUI;
import java.util.ArrayList;
import java.util.List;
import libretadecontactossedeguanacaste.Logica.GestorDeCarreras;
import libretadecontactossedeguanacaste.Logica.GestorDeCoordinaciones;
import libretadecontactossedeguanacaste.Logica.GestorDeDepartamentos;
import libretadecontactossedeguanacaste.Logica.GestorDeContactos;
import libretadecontactossedeguanacaste.Logica.GestorDeTelefonos;
import libretadecontactossedeguanacaste.Logica.GestorDeCorreos;
import libretadecontactossedeguanacaste.Modelos.Carreras;
import libretadecontactossedeguanacaste.Modelos.Contactos;
import libretadecontactossedeguanacaste.Modelos.Coordinaciones;
import libretadecontactossedeguanacaste.Modelos.Departamentos;
/**
 *
 * @author KURISUTIAN
 */
public class VentanaCoordinaciones extends javax.swing.JFrame {
  GestorDeCarreras GestorParaCoordinaciones= new GestorDeCarreras();
    /**
     * Creates new form VentanaCoordinaciones
     */
    public VentanaCoordinaciones() {
        initComponents();
        ListarCoordinacionesParaComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        private void ListarCoordinacionesParaComboBox()
    {
       GestorDeCoordinaciones gestorDeCoordinaciones=new GestorDeCoordinaciones();
       Coordinaciones laCoordinacion= new Coordinaciones();
     
        try {
            for (int i = 0; i < gestorDeCoordinaciones.ObtenerLasCoordinaciones().size(); i++) {
             
            laCoordinacion= gestorDeCoordinaciones.ObtenerLasCoordinaciones().get(i);
            CbCoordinaciones.addItem(laCoordinacion);
              
        }
        } catch (Exception e) {
        }
         
         
        
    } 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PmTelefonos = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        JlistContactos = new javax.swing.JList();
        Modificar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        CbCoordinaciones = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JlistCorreos = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        JlistTelefonos = new javax.swing.JList();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("Agregar");
        PmTelefonos.add(jMenuItem1);

        jMenuItem2.setText("Modificar");
        PmTelefonos.add(jMenuItem2);

        jMenuItem3.setText("Eliiminar");
        PmTelefonos.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JlistContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlistContactosPrecionDeClick(evt);
            }
        });
        jScrollPane1.setViewportView(JlistContactos);

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");

        CbCoordinaciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbCoordinacionesseleccionDeLaInstancia(evt);
            }
        });
        CbCoordinaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCoordinacionesActionPerformed(evt);
            }
        });

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(JlistCorreos);

        JlistTelefonos.setComponentPopupMenu(PmTelefonos);
        jScrollPane3.setViewportView(JlistTelefonos);

        jButton8.setText("Eliminar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Eliminar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Agregar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Agregar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefonos");

        jLabel2.setText("Contacto:");

        jLabel3.setText("Correos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Modificar)
                                                .addGap(10, 10, 10)
                                                .addComponent(jButton7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel2))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9)
                                        .addGap(10, 10, 10))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(54, 54, 54))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CbCoordinaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(CbCoordinaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Modificar)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton8)
                                .addComponent(jButton10)
                                .addComponent(jButton11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addGap(2, 2, 2)))
                .addComponent(Salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JlistContactosPrecionDeClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlistContactosPrecionDeClick
        ObtenerDatos();
    }//GEN-LAST:event_JlistContactosPrecionDeClick

    
     public void ObtenerDatos(){
        Contactos elContacto=new Contactos();
  
        try {
          elContacto=(Contactos)JlistContactos.getSelectedValue();
          
        } catch (Exception e) {
        }
         ObtenerTelefonos(elContacto.getIdcontacto());
         ObtenerCorreos(elContacto.getIdcontacto());
            
    
    }
    
     public void ObtenerTelefonos(int IdContacto)
     {
         GestorDeTelefonos gestorDeTelefonos=new GestorDeTelefonos();
         
          JlistTelefonos.setListData(gestorDeTelefonos.ObtenerLosTelefonos(IdContacto).toArray());
         
         
     }
    
     public void ObtenerCorreos(int IdContacto)
     {
         GestorDeCorreos gestorDeCorreos=new GestorDeCorreos();
          JlistCorreos.setListData(gestorDeCorreos.ObtenerLosCorreos(IdContacto).toArray());
         
     }
     public Departamentos ObtieneNombreDelDepartamento(int idDepartamento)
    { 
        Departamentos NombreDelDepartamento=null;
        GestorDeDepartamentos gestorDeDepartamentos=new GestorDeDepartamentos();
        for (Departamentos elDepartamento : gestorDeDepartamentos.ObtenerLosDepartamentos()) {
            
            if(elDepartamento.getIddepartamento()==idDepartamento)
            {
                NombreDelDepartamento=elDepartamento;
            }
        }
       return NombreDelDepartamento; 
    }
    
    public Carreras ObtieneNombreDeLaCarrera(int idCarrera)
    { 
        Carreras NombreDeLaCarrera=null;
        GestorDeCarreras gestorDeCarreras=new GestorDeCarreras();
        for (Carreras laCarrera : gestorDeCarreras.ObtenerLasCarreras()) {
            
            if(laCarrera.getIdcarrera()==idCarrera)
            {
                NombreDeLaCarrera=laCarrera;
            }
        }
       return NombreDeLaCarrera; 
    }
    
    
    
    
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
   Contactos elContactoAModificar=(Contactos)JlistContactos.getSelectedValue();
        ModificarContacto ventanaNueva=new ModificarContacto();    
        ventanaNueva.setVisible(true);
        ventanaNueva.MandarElContactoParaModificar(elContactoAModificar);
    }//GEN-LAST:event_ModificarActionPerformed

    private void CbCoordinacionesseleccionDeLaInstancia(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbCoordinacionesseleccionDeLaInstancia
        Coordinaciones laCoordinacion=(Coordinaciones)CbCoordinaciones.getSelectedItem();
        ListarContactosParaLaLista(laCoordinacion.getIdcoordinacion());
    }//GEN-LAST:event_CbCoordinacionesseleccionDeLaInstancia

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void CbCoordinacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbCoordinacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbCoordinacionesActionPerformed

    public void ListarContactosParaLaLista(int idCoordinacion)
    {
        GestorDeContactos gestorDeContactos=new GestorDeContactos();
        
        List<Contactos> laListaDeContactos=gestorDeContactos.ObtenerLasContactos();
        List<Contactos> laListaDeContactosParaLaLista=new ArrayList<>();
        
        List<Carreras> laListaDeCoordinacionesSinDepartamentos= ObtenerContactosDeInstancias();
        
        for (Carreras laCoordinacion : laListaDeCoordinacionesSinDepartamentos) {
            if (laCoordinacion.getIdcoordinacion()==idCoordinacion) {
               
            for (Contactos elContacto : laListaDeContactos) {
                if (laCoordinacion.getIdcarrera()==elContacto.getIdcarrera()) {
                   laListaDeContactosParaLaLista.add(elContacto);
                }
            }
        }
        }
         JlistContactos.setListData(laListaDeContactosParaLaLista.toArray());
       
    }
    public List<Carreras>ObtenerContactosDeInstancias()
    {
        List<Carreras> laListaDeCoordinaciones= new ArrayList<>();
        
        for (Carreras laCarrera : GestorParaCoordinaciones.ObtenerLasCarreras()) {
            
            if (laCarrera.getCarrera().contains("-")) {
                laListaDeCoordinaciones.add(laCarrera);
            }
            
        }
                return laListaDeCoordinaciones;
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
            java.util.logging.Logger.getLogger(VentanaCoordinaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCoordinaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCoordinaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCoordinaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCoordinaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CbCoordinaciones;
    private javax.swing.JList JlistContactos;
    private javax.swing.JList JlistCorreos;
    private javax.swing.JList JlistTelefonos;
    private javax.swing.JButton Modificar;
    private javax.swing.JPopupMenu PmTelefonos;
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
