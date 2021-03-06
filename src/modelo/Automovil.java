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
public class Automovil implements Serializable {

    private int id;
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private LinkedList<ImageIcon> imagen;
    private boolean mover;
    private Rectangle area;
    private boolean imgAnterior0;
    private boolean imgAnterior1;
    private boolean imgAnterior2;
    private boolean imgAnterior3;
    LinkedList<Integer> rutaIdNodos;
    LinkedList<Integer> ruta;
    NodoGrafoMapa nodoA;
    NodoGrafoMapa nodoB;
    int contarNodoRuta;
    String tipoDeRutaActual;

    public Automovil(int id, int x, int y, int ancho, int alto, boolean mover) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.imagen = new LinkedList<>();
        this.mover = mover;
        this.area = new Rectangle(x, y, ancho, alto);
        this.imgAnterior0 = false;
        this.imgAnterior1 = false;
        this.imgAnterior2 = false;
        this.imgAnterior3 = false;
        this.rutaIdNodos = new LinkedList<>(); //ruta de nodos seleccionados inicialmente
        this.nodoA = null;
        this.nodoB = null;
        this.contarNodoRuta = 0;
        this.ruta= new LinkedList<>();//ruta final para recorrer 
        this.tipoDeRutaActual="";
       
    }

    public String getTipoDeRutaActual() {
        return tipoDeRutaActual;
    }

    public void setTipoDeRutaActual(String tipoDeRutaActual) {
        this.tipoDeRutaActual = tipoDeRutaActual;
    }

    public int getContarNodoRuta() {
        return contarNodoRuta;
    }

    public void setContarNodoRuta(int contarNodoRuta) {
        this.contarNodoRuta = contarNodoRuta;
    }

    public NodoGrafoMapa getNodoA() {
        return nodoA;
    }

    public NodoGrafoMapa getNodoB() {
        return nodoB;
    }

    public void setNodoA(NodoGrafoMapa nodoA) {
        this.nodoA = nodoA;
    }

    public void setNodoB(NodoGrafoMapa nodoB) {
        this.nodoB = nodoB;
    }

    public LinkedList<Integer> getRutaIdNodos() {
        return rutaIdNodos;
    }

    public void setRutaIdNodos(LinkedList<Integer> rutaIdNodos) {
        this.rutaIdNodos = rutaIdNodos;
    }

    public boolean isImgAnterior0() {
        return imgAnterior0;
    }

    public boolean isImgAnterior1() {
        return imgAnterior1;
    }

    public boolean isImgAnterior2() {
        return imgAnterior2;
    }

    public boolean isImgAnterior3() {
        return imgAnterior3;
    }

    public void setImgAnterior0(boolean imgAnterior0) {
        this.imgAnterior0 = imgAnterior0;
    }

    public void setImgAnterior1(boolean imgAnterior1) {
        this.imgAnterior1 = imgAnterior1;
    }

    public void setImgAnterior2(boolean imgAnterior2) {
        this.imgAnterior2 = imgAnterior2;
    }

    public void setImgAnterior3(boolean imgAnterior3) {
        this.imgAnterior3 = imgAnterior3;
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

    public LinkedList<Integer> getRuta() {
        return ruta;
    }

    public void setRuta(LinkedList<Integer> ruta) {
        this.ruta = ruta;
    }

}
