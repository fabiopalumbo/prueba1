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
public class TipoBien {

    /**
     * Default constructor
     */
    public TipoBien() {
    }
    
    /**
     *codigo del tipo bien
     */
    protected int codigo;

    public TipoBien(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
