package ejemplo;

import desplazable.Desface;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Seleccion extends javax.swing.JPanel {

    String ori;
    String desti;
    int adul;
    int nino;

    Desface desplace;

    public Seleccion() {
        initComponents();
        desplace = new Desface();
        
        
        
        
        
         try {codVu();} catch (ClassNotFoundException ex) {
            Logger.getLogger(Seleccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Seleccion.class.getName()).log(Level.SEVERE, null, ex);
        }

        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        B_S_ida = new javax.swing.JToggleButton();
        B_S_R = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_alum = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        B_Ajenda2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        txtnumvuelo = new javax.swing.JTextField();
        clase_ida = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cb_hida = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cb_regreso = new javax.swing.JComboBox<>();
        clase_regreso = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        B_Ajenda1 = new javax.swing.JToggleButton();
        MenuPlegable = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        pr = new javax.swing.JTextField();
        xd = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        B_S_ida.setFont(new java.awt.Font("Century", 0, 10)); // NOI18N
        B_S_ida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/travel-holiday-vacation-328_89069.png"))); // NOI18N
        B_S_ida.setText("SELECCION DE SOLO IDA");
        B_S_ida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_S_idaActionPerformed(evt);
            }
        });

        B_S_R.setText("SELECCION DE IDA Y REGRESO");
        B_S_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_S_RActionPerformed(evt);
            }
        });

        jLabel1.setText("Vuelos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_S_ida, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(B_S_R, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B_S_ida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_S_R, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 100));

        Tabla_alum.setBackground(new java.awt.Color(255, 153, 153));
        Tabla_alum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "fila", "Origen", "Destino", "Adulto_Cantidad_solo", "Nino_Catidad_solo", "Fecha Ida", "Fecha de regreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla_alum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_alumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_alum);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 770, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Ajenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/previo.png"))); // NOI18N
        B_Ajenda2.setText("Agendar");
        B_Ajenda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Ajenda2ActionPerformed(evt);
            }
        });
        jPanel3.add(B_Ajenda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel3.setText("Vuelo escogido");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtnumvuelo.setEditable(false);
        jPanel3.add(txtnumvuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 33, 77, -1));

        clase_ida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera", "Segunda", "Turista" }));
        clase_ida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clase_idaActionPerformed(evt);
            }
        });
        jPanel3.add(clase_ida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 38));

        jLabel4.setText("Clase");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        cb_hida.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        cb_hida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2:00AM", "6:00AM", "10:00AM", "1:30AM", "2:00PM", "4:00PM", "7:00Pm", "9:00pm", "10:00pm", " " }));
        jPanel3.add(cb_hida, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 180, 30));

        jLabel7.setText("HORARIOS");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 160, 20));

        txt_costo.setEditable(false);
        jPanel3.add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 140, 30));

        jLabel8.setText("COSTO");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        cb_regreso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_regreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2:00AM", "6:00AM", "10:00AM", "1:30AM", "2:00PM", "4:00PM", "7:00Pm", "9:00pm", "10:00pm", " " }));
        jPanel3.add(cb_regreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 180, 30));

        clase_regreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera", "Segunda", "Turista" }));
        jPanel3.add(clase_regreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 30));

        jLabel9.setText("Regreso");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel10.setText("regreso");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        B_Ajenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/previo.png"))); // NOI18N
        B_Ajenda1.setText("Agendar");
        B_Ajenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Ajenda1ActionPerformed(evt);
            }
        });
        jPanel3.add(B_Ajenda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 413, 234));

        MenuPlegable.setBackground(new java.awt.Color(255, 102, 51));
        MenuPlegable.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/suitcase_travel_icon-icons.com_51097.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel2);
        jLabel2.setBounds(270, 0, 60, 70);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/configuracion2.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuPlegable.add(jLabel6);
        jLabel6.setBounds(10, 300, 170, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 0));
        jLabel5.setText("Equipage");
        MenuPlegable.add(jLabel5);
        jLabel5.setBounds(110, 10, 90, 40);

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5kg", "10kg", "15kg", " " }));
        MenuPlegable.add(jComboBox5);
        jComboBox5.setBounds(30, 70, 230, 60);
        MenuPlegable.add(pr);
        pr.setBounds(80, 150, 130, 60);

        MenuPlegable.add(xd);
        xd.setBounds(240, 160, 28, 20);

        add(MenuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 310, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void B_S_idaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_S_idaActionPerformed

        cargarTabla();
        clase_regreso.setEnabled(false);
        cb_regreso.setEnabled(false);
        B_Ajenda2.setEnabled(false);
        
       
        // TODO add your handling code here:
    }//GEN-LAST:event_B_S_idaActionPerformed

    private void B_S_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_S_RActionPerformed

        cargarTabla2();
        clase_regreso.setEnabled(true);
        cb_regreso.setEnabled(true);
        B_Ajenda2.setEnabled(true);
        B_Ajenda1.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_B_S_RActionPerformed

    private void Tabla_alumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_alumMouseClicked
     
        int seleccion = Tabla_alum.rowAtPoint(evt.getPoint());
        txtnumvuelo.setText(Tabla_alum.getValueAt(seleccion, 0).toString());
        pr.setText(Tabla_alum.getValueAt(seleccion, 1).toString());
       // xd.addItem(Tabla_alum.ge);
       this.xd.addItem(Tabla_alum.getColumnName(seleccion.1).toString());
        
        
        
        /*
        try {
        int fila = Tabla_alum.getSelectedRow();
        //sin base de datos
        int selecion = Tabla_alum.rowAtPoint(evt.getPoint());
        pr.setText(Tabla_alum.getValueAt(selecion, 1).toString());
        //termina aq
        // ori = (String) Tabla_alum.getValueAt(selecion, 1);
        desti = (String) Tabla_alum.getValueAt(selecion, 2);
        
        adul = Integer.parseInt(Tabla_alum.getValueAt(fila, 3).toString());
        nino = Integer.parseInt(Tabla_alum.getValueAt(fila, 4).toString());
        
        int id = Integer.parseInt(Tabla_alum.getValueAt(fila, 0).toString());
        PreparedStatement ps;
        ResultSet rs;
        Conectar con = new Conectar();
        ps = con.getConex().prepareStatement("SELECT Origen_solo,Destino_solo FROM Reserva_Solo WHERE ID=?;");
        ps.setInt(1, id);
        rs = ps.executeQuery();
        while (rs.next()) {
        
        txtnumvuelo.setText(String.valueOf(id));
        
        }
        
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
        
        JOptionPane.showMessageDialog(null, "mal");
        }
        
        //pago();
        */
    }//GEN-LAST:event_Tabla_alumMouseClicked
