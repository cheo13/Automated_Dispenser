package proyecto2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.JRadioButton;

public class ProyectoInterfaz extends javax.swing.JFrame {

    private static final String pu1 = "a";
    private static final String pu2 = "b";
    private static final String pu3 = "c";
    private static final String pu4 = "d";
    private static final String pu5 = "e";
    private static final String pu6 = "f";
    private static final String pu7 = "g";
    private static final String pu8 = "h";
    private static final String pu9 = "i";
    private static final String pu10 = "j";
    private static final String pu11 = "k";
    private static final String pu12 = "l";
    private OutputStream Arduino = null;
    SerialPort serialPort;
    private final String PUERTO = "COM5";
    private static final int TIMEOUT = 20000; //Milisegundos
    private
            static final int DATA_RATE = 9600;
    public String men = "", me = "";
    private final Connection conn = null;
    public Connection leerba = null;
    private final Statement statement = null;
    private final ResultSet rs = null;
    public static ResultSet resultSet = null;

    public ProyectoInterfaz() {
        initComponents();
        inicializarConexion();
        this.getContentPane().setBackground(Color.black);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        Icon m = new ImageIcon(getClass().getResource("inicio.png"));
        JOptionPane.showMessageDialog(null, m, "                                                                   BIENVENIDO!", JOptionPane.PLAIN_MESSAGE);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doc = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        beb1 = new javax.swing.JRadioButton();
        beb2 = new javax.swing.JRadioButton();
        beb3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        med1 = new javax.swing.JRadioButton();
        med2 = new javax.swing.JRadioButton();
        med3 = new javax.swing.JRadioButton();
        med4 = new javax.swing.JRadioButton();
        servir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        VENDER = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        doc.setBackground(new java.awt.Color(0, 0, 0));
        doc.setForeground(new java.awt.Color(255, 255, 255));
        doc.setText("COCA - COLA");
        doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Open Sans", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("\" BAR - BOX \"");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccionar Bebida :");

