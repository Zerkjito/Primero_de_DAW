/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio01 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alumnos = preguntarCantAlumnos();
        ArrayList<Double> alturas = preguntarAlturas(alumnos);
        double media = calcularMedia(alturas);
        mostrarDatos(alturas, media);
    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        double media = 0;
        for (Double altura : alturas) {
            media += altura;
        }
        return media / alturas.size();
    }

    public static void mostrarDatos(ArrayList<Double> alturas, double media) {
        int masAltoMedia = 0;
        System.out.println("Alturas introducidas en metros: " + alturas);

        for (Double altura : alturas) {
            if (altura > media) {
                masAltoMedia++;
            }
        }
        int masBajoMedia = alturas.size() - masAltoMedia;

        System.out.printf("Media -> %.2f%n", media);
        System.out.println("Alumnos mas altos que la media -> " + masAltoMedia);
        System.out.println("Alumnos mas bajos que la media -> " + masBajoMedia);
    }

    public static int preguntarCantAlumnos() {
        int n;
        do {
            System.out.print("Introduce cantidad de alumnos: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce cantidad de alumnos: ");
            }
            n = sc.nextInt();
        } while (n < 1);
        return n;
    }

    public static ArrayList<Double> preguntarAlturas(int alumnos) {
        ArrayList<Double> alturas = new ArrayList<>();
        for (int i = 0; i < alumnos; i++) {
            double altura = 0;
            do {
                System.out.print("Introduce la altura del alumno " + (i + 1) + " en metros: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error. Entrada invalida.");
                    sc.nextLine();
                    System.out.print("Introduce la altura del alumno " + (i + 1) + " en metros: ");
                }
                altura = sc.nextDouble();
            } while (altura <= 0);
            alturas.add(altura);
        }
        return alturas;
    }

}
