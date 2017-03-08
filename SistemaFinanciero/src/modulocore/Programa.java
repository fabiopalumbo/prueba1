/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulocore;

import java.util.*;
import modulopresuprogramas.Plan;
import modulopresuprogramas.Responsable;

/**
 *
 */
public class Programa extends Documento {

    /**
     * Default constructor
     */
    public Programa() {
    }

    /**
     * el responsable del programa
     */
    private Responsable responsable;

    /**
     * la lista de planes de un programa
     */
    private List<Plan> planes;

    /**
     * constructor
     *
     * @param responsable
     * @param codigo
     */
    public Programa(Responsable responsable, int codigo) {
        super(codigo);
        this.responsable = responsable;
        this.planes = new ArrayList<>();
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public List<Plan> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plan> planes) {
        this.planes = planes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
