/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import modelo.Arbol;
import modelo.AristaGrafoMapa;
import modelo.Calle;
import modelo.Ciudad;
import modelo.Edificio;
import modelo.NodoGrafoMapa;

/**
 *
 * @author SAMAEL
 */
public class FrameAnimacionMapa extends javax.swing.JFrame {

    static FrameAnimacionMapa frameMapa;
    Ciudad ciudad;
    LinkedList<Calle> calles;
    LinkedList<Arbol> arboles;
    LinkedList<Edificio> edificios;
    LinkedList<NodoGrafoMapa> listaNodosMapa;
    LinkedList<AristaGrafoMapa> aristasGrafoMapa;
    Thread hilo;
    boolean iniciarHilo;
    LinkedList<NodoGrafoMapa> listaNodosPeaton;
    LinkedList<AristaGrafoMapa> aristasGrafoPeaton;

    /**
     * Creates new form FrameCrearMapa
     */
    public FrameAnimacionMapa() {
        initComponents();

        calles = new LinkedList();
        arboles = new LinkedList<>();
        edificios = new LinkedList<>();
        listaNodosMapa = new LinkedList<>();
        aristasGrafoMapa = new LinkedList<>();
        listaNodosPeaton = new LinkedList<>();
        aristasGrafoPeaton = new LinkedList<>();
        ciudad = new Ciudad();

        this.hilo = new Thread(this.panelAnimacionMapa1);

        this.iniciarHilo = false;

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

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panelAnimacionMapa1 = new vista.PanelAnimacionMapa();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButton1.setText("Cargar Ciudad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 590, 110, 23);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/cerrarIcon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1180, 0, 20, 20);

        jButton2.setText("Mover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 590, 100, 23);

        jButton4.setText("Detener");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(260, 590, 110, 23);

        javax.swing.GroupLayout panelAnimacionMapa1Layout = new javax.swing.GroupLayout(panelAnimacionMapa1);
        panelAnimacionMapa1.setLayout(panelAnimacionMapa1Layout);
        panelAnimacionMapa1Layout.setHorizontalGroup(
            panelAnimacionMapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        panelAnimacionMapa1Layout.setVerticalGroup(
            panelAnimacionMapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(panelAnimacionMapa1);
        panelAnimacionMapa1.setBounds(30, 10, 1120, 560);

        jButton5.setText("Regresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(380, 590, 130, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Documentos/FondoPaginaInicial2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1400, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //cargar el archivo de la ciudad
        ObjectInputStream objetoDeEntrada;
        String file = null;
        JFileChooser ventanaDialogo = new JFileChooser("C:\\Users\\VICTOR\\Documents\\proyectoAnalisis");
        int option = ventanaDialogo.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = ventanaDialogo.getSelectedFile().getPath();
            try {
                objetoDeEntrada = new ObjectInputStream(new FileInputStream(file));
                ciudad = (Ciudad) objetoDeEntrada.readObject();
                objetoDeEntrada.close();

            } catch (IOException e) {
                System.out.println("problema" + e.getMessage());
                JOptionPane.showMessageDialog(this, "SELECCIONE UN ARCHIVO VALIDO");

            } catch (ClassNotFoundException ex) {
                System.out.println("problema" + ex.getMessage());
                Logger.getLogger(FrameAnimacionMapa.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "SELECCIONE UN ARCHIVO VALIDO");

            }

            panelAnimacionMapa1.setMatrizLetrasElementosInternosCuadriculaMapa(ciudad.getMatrizLetrasElementosInternosCuadriculaMapa());
            panelAnimacionMapa1.setMatrizCuadriculaMapaIdArboles(ciudad.getMatrizCuadriculaMapaIdArboles());
            panelAnimacionMapa1.setMatrizCuadriculaMapaIdCalles(ciudad.getMatrizCuadriculaMapaIdCalles());
            panelAnimacionMapa1.setMatrizCuadriculaMapaIdEdificios(ciudad.getMatrizCuadriculaMapaIdEdificios());
            panelAnimacionMapa1.setMatrizPuntosLimitesCuadriculaMapa(ciudad.getMatrizPuntosLimitesCuadriculaMapa());

            this.calles = ciudad.getListaCalles();
            this.arboles = ciudad.getArboles();
            this.edificios = ciudad.getListaEdificos();
            this.listaNodosMapa = ciudad.getListaNodosMapa();
            this.aristasGrafoMapa = ciudad.getListaDeTransicionesAristas();
            this.listaNodosPeaton = ciudad.getListaNodosPeatones();
            this.aristasGrafoPeaton = ciudad.getListaDeTransicionesAristasPeatones();

            panelAnimacionMapa1.setFrame(this);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panelAnimacionMapa1.moverCarros();
        if (this.iniciarHilo == false) {
            this.hilo.start();
        }
        this.iniciarHilo = true;

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        panelAnimacionMapa1.detenerCarros();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        paginaInicial inicio = new paginaInicial();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void agregarCalleALaLista(Calle calle) {
        calles.add(calle);
    }

    public void agregarArbolALaLista(Arbol arbol) {
        arboles.add(arbol);
    }

    public void agregarEdificioALaLista(Edificio edificio) {
        edificios.add(edificio);
    }

    public void agregarNodoALista(NodoGrafoMapa nodo) {
        listaNodosMapa.add(nodo);

    }

    //agrega los nodos a la lista de nodos de la calle
    public void agregarNodosAlistaDeCalle() {
        for (int i = 0; i < calles.size(); i++) {
            for (int j = 0; j < listaNodosMapa.size(); j++) {
                if (listaNodosMapa.get(j).getIdCalle() == calles.get(i).getId()) {
                    calles.get(i).getListaDeNodosEnCalle().add(listaNodosMapa.get(j));
                }
            }
        }
    }

    public LinkedList<NodoGrafoMapa> getListaNodosMapa() {
        return listaNodosMapa;
    }

    public LinkedList<AristaGrafoMapa> getAristasGrafoMapa() {
        return aristasGrafoMapa;
    }

    public LinkedList<Calle> getCalles() {
        return calles;
    }

    public LinkedList<Arbol> getArboles() {
        return arboles;
    }

    public LinkedList<Edificio> getEdificios() {
        return edificios;
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
            java.util.logging.Logger.getLogger(FrameAnimacionMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAnimacionMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAnimacionMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAnimacionMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frameMapa = new FrameAnimacionMapa();
                frameMapa.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private vista.PanelAnimacionMapa panelAnimacionMapa1;
    // End of variables declaration//GEN-END:variables

}
