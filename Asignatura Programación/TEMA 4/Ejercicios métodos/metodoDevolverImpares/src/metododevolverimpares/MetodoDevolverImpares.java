/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metododevolverimpares;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class MetodoDevolverImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero entero >= 0: ");
        n = sc.nextInt();
        
        int resultado = devolverImpares(n);
        System.out.println("La cantidad de cifras impares es -> " + resultado);
    }

    public static int devolverImpares(int n) {
        int aux = n;
        int contadorImpares = 0;
        while (aux > 0) {
            n = aux % 10;
            if (n % 2 != 0) {
                contadorImpares++;
            }
            aux/=10;
        }
        return contadorImpares;
    }

}
