

package ejemplo;

import desplazable.Desface;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class PRINCIPAL extends javax.swing.JFrame {
private ImageIcon imagen;
     private Icon icono;
    
    Desface desplace;
    public PRINCIPAL() {
        initComponents();
        desplace = new Desface();
        this.setLocationRelativeTo(this);
        
        this.pintarImagen(this.lblImagen1, "src/img/labo.jpg");
        this.pintarImagen(this.lblImagen2, "src/img/aire2.png");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPlegable = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        B_reserva = new javax.swing.JButton();
        B_secvuelo = new javax.swing.JButton();
        B_pervuelo = new javax.swing.JButton();
        B_pagos = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        MenuPlegable.setBackground(new java.awt.Color(51, 51, 51));
        MenuPlegable.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu2.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        MenuPlegable.add(jLabel2);
        jLabel2.setBounds(170, 0, 50, 50);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/configuracion2.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuPlegable.add(jLabel6);
        jLabel6.setBounds(10, 300, 170, 50);

        B_reserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/factura2.png"))); // NOI18N
        B_reserva.setText("Reserva");
        B_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_reservaActionPerformed(evt);
            }
        });
        MenuPlegable.add(B_reserva);
        B_reserva.setBounds(10, 50, 200, 40);

        B_secvuelo.setText("Seleccion de vuelo");
        B_secvuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_secvueloActionPerformed(evt);
            }
        });
        MenuPlegable.add(B_secvuelo);
        B_secvuelo.setBounds(10, 100, 200, 50);

        B_pervuelo.setText("Personalisa vuelo");
        B_pervuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_pervueloActionPerformed(evt);
            }
        });
        MenuPlegable.add(B_pervuelo);
        B_pervuelo.setBounds(10, 160, 200, 40);

        B_pagos.setText("Pagos");
        B_pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_pagosActionPerformed(evt);
            }
        });
        MenuPlegable.add(B_pagos);
        B_pagos.setBounds(10, 220, 200, 50);

        getContentPane().add(MenuPlegable);
        MenuPlegable.setBounds(0, 0, 220, 430);

        content.setMinimumSize(new java.awt.Dimension(0, 0));
        content.setPreferredSize(new java.awt.Dimension(2000, 900));

        lblImagen2.setBackground(new java.awt.Color(153, 255, 102));
        lblImagen2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblImagen1.setBackground(new java.awt.Color(255, 204, 0));
        lblImagen1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        getContentPane().add(content);
        content.setBounds(230, 20, 830, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 10);
        } else if (MenuPlegable.getX() == -170) {
            desplace.desplazarDerecha(MenuPlegable, MenuPlegable.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        MenuPlegable.setSize(new Dimension(MenuPlegable.getWidth(), this.getHeight()));
    }//GEN-LAST:event_formComponentResized

    private void B_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_reservaActionPerformed
      
        vuelo p1=new vuelo();

        p1.setSize(1500, 900);
        p1.setLocation(0, 0);
        content.removeAll();
        content.add(p1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_B_reservaActionPerformed

    private void B_secvueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_secvueloActionPerformed

        Seleccion p1=new Seleccion();
        p1.setSize(1600, 900);
        p1.setLocation(0, 0);
        content.removeAll();
        content.add(p1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_B_secvueloActionPerformed

    private void B_pervueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_pervueloActionPerformed

        Personaliza p1=new Personaliza();
        p1.setSize(1500, 900);
        p1.setLocation(0, 0);
        content.removeAll();
        content.add(p1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_B_pervueloActionPerformed

    private void B_pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_pagosActionPerformed

        Pagos p1=new Pagos();
        p1.setSize(1500, 900);
        p1.setLocation(0, 0);
        content.removeAll();
        content.add(p1,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

        // TODO add your handling code here:
    }//GEN-LAST:event_B_pagosActionPerformed

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
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(), 
                        lbl.getHeight(), 
                        Image.SCALE_DEFAULT
                )
        );
        lbl.setIcon(this.icono);
        this.repaint();
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_pagos;
    private javax.swing.JButton B_pervuelo;
    private javax.swing.JButton B_reserva;
    private javax.swing.JButton B_secvuelo;
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    // End of variables declaration//GEN-END:variables
}
