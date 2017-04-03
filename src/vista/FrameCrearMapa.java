/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import modelo.Calle;


/**
 *
 * @author SAMAEL
 */
public class FrameCrearMapa extends javax.swing.JFrame {

    static FrameCrearMapa frameMapa;
    LinkedList<JRadioButton> botones; 
    LinkedList<Calle> calles;
    /**
     * Creates new form FrameCrearMapa
     */
    public FrameCrearMapa() {
        initComponents();
        botones = new LinkedList();
        calles = new LinkedList();
        
        this.botones.add(jRadioButton1);
        this.botones.add(jRadioButton2);
        this.botones.add(jRadioButton3);
        this.botones.add(jRadioButton4);
        this.botones.add(jRadioButton5);
        this.botones.add(jRadioButton6);
        
        
       for (int i = 0; i < 6; i++) {
            this.buttonGroup1.add(botones.get(i));
            ImageIcon imagen=new ImageIcon("src\\imagenes\\calles\\"+i+".png");
            this.botones.get(i).setIcon(imagen);            
            //Calle(int id, int x, int y, int ancho, int alto, ImageIcon imagen, String tipo, String sentido, int velocidad, boolean movimiento); 
            this.calles.add(new Calle(i, -50, -50, imagen.getIconWidth(),imagen.getIconHeight(),imagen, "tipo", "sentido", 100, true));
            
        }
       // addKeyListener(crearMapaPanel1);
        setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelCrearMapa1 = new vista.PanelCrearMapa();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1350, 700));
        setMinimumSize(new java.awt.Dimension(1350, 700));
        setPreferredSize(new java.awt.Dimension(1350, 700));
        getContentPane().setLayout(null);

        jButton1.setText("Guardar Nuevo Mapa");
        getContentPane().add(jButton1);
        jButton1.setBounds(1170, 490, 140, 23);

        jButton2.setText("Cargar Nuevo Mapa");
        getContentPane().add(jButton2);
        jButton2.setBounds(1170, 520, 140, 23);

        javax.swing.GroupLayout panelCrearMapa1Layout = new javax.swing.GroupLayout(panelCrearMapa1);
        panelCrearMapa1.setLayout(panelCrearMapa1Layout);
        panelCrearMapa1Layout.setHorizontalGroup(
            panelCrearMapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        panelCrearMapa1Layout.setVerticalGroup(
            panelCrearMapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(panelCrearMapa1);
        panelCrearMapa1.setBounds(10, 10, 1120, 560);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(428, 569));
        jScrollPane3.setWheelScrollingEnabled(false);

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton6))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton2)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton3)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton4)
                .addGap(0, 0, 0)
                .addComponent(jRadioButton5)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton6)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(1170, 10, 149, 460);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/FondoPaginaInicial.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1400, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        this.ocultarBordes();
        this.jRadioButton1.setBorderPainted(true);
        this.panelCrearMapa1.setCalle(calles.get(0));
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        this.ocultarBordes();
        this.jRadioButton2.setBorderPainted(true);
        this.panelCrearMapa1.setCalle(calles.get(1));
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        this.ocultarBordes();
        this.jRadioButton3.setBorderPainted(true);
        this.panelCrearMapa1.setCalle(calles.get(2));
        

    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        
        this.ocultarBordes();
        this.jRadioButton4.setBorderPainted(true);
        this.panelCrearMapa1.setCalle(calles.get(3));
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        
        this.ocultarBordes();
        this.jRadioButton5.setBorderPainted(true);
        this.panelCrearMapa1.setCalle(calles.get(4));
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        
        this.ocultarBordes();
        this.jRadioButton6.setBorderPainted(true);
        this.panelCrearMapa1.setCalle(calles.get(5));
    }//GEN-LAST:event_jRadioButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCrearMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCrearMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCrearMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCrearMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 frameMapa=new FrameCrearMapa();
                  frameMapa.setVisible(true);
            }
        });
    }
    
    private void ocultarBordes() {
        this.botones.stream().forEach((boton) -> {
            if (boton.isBorderPainted()) {
                boton.setBorderPainted(false);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane3;
    private vista.PanelCrearMapa panelCrearMapa1;
    // End of variables declaration//GEN-END:variables
}
