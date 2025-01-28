/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Introduce la cantidad de alumnos: ");
            if (!sc.hasNextInt()) {
                System.out.println("Entrada invalida. Introduce un numero valido.");
                sc.next();
                continue;
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Error. El minimo de alumnos a leer es 1.");
            }
        } while (n <= 0);

        double altura = 0, sumaAltura = 0;
        int masAltosMedia = 0;
        int masBajosMedia = 0;
        double mediaAltura;
        double[] alumnos = new double[n];
        for (int i = 0; i < alumnos.length; i++) {
            do {
                System.out.print("Altura del alumno " + (i + 1) + ": ");
                if (!sc.hasNextDouble()) {
                    System.out.println("Entrada invalida. Introduce una altura valida.");
                    sc.next();
                    continue;
                }
                System.out.println();
                altura = sc.nextDouble();
                if (altura <= 0) {
                    System.out.println("Error. Altura debe ser mayor a 0");
                }

            } while (altura <= 0);

            alumnos[i] = altura;
            sumaAltura += altura;
        }
        mediaAltura = sumaAltura / n;
        System.out.printf("Media de alturas introducidas: %.2f %n", mediaAltura);
        
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] > mediaAltura) {
                masAltosMedia++;
            } else if (alumnos[i] < mediaAltura) {
                masBajosMedia++;
            }
        }
        System.out.println("Alumnos mas altos que la media: " + masAltosMedia);
        System.out.println("Alumnos mas bajos que la media: " + masBajosMedia);
        
        sc.close();
    }

}
