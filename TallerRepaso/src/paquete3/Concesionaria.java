/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import paquete2.Tipos;

/**
 *
 * @author USUARIO
 */
public class Concesionaria {
    private ArrayList<Tipos> listado;
    private String nombre;
    private double ventasTotales;
    private double vehiculoMasCaro;
    private double vehiculoMasBarato;
    
    public Concesionaria(String nom, ArrayList<Tipos> vehiculos){
        nombre = nom;
        listado = vehiculos;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerListado(ArrayList<Tipos> n){
        listado = n;
    }
    
    public void establecerVentasTotales(){
        for (int i = 0; i < listado.size();i++){
            ventasTotales += listado.get(i).obtenerPrecioFinal();
        }
    }
    
    public void establecerVehiculoMasCaro(){
        double aux = 0;
        for (int i = 0; i < listado.size();i++){
            if (listado.get(i).obtenerPrecioFinal() > aux){
                aux = listado.get(i).obtenerPrecioFinal();
            }
        }
        
        vehiculoMasCaro = aux;
    }
    
    public void establecerVehiculoMasBarato(){
        double aux = listado.get(0).obtenerPrecioFinal();
        for (int i = 0; i < listado.size();i++){
            if (listado.get(i).obtenerPrecioFinal() < aux){
                aux = listado.get(i).obtenerPrecioFinal();
            }
        }
        
        vehiculoMasBarato = aux;
    }

    public ArrayList<Tipos> obtenerListado() {
        return listado;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public double obtenerVehiculoMasCaro() {
        return vehiculoMasCaro;
    }

    public double obtenerVehiculoMasBarato() {
        return vehiculoMasBarato;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Listado\n");
        for(int i = 0; i < listado.size();i++){
            cadena = String.format("%s%s", cadena, listado.get(i));
        }
        cadena = String.format("%sVehiculo Mas Caro: %.2f\n"
                + "Vehiculo Mas Barato: %.2f\n", cadena, vehiculoMasCaro,
                vehiculoMasBarato);
        return cadena;
    }
}
