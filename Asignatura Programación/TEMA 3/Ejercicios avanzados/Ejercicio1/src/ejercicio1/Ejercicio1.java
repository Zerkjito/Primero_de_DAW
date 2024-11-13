/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numPerf, suma = 0;
        
        System.out.print("Por favor, introduce un numero entero: ");
        numPerf = sc.nextInt();
        
        for (int i = 1; i < numPerf; i++) {
            if (numPerf % i == 0) {
                suma += i;
            }
        }
        if (suma == numPerf) {
            System.out.println(numPerf + " es un numero perfecto");
        } else {
            System.out.println(numPerf + " no es un numero perfecto");
        }
    }
    
}
