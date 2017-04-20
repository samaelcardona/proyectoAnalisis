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
    private LinkedList<Automovil> listaAutomoviles;
    private LinkedList<Peaton> listaPeatones;
    private LinkedList<Calle> listaCalles;
    private LinkedList<Arbol> arboles;
    private LinkedList<Edificio> listaEdificos;
    private String [][] matrizPuntosLimitesCuadriculaMapa;
    private String [][] matrizLetrasElementosInternosCuadriculaMapa;
    private String [][] matrizCuadriculaMapaIdCalles;
    private String [][] matrizCuadriculaMapaIdArboles;
    private String [][] matrizCuadriculaMapaIdEdificios;
    private LinkedList<NodoGrafoMapa> listaNodosMapa;
    private LinkedList<AristaGrafoMapa> listaDeTransicionesAristas;


    public Ciudad(int id, int tamano, LinkedList<Calle> listaCalles, LinkedList<Arbol> arboles, LinkedList<Edificio> listaEdificos, String[][] matrizPuntosLimitesCuadriculaMapa, String[][] matrizLetrasElementosInternosCuadriculaMapa, String[][] matrizCuadriculaMapaIdCalles, String[][] matrizCuadriculaMapaIdArboles, String[][] matrizCuadriculaMapaIdEdificios, LinkedList<NodoGrafoMapa> listaNodosMapa, LinkedList<AristaGrafoMapa> listaDeTransicionesAristas) {
        this.id = id;
        this.listaCalles = listaCalles;
        this.arboles = arboles;
        this.listaEdificos = listaEdificos;
        this.matrizPuntosLimitesCuadriculaMapa = matrizPuntosLimitesCuadriculaMapa;
        this.matrizLetrasElementosInternosCuadriculaMapa = matrizLetrasElementosInternosCuadriculaMapa;
        this.matrizCuadriculaMapaIdCalles = matrizCuadriculaMapaIdCalles;
        this.matrizCuadriculaMapaIdArboles = matrizCuadriculaMapaIdArboles;
        this.matrizCuadriculaMapaIdEdificios = matrizCuadriculaMapaIdEdificios;
        this.listaNodosMapa = listaNodosMapa;
        this.listaDeTransicionesAristas = listaDeTransicionesAristas;
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



    public void setId(int id) {
        this.id = id;
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

    public LinkedList<Arbol> getArboles() {
        return arboles;
    }

    public String[][] getMatrizPuntosLimitesCuadriculaMapa() {
        return matrizPuntosLimitesCuadriculaMapa;
    }

    public String[][] getMatrizLetrasElementosInternosCuadriculaMapa() {
        return matrizLetrasElementosInternosCuadriculaMapa;
    }

    public String[][] getMatrizCuadriculaMapaIdCalles() {
        return matrizCuadriculaMapaIdCalles;
    }

    public String[][] getMatrizCuadriculaMapaIdArboles() {
        return matrizCuadriculaMapaIdArboles;
    }

    public String[][] getMatrizCuadriculaMapaIdEdificios() {
        return matrizCuadriculaMapaIdEdificios;
    }

    public LinkedList<NodoGrafoMapa> getListaNodosMapa() {
        return listaNodosMapa;
    }

    public void setArboles(LinkedList<Arbol> arboles) {
        this.arboles = arboles;
    }

    public void setMatrizPuntosLimitesCuadriculaMapa(String[][] matrizPuntosLimitesCuadriculaMapa) {
        this.matrizPuntosLimitesCuadriculaMapa = matrizPuntosLimitesCuadriculaMapa;
    }

    public void setMatrizLetrasElementosInternosCuadriculaMapa(String[][] matrizLetrasElementosInternosCuadriculaMapa) {
        this.matrizLetrasElementosInternosCuadriculaMapa = matrizLetrasElementosInternosCuadriculaMapa;
    }

    public void setMatrizCuadriculaMapaIdCalles(String[][] matrizCuadriculaMapaIdCalles) {
        this.matrizCuadriculaMapaIdCalles = matrizCuadriculaMapaIdCalles;
    }

    public void setMatrizCuadriculaMapaIdArboles(String[][] matrizCuadriculaMapaIdArboles) {
        this.matrizCuadriculaMapaIdArboles = matrizCuadriculaMapaIdArboles;
    }

    public void setMatrizCuadriculaMapaIdEdificios(String[][] matrizCuadriculaMapaIdEdificios) {
        this.matrizCuadriculaMapaIdEdificios = matrizCuadriculaMapaIdEdificios;
    }

    public void setListaNodosMapa(LinkedList<NodoGrafoMapa> listaNodosMapa) {
        this.listaNodosMapa = listaNodosMapa;
    }

    
    
    
    
    
    
    
    
}
