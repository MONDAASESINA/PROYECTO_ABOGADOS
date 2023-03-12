/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abogados;

import clases.Cliente;
import clases.PostgresConexion;
import clases.abogado;
import clases.asistente;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author KEVIN SANCHEZ
 */
public final class asistenteInterfaz2 extends javax.swing.JFrame {

    PostgresConexion conexion = new PostgresConexion();

    /**
     * Creates new form administradorInterfaz
     */
    public asistenteInterfaz2() {
        initComponents();
        panelaboga.setVisible(false);
        jPanelclientes.setVisible(false);
    }
///////////////

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
        jPanelclientes = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacli = new javax.swing.JTable();
        panelaboga = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        datosabo = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        salimenu = new javax.swing.JButton();
        datasi = new javax.swing.JButton();
        jButtonModificarA2 = new javax.swing.JButton();
        casoasis = new javax.swing.JButton();
        reserasis = new javax.swing.JButton();
        enviocon = new javax.swing.JButton();
        mostraasis = new javax.swing.JButton();

        jButtonModificarA10.setBackground(new java.awt.Color(102, 153, 255));
        jButtonModificarA10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA10.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA10.setText("Modificar");
        jButtonModificarA10.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPfondo_Inicial.setBackground(new java.awt.Color(255, 255, 255));
        JPfondo_Inicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPcrud_abg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelclientes.setBackground(new java.awt.Color(204, 255, 204));

        jLabel6.setFont(new java.awt.Font("Castellar", 0, 70)); // NOI18N
        jLabel6.setText("Datos clientes");

