/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double importeIva, precioSinIva, precioPorUnidad, precioVenta, unidades, iva;
        System.out.print("Introduzca precio por unidad del producto: ");
        precioPorUnidad = sc.nextDouble();
        System.out.print("Introduzca numero de unidades vendidas del producto: ");
        unidades = sc.nextDouble();
        System.out.print("Introduzca % IVA aplicado: ");
        iva = sc.nextDouble();
        precioSinIva = precioPorUnidad * unidades;
        importeIva = precioSinIva * iva / 100;
        precioVenta = precioSinIva + importeIva;
        System.out.println("El precio de venta es: " + precioVenta);
        
        
        
        
        
        
    }
    
}
