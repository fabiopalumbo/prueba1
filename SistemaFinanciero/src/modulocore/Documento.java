/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulocore;

import java.util.*;

/**
 *
 */
public class Documento {

    /**
     * Default constructor
     */
    public Documento() {
    }

    /**
     * el codigo del documento
     *
     */
    protected int codigo;

    /**
     * constructor
     *
     * @param codigo
     */
    public Documento(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
