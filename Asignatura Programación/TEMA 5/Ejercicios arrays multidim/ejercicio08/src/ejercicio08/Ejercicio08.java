/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio08 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int est;
        System.out.print("Introduce el numero de estudiantes a leer: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error. Entrada invalida");
            sc.nextLine();
            System.out.print("Introduce el numero de estudiantes a leer: ");
        }
        est = sc.nextInt();
        sc.nextLine();

        String[] estudiantes = new String[est];
        double[][] notas = new double[est][10];

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("Introduce el nombre del alumno/a " + (i + 1) + ": ");
            estudiantes[i] = sc.nextLine().trim();

            while (estudiantes[i].isEmpty() || estudiantes[i].isBlank()) {
                System.out.println("Error. El nombre no puede estar vacio");
                System.out.print("Introduce el nombre del alumno/a " + (i + 1) + ": ");
                estudiantes[i] = sc.nextLine().trim();
            }

            for (int j = 0; j < 10; j++) {
                double nota;
                System.out.print("Introduce la nota " + (j + 1) + " del alumno/a " + estudiantes[i] + ": ");

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
                    System.out.print("Introduce la nota " + (j + 1) + " del alumno/a " + estudiantes[i] + ": ");
                }

                notas[i][j] = nota;
            }
            System.out.println();
            sc.nextLine();
        }

        double[] media = new double[estudiantes.length];
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < 10; j++) {
                media[i] += notas[i][j];
            }
            media[i] /= 10;
        }

        double mediaGlobal = 0;
        for (int i = 0; i < media.length; i++) {
            mediaGlobal += media[i];
        }
        mediaGlobal /= estudiantes.length;

        double[] diferencia = new double[estudiantes.length];
        for (int i = 0; i < estudiantes.length; i++) {
            diferencia[i] = media[i] - mediaGlobal;
        }

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("\nCalificacion media de %s -> %.2f%n", estudiantes[i], media[i]);
            System.out.printf("Diferencia respecto a la nota global -> %.2f%n%n", diferencia[i]);
            System.out.println();
        }

        System.out.printf("\nMedia global de los estudiantes -> %.2f%n", mediaGlobal);

    }

}
