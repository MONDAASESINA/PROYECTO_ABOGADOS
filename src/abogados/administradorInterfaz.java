/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abogados;

import clases.abogado;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KEVIN SANCHEZ
 */
public class administradorInterfaz extends javax.swing.JFrame {
ArrayList mostrar  = new ArrayList();
    /**
     * Creates new form administradorInterfaz
     */
    public administradorInterfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonModificarA10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JPfondo_Inicial = new javax.swing.JPanel();
        JPcrud_abg = new javax.swing.JPanel();
        jButtonModificarA6 = new javax.swing.JButton();
        jButtonModificarA7 = new javax.swing.JButton();
        jButtonModificarA8 = new javax.swing.JButton();
        jButtonModificarA9 = new javax.swing.JButton();
        jButtonModificarA11 = new javax.swing.JButton();
        jScrollPaneCam = new javax.swing.JScrollPane();
        TablaR = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonModificarA = new javax.swing.JButton();
        jButtonModificarA1 = new javax.swing.JButton();
        jButtonModificarA2 = new javax.swing.JButton();
        jButtonModificarA3 = new javax.swing.JButton();
        jButtonModificarA4 = new javax.swing.JButton();
        jButtonModificarA5 = new javax.swing.JButton();

        jButtonModificarA10.setBackground(new java.awt.Color(102, 153, 255));
        jButtonModificarA10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA10.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA10.setText("Modificar");
        jButtonModificarA10.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205, 133, 63));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPfondo_Inicial.setBackground(new java.awt.Color(255, 255, 255));
        JPfondo_Inicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPcrud_abg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonModificarA6.setBackground(new java.awt.Color(128, 0, 0));
        jButtonModificarA6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA6.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA6.setText("INGRESAR");
        jButtonModificarA6.setBorder(null);
        JPcrud_abg.add(jButtonModificarA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 140, 50));

        jButtonModificarA7.setBackground(new java.awt.Color(128, 0, 0));
        jButtonModificarA7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA7.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA7.setText("MOSTRAR");
        jButtonModificarA7.setBorder(null);
        jButtonModificarA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarA7ActionPerformed(evt);
            }
        });
        JPcrud_abg.add(jButtonModificarA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 140, 50));

        jButtonModificarA8.setBackground(new java.awt.Color(128, 0, 0));
        jButtonModificarA8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA8.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA8.setText("BUSCAR");
        jButtonModificarA8.setBorder(null);
        JPcrud_abg.add(jButtonModificarA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 140, 50));

        jButtonModificarA9.setBackground(new java.awt.Color(128, 0, 0));
        jButtonModificarA9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA9.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA9.setText("MODIFICAR");
        jButtonModificarA9.setBorder(null);
        JPcrud_abg.add(jButtonModificarA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 140, 50));

        jButtonModificarA11.setBackground(new java.awt.Color(128, 0, 0));
        jButtonModificarA11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA11.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA11.setText("ELIMINAR");
        jButtonModificarA11.setBorder(null);
        JPcrud_abg.add(jButtonModificarA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 140, 50));

        TablaR.setBackground(new java.awt.Color(255, 160, 122));
        TablaR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        TablaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_ABG", "CEDULA", "NOMBRE", "APELLIDO", "TELEFONO", "GRATUIDAD", "PUNTUACIÓN", "EDAD", "COSTO X HORAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaR.setRowHeight(30);
        jScrollPaneCam.setViewportView(TablaR);

        JPcrud_abg.add(jScrollPaneCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 880, 330));

        JPfondo_Inicial.add(JPcrud_abg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 550));

        jPanel1.add(JPfondo_Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 980, 550));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escala-de-justicia.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Castellar", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ABOGADOS-ECU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maps-and-location.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VICENTE PINZON Y LUIS DE LA CEDA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 720, 430, 40));

        jPanel2.setBackground(new java.awt.Color(25, 25, 112));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonModificarA.setBackground(new java.awt.Color(102, 153, 255));
        jButtonModificarA.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA.setText("Modificar");
        jButtonModificarA.setBorder(null);
        jPanel2.add(jButtonModificarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 180, 50));

        jButtonModificarA1.setBackground(new java.awt.Color(102, 153, 255));
        jButtonModificarA1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA1.setText("ABOGADOS");
        jButtonModificarA1.setBorder(null);
        jPanel2.add(jButtonModificarA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 50));

        jButtonModificarA2.setBackground(new java.awt.Color(102, 153, 255));
        jButtonModificarA2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA2.setText("CLIENTES");
        jButtonModificarA2.setBorder(null);
        jPanel2.add(jButtonModificarA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 180, 50));

        jButtonModificarA3.setBackground(new java.awt.Color(102, 153, 255));
        jButtonModificarA3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA3.setText("ASISTENTES");
        jButtonModificarA3.setBorder(null);
        jPanel2.add(jButtonModificarA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 180, 50));

        jButtonModificarA4.setBackground(new java.awt.Color(102, 153, 255));
        jButtonModificarA4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA4.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA4.setText("Modificar");
        jButtonModificarA4.setBorder(null);
        jPanel2.add(jButtonModificarA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 180, 50));

        jButtonModificarA5.setBackground(new java.awt.Color(102, 153, 255));
        jButtonModificarA5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA5.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA5.setText("Modificar");
        jButtonModificarA5.setBorder(null);
        jPanel2.add(jButtonModificarA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 180, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModificarA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarA7ActionPerformed
        abogado abg_usuario = new abogado();
        DefaultTableModel modelo = (DefaultTableModel) TablaR.getModel();
        try {
            
            mostrar = abg_usuario.Listar();
            if(mostrar.isEmpty()){
                JOptionPane.showMessageDialog(null,"NO HAY NINGUN ABOGADO REGISTRADO4");
            }else{
                
            }
        } catch (SQLException ex){
            Logger.getLogger(administradorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_jButtonModificarA7ActionPerformed

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
            java.util.logging.Logger.getLogger(administradorInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administradorInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administradorInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administradorInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administradorInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPcrud_abg;
    private javax.swing.JPanel JPfondo_Inicial;
    private javax.swing.JTable TablaR;
    private javax.swing.JButton jButtonModificarA;
    private javax.swing.JButton jButtonModificarA1;
    private javax.swing.JButton jButtonModificarA10;
    private javax.swing.JButton jButtonModificarA11;
    private javax.swing.JButton jButtonModificarA2;
    private javax.swing.JButton jButtonModificarA3;
    private javax.swing.JButton jButtonModificarA4;
    private javax.swing.JButton jButtonModificarA5;
    private javax.swing.JButton jButtonModificarA6;
    private javax.swing.JButton jButtonModificarA7;
    private javax.swing.JButton jButtonModificarA8;
    private javax.swing.JButton jButtonModificarA9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneCam;
    // End of variables declaration//GEN-END:variables
}
