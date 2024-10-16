/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cateto1, cateto2, longitudHipo;
        System.out.print("Por favor, introduzca la longitud del primer cateto: ");
        cateto1 = sc.nextDouble();
        System.out.print("Por favor, introduzca la longtiud del segundo cateto: ");
        cateto2 = sc.nextDouble();
        longitudHipo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.print("La longitud de la hipotenusa es: " + longitudHipo);
        
    }
    
}
