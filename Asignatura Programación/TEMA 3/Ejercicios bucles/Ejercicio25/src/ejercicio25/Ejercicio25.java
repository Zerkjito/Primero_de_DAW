/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = 0, menor, n, posicionMayor = 0, contador = 0;

        do {
            System.out.print("Introduce un numero: ");
            n = sc.nextInt();
            if (n != 0) {
                contador++;
                if (contador == 1) {
                    mayor = n;
                    posicionMayor = 1;
                } else if (n > mayor) {
                    mayor = n;
                    posicionMayor = contador;
                }
            }
        } while (n != 0);
        if (contador != 0) {
            System.out.println("Numero mayor -> " + mayor);
            System.out.println("Posicion del mayor -> " + posicionMayor);
        } else {
            System.out.println("Ha introducido 0");
        }
    }
}
