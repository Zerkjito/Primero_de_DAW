/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;
/**
 *
 * @author zerkje
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, entero, dosCifras = 0;
        int positivo = 0, negativo = 0, cero = 0;
        int mayor = 0, posicion2cifras = 0;
        boolean primero = true;
        boolean pares = false;
        boolean menores1000 = true;
        
        do {
            System.out.print("Cantidad de numeros a introducir: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Valor invalido. Introduce al menos 1.");
            }
        } while  (n <= 0);
        
        for (int i = 1; i <= n; i++) {
            
            System.out.print("Numero " + i + ": ");
            entero = sc.nextInt();
            
            if (entero > 0) {
                positivo++;
                if (entero > 9 && entero < 100 && primero) {
                    dosCifras = entero;
                    primero = false;
                    posicion2cifras = i;
                    
                } else if (entero < 0) {
                    negativo++;
                } else {
                    cero++;
                }
            }
            
            if (i <= 5 && entero % 2 == 0) {
                pares = true;
            }
            
            if (entero >= 1000) {
                menores1000 = false;
            }
        }
        System.out.println("Numeros positivos introducidos: " + positivo);
        System.out.println("Numeros negativos introducidos: " + negativo);
        System.out.println("Ceros introducidos: " + cero);
        if (positivo > 0) {
            if (posicion2cifras == 0) {
                System.out.println("No se han introducido numeros positivos de 2 cifras");
            } else {
                System.out.println("Primer positivo de 2 cifras: " + dosCifras + " en la posicion " + posicion2cifras);
            }
        }
        if (pares) {
            System.out.println("Se han introducido pares entre los cinco primeros numeros");
        } else {
            System.out.println("No se han introducido pares entre los cinco primeros numeros");
        }
        if (menores1000) {
            System.out.println("Se han introducido numeros menores a 1000");
        } else {
            System.out.println("Se han introducido numeros mayores o iguales a 1000");
        }      
    }
    
}
