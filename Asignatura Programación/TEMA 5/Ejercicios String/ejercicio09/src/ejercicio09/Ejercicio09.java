/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio09 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String secuenciaNumeros;
        System.out.print("Introduce numeros separados por espacios: ");
        secuenciaNumeros = sc.nextLine();
        if (secuenciaNumeros.isBlank()) {
            System.out.println("\nError: No se ingresaron numeros.");
            return;
        }
        
        String partes[] = secuenciaNumeros.split("\\s+");
        int numeros[] = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            try {
                numeros[i] = Integer.parseInt(partes[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error. Entrada contiene caracteres invalidos.");
                return;
            }
            
            numeros[i] = Integer.parseInt(partes[i]);
        }
        Arrays.sort(numeros);

        System.out.println("Numeros ordenados de menor a mayor:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

}
