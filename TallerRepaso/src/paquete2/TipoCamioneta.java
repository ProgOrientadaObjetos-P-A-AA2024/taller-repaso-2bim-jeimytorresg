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
public class TipoCamioneta extends Tipos {

    private double porcentajeAdicionalImportacion;
    private double valorAdicionalImportacion;
    private double seguroMantenimiento;

    public TipoCamioneta(double porcen, Comprador prop, String mar, double precio) {
        super(prop, mar, precio);
        porcentajeAdicionalImportacion = porcen;
    }

    public void establecerPorcentajeAdicionalImportacion(double p) {
        porcentajeAdicionalImportacion = p;
    }

    public void establecerValorAdicionalImportacion() {
        valorAdicionalImportacion = precioBase * (porcentajeAdicionalImportacion / 100);
    }

    public void establecerSeguroMantenimiento() {
        seguroMantenimiento = valorAdicionalImportacion * 1.5;
    }

    public double obtenerPorcentajeAdicionalImportacion() {
        return porcentajeAdicionalImportacion;
    }

    public double obtenerValorAdicionalImportacion() {
        return valorAdicionalImportacion;
    }

    public double obtenerSeguroMantenimiento() {
        return seguroMantenimiento;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + valorAdicionalImportacion + seguroMantenimiento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Tipo Camioneta\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Precio Base: %.2f\n"
                + "Porcentaje Importacion: %.0f\n"
                + "Valor Importacion: %.2f\n"
                + "Seguros Mantenimiento: %.2f\n"
                + "Precio Final: %.2f\n", propietario.obtenerNombre(),
                propietario.obtenerCedula(), precioBase,
                porcentajeAdicionalImportacion,
                valorAdicionalImportacion,
                seguroMantenimiento,
                precioFinal);
        return cadena;
    }

}
