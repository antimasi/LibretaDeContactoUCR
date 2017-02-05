/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libretadecontactossedeguanacaste.GUI;

import javax.swing.JOptionPane;
import libretadecontactossedeguanacaste.Logica.GestorDeCarreras;
import libretadecontactossedeguanacaste.Logica.GestorDeCoordinaciones;
import libretadecontactossedeguanacaste.Modelos.Carreras;
import libretadecontactossedeguanacaste.Modelos.Coordinaciones;
import libretadecontactossedeguanacaste.Modelos.Departamentos;

/**
 *
 * @author KURISUTIAN
 */
public class AgregarCarrera extends javax.swing.JFrame {
GestorDeCarreras gestorDeCarreras=new GestorDeCarreras();
    /**
     * Creates new form AgregarCarrera
     */
    public AgregarCarrera() {
        initComponents();
        ListarCoordinacionesParaComboBox();
        LlenarListaDeCarreras();
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
        Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListaDeDepartamentos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        AgregarNuevaCarrera = new javax.swing.JButton();
        CbCoordinaciones = new javax.swing.JComboBox();
        txtDepartamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        JListaDeDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListaDeDepartamentosPresionDeClick(evt);
            }
        });
        jScrollPane1.setViewportView(JListaDeDepartamentos);

        jLabel1.setText("Selecione una carrera");

        AgregarNuevaCarrera.setText("Agregar");
        AgregarNuevaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNuevaCarreraActionPerformed(evt);
            }
        });

        CbCoordinaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCoordinacionesActionPerformed(evt);
            }
        });

        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione una Coordinacion");

        jLabel4.setText("las opciones con \"--\" significan que no son departamentos, sino instancias");

        jLabel6.setText("Nombre de la carrera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(CbCoordinaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel6))
                                .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(AgregarNuevaCarrera))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(Modificar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(140, 140, 140)
                                    .addComponent(Salir))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel4)))
                    .addGap(0, 30, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 17, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3)
                            .addGap(16, 16, 16)
                            .addComponent(CbCoordinaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel6)
                            .addGap(16, 16, 16)
                            .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(AgregarNuevaCarrera)
                            .addGap(7, 7, 7)
                            .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(Salir)))
                    .addGap(23, 23, 23)
                    .addComponent(jLabel4)
                    .addGap(0, 17, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
private void ListarCoordinacionesParaComboBox()
    {
        GestorDeCoordinaciones GestorDeCoordinaciones= new GestorDeCoordinaciones();
         Coordinaciones laCoordinacion= new Coordinaciones();
     
        try {
            for (int i = 0; i < GestorDeCoordinaciones.ObtenerLasCoordinaciones().size(); i++) {
             
            laCoordinacion= GestorDeCoordinaciones.ObtenerLasCoordinaciones().get(i);
            CbCoordinaciones.addItem(laCoordinacion);
              
        }
        } catch (Exception e) {
        }
         
         
        
    }
   private void LlenarListaDeCarreras()
    {
     
         JListaDeDepartamentos.setListData(gestorDeCarreras.ObtenerLasCarreras().toArray());
        
    } 
    
    
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

        if(SiElNombreExiste(txtDepartamento.getText()) )
        {
            JOptionPane.showMessageDialog(null, "El nombre del departamento ya esta registrado");

        }else if(txtDepartamento.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "no debe dejar el nombre vacio");

        }else if(JListaDeDepartamentos.isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null, "Debe selecionar un departamento para modificar");

        }else
        {

            Carreras laCarreraAModificar=(Carreras)JListaDeDepartamentos.getSelectedValue();
            int acepto=JOptionPane.showConfirmDialog(null, "desea modificar el registro"+laCarreraAModificar.getCarrera());
            if(acepto==JOptionPane.YES_OPTION){
                laCarreraAModificar.setCarrera(txtDepartamento.getText());
                laCarreraAModificar.setIdcoordinacion(ObtenerIdCoordinacion());

                gestorDeCarreras.ModificarCarrera(laCarreraAModificar);
            }else{JOptionPane.showMessageDialog(null, "No se modifico el registro");}
        }
        txtDepartamento.setText("");
       

        LlenarListaDeCarreras();        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void JListaDeDepartamentosPresionDeClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListaDeDepartamentosPresionDeClick
        ObtenerDatos();
    }//GEN-LAST:event_JListaDeDepartamentosPresionDeClick

    public void ObtenerDatos(){
        Carreras laCarrera=new Carreras();
  
        try {
          laCarrera=(Carreras)JListaDeDepartamentos.getSelectedValue();
          
        } catch (Exception e) {
        }
  
  txtDepartamento.setText(laCarrera.getCarrera());
  CbCoordinaciones.setSelectedItem(ObtieneNombreDeLaCoordinacion(laCarrera.getIdcoordinacion()));
          
    
    }
    
       public Coordinaciones ObtieneNombreDeLaCoordinacion(int idCoordinacion)
    { 
        Coordinaciones NombreDeLaCoordinacion=null;
        GestorDeCoordinaciones gestorDeCoordinaciones=new GestorDeCoordinaciones();
        for (Coordinaciones laCoordinacion : gestorDeCoordinaciones.ObtenerLasCoordinaciones()) {
            
            if(laCoordinacion.getIdcoordinacion()==idCoordinacion)
            {
                NombreDeLaCoordinacion=laCoordinacion;
            }
        }
       return NombreDeLaCoordinacion; 
    }
    
    
     private boolean SiElNombreExiste(String Nombre)
{
    boolean Existe=false;
    GestorDeCarreras gestorDeCarreras=new GestorDeCarreras(); 
   
    for (Carreras laCarrera : gestorDeCarreras.ObtenerLasCarreras()) {
        try {
            if(laCarrera.getCarrera().equalsIgnoreCase(Nombre))
        {
            Existe=true;
        }
        } catch (NullPointerException e) {
            //JOptionPane.showMessageDialog(null, "el campo esta nulo");
        }
        
    }
   
   
   
   return Existe;
}
    private void AgregarNuevaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNuevaCarreraActionPerformed

        if(SiElNombreExiste(txtDepartamento.getText()))
        {
            JOptionPane.showMessageDialog(null, "El nombre del departamento ya esta registrado");

        }else if(txtDepartamento.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "no debe dejar el nombre vacio");

        }else
        {

            Carreras laNuevaCarrera=new Carreras();

            laNuevaCarrera.setCarrera(txtDepartamento.getText());
            laNuevaCarrera.setIdcoordinacion(ObtenerIdCoordinacion());

            gestorDeCarreras.IngresarCarrera(laNuevaCarrera);

        }

        LlenarListaDeCarreras();
    }//GEN-LAST:event_AgregarNuevaCarreraActionPerformed

        public Integer ObtenerIdCoordinacion(){
Integer idCoordinacion;
 Coordinaciones laCoordinacion=(Coordinaciones)CbCoordinaciones.getSelectedItem();

idCoordinacion=laCoordinacion.getIdcoordinacion();
return idCoordinacion;
}
 
    
    
    private void txtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartamentoActionPerformed

    private void CbCoordinacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbCoordinacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbCoordinacionesActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCarrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarNuevaCarrera;
    private javax.swing.JComboBox CbCoordinaciones;
    private javax.swing.JList JListaDeDepartamentos;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDepartamento;
    // End of variables declaration//GEN-END:variables
}
