/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete3.Comprador;

/**
 *
 * @author USUARIO
 */
public abstract class Tipos {

    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Tipos(Comprador prop, String mar, double precio) {
        propietario = prop;
        marca = mar;
        precioBase = precio;
    }

    public void establecerPropietario(Comprador p) {
        propietario = p;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerPrecioBase(double p) {
        precioBase = p;
    }

    public abstract void establecerPrecioFinal();

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

}
