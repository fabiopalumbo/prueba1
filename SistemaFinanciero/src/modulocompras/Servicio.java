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
public class Servicio extends TipoBien {

    /**
     * Default constructor
     */
    public Servicio() {
    }

    /**
     * constructor
     *
     * @param compania
     * @param codigo
     */
    public Servicio(String compania, int codigo) {
        super(codigo);
        this.compania = compania;
    }

    /**
     * compañia del servicio
     */
    private String compania;

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
