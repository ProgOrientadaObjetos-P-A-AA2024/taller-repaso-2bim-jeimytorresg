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
public class TipoSuv extends Tipos {
    private double porcentajeAdicionalSeguros;
    private double segurosPersona;

    public TipoSuv(double porcen, Comprador prop, String mar, double precio) {
        super(prop, mar, precio);
        porcentajeAdicionalSeguros = porcen;
    }

    public double obtenerPorcentajeAdicionalSeguros() {
        return porcentajeAdicionalSeguros;
    }

    public void establecerPorcentajeAdicionalSeguros(double p) {
        porcentajeAdicionalSeguros = p;
    }

    public double obtenerSegurosPersona() {
        return segurosPersona;
    }

    public void establecerSegurosPersona() {
        segurosPersona = precioBase * (porcentajeAdicionalSeguros/100);
    }
    
    @Override
    public void establecerPrecioFinal(){
        precioFinal = precioBase + segurosPersona;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Tipo Suv\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Precio Base: %.2f\n"
                + "Porcentaje Adicional de Seguros: %.0f\n"
                + "Seguros Persona: %.2f\n"
                + "Precio Final: %.2f\n", propietario.obtenerNombre(),
                propietario.obtenerCedula(), precioBase, 
                porcentajeAdicionalSeguros,
                segurosPersona,
                precioFinal);
        return cadena;
    }
    
}
