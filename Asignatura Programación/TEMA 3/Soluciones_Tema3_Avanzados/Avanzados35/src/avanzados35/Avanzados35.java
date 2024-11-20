/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados35;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados35 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int N, aux, cifra;
        double suma;
        do {
            do {
                System.out.print("Introduce número entero positivo (0 para finalizar): ");
                N = sc.nextInt();
                if (N < 0) {
                    System.out.println("Error. Debe ser un número positivo");
                }
            } while (N < 0);
            if (N != 0) {
                suma = 0;
                aux = N;
                while (aux != 0) {
                    cifra = aux % 10; //obtenmos la última cifra del número
                    suma = suma + Math.pow(cifra, 3); //la elevamos al cubo y la sumamos
                    aux = aux / 10; //quitamos al número su última cifra
                }
                if (suma == N) { //si la suma es igual al número
                    System.out.println("Es cúbico perfecto");
                } else {
                    System.out.println("No es cúbico perfecto");
                }
            }
        } while (N != 0);
        System.out.println("Fin de programa");
    }
    
}