        beb1.setBackground(new java.awt.Color(0, 0, 0));
        beb1.setForeground(new java.awt.Color(255, 255, 255));
        beb1.setText("PEPSI");
        beb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beb1ActionPerformed(evt);
            }
        });

        beb2.setBackground(new java.awt.Color(0, 0, 0));
        beb2.setForeground(new java.awt.Color(255, 255, 255));
        beb2.setText("VODKA");
        beb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beb2ActionPerformed(evt);
            }
        });

        beb3.setBackground(new java.awt.Color(0, 0, 0));
        beb3.setForeground(new java.awt.Color(255, 255, 255));
        beb3.setText("WISKY");
        beb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beb3ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione Medida :");

        med1.setBackground(new java.awt.Color(0, 0, 0));
        med1.setForeground(new java.awt.Color(255, 255, 255));
        med1.setText("1/4");
        med1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med1ActionPerformed(evt);
            }
        });

        med2.setBackground(new java.awt.Color(0, 0, 0));
        med2.setForeground(new java.awt.Color(255, 255, 255));
        med2.setText("1/2");
        med2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med2ActionPerformed(evt);
            }
        });

        med3.setBackground(new java.awt.Color(0, 0, 0));
        med3.setForeground(new java.awt.Color(255, 255, 255));
        med3.setText("3/4");
        med3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med3ActionPerformed(evt);
            }
        });

        med4.setBackground(new java.awt.Color(0, 0, 0));
        med4.setForeground(new java.awt.Color(255, 255, 255));
        med4.setText("FULL");
        med4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med4ActionPerformed(evt);
            }
        });

        servir.setBackground(new java.awt.Color(0, 0, 0));
        servir.setForeground(new java.awt.Color(255, 255, 255));
        servir.setText("SERVIR");
        servir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                servirMouseClicked(evt);
            }
        });
        servir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servirActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pepsi def.gif"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Vodka (1).gif"))); // NOI18N
        jLabel4.setText("jLabel4");

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("INGRESO");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fireball_gif_3 (1).gif"))); // NOI18N
        jLabel6.setText("jLabel6");

        VENDER.setBackground(new java.awt.Color(0, 0, 0));
        VENDER.setForeground(new java.awt.Color(255, 255, 255));
        VENDER.setText("VENDER");
        VENDER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VENDERMouseClicked(evt);
            }
        });
        VENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VENDERActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REPORTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(beb1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(61, 61, 61)
                                                .addComponent(beb2)))
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(servir)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(VENDER)
                                                .addGap(100, 100, 100))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(med4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(22, 22, 22))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(322, 322, 322)
                                .addComponent(beb3)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(med1)
                        .addGap(18, 18, 18)
                        .addComponent(med2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reset)
                            .addComponent(med3))
                        .addGap(146, 146, 146))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beb1)
                    .addComponent(beb2)
                    .addComponent(beb3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(med1)
                    .addComponent(med2)
                    .addComponent(med3)
                    .addComponent(med4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servir)
                    .addComponent(reset)
                    .addComponent(VENDER)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void beb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beb1ActionPerformed
        if (beb1.isSelected() == true || beb2.isSelected() == true) {
            beb2.setEnabled(true);
            beb3.setEnabled(true);
        } else {
            beb2.setEnabled(true);
            beb3.setEnabled(true);
        }
        if (beb2.isSelected() == true && beb1.isSelected() == true) {
            beb3.setEnabled(false);
        }
        if (beb3.isSelected() == true && beb1.isSelected() == true) {
            beb2.setEnabled(false);
        }
        if (beb1.isSelected() == true && beb2.isSelected() == true) {
            beb3.setEnabled(false);
        }
    }//GEN-LAST:event_beb1ActionPerformed
    private void beb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beb2ActionPerformed
        if (beb2.isSelected() == true || beb1.isSelected() == true) {
            beb1.setEnabled(true);
            beb3.setEnabled(true);
        } else {
            beb1.setEnabled(true);
            beb3.setEnabled(true);
        }
        if (beb2.isSelected() == false) {
            beb3.setEnabled(true);
        }
        if (beb3.isSelected() == true && beb2.isSelected() == true) {
            beb1.setEnabled(false);
        }
        if (beb1.isSelected() == true && beb2.isSelected() == true) {
            beb3.setEnabled(false);
        }
    }//GEN-LAST:event_beb2ActionPerformed
    private void beb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beb3ActionPerformed
        if (beb3.isSelected() == true || beb1.isSelected() == true) {
            beb1.setEnabled(true);
            beb2.setEnabled(false);
        } else {
            beb1.setEnabled(true);
            beb2.setEnabled(true);
        }
        if (beb3.isSelected() == false) {
            beb2.setEnabled(true);
        }
        if (beb3.isSelected() == false) {
            beb1.setEnabled(true);
        }
        if (beb2.isSelected() == true && beb3.isSelected() == true) {
            beb1.setEnabled(false);
        }
        if (beb3.isSelected() == true && beb2.isSelected() == true) {
            beb1.setEnabled(false);
        }
    }//GEN-LAST:event_beb3ActionPerformed
    private void med1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med1ActionPerformed
        if (med1.isSelected() == true) {
            med4.setEnabled(false);
        }
        if (med1.isSelected() == false) {
            med4.setEnabled(true);
        }
        if (med2.isSelected() == true && med1.isSelected() == false) {
            med4.setEnabled(false);
        }
        if (med3.isSelected() == true && med1.isSelected() == false) {
            med4.setEnabled(false);
        }
    }//GEN-LAST:event_med1ActionPerformed
    private void med2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med2ActionPerformed
        if (med2.isSelected() == true) {
            med3.setEnabled(false);
            med4.setEnabled(false);
        }
        if (med2.isSelected() == false) {
            med3.setEnabled(true);
            med4.setEnabled(true);
        }
        if (med1.isSelected() == true && med2.isSelected() == false) {
            med4.setEnabled(false);
        }
    }//GEN-LAST:event_med2ActionPerformed
    private void med3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med3ActionPerformed
        if (med3.isSelected() == true) {
            med1.setEnabled(true);
            med2.setEnabled(false);
            med4.setEnabled(false);
        }
        if (med3.isSelected() == false) {
            med1.setEnabled(true);
            med2.setEnabled(true);
            med4.setEnabled(true);
        }
        if (med3.isSelected() == false) {
            med4.setEnabled(true);
        }
        if (med1.isSelected() == true) {
            med4.setEnabled(false);
        }
    }//GEN-LAST:event_med3ActionPerformed
    private void med4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med4ActionPerformed
        if (med4.isSelected() == true) {
            med1.setEnabled(false);
            med2.setEnabled(false);
            med3.setEnabled(false);
        }
        if (med4.isSelected() == false) {
            med1.setEnabled(true);
            med2.setEnabled(true);
            med3.setEnabled(true);
        }
        if (med4.isSelected() == true) {
            med1.setEnabled(false);
        }
        if (med4.isSelected() == true) {
            med2.setEnabled(false);
        }
        if (med4.isSelected() == true) {
            med3.setEnabled(false);
        }
    }//GEN-LAST:event_med4ActionPerformed
    private void servirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servirActionPerformed
    }//GEN-LAST:event_servirActionPerformed
    private void docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docActionPerformed
    }//GEN-LAST:event_docActionPerformed
    private void VENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VENDERActionPerformed

    }//GEN-LAST:event_VENDERActionPerformed
    private void VENDERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VENDERMouseClicked
        Ventana2 vent = new Ventana2();
        vent.setVisible(true);

        if (beb1.isSelected() == true && med4.isSelected()== true) {
            men = men + " - COCACOLA";
        } else if (beb2.isSelected() == true && med4.isSelected()== true) {
            men = men + " - VODKA";
        } else if (beb3.isSelected() == true && med4.isSelected() == true) {
            men = men + " - WISKY";
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione bebida....");
        }
        if (beb1.isSelected() == true && beb2.isSelected() == true) {
            men = men + " COCACOLA  & VODKA";
        } else if (beb1.isSelected() == true && beb3.isSelected() == true) {
            men = men + " COCACOLA & WISKY";
        } else if (beb2.isSelected() == true && beb1.isSelected() == true) {
            men = men + " VODKA & COCACOLA";
        } else if (beb3.isSelected() == true && beb1.isSelected() == true) {
            men = men + " WISKY & COCACOLA";
        } else if (med1.isSelected() == true) {
            me = me + " - 1/4";
        } else if (med2.isSelected() == true) {
            me = me + " - 1/2";
        } else if (med3.isSelected() == true) {
            me = me + " - 3/4";
        } else if (med4.isSelected() == true) {
            me = me + " - FULL";
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione medida...");
        }
        Ventana2.va4.setText(men);

        ConexionBD();
        Connection con1 = ConexionBD();
        int numeroRegistro = 0;
        try {
            String consulta = "insert into cliente (bebida,medida)values(?,?)";
            PreparedStatement misentencia = con1.prepareStatement(consulta);
            misentencia.setString(1, men);
            misentencia.setString(2, me);
            numeroRegistro = (int) misentencia.executeUpdate();
        } catch (SQLException error) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, error);
        }
    }//GEN-LAST:event_VENDERMouseClicked
    public void inicializarConexion() {
        CommPortIdentifier puertoID = null;
        Enumeration puertoEnum = CommPortIdentifier.getPortIdentifiers();
        while (puertoEnum.hasMoreElements()) {
            CommPortIdentifier actualPuertoID = (CommPortIdentifier) puertoEnum.nextElement();
            if (PUERTO.equals(actualPuertoID.getName())) {
                puertoID = actualPuertoID;
                break;
            }
        }
        if (puertoID == null) {
            mostrarError("No se puede conectar al puerto");
            System.exit(ERROR);
        }
        try {
            serialPort = (SerialPort) puertoID.open(this.getClass().getName(), TIMEOUT);
            serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            Arduino = serialPort.getOutputStream();
        } catch (Exception e) {
            mostrarError(e.getMessage());
            System.exit(ERROR);
        }
    }

    private void dato1(String dato1) {
        try {
           
            Arduino.write(dato1.getBytes());
        } catch (IOException e) {
            mostrarError("ERROR");
            System.exit(ERROR);
        }
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public void  bloq(){
        beb1.setSelected(false);
        beb2.setSelected(false);
        beb3.setSelected(false);

        med1.setSelected(false);
        med2.setSelected(false);
        med3.setSelected(false);
        med4.setSelected(false);

        beb1.setEnabled(true);
        beb2.setEnabled(true);
        beb3.setEnabled(true);

        med1.setEnabled(true);
        med2.setEnabled(true);
        med3.setEnabled(true);
        med4.setEnabled(true);
    
    }
    private void servirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servirMouseClicked
       
        if (beb1.isSelected() == true && med1.isSelected() == true) {
            try {
                dato1(pu1);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (beb1.isSelected() == true && med2.isSelected() == true) {
            // ENVIA SEÑAL PARA COCA-COLA Y 1/2 DE VASO           
            try {
                dato1(pu2);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (beb1.isSelected() == true && med3.isSelected() == true) {
            try {
                dato1(pu3);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (beb1.isSelected() == true && med4.isSelected() == true) {
            // ENVIA SEÑAL PARA COCA-COLA Y FULL DE VASO
            try {
                dato1(pu4);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////7
        if (beb2.isSelected() == true && med1.isSelected() == true) {
            // ENVIA SEÑAL PARA VODKA Y 1/4 DE VASO
            try {
                dato1(pu5);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (beb2.isSelected() == true && med2.isSelected() == true) {
            // ENVIA SEÑAL PARA VODKA Y 1/2 DE VASO           
            try {
                dato1(pu6);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (beb2.isSelected() == true && med3.isSelected() == true) {
            // ENVIA SEÑAL PARA VODKA Y 3/4 DE VASO
            try {
                dato1(pu7);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (beb2.isSelected() == true && med4.isSelected() == true) {
            // ENVIA SEÑAL PARA VODKA Y FULL DE VASO
            try {
                dato1(pu8);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////7
        if (beb3.isSelected() == true && med1.isSelected() == true) {
            // ENVIA SEÑAL PARA WISKY Y 1/4 DE VASO
            try {
                dato1(pu9);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("se envio");
        } else if (beb3.isSelected() == true && med2.isSelected() == true) {
            // ENVIA SEÑAL PARA WISKY Y 1/2 DE VASO           
            try {
                dato1(pu10);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("se envio");
        } else if (beb3.isSelected() == true && med3.isSelected() == true) {
            // ENVIA SEÑAL PARA WISKY Y 3/4 DE VASO
            try {
                dato1(pu11);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("se envio");
        } else if (beb3.isSelected() == true && med4.isSelected() == true) {
            // ENVIA SEÑAL PARA WISKY Y FULL DE VASO
            try {
                dato1(pu12);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("se envio");
        } else {
        }        String beb11= String.valueOf(beb1);
        bloq();
  
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_servirMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tabla vent = new tabla();
        vent.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked

        contab ven = new contab();
        ven.setVisible(true);

        
        
    }//GEN-LAST:event_resetMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    public static Connection ConexionBD() {
        Connection conn = null;
        String urlDatabase = "jdbc:postgresql://localhost:5432/DATA";
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DATA", "postgres", "123456789");
        } catch (Exception e) {
            System.out.println("Ocurrio un error : " + e.getMessage());
        }
        System.out.println("La conexión se realizo sin problemas! =) ");
        return conn;
    }

    public static void main(String args[]) throws SQLException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoInterfaz().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VENDER;
    public static javax.swing.JRadioButton beb1;
    public static javax.swing.JRadioButton beb2;
    public static javax.swing.JRadioButton beb3;
    public static javax.swing.JRadioButton doc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton med1;
    private javax.swing.JRadioButton med2;
    private javax.swing.JRadioButton med3;
    private javax.swing.JRadioButton med4;
    private javax.swing.JButton reset;
    private javax.swing.JButton servir;
    // End of variables declaration//GEN-END:variables
}
