/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01;

/**
 *
 * @author Bug0
 */
public class Imagen {
    private int numImgen;
    private byte[] imagenes;
    
    public Imagen() {
        
    }
    public Imagen(int numImgen, byte[] imagenes) {
        this.numImgen = numImgen;
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
    

    
}
