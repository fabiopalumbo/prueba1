/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulocore;

import java.util.*;
import modulocompras.Detalle;

/**
 *
 */
public class Compra extends Documento {

    /**
     * Default constructor
     */
    public Compra() {
    }

    /**
     * fecha de la compra
     */
    private Date fechaCompra;

    /**
     * valor total de la compra
     */
    private double totalCompra;

    /**
     * lista de detalle compra
     */
    private List<Detalle> detalles;

    /**
     * constructor
     *
     * @param fechaCompra
     * @param totalCompra
     * @param codigo
     */
    public Compra(Date fechaCompra, double totalCompra, int codigo) {
        super(codigo);
        this.fechaCompra = fechaCompra;
        this.totalCompra = totalCompra;
        this.detalles = new ArrayList<>();
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