public void codVu() throws ClassNotFoundException, SQLException {
        
        Conectar cc = new Conectar();
    Connection cn = cc.getConex();
        String matricula = "SELECT* FROM Reserva_Solo";
        try {
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(matricula);
            while (rs.next()) {
                txt_costo.setText(rs.getString("Origen_solo"));
                //this.txt_costo.addItem(rs.getString("Origen_solo"));
                //this..addItem(rs.getString("Origen_solo"));
            }
        } catch (Exception e) {
        }
    }
    
    
    
    
    public void pago() {
         String comvertido;
          int valor;
         //int luna = adul + nino;
         //comvertido = Integer.toString(luna);
        //txt_costo.setText(comvertido);
        //txt_costo.setText(ori);
        String origin = "Quito";
        //funciona tanto con objeto origen con con variavia ingresada "la palabra"
        if (ori.equals(origin) && desti.equals("Madrid")) {

            valor = 1000 * (adul + nino);
            comvertido = Integer.toString(valor);
            txt_costo.setText(comvertido);
        }
        if (ori.equals("Quito") && desti.equals("Roma")) {
             valor = 600 * (adul + nino);
            comvertido = Integer.toString(valor);
            txt_costo.setText(comvertido);
        }
        if (ori.equals("Quito") && desti.equals("Chicago")) {
             valor = 700 * (adul + nino);
            comvertido = Integer.toString(valor);
            txt_costo.setText(comvertido);
        }
        if (ori.equals("Quito") && desti.equals("NewYour")) {
             valor = 800 * (adul + nino);
            comvertido = Integer.toString(valor);
            txt_costo.setText(comvertido);
        }
        if (ori.equals("Quito") && desti.equals("Pekin")) {
             valor = 2000 * (adul + nino);
            comvertido = Integer.toString(valor);
            txt_costo.setText(comvertido);
        }
        

    }


    private void clase_idaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clase_idaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clase_idaActionPerformed

    private void B_Ajenda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Ajenda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_Ajenda2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -270, 10, 10);

        } else if (MenuPlegable.getX() == -270) {
            desplace.desplazarDerecha(MenuPlegable, MenuPlegable.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void B_Ajenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Ajenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_Ajenda1ActionPerformed
    private void formComponentResized(java.awt.event.ComponentEvent evt) {
        MenuPlegable.setSize(new Dimension(MenuPlegable.getWidth(), this.getHeight()));
    }

    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) Tabla_alum.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            //cargar driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conexion con base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=modelos";
            Connection Con = DriverManager.getConnection(url, "sa", "123456");

            ps = Con.prepareStatement("SELECT ID,Origen_solo,Destino_solo,Adulto_Cantidad_solo,Nino_Catidad_solo,fecha_vuelo_solo  from  Reserva_Solo;");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void cargarTabla2() {
        DefaultTableModel modeloTabla = (DefaultTableModel) Tabla_alum.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            //cargar driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conexion con base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=modelos";
            Connection Con = DriverManager.getConnection(url, "sa", "123456");

            ps = Con.prepareStatement("SELECT IDV,Origen_varios,Destino_varios,Adulto_Cantidad_varios,Nino_Catidad_varios,fecha_vuelo_ida_varios,fecha_vuelo_regreso_varios from  Reserva_Varios;");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void calculartarifa(String origen, String destino, int adu, int nino) {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton B_Ajenda1;
    private javax.swing.JToggleButton B_Ajenda2;
    private javax.swing.JToggleButton B_S_R;
    private javax.swing.JToggleButton B_S_ida;
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JTable Tabla_alum;
    private javax.swing.JComboBox<String> cb_hida;
    private javax.swing.JComboBox<String> cb_regreso;
    private javax.swing.JComboBox<String> clase_ida;
    private javax.swing.JComboBox<String> clase_regreso;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pr;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txtnumvuelo;
    private javax.swing.JComboBox<String> xd;
    // End of variables declaration//GEN-END:variables
}
