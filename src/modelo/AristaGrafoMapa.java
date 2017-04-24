/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author SAMAEL
 */
public class AristaGrafoMapa implements Serializable {
    
    private NodoGrafoMapa nodoA;
    private Calle arista;
    private NodoGrafoMapa nodoB;

    public AristaGrafoMapa(NodoGrafoMapa nodoA, Calle arista, NodoGrafoMapa nodoB) {
        this.nodoA = nodoA;
        this.arista = arista;
        this.nodoB = nodoB;
    }

    public void setNodoA(NodoGrafoMapa nodoA) {
        this.nodoA = nodoA;
    }

    public void setArista(Calle arista) {
        this.arista = arista;
    }

    public void setNodoB(NodoGrafoMapa nodoB) {
        this.nodoB = nodoB;
    }

    public NodoGrafoMapa getNodoA() {
        return nodoA;
    }

    public Calle getArista() {
        return arista;
    }

    public NodoGrafoMapa getNodoB() {
        return nodoB;
    }
    
    
    
    
}
