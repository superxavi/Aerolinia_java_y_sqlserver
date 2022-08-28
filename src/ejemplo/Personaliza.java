
package ejemplo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Personaliza extends javax.swing.JPanel {

  
    public Personaliza() {
        initComponents();
        try {
            codVu();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Personaliza.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Personaliza.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cmbxCodeVu = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Personaliza");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 25, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 150, 40));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 160, 40));

        jLabel2.setText("Correo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel3.setText("Codigo de area");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel4.setText("Numero de telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jCheckBox1.setText("Acepto el uso de mis datos personales para recibir promociones, ofertas y novedades que Avianca tiene para mí");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jCheckBox2.setText(" Recordar mis datos para futuras compras.");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jTabbedPane1.addTab("Contacto", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Asiento.jpg"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 360));

        jRadioButton1.setText("jRadioButton1");
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 50, -1));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "R1", "R2", "R3", "R4", "R5", "R6", "R7", "R9", "R10L", "R11L", " " }));
        jPanel4.add(jComboBox4);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 80, 160));

        jPanel5.setBackground(new java.awt.Color(255, 255, 51));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A50", "A51", "A52", "A53", "A54", "A55", "A56", " " }));
        jPanel5.add(jComboBox5);

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 80, 160));

        jPanel6.setBackground(new java.awt.Color(0, 153, 0));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V100", "V102", "V103", "V104", "V105", "V106", "V107", " " }));
        jPanel6.add(jComboBox6);

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 90, 160));

        jTabbedPane1.addTab("Asientos", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, 30));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ECUADOR", "COLOMBIA", "MEXICO", "EEUU", "PERU", "BOLIA", "ARGENTINA", "URUGUAY", "BRAZIL" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 110, 20));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 270, 50));

        cmbxCodeVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        cmbxCodeVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxCodeVuActionPerformed(evt);
            }
        });
        jPanel2.add(cmbxCodeVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 210, 50));

        jLabel6.setText("Nombre");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel7.setText("Apellido");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel8.setText("Genero");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel9.setText("Nacionalidad");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel10.setText("Ingresa tu fecha de nacimiento:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 260, 20));

        jLabel11.setText("Numero de Vuelo");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 50));

        jButton2.setText("jButton2");
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 140, 50));

        jLabel12.setText("Campo Obligatorio para su vuelo");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 340, 110));

        jButton3.setText("Agendar ");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 200, 60));

        jTabbedPane1.addTab("Imformación", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 840, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxCodeVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxCodeVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxCodeVuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbxCodeVu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    public void codVu() throws ClassNotFoundException, SQLException {
        Conectar cc = new Conectar();
    Connection cn = cc.getConex();
        String matricula = "SELECT* FROM Reserva_Solo";
        try {
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(matricula);
            while (rs.next()) {
                this.cmbxCodeVu.addItem(rs.getString("Origen_solo"));
            }
        } catch (Exception e) {
        }
    }




}
