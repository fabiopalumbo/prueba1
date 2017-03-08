/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulocompras;

import java.util.*;
import modulocore.Compra;

/**
 *
 */
public class Detalle {

    /**
     * compra del detalle
     */
    private Compra compra;

    /**
     * bien del detalle
     */
    private Bien bien;

    /**
     * cantidad del bien
     */
    private int cantidadBien;

    /**
     * Default constructor
     */
    public Detalle() {
    }

    /**
     * constructor
     *
     * @param compra
     * @param bien
     * @param cantidadBien
     */
    public Detalle(Compra compra, Bien bien, int cantidadBien) {
        this.compra = compra;
        this.bien = bien;
        this.cantidadBien = cantidadBien;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Bien getBien() {
        return bien;
    }

    public void setBien(Bien bien) {
        this.bien = bien;
    }

    public int getCantidadBien() {
        return cantidadBien;
    }

    public void setCantidadBien(int cantidadBien) {
        this.cantidadBien = cantidadBien;
    }

}
