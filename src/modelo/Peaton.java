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
public class Peaton implements Serializable{
    
    private int id;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private ImageIcon imagen;
    private boolean mover;
    private Rectangle area;
    LinkedList<Integer> rutaIdNodos;
    LinkedList<Integer> ruta;
    NodoGrafoMapa nodoA;
    NodoGrafoMapa nodoB;
    int contarNodoRuta;

    public Peaton(int id, int x, int y, int ancho, int alto, ImageIcon imagen, boolean mover) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.imagen = imagen;
        this.mover = mover;
        this.area = new Rectangle(x, y, ancho, alto);
         this.rutaIdNodos = new LinkedList<>(); //ruta de nodos seleccionados inicialmente
        this.nodoA = null;
        this.nodoB = null;
        this.contarNodoRuta = 0;
        this.ruta= new LinkedList<>();//ruta final para recorrer 
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

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public void setMover(boolean mover) {
        this.mover = mover;
    }

    public void setArea(Rectangle area) {
        this.area = area;
    }

    public LinkedList<Integer> getRutaIdNodos() {
        return rutaIdNodos;
    }

    public void setRutaIdNodos(LinkedList<Integer> rutaIdNodos) {
        this.rutaIdNodos = rutaIdNodos;
    }

    public LinkedList<Integer> getRuta() {
        return ruta;
    }

    public void setRuta(LinkedList<Integer> ruta) {
        this.ruta = ruta;
    }

    public NodoGrafoMapa getNodoA() {
        return nodoA;
    }

    public void setNodoA(NodoGrafoMapa nodoA) {
        this.nodoA = nodoA;
    }

    public NodoGrafoMapa getNodoB() {
        return nodoB;
    }

    public void setNodoB(NodoGrafoMapa nodoB) {
        this.nodoB = nodoB;
    }

    public int getContarNodoRuta() {
        return contarNodoRuta;
    }

    public void setContarNodoRuta(int contarNodoRuta) {
        this.contarNodoRuta = contarNodoRuta;
    }
    
    
    
    
}
