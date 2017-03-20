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
public class Calle {
   //identificador de calle 
    private int id;
    //posicion x de la calle
    private int x;
    //posicion y de la calle
    private int y;
    //tamano en ancho de la imagen 
    private int ancho;
    //tamano en alto de la imagen
    private int alto;
    //area que ocupa en la posicion x y la imagen 
    private Rectangle area;
    //imagen perteneciente a la calle
    private ImageIcon imagen;
    //tipo de calle urbana o carretera
    private String tipo;
    //sentido derecha izquierda o ambos sentidos
    private String sentido;
    //velocidad en la que se puede manejar en esta calle  60 urbana 100 carretera
    private int velocidad;
    //movimiento se refiere a si hay movimiento o la via esta cerrada o restringida 
    private boolean movimiento;
    //lista de sucesos accidente, obreros, 
    private LinkedList<String> listaSucesos;

    public Calle(int id, int x, int y, int ancho, int alto, ImageIcon imagen, String tipo, String sentido, int velocidad, boolean movimiento) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.area = new Rectangle(x, y, ancho, alto);
        this.imagen = imagen;
        this.tipo = tipo;
        this.sentido = sentido;
        this.velocidad = velocidad;
        this.movimiento = movimiento;
        this.listaSucesos = new LinkedList<>();
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

    public Rectangle getArea() {
        return area;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSentido() {
        return sentido;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean isMovimiento() {
        return movimiento;
    }

    public LinkedList<String> getListaSucesos() {
        return listaSucesos;
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

    public void setArea(Rectangle area) {
        this.area = area;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }

    public void setListaSucesos(LinkedList<String> listaSucesos) {
        this.listaSucesos = listaSucesos;
    }
    
    
    
    
    
    
   
}
