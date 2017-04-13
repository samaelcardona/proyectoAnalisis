/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import modelo.Arbol;
import modelo.Calle;


/**
 *
 * @author SAMAEL
 */
public class FrameCrearMapa extends javax.swing.JFrame {

    static FrameCrearMapa frameMapa;
    LinkedList<JRadioButton> botones; 
    LinkedList<Calle> calles;
    ImageIcon [] listaImagenesParaSeleccionar;
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
        this.botones.add(jRadioButton7);
        this.botones.add(jRadioButton8);
        this.botones.add(jRadioButton9);
        this.botones.add(jRadioButton10);
        this.botones.add(jRadioButton11);
        this.botones.add(jRadioButton12);
        this.botones.add(jRadioButton13);
        this.botones.add(jRadioButton14);
        this.botones.add(jRadioButton15);
        this.botones.add(jRadioButton16);
        this.botones.add(jRadioButton17);
        this.botones.add(jRadioButton18);
        this.botones.add(jRadioButton19);
        this.botones.add(jRadioButton20);
        
        ///cambio para no crear de una vez cada boton
        listaImagenesParaSeleccionar=new ImageIcon[botones.size()];
        
       for (int i = 0; i < botones.size(); i++) {
            this.buttonGroup1.add(botones.get(i));
            ImageIcon imagen=new ImageIcon("src\\imagenes\\calles\\"+i+".png");
            this.botones.get(i).setIcon(imagen);            
            //Calle(int id, int x, int y, int ancho, int alto, ImageIcon imagen, String tipo, String sentido, int velocidad, boolean movimiento); 
            listaImagenesParaSeleccionar[i]=imagen;
            
        }
       // addKeyListener(crearMapaPanel1);
        setFocusable(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 700));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButton1.setText("Guardar Nuevo Mapa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1170, 490, 140, 23);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/cerrarIcon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1330, 0, 20, 20);

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

        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });

        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });

        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });

        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
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
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton8)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton9)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton10)
                .addGap(0, 0, 0)
                .addComponent(jRadioButton11)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton12)
                .addGap(0, 0, 0)
                .addComponent(jRadioButton13)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton14)
                .addGap(0, 0, 0)
                .addComponent(jRadioButton16)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton15)
                .addGap(0, 0, 0)
                .addComponent(jRadioButton20)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton19)
                .addGap(0, 0, 0)
                .addComponent(jRadioButton18)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton17)
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
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[0].getIconWidth(),listaImagenesParaSeleccionar[0].getIconHeight(),listaImagenesParaSeleccionar[0], "", "", 0, true),"horizontal");
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        this.ocultarBordes();
        this.jRadioButton2.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[1].getIconWidth(),listaImagenesParaSeleccionar[1].getIconHeight(),listaImagenesParaSeleccionar[1], "", "", 0, true),"vertical");
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        this.ocultarBordes();
        this.jRadioButton3.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[2].getIconWidth(),listaImagenesParaSeleccionar[2].getIconHeight(),listaImagenesParaSeleccionar[2], "", "", 0, true),"horizontal");
        

    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        
        this.ocultarBordes();
        this.jRadioButton4.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[3].getIconWidth(),listaImagenesParaSeleccionar[3].getIconHeight(),listaImagenesParaSeleccionar[3], "", "", 0, true),"interseccionCruzada");
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        
        this.ocultarBordes();
        this.jRadioButton5.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[4].getIconWidth(),listaImagenesParaSeleccionar[4].getIconHeight(),listaImagenesParaSeleccionar[4], "", "", 0, true),"horizontal");
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        
        this.ocultarBordes();
        this.jRadioButton6.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[5].getIconWidth(),listaImagenesParaSeleccionar[5].getIconHeight(),listaImagenesParaSeleccionar[5], "", "", 0, true),"vertical");
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
       this.ocultarBordes();
        this.jRadioButton7.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[6].getIconWidth(),listaImagenesParaSeleccionar[6].getIconHeight(),listaImagenesParaSeleccionar[6], "", "", 0, true),"vertical");
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        this.ocultarBordes();
        this.jRadioButton8.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        ///interseccion
        this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[7].getIconWidth(),listaImagenesParaSeleccionar[7].getIconHeight(),listaImagenesParaSeleccionar[7], "", "", 0, true),"interseccionArribaDerecha");
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        this.ocultarBordes();
        this.jRadioButton9.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        //interseccion
        this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[8].getIconWidth(),listaImagenesParaSeleccionar[8].getIconHeight(),listaImagenesParaSeleccionar[8], "", "", 0, true),"interseccionArribaIzquierda");

    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        this.ocultarBordes();
        this.jRadioButton10.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        //interseccion
       this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[9].getIconWidth(),listaImagenesParaSeleccionar[9].getIconHeight(),listaImagenesParaSeleccionar[9], "", "", 0, true),"interseccionAbajoDerecha");

    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        this.ocultarBordes();
        this.jRadioButton11.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        //interseccion
        this.panelCrearMapa1.setCalle(new Calle(0, -50, -50, listaImagenesParaSeleccionar[10].getIconWidth(),listaImagenesParaSeleccionar[10].getIconHeight(),listaImagenesParaSeleccionar[10], "", "", 0, true),"interseccionAbajoIzquierda");
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        this.ocultarBordes();
        this.jRadioButton12.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        //arbol
        this.panelCrearMapa1.setArbol(new Arbol(0, 0, 0, listaImagenesParaSeleccionar[11].getIconWidth(), listaImagenesParaSeleccionar[11].getIconHeight(), listaImagenesParaSeleccionar[11]));

    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        this.ocultarBordes();
        this.jRadioButton13.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
       //arbol
        this.panelCrearMapa1.setArbol(new Arbol(0, 0, 0, listaImagenesParaSeleccionar[12].getIconWidth(), listaImagenesParaSeleccionar[12].getIconHeight(), listaImagenesParaSeleccionar[12]));

    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        this.ocultarBordes();
        this.jRadioButton14.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
       //arbol
        this.panelCrearMapa1.setArbol(new Arbol(0, 0, 0, listaImagenesParaSeleccionar[13].getIconWidth(), listaImagenesParaSeleccionar[13].getIconHeight(), listaImagenesParaSeleccionar[13]));
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        this.ocultarBordes();
        this.jRadioButton15.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        //edificio
      

    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        this.ocultarBordes();
        this.jRadioButton16.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);
        //edificio
      
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        this.ocultarBordes();
        this.jRadioButton17.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);        
       //edificio
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        this.ocultarBordes();
        this.jRadioButton17.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);        
         //edificio
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        this.ocultarBordes();
        this.jRadioButton19.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);        
         //edificio
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        this.ocultarBordes();
        this.jRadioButton20.setBorderPainted(true);
        this.panelCrearMapa1.recibirFrameCrearMapa(this);        
         //edificio
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < calles.size(); i++) {
            System.out.println("calle " + calles.get(i).getId());
            System.out.println("  sentido "+ calles.get(i).getSentido());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void agregarCalleALaLista(Calle calle) {
        calles.add(calle);
    }

    public LinkedList<Calle> getCalles() {
        return calles;
    }

    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    public JRadioButton getjRadioButton10() {
        return jRadioButton10;
    }

    public JRadioButton getjRadioButton11() {
        return jRadioButton11;
    }

    public JRadioButton getjRadioButton12() {
        return jRadioButton12;
    }

    public JRadioButton getjRadioButton13() {
        return jRadioButton13;
    }

    public JRadioButton getjRadioButton14() {
        return jRadioButton14;
    }

    public JRadioButton getjRadioButton15() {
        return jRadioButton15;
    }

    public JRadioButton getjRadioButton16() {
        return jRadioButton16;
    }

    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    public JRadioButton getjRadioButton3() {
        return jRadioButton3;
    }

    public JRadioButton getjRadioButton4() {
        return jRadioButton4;
    }

    public JRadioButton getjRadioButton5() {
        return jRadioButton5;
    }

    public JRadioButton getjRadioButton6() {
        return jRadioButton6;
    }

    public JRadioButton getjRadioButton7() {
        return jRadioButton7;
    }

    public JRadioButton getjRadioButton8() {
        return jRadioButton8;
    }

    public JRadioButton getjRadioButton9() {
        return jRadioButton9;
    }

    
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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane3;
    private vista.PanelCrearMapa panelCrearMapa1;
    // End of variables declaration//GEN-END:variables

    
}
