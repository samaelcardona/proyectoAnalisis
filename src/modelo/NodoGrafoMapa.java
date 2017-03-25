/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Rectangle;

/**
 *
 * @author SAMAEL
 */
public class NodoGrafoMapa {
    
    
    private int id;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private Rectangle area;
    private boolean activo;

    public NodoGrafoMapa(int id, int x, int y, int ancho, int alto, boolean activo) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.activo = activo;
        this.area=new Rectangle(x, y, ancho, alto);
    }

    public Rectangle getArea() {
        return area;
    }

    public void setArea(Rectangle area) {
        this.area = area;
    }

    
    
    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
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

    public boolean isActivo() {
        return activo;
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

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
     public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
    
}
