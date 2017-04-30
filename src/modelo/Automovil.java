/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Rectangle;
import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 *
 * @author SAMAEL
 */
public class Automovil implements Serializable{
    
    private int id;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private LinkedList <ImageIcon> imagen;
    private boolean mover;
    private Rectangle area;

    public Automovil(int id, int x, int y, int ancho, int alto, boolean mover) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.imagen = new LinkedList<>();
        this.mover = mover;
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

    public LinkedList<ImageIcon> getImagen() {
        return imagen;
    }

    public boolean isMover() {
        return mover;
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

    public void setImagen(LinkedList<ImageIcon> imagen) {
        this.imagen = imagen;
    }

    public void setMover(boolean mover) {
        this.mover = mover;
    }

    public void setArea(Rectangle area) {
        this.area = area;
    }
    
    
    
    
    
    
    
}
