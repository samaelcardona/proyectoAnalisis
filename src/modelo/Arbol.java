/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Rectangle;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author SAMAEL
 */
public class Arbol implements Serializable{
    
    
    private int id;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private ImageIcon imagen;
    private Rectangle area;

    public Arbol(int id, int x, int y, int ancho, int alto, ImageIcon imagen) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.imagen = imagen;
        this.area = new Rectangle(x, y, ancho, alto);
    }

    public int getId() {
        return id;
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

    public Rectangle getArea() {
        return area;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setArea(Rectangle area) {
        this.area = area;
    }
    
    
}
