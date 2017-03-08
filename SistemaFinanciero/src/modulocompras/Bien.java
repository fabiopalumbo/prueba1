/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulocompras;

import java.util.*;

/**
 *
 */
public class Bien {

    /**
     * Default constructor
     */
    public Bien() {
    }

    /**
     * contructor
     *
     * @param codigo
     * @param nombre
     * @param tipoBien
     * @param valor
     */
    public Bien(int codigo, String nombre, TipoBien tipoBien, double valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoBien = tipoBien;
        this.valor = valor;
    }

    /**
     * codigo del bien
     */
    private int codigo;

    /**
     * nombre del bien
     */
    private String nombre;

    /**
     * tipo de bien
     */
    private TipoBien tipoBien;

    /**
     * valor unitario del bien
     */
    private double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoBien getTipoBien() {
        return tipoBien;
    }

    public void setTipoBien(TipoBien tipoBien) {
        this.tipoBien = tipoBien;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
