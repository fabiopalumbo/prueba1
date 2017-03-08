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
public class Inversion extends TipoBien {

    /**
     * Default constructor
     */
    public Inversion() {
    }

    /**
     * constructor
     *
     * @param detalle
     * @param codigo
     */
    public Inversion(String detalle, int codigo) {
        super(codigo);
        this.detalle = detalle;
    }

    /**
     * detalle de la inversion
     */
    private String detalle;

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
