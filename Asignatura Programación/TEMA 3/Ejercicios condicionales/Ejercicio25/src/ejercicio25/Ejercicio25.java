/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, descuento5, descuento10;
        
        System.out.print("Introduce el precio del producto: ");
        precio = sc.nextDouble();
        
        descuento5 = precio * 0.05;
        descuento10 = precio * 0.1;
        
        if (precio < 100) {
            System.out.println("Precio final: " + precio);
            System.out.println("Descuento aplicado: Ninguno");
        } else if (precio >= 100 && precio < 200) {
            double precioFinal = precio - descuento5;
            System.out.println("Precio final: " + precioFinal + "€");
            System.out.println("Descuento aplicado: " + " 5% -> " + descuento5 + "€");
        } else if (precio >= 200) {
            double precioFinal = precio - descuento10;
            System.out.println("Precio final: " + precioFinal + "€");
            System.out.println("Descuento aplicado: " + " 10% -> " + descuento10 + "€");
        }
        
    }
    
}
