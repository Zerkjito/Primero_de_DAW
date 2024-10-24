/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20v2;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio20V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador= 0;
        boolean negativo = false;
        int sumaPositivos = 0;
        int n;
        
        do {
           System.out.print("Por favor, introduzca un numero: ");
        n = sc.nextInt(); 
        if (n > 0) {
                contador++;
                sumaPositivos += n;
            } else if (n < 0) {
                negativo = true;
            }
        } while(n != 0);
        
        if (contador > 0) {
            System.out.println("Numeros positivos leidos: " + contador);
            System.out.println("Total suma: " + sumaPositivos);
        } else {
            System.out.println("No se ha introducido ningun numero positivo");
        }
        
        if (negativo) {
            System.out.println("Se han introducido numeros negativos");
        } else {
            System.out.println("No se han introducido numeros negativos");
        }
    }
    
}
