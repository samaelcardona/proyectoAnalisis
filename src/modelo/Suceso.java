/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Rectangle;
import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 *
 * @author SAMAEL
 */
public class Suceso {

    private String nombre;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private ImageIcon imagen;
     LinkedList<AristaGrafoMapa> aristasAEliminar;
    LinkedList<AristaGrafoMapa> aristasNuevasAEliminar;

    public Suceso(String nombre, int x, int y, int ancho, int alto, ImageIcon imagen) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.imagen = imagen;
        this.aristasAEliminar = new LinkedList<>();
        this.aristasNuevasAEliminar = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public LinkedList<AristaGrafoMapa> getAristasAEliminar() {
        return aristasAEliminar;
    }

    public LinkedList<AristaGrafoMapa> getAristasNuevasAEliminar() {
        return aristasNuevasAEliminar;
    }

    public void setAristasAEliminar(LinkedList<AristaGrafoMapa> aristasAEliminar) {
        this.aristasAEliminar = aristasAEliminar;
    }

    public void setAristasNuevasAEliminar(LinkedList<AristaGrafoMapa> aristasNuevasAEliminar) {
        this.aristasNuevasAEliminar = aristasNuevasAEliminar;
    }
    

}
