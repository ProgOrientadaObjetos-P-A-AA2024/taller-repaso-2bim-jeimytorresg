/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import java.util.ArrayList;
import paquete2.*;
import paquete3.*;
/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Tipos> lista = new ArrayList();
        Comprador prop1 = new Comprador("Daniel", "111111");
        TipoSuv vehiculo1 = new TipoSuv(15, prop1,"Toyota", 120000);
        
        Comprador prop2 = new Comprador("Antonella", "1112222");
        TipoSedan v2 = new TipoSedan(20, prop2, "Chevrolet",200000);
        
        Comprador prop3 = new Comprador("Byron", "1112222");
        TipoSedan v3 = new TipoSedan(25, prop3, "Hyundai",205000);
        
        Comprador prop4 = new Comprador("Eric", "1112232");
        TipoSedan v4 = new TipoSedan(13, prop4, "Toyota",210000);
        
        lista.add(vehiculo1);
        lista.add(v2);
        lista.add(v3);
        lista.add(v4);
        
        for(Tipos a : lista){
            a.establecerPrecioFinal();
        }
        
        Concesionaria con1 = new Concesionaria("Patio", lista);
        con1.establecerVehiculoMasBarato();
        con1.establecerVehiculoMasCaro();
        con1.establecerVentasTotales();
        
        System.out.println(con1);
    }
    
}
