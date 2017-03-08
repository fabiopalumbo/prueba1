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
public class Actividad extends Plan {

    /**
     * Default constructor
     */
    public Actividad() {
    }

    /**
     * 
     */
    private String objetivo;

    public Actividad(String objetivo, int codigo, double presupuesto, String ciudad, String descripcion) {
        super(codigo, presupuesto, ciudad, descripcion);
        this.objetivo = objetivo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

}