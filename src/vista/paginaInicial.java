/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author SAMAEL
 */
public class paginaInicial extends javax.swing.JFrame {

    /**
     * Creates new form paginaInicial
     */
    public paginaInicial() {
        initComponents();
        
        //localizar la pantalla en el medio 
        this.setLocationRelativeTo(null);
   
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondoPaginaInicial1 = new vista.PanelFondoPaginaInicial();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("Animacion ");
        jButton2.setMaximumSize(new java.awt.Dimension(51, 176));
        jButton2.setMinimumSize(new java.awt.Dimension(51, 176));
        jButton2.setPreferredSize(new java.awt.Dimension(51, 176));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("<html><p>Crear O Modificar</p><p ALIGN=center>Mapa</p></html>"); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setActionCommand("<html><p>Crear O Modificar</p><p>Mapa</p></html>");
        jButton1.setMaximumSize(new java.awt.Dimension(51, 176));
        jButton1.setMinimumSize(new java.awt.Dimension(51, 176));
        jButton1.setPreferredSize(new java.awt.Dimension(51, 176));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoPaginaInicial1Layout = new javax.swing.GroupLayout(panelFondoPaginaInicial1);
        panelFondoPaginaInicial1.setLayout(panelFondoPaginaInicial1Layout);
        panelFondoPaginaInicial1Layout.setHorizontalGroup(
            panelFondoPaginaInicial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoPaginaInicial1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        panelFondoPaginaInicial1Layout.setVerticalGroup(
            panelFondoPaginaInicial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoPaginaInicial1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(panelFondoPaginaInicial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("\"<\"+\"html\"+\">Crear O Modificar<\"+\"br\"+\">Mapa+\"<!--\"+\"html\"+\"-->\""); // NOI18N

        getContentPane().add(panelFondoPaginaInicial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameCrearMapa mapaFrame=new FrameCrearMapa();
        mapaFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(paginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private vista.PanelFondoPaginaInicial panelFondoPaginaInicial1;
    // End of variables declaration//GEN-END:variables
}
