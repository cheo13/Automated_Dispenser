package proyecto2;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ventana2 extends javax.swing.JFrame {

    public static Connection ConexionB() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DATA", "postgres", "123456789");
        } catch (Exception e) {
            System.out.println("Ocurrio un error : " + e.getMessage());
        }
        System.out.println("La conexión se realizo sin problemas! =) ");
        return conn;
    }
    public Ventana2() {
        initComponents();
        this.getContentPane().setBackground(Color.black);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        va1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        va3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        va2 = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        va4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        va5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESO - \" BAR - BOX \"");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        getContentPane().add(va1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 190, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Costo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        getContentPane().add(va3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 190, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pedidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        getContentPane().add(va2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 190, -1));

        enviar.setBackground(new java.awt.Color(0, 0, 0));
        enviar.setForeground(new java.awt.Color(204, 204, 255));
        enviar.setText("SEND");
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarMouseClicked(evt);
            }
        });
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bebidas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        getContentPane().add(va4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 190, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        va5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                va5ActionPerformed(evt);
            }
        });
        getContentPane().add(va5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
    }//GEN-LAST:event_enviarActionPerformed
    private void enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseClicked
        ConexionB();
        Connection con2 = ConexionB();
        double pedi = Double.parseDouble(va2.getText());
        double cost = Double.parseDouble(va3.getText());
        String sis = String.valueOf(va2.getText());
        String de1 = String.valueOf(va1.getText());
        String cot = String.valueOf(va3.getText());
        double net = 0;
        net = pedi * cost;
        String tote = String.valueOf(net);
        va5.setText(String.valueOf(net));
        int numeroRegistro = 0;
        try {
            String cosul = "insert into ingreso (cliente,pedidos,costo,total )values(?,?,?,?)";
            PreparedStatement misentencia;
            misentencia = con2.prepareStatement(cosul);
            misentencia.setString(1, de1);
            misentencia.setString(2, sis);
            misentencia.setString(3, cot);
            misentencia.setString(4, tote);
            numeroRegistro = (int) misentencia.executeUpdate();
        } catch (SQLException error) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, error);
        }
    }//GEN-LAST:event_enviarMouseClicked

    private void va5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_va5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_va5ActionPerformed
    public static void main(String args[]) throws SQLException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });

// 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField va1;
    private javax.swing.JTextField va2;
    private javax.swing.JTextField va3;
    public static javax.swing.JTextField va4;
    private javax.swing.JTextField va5;
    // End of variables declaration//GEN-END:variables
}
