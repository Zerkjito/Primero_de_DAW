/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int invertido = 0;
        System.out.print("Introduce un numero: ");
        n = sc.nextInt();
        int aux = n;

        while (aux != 0) {
            int digito = aux % 10;
            invertido = invertido * 10 + digito;
            aux /= 10;
        }
        if (n == invertido) {
            System.out.println(n + " es capicua");
        } else {
            System.out.println(n + " no es capicua");
        }
    }
    
}
