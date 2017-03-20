/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author SAMAEL
 */
public class NodoGrafoMapa {
    
    
    private int id;
    private int x;
    private int y;
    private boolean activo;

    public NodoGrafoMapa(int id, int x, int y, boolean activo) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.activo = activo;
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
    
    
    
    
    
}
