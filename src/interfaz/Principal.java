/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author gvega2
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    double v[];
    public Principal() {
        initComponents();
        cmdCrear.setEnabled(true);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAuto.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtlongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenarManual = new javax.swing.JButton();
        cmdLlenarAuto = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("MANEJO DE VECTORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Interfaz"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 20));

        txtlongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtlongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, -1));

        cmdLlenarManual.setText("Llenar manual");
        cmdLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, -1));

        cmdLlenarAuto.setText("Llenar Automatico");
        cmdLlenarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 160, 210));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtresultado.setEditable(false);
        txtresultado.setColumns(20);
        txtresultado.setRows(5);
        jScrollPane1.setViewportView(txtresultado);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 100));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
       int longitud;
        if(txtlongitud.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this,"Digite la longitud","Error",JOptionPane.ERROR_MESSAGE );
           txtlongitud.requestFocusInWindow();
       } else if (Integer.parseInt(txtlongitud.getText().trim())==0) {
            JOptionPane.showMessageDialog(this, "La longitud no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtlongitud.requestFocusInWindow();
            txtlongitud.selectAll();    
              
       }else{
           longitud = Integer.parseInt(txtlongitud.getText());
            v = new double[longitud];
            JOptionPane.showMessageDialog(this, "Vector Creado satisfactoriamente!");
           
            cmdCrear.setEnabled(false);
            cmdLlenarManual.setEnabled(true);
            cmdLlenarAuto.setEnabled(true);
            cmdMostrar.setEnabled(false);
            cmdBorrar.setEnabled(true);
            txtlongitud.setEditable(false);

            
          
       }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void txtlongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlongitudKeyTyped
      char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
    }//GEN-LAST:event_txtlongitudKeyTyped

    private void cmdLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarManualActionPerformed
     double n;
     int sw,res=0;
     
        for (int i = 0; i < v.length; i++) {
            do{
                sw=1;
            
            try {
            n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elmento en la posición "+i));
            v[i]=n;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Digite numero valido","Error",JOptionPane.ERROR_MESSAGE);
                sw=0;
            }catch (NullPointerException e){
                JOptionPane.showConfirmDialog(this,"¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
               if(res==0){
                   sw=1;
                   i=v.length;
                   
               }else{
                   
               } 
             }
            } while (sw==0);
        }
        
         cmdCrear.setEnabled(false);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAuto.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdBorrar.setEnabled(true);
       
    }//GEN-LAST:event_cmdLlenarManualActionPerformed

    private void cmdLlenarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAutoActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
            n =(int) (Math.random()* 50 + 1);
            v[i]=n;
        }
        JOptionPane.showMessageDialog(this, "Vector Llenado Correctamente");
        
         cmdCrear.setEnabled(false);
         cmdLlenarAuto.setEnabled(false);
         cmdLlenarManual.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdLlenarAutoActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
         txtlongitud.setText("");
        txtresultado.setText("");
        v = null;
        txtlongitud.requestFocusInWindow();
       
        cmdCrear.setEnabled(true);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAuto.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);
        txtlongitud.setEnabled(true);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        for (int i = 0; i < v.length; i++) {
           txtresultado.append(v[i]+"\n");
            
        }
        cmdCrear.setEnabled(false);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAuto.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenarAuto;
    private javax.swing.JButton cmdLlenarManual;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtlongitud;
    private javax.swing.JTextArea txtresultado;
    // End of variables declaration//GEN-END:variables
}
