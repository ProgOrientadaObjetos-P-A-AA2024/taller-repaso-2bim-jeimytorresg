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
public class TipoSedan extends Tipos {

    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroAdicionalMecanico;

    public TipoSedan(double desc, Comprador prop, String mar, double precio) {
        super(prop, mar, precio);
        porcentajeDescuento = desc;
    }

    public void establecerPorcentajeDescuento(double p) {
        porcentajeDescuento = p;
    }

    public void establecerSeguroAdicionalMecanico() {
        seguroAdicionalMecanico = precioBase * 0.01;
    }

    public void establecerValorDescuento() {
        valorDescuento = precioBase * (porcentajeDescuento/100);
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerSeguroAdicionalMecanico() {
        return seguroAdicionalMecanico;
    }
    
    @Override
    public void establecerPrecioFinal(){
        precioFinal = precioBase + valorDescuento + seguroAdicionalMecanico;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Tipo Sedan\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Precio Base: %.2f\n"
                + "Porcentaje Descuento: %.0f\n"
                + "Valor de Descuento: %.2f\n"
                + "Seguros Mecanico: %.2f\n"
                + "Precio Final: %.2f\n", propietario.obtenerNombre(),
                propietario.obtenerCedula(), precioBase, 
                porcentajeDescuento,
                valorDescuento,
                seguroAdicionalMecanico,
                precioFinal);
        return cadena;
    }
}
