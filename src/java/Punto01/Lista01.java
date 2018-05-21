/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01;

import java.util.ArrayList;

/**
 *
 * @author Bug0
 */
public class Lista01 {
    private ArrayList <Imagen> listaImagen;
    private byte[] imagenes;
    private int numImgen;
    public Lista01() {
        
    }
    public Lista01(ArrayList<Imagen> listaImagen, byte[] imagenes, int numImgen) {
        this.listaImagen = listaImagen;
        this.imagenes = imagenes;
        this.numImgen = numImgen;
    }

    public Lista01(ArrayList<Imagen> listaImagen) {
        this.listaImagen = listaImagen;
    }

    /**
     * @return the listaImagen
     */
    public ArrayList <Imagen> getListaImagen() {
        return listaImagen;
    }

    /**
     * @param listaImagen the listaImagen to set
     */
    public void setListaImagen(ArrayList <Imagen> listaImagen) {
        this.listaImagen = listaImagen;
    }

    /**
     * @return the imagenes
     */
    public byte[] getImagenes() {
        return imagenes;
    }

    /**
     * @param imagenes the imagenes to set
     */
    public void setImagenes(byte[] imagenes) {
        this.imagenes = imagenes;
    }

    /**
     * @return the numImgen
     */
    public int getNumImgen() {
        return numImgen;
    }

    /**
     * @param numImgen the numImgen to set
     */
    public void setNumImgen(int numImgen) {
        this.numImgen = numImgen;
    }
}
  