/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean secuenciaRota = false;
        int indiceRoto = 0;
        int[] valores = new int[5];
        int suma = 0;
        int valoresLeidos = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("(-99 para finalizar)Introduce el valor de " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("(-99 para finalizar)Introduce el valor de " + (i + 1) + ": ");
            }
            valores[i] = sc.nextInt();

            if (valores[i] == -99) {
                secuenciaRota = true;
                indiceRoto = i;
                break;
            }
            suma += valores[i];
            valoresLeidos++;
        }
        double media = valoresLeidos > 0 ? (double) suma / valoresLeidos : 0;  // importante asegurarse de que no haya division por cero

        if (secuenciaRota && valoresLeidos > 0) {
            for (int i = 0; i <= indiceRoto; i++) {
                System.out.println("\nValor leido numero " + (i + 1) + ": " + valores[i]);
                System.out.println(valores[i] > media ? valores[i] + " es mayor que la media" : "");

            }
        } else if (!secuenciaRota) {
            for (int i = 0; i < valores.length; i++) {
                System.out.println("\nValor leido numero " + (i + 1) + ": " + valores[i]);
                System.out.println(valores[i] > media ? valores[i] + " es mayor que la media" : "");
            }
        } else {
            System.out.println("\nNingun valor leido.");
        }
        if (valoresLeidos > 0) {
            System.out.println("\nNumero de valores leidos --> " + valoresLeidos);
            System.out.println("Suma de los valores leidos: --> " + suma);
            System.out.printf("Media de los valores leidos: --> %.2f%n", media);
        }

    }

}
