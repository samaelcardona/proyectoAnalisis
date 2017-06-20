/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author SAMAEL
 */
public class Ciudad implements Serializable{


    private int id;
    private LinkedList<Automovil> listaAutomoviles;
    private LinkedList<Peaton> listaPeatones;
    private LinkedList<Calle> listaCalles;
    private LinkedList<Arbol> arboles;
    private LinkedList<Edificio> listaEdificos;
    private PuntosLimiteCuadricula [][] matrizPuntosLimitesCuadriculaMapa;
    private String [][] matrizLetrasElementosInternosCuadriculaMapa;
    private int [][] matrizCuadriculaMapaIdCalles;
    private int [][] matrizCuadriculaMapaIdArboles;
    private int [][] matrizCuadriculaMapaIdEdificios;
    private LinkedList<NodoGrafoMapa> listaNodosMapa;
    private LinkedList<NodoGrafoMapa> listaNodosPeatones;
    private LinkedList<AristaGrafoMapa> listaDeTransicionesAristas;
    private LinkedList<AristaGrafoMapa> listaDeTransicionesAristasPeatones;
    

    public Ciudad() {
    }

    public Ciudad(int id, LinkedList<Calle> listaCalles, LinkedList<Arbol> arboles, LinkedList<Edificio> listaEdificos, PuntosLimiteCuadricula[][] matrizPuntosLimitesCuadriculaMapa, String [][] matrizLetrasElementosInternosCuadriculaMapa, int [][] matrizCuadriculaMapaIdCalles, int [][] matrizCuadriculaMapaIdArboles, int [][] matrizCuadriculaMapaIdEdificios, LinkedList<NodoGrafoMapa> listaNodosMapa, LinkedList<AristaGrafoMapa> listaDeTransicionesAristas) {
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
        this.listaNodosPeatones=new LinkedList<>();
        this.listaDeTransicionesAristasPeatones=new LinkedList<>();
    }

    public LinkedList<NodoGrafoMapa> getListaNodosPeatones() {
        return listaNodosPeatones;
    }

    public void setListaNodosPeatones(LinkedList<NodoGrafoMapa> listaNodosPeatones) {
        this.listaNodosPeatones = listaNodosPeatones;
    }

    
    public LinkedList<AristaGrafoMapa> getListaDeTransicionesAristasPeatones() {
        return listaDeTransicionesAristasPeatones;
    }

    public void setListaDeTransicionesAristasPeatones(LinkedList<AristaGrafoMapa> listaDeTransicionesAristasPeatones) {
        this.listaDeTransicionesAristasPeatones = listaDeTransicionesAristasPeatones;
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

    public PuntosLimiteCuadricula[][] getMatrizPuntosLimitesCuadriculaMapa() {
        return matrizPuntosLimitesCuadriculaMapa;
    }

    public String[][] getMatrizLetrasElementosInternosCuadriculaMapa() {
        return matrizLetrasElementosInternosCuadriculaMapa;
    }

    public int[][] getMatrizCuadriculaMapaIdCalles() {
        return matrizCuadriculaMapaIdCalles;
    }

    public int [][] getMatrizCuadriculaMapaIdArboles() {
        return matrizCuadriculaMapaIdArboles;
    }

    public int [][] getMatrizCuadriculaMapaIdEdificios() {
        return matrizCuadriculaMapaIdEdificios;
    }

    public LinkedList<NodoGrafoMapa> getListaNodosMapa() {
        return listaNodosMapa;
    }

    public void setArboles(LinkedList<Arbol> arboles) {
        this.arboles = arboles;
    }

    public void setMatrizPuntosLimitesCuadriculaMapa(PuntosLimiteCuadricula[][] matrizPuntosLimitesCuadriculaMapa) {
        this.matrizPuntosLimitesCuadriculaMapa = matrizPuntosLimitesCuadriculaMapa;
    }

    public void setMatrizLetrasElementosInternosCuadriculaMapa(String[][] matrizLetrasElementosInternosCuadriculaMapa) {
        this.matrizLetrasElementosInternosCuadriculaMapa = matrizLetrasElementosInternosCuadriculaMapa;
    }

    public void setMatrizCuadriculaMapaIdCalles(int [][] matrizCuadriculaMapaIdCalles) {
        this.matrizCuadriculaMapaIdCalles = matrizCuadriculaMapaIdCalles;
    }

    public void setMatrizCuadriculaMapaIdArboles(int [][] matrizCuadriculaMapaIdArboles) {
        this.matrizCuadriculaMapaIdArboles = matrizCuadriculaMapaIdArboles;
    }

    public void setMatrizCuadriculaMapaIdEdificios(int [][] matrizCuadriculaMapaIdEdificios) {
        this.matrizCuadriculaMapaIdEdificios = matrizCuadriculaMapaIdEdificios;
    }

    public void setListaNodosMapa(LinkedList<NodoGrafoMapa> listaNodosMapa) {
        this.listaNodosMapa = listaNodosMapa;
    }

    
    
    
    
    
    
    
    
}
