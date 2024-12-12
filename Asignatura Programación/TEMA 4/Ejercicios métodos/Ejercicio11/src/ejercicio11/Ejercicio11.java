/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int n = sc.nextInt();
        
        imprimirTablasHasta(n);
        
        

    }

    public static void imprimirTablasHasta(int n) {
        for (int i = 2; i <= n; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
