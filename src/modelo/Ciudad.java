/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author SAMAEL
 */
public class Ciudad {


    private int id;
    private int tamano;
    private LinkedList<Automovil> listaAutomoviles;
    private LinkedList<Peaton> listaPeatones;
    private LinkedList<Calle> listaCalles;
    private LinkedList<Edificio> listaEdificos;
    private String [][] matrizPosicionObjetosCiudad;
    private LinkedList<AristaGrafoMapa> listaDeTransicionesAristas;

    public Ciudad(int id, int tamano) {
        this.id = id;
        this.tamano = tamano;
        this.listaAutomoviles = new LinkedList<>();
        this.listaPeatones = new LinkedList<>();
        this.listaCalles = new LinkedList<>();
        this.listaEdificos = new LinkedList<>();
        this.matrizPosicionObjetosCiudad =new String[tamano][tamano];
        this.listaDeTransicionesAristas=new LinkedList<>();
    }

    public LinkedList<AristaGrafoMapa> getListaDeTransicionesAristas() {
        return listaDeTransicionesAristas;
    }

    public void setListaDeTransicionesAristas(LinkedList<AristaGrafoMapa> listaDeTransicionesAristas) {
        this.listaDeTransicionesAristas = listaDeTransicionesAristas;
    }

    public int getId() {
        return id;
    }

    public int getTamano() {
        return tamano;
    }

    public LinkedList<Automovil> getListaAutomoviles() {
        return listaAutomoviles;
    }

    public LinkedList<Peaton> getListaPeatones() {
        return listaPeatones;
    }

    public LinkedList<Calle> getListaCalles() {
        return listaCalles;
    }

    public LinkedList<Edificio> getListaEdificos() {
        return listaEdificos;
    }

    public String[][] getMatrizPosicionObjetosCiudad() {
        return matrizPosicionObjetosCiudad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void setListaAutomoviles(LinkedList<Automovil> listaAutomoviles) {
        this.listaAutomoviles = listaAutomoviles;
    }

    public void setListaPeatones(LinkedList<Peaton> listaPeatones) {
        this.listaPeatones = listaPeatones;
    }

    public void setListaCalles(LinkedList<Calle> listaCalles) {
        this.listaCalles = listaCalles;
    }

    public void setListaEdificos(LinkedList<Edificio> listaEdificos) {
        this.listaEdificos = listaEdificos;
    }

    public void setMatrizPosicionObjetosCiudad(String[][] matrizPosicionObjetosCiudad) {
        this.matrizPosicionObjetosCiudad = matrizPosicionObjetosCiudad;
    }
 
    
    
    
    
    
    
    
    
}
