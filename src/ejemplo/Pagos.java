/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author XarryGames
 */
public class Pagos extends javax.swing.JPanel {

    /**
     * Creates new form Pagos
     */
    public Pagos() {
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

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField21 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(153, 153, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Pagar.png"))); // NOI18N
        jButton2.setText("Targeta");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 200, 100));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setText("Pagos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel1)
                .addContainerGap(493, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 180, -1));

        jLabel2.setText("Imformacion Targeta");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/targe2.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 40, 30));

        jLabel3.setText("Numero");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jTextField2.setToolTipText("");
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 140, -1));

        jLabel4.setText("MM/AA");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setText("CV");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 140, 20));

        jLabel7.setText("Información del titular de la tarjeta");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 100, -1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 120, -1));

        jLabel8.setText("Nombre");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel9.setText("Apellido");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 20));

        jLabel10.setText("Tipo");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 110, -1));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 220, -1));

        jLabel11.setText("Correo");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jTextField8.setText("jTextField8");
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 360, 110, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel12.setText("ciudad");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jLabel13.setText("Direccion");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 130, -1));

        jCheckBox1.setText("Acepto");
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Resumen de la compra");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jTextField10.setEditable(false);
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 70, -1));

        jTextField11.setEditable(false);
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 70, -1));

        jLabel15.setText("Total");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jTextField12.setEditable(false);
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, -1));

        jTextField13.setEditable(false);
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 70, -1));

        jTextField14.setEditable(false);
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 60, -1));

        jLabel16.setText("Precio");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel17.setText("Precio Regreso");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel18.setText("Origin");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel19.setText("Destino");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jTextField15.setEditable(false);
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 60, -1));

        jLabel20.setText("Horario");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jTextField16.setEditable(false);
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 160, 70, -1));

        jTextField17.setEditable(false);
        jPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 80, -1));

        jLabel21.setText("Fecha");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel22.setText("Regreso");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jTextField18.setEditable(false);
        jPanel2.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 160, 80, -1));

        jTextField19.setEditable(false);
        jPanel2.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 60, -1));

        jTextField20.setEditable(false);
        jPanel2.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 160, 80, -1));

        jButton1.setText("jButton1");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jButton3.setText("jButton3");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));
        jPanel2.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 110, 20));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 460, 270));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}