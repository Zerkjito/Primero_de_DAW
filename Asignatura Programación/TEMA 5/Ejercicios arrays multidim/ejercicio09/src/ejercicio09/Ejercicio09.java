/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

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
        double[][] notas = new double[10][];
        for (int i = 0; i < notas.length; i++) {
            int cant = 0;
            do {
                System.out.print("Introduce la cantidad de notas a leer: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error. Entrada invalida");
                    sc.nextLine();
                    System.out.print("Introduce la cantidad de notas a leer: ");
                }
                cant = sc.nextInt();
            } while (cant < 1);

            notas[i] = new double[cant];
            
            for (int j = 0; j < cant; j++) {
                double nota;
                System.out.print("Introduce la nota " + (j + 1) + " del alumno " + (i + 1) + ": ");
                while (true) {
                    if (!sc.hasNextDouble()) {
                        System.out.println("Error. Entrada invalida");
                        sc.next();
                    } else {
                        nota = sc.nextDouble();
                        if (nota >= 0 && nota <= 10) {
                            break;
                        } else {
                            System.out.println("Error. La nota debe estar comprendida entre 0 y 10.");
                        }
                    }
                    System.out.print("Introduce la nota " + (j + 1) + " del alumno " + (i + 1) + ": ");
                }
                notas[i][j] = nota;
            }
        }

        double[] media = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                media[i] += notas[i][j];
            }
            media[i] /= notas[i].length;
        }

        double mediaGlobal = 0;
        for (double d : media) {
            mediaGlobal += d;
        }
        mediaGlobal /= 10;

        for (int i = 0; i < media.length; i++) {
            System.out.printf("Media del alumno %d -> %.2f%n", i + 1, media[i]);
        }
        System.out.printf("%nMedia global de los alumnos %.2f%n", mediaGlobal);
    }
}
