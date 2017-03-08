/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulopresuprogramas;

import java.util.*;

/**
 * 
 */
public class Proyecto extends Plan {

    /**
     * Default constructor
     */
    public Proyecto() {
    }

    /**
     * 
     */
    private String nombre;

    public Proyecto(String nombre, int codigo, double presupuesto, String ciudad, String descripcion) {
        super(codigo, presupuesto, ciudad, descripcion);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}