        tablacli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_CLIENTE", "CEDULA", "PRIMER NOMBRE", "SEGUNDO NOMBRE", "PRIMER APELLIDO", "SEGUNDO APELLIDO", "TELEFONO", "EDAD", "CORREO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablacli.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablacli.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablacli);
        if (tablacli.getColumnModel().getColumnCount() > 0) {
            tablacli.getColumnModel().getColumn(0).setResizable(false);
            tablacli.getColumnModel().getColumn(1).setResizable(false);
            tablacli.getColumnModel().getColumn(2).setResizable(false);
            tablacli.getColumnModel().getColumn(3).setResizable(false);
            tablacli.getColumnModel().getColumn(4).setResizable(false);
            tablacli.getColumnModel().getColumn(5).setResizable(false);
            tablacli.getColumnModel().getColumn(6).setResizable(false);
            tablacli.getColumnModel().getColumn(7).setResizable(false);
            tablacli.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout jPanelclientesLayout = new javax.swing.GroupLayout(jPanelclientes);
        jPanelclientes.setLayout(jPanelclientesLayout);
        jPanelclientesLayout.setHorizontalGroup(
            jPanelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelclientesLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel6)
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(jPanelclientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanelclientesLayout.setVerticalGroup(
            jPanelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelclientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );

        JPcrud_abg.add(jPanelclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        panelaboga.setBackground(new java.awt.Color(255, 204, 255));
        panelaboga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Castellar", 0, 70)); // NOI18N
        jLabel4.setText("Datos ABOGADOS");
        panelaboga.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 780, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CODIGO-RO-388-1 (1).jpg"))); // NOI18N
        panelaboga.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        datosabo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_ABOGADO", "CEDULA", "PRIMER NOMBRE", "SEGUNDO NOMBRE", "PRIMER APELLIDO", "SEGUNDO APELLIDO", "TELEFONO", "COSTO", "TITULO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        datosabo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        datosabo.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(datosabo);
        if (datosabo.getColumnModel().getColumnCount() > 0) {
            datosabo.getColumnModel().getColumn(0).setResizable(false);
            datosabo.getColumnModel().getColumn(1).setResizable(false);
            datosabo.getColumnModel().getColumn(2).setResizable(false);
            datosabo.getColumnModel().getColumn(3).setResizable(false);
            datosabo.getColumnModel().getColumn(4).setResizable(false);
            datosabo.getColumnModel().getColumn(5).setResizable(false);
            datosabo.getColumnModel().getColumn(6).setResizable(false);
            datosabo.getColumnModel().getColumn(7).setResizable(false);
            datosabo.getColumnModel().getColumn(8).setResizable(false);
        }

        panelaboga.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 830, 230));

        JPcrud_abg.add(panelaboga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        JPfondo_Inicial.add(JPcrud_abg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 560));

        jPanel1.add(JPfondo_Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 550));

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

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salimenu.setBackground(new java.awt.Color(0, 0, 102));
        salimenu.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        salimenu.setForeground(new java.awt.Color(255, 255, 255));
        salimenu.setText("SALIR");
        salimenu.setBorder(null);
        salimenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salimenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salimenuMouseExited(evt);
            }
        });
        jPanel2.add(salimenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 180, 50));

        datasi.setBackground(new java.awt.Color(0, 0, 102));
        datasi.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        datasi.setForeground(new java.awt.Color(255, 255, 255));
        datasi.setText("DATOS ABOGADO");
        datasi.setBorder(null);
        datasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                datasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                datasiMouseExited(evt);
            }
        });
        datasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasiActionPerformed(evt);
            }
        });
        jPanel2.add(datasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, 50));

        jButtonModificarA2.setBackground(new java.awt.Color(0, 0, 102));
        jButtonModificarA2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonModificarA2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarA2.setText("LISTA CLIENTES");
        jButtonModificarA2.setBorder(null);
        jButtonModificarA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModificarA2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonModificarA2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonModificarA2MouseExited(evt);
            }
        });
        jButtonModificarA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarA2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonModificarA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 180, 50));

        casoasis.setBackground(new java.awt.Color(0, 0, 102));
        casoasis.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        casoasis.setForeground(new java.awt.Color(255, 255, 255));
        casoasis.setText("CASOS");
        casoasis.setBorder(null);
        casoasis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                casoasisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                casoasisMouseExited(evt);
            }
        });
        casoasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casoasisActionPerformed(evt);
            }
        });
        jPanel2.add(casoasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 50));

        reserasis.setBackground(new java.awt.Color(0, 0, 102));
        reserasis.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        reserasis.setForeground(new java.awt.Color(255, 255, 255));
        reserasis.setText("RESERVACIONES");
        reserasis.setBorder(null);
        reserasis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reserasisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reserasisMouseExited(evt);
            }
        });
        jPanel2.add(reserasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 180, 50));

        enviocon.setBackground(new java.awt.Color(0, 0, 102));
        enviocon.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        enviocon.setForeground(new java.awt.Color(255, 255, 255));
        enviocon.setText("ENVIAR CONTRATO");
        enviocon.setBorder(null);
        enviocon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                envioconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                envioconMouseExited(evt);
            }
        });
        jPanel2.add(enviocon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 180, 50));

        mostraasis.setBackground(new java.awt.Color(0, 0, 102));
        mostraasis.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        mostraasis.setForeground(new java.awt.Color(255, 255, 255));
        mostraasis.setText("MOSTRAR MIS DATOS");
        mostraasis.setBorder(null);
        mostraasis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostraasisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostraasisMouseExited(evt);
            }
        });
        mostraasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraasisActionPerformed(evt);
            }
        });
        jPanel2.add(mostraasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
////////datos abogado//////////////////

    public void mostrarabogados(ArrayList<abogado> lista_tipo) {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) datosabo.getModel();
        mTabla.setNumRows(0);
        // Uso de una expresion landa
        lista_tipo.stream().forEach(tipos -> {
            String[] filaNueva = {String.valueOf(tipos.getCod_abogado()), tipos.getCedula(), tipos.getPrimerNombre(), tipos.getSegundoNombre(), tipos.getNombreApellido(), tipos.getSegundoApellido(), tipos.getTelefono(), String.valueOf(tipos.getCost_hora()), String.valueOf(tipos.getTitulo())};
            mTabla.addRow(filaNueva);
        });
        datosabo.setModel(mTabla);
        columnasabo();
    }

    public void columnasabo() {
        TableColumnModel columna = datosabo.getColumnModel();
        columna.getColumn(0).setPreferredWidth(100);
        columna.getColumn(1).setPreferredWidth(100);
        columna.getColumn(2).setPreferredWidth(115);
        columna.getColumn(3).setPreferredWidth(155);
        columna.getColumn(4).setPreferredWidth(155);
        columna.getColumn(5).setPreferredWidth(150);
        columna.getColumn(6).setPreferredWidth(150);
        columna.getColumn(7).setPreferredWidth(115);
        columna.getColumn(8).setPreferredWidth(150);
    }

    public void mosabog() {
        abogado abg_usuario = new abogado();
        DefaultTableModel modelo = (DefaultTableModel) datosabo.getModel();
        try {
            ArrayList<abogado> mostrar = new ArrayList();
            mostrar = abg_usuario.Listar();
            if (mostrar.isEmpty()) {
                JOptionPane.showMessageDialog(null, "NO EXISTE ABOGADOS REGISTRADOS");
            } else {
                mostrarabogados(mostrar);
            }
        } catch (SQLException ex) {
            Logger.getLogger(administradorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /////////////////////////////////datos cliente//////////////////

    public void mostrarclientes(ArrayList<Cliente> lista_tipo) {
        // Para darle forma al modelo de la tabla
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) tablacli.getModel();
        mTabla.setNumRows(0);
        // Uso de una expresion landa
        lista_tipo.stream().forEach(tipos -> {
            String[] filaNueva = {String.valueOf(tipos.getID_cliente()), tipos.getCedula(), tipos.getPrimerNombre(), tipos.getSegundoNombre(), tipos.getNombreApellido(), tipos.getSegundoApellido(), tipos.getTelefono(), String.valueOf(tipos.getEdad()), tipos.getCorre()};
            mTabla.addRow(filaNueva);
        });
        tablacli.setModel(mTabla);
        columnascli();
    }

    public void columnascli() {
        TableColumnModel columna = tablacli.getColumnModel();
        columna.getColumn(0).setPreferredWidth(100);
        columna.getColumn(1).setPreferredWidth(100);
        columna.getColumn(2).setPreferredWidth(115);
        columna.getColumn(3).setPreferredWidth(155);
        columna.getColumn(4).setPreferredWidth(155);
        columna.getColumn(5).setPreferredWidth(150);
        columna.getColumn(6).setPreferredWidth(150);
        columna.getColumn(7).setPreferredWidth(115);
        columna.getColumn(8).setPreferredWidth(150);
    }

    public void listarcli() {
        Cliente cli1 = new Cliente();
        DefaultTableModel modelo = (DefaultTableModel) tablacli.getModel();
        try {
            ArrayList<Cliente> mostrar = new ArrayList();
            mostrar = cli1.Listar();
            if (mostrar.isEmpty()) {
                JOptionPane.showMessageDialog(null, "NO EXISTE CLIENTES REGISTRADOS");
            } else {
                mostrarclientes(mostrar);
            }
        } catch (SQLException ex) {
            Logger.getLogger(administradorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    private void mostraasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraasisActionPerformed
        // TODO add your handling code here:
        Regi_Asistente res = new Regi_Asistente();
        res.AsisReg();
        res.setVisible(true);       
        dispose();
    }//GEN-LAST:event_mostraasisActionPerformed

    private void jButtonModificarA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarA2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModificarA2MouseClicked

    private void jButtonModificarA2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarA2MouseEntered
        // TODO add your handling code here:
        jButtonModificarA2.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_jButtonModificarA2MouseEntered

    private void jButtonModificarA2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarA2MouseExited
        // TODO add your handling code here:
        jButtonModificarA2.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_jButtonModificarA2MouseExited

    private void jButtonModificarA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarA2ActionPerformed
        // TODO add your handling code here:
        panelaboga.setVisible(false);
        jPanelclientes.setVisible(true);
        listarcli();
    }//GEN-LAST:event_jButtonModificarA2ActionPerformed

    private void datasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasiActionPerformed
        // TODO add your handling code here:
        jPanelclientes.setVisible(false);
        panelaboga.setVisible(true);
        mosabog();
        //mostrarASISTENTE();
    }//GEN-LAST:event_datasiActionPerformed

    private void datasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datasiMouseEntered
        // TODO add your handling code here:
        datasi.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_datasiMouseEntered

    private void casoasisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casoasisMouseEntered
        // TODO add your handling code here:
        casoasis.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_casoasisMouseEntered

    private void reserasisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserasisMouseEntered
        // TODO add your handling code here:
        reserasis.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_reserasisMouseEntered

    private void mostraasisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostraasisMouseEntered
        // TODO add your handling code here:
        mostraasis.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_mostraasisMouseEntered

    private void envioconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_envioconMouseEntered
        // TODO add your handling code here:
        enviocon.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_envioconMouseEntered

    private void salimenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salimenuMouseEntered
        // TODO add your handling code here:
        salimenu.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_salimenuMouseEntered

    private void casoasisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casoasisMouseExited
        // TODO add your handling code here:
        casoasis.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_casoasisMouseExited

    private void reserasisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reserasisMouseExited
        // TODO add your handling code here:
        reserasis.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_reserasisMouseExited

    private void datasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datasiMouseExited
        // TODO add your handling code here:
        datasi.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_datasiMouseExited

    private void salimenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salimenuMouseExited
        // TODO add your handling code here:
        salimenu.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_salimenuMouseExited

    private void envioconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_envioconMouseExited
        // TODO add your handling code here:
        enviocon.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_envioconMouseExited

    private void mostraasisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostraasisMouseExited
        // TODO add your handling code here:
        mostraasis.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_mostraasisMouseExited

    private void casoasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casoasisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casoasisActionPerformed

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
            java.util.logging.Logger.getLogger(asistenteInterfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asistenteInterfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asistenteInterfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asistenteInterfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asistenteInterfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPcrud_abg;
    private javax.swing.JPanel JPfondo_Inicial;
    private javax.swing.JButton casoasis;
    private javax.swing.JButton datasi;
    private javax.swing.JTable datosabo;
    private javax.swing.JButton enviocon;
    private javax.swing.JButton jButtonModificarA10;
    private javax.swing.JButton jButtonModificarA2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelclientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mostraasis;
    private javax.swing.JPanel panelaboga;
    private javax.swing.JButton reserasis;
    private javax.swing.JButton salimenu;
    private javax.swing.JTable tablacli;
    // End of variables declaration//GEN-END:variables
}
