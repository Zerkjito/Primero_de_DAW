/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales08;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioPorUnidad, unidades, iva, precioSinIva, importeIva, precioVenta;

        System.out.print("Introduzca precio por unidad del producto: ");
        precioPorUnidad = sc.nextDouble();

        System.out.print("Introduzca número de unidades vendidas del producto: ");
        unidades = sc.nextDouble();

        System.out.print("Introduzca % IVA aplicado: ");
        iva = sc.nextDouble();

        precioSinIva = precioPorUnidad * unidades;
        importeIva = precioSinIva * iva / 100;
        
        precioVenta = precioSinIva + importeIva;

        System.out.printf("Precio de venta -> %.2f€%n" , precioVenta);
    }

}
