/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArrayList_01 {

    public static void main(String[] args) {

        ArrayList<Double> altura = new ArrayList<>();//se crea el ArrayList donde se guardarán las alturas de los alumnos
        double media;
        int N = numeroAlumnos();
        leerAlturas(altura, N);
        media = calcularMedia(altura);
        mostrarResultados(altura, media);
    }

    //método para introducir el número de alumnos
    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce número de alumnos: ");
            n = sc.nextInt();
        } while (n < 1);
        return n;
    }

    //método para leer la altura de los alumnos y almacenarlas en el ArrayList
    public static void leerAlturas(ArrayList<Double> a, int n) {
        Scanner sc = new Scanner(System.in);
        int i;
        double alto;
        for (i = 1; i <= n; i++) {
            do {
                System.out.print("Alumno " + i + " altura: ");
                alto = sc.nextDouble();
            } while (alto <= 0);
            a.add(alto);
        }
    }

    //método que calcula y devuele la media de las alturas contenidas en el ArrayList
    public static double calcularMedia(ArrayList<Double> a) {
        double media = 0;
        for (Double d : a) {
            media = media + d;
        }
        return media / a.size();
    }

    //método para mostrar resultados por pantalla
    public static void mostrarResultados(ArrayList<Double> a, double media) {
        int superior = 0, inferior = 0;
        System.out.println("alturas introducidas: ");
        System.out.println(a); //se muestra el ArrayList completo en una sola instrucción
        for (Double d : a) {
            if (d > media) {
                superior++;
            } else if (d < media) {
                inferior++;
            }
        }
        System.out.printf("Media: %.2f %n", media);
        System.out.println("Hay " + superior + " alumnos más altos que la media");
        System.out.println("Hay " + inferior + " alumnos más bajos que la media");
    }
}
