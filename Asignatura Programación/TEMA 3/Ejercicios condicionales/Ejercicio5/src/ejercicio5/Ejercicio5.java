/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Por favor, intrdouzca el primer numero");
        numero1 = sc.nextDouble();
        System.out.println("Por favor, introduzca el segundo numero");
        numero2 = sc.nextDouble();
        
        if (numero1 % 100 == numero2 % 100) {
            System.out.println("Las dos ultimas cifras de " + numero1 + " y " + numero2 + " son las mismas");
            
        } else {
            System.out.println("Las dos ultimas cifras de " + numero1 + " y " + numero2 + " no coinciden");
        }
    }
    
}
