/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int filas, contador = 1;
        
        do {
            System.out.print("Introduce el numero de filas (1-99): ");
            filas = sc.nextInt();
            
        } while (filas <= 0 || filas >= 100);
        int aux = contador;

        for (int i = 1; i <= filas; i++) {
            for (int j = filas; j >= i; j--) {
                if (contador == filas + 1) {
                    contador = i;
                }
                System.out.print(contador++ + "  ");
            }
            System.out.println();

        }
    }

}
