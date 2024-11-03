/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio39;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBolsas, descuento = 0;
        double precioDescuento = 0, precioFinal;
        
        System.out.print("Introduce el numero de bolsas: ");
        numBolsas = sc.nextInt();
        
        if (numBolsas >= 25 && numBolsas < 50) {
            descuento = 5;
            precioDescuento = (numBolsas * 6.50) * 0.05; 
        } else if (numBolsas >= 50 && numBolsas < 100){
            descuento = 10;
            precioDescuento = (numBolsas * 6.50) * 0.1;
        } else if (numBolsas >= 100 && numBolsas < 150){
            descuento = 15;
            precioDescuento = (numBolsas * 6.50) * 0.15;
        } else if (numBolsas >= 150 && numBolsas < 200){
            descuento = 20;
            precioDescuento = (numBolsas * 6.50) * 0.2;
        } else if (numBolsas >= 200 && numBolsas < 300){
            descuento = 25;
            precioDescuento = (numBolsas * 6.50) * 0.25;
        } else if (numBolsas >= 300){
            descuento = 30;
            precioDescuento = (numBolsas * 6.50) * 0.3;
        }
        precioFinal = numBolsas * 6.50 - precioDescuento;
        
        System.out.println("Numero de bolsas: " + numBolsas + " -> Precio: " + numBolsas * 6.50 + " euros");
        System.out.println(descuento + " % Descuento -> " + precioDescuento + " euros");
        System.out.println("Total a pagar -> " + precioFinal);
        
    }
    
}
