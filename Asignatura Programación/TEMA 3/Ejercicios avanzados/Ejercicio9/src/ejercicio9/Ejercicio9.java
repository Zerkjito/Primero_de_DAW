/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cifra;

        // Leer el número entero
        System.out.print("Introduce un número entero: ");
        num = sc.nextInt();

        // Leer el dígito que se debe reemplazar
        System.out.print("Introduce el dígito que quieres reemplazar: ");
        cifra = sc.nextInt();

        // Calcular el número de cifras
        int numCifras = (int) Math.log10(num) + 1;

        // Iterar sobre cada cifra del número
        for (int i = numCifras - 1; i >= 0; i--) {
            // Extraemos la cifra más significativa de izquierda a derecha
            int divisor = (int) Math.pow(10, i);  // Esto nos da el lugar de la cifra
            int digito = num / divisor;           // Extraemos la cifra
            digito = digito % 10;                 // Aseguramos que sea solo la cifra (por ejemplo, 543 -> 5)

            if (digito == cifra) {
                System.out.print("*");
            } else {
                System.out.print(digito);
            }

            // Reducimos el número quitando la cifra más significativa
            num = num % divisor;  
        }

        System.out.println();
    }
    
}
