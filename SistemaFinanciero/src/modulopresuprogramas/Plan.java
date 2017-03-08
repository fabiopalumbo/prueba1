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
public class Plan {

    /**
     * Default constructor
     */
    public Plan() {
    }

    /**
     * 
     */
    private int codigo;

    /**
     * 
     */
    private double presupuesto;

    /**
     * 
     */
    private String ciudad;

    /**
     * 
     */
    private String descripcion;

    public Plan(int codigo, double presupuesto, String ciudad, String descripcion) {
        this.codigo = codigo;
        this.presupuesto = presupuesto;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}