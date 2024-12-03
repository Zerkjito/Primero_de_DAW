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
        int filas, digito, numero;
        
        do {
            System.out.print("Introduce el numero de filas (min. 2): ");
            filas = sc.nextInt();
        } while (filas < 2);
        
        do {
            System.out.print("Introduce el digito (0-9): ");
            digito = sc.nextInt();
        } while (digito < 0 || digito > 9);
        
        for (int i = 1; i <= filas; i++) {
            numero = digito;
            for (int j = 1; j <= i; j++) {
                System.out.print(numero % 10 + " ");
                numero++;
            }
            System.out.println();
            digito++;
        }
    }
    
}
