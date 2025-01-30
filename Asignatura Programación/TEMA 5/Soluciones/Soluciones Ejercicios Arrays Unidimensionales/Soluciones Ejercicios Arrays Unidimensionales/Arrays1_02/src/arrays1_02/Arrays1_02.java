/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /* 
 * Arrays1_02 Programa que lea la altura de N alumnos y calcule y muestre 
 * cuantos alumnos son más altos que la media y cuantos más bajos. 
 * N se lee por teclado y debe ser un entero positivo
 */
package arrays1_02;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, contadorMayores = 0, contadorMenores = 0, N;
        double media = 0;

        //Pedimos que se introduzca el número N de alumnos
        do {
            System.out.print("Introduce número de alumnos: ");
            N = sc.nextInt();
        } while (N <= 0);

        //Creamos el array de tamaño N
        double[] altura = new double[N];

        //Lectura por teclado de la altura de cada alumno
        //Al mismo tiempo se suman todas las alturas introducidas para después calcular la media
        System.out.println("Lectura de la altura de los alumnos: ");
        for (i = 0; i < N; i++) {
            System.out.print("alumno " + (i + 1) + " = ");
            altura[i] = sc.nextDouble();
            media = media + altura[i]; //se suma la estatura leída para calcular la media
        }

        //Se calcula la altura media de los alumnos
        media = media / N;

        //Se recorre el array para ver cuántos alumnos hay más altos que 
        //la media y cuántos más bajos
        for (i = 0; i < altura.length; i++) {
            if (altura[i] > media) { //si la estatura del alumno es mayor que la media
                contadorMayores++;
            } else if (altura[i] < media) { //si es menor
                contadorMenores++;
            }
        }

        //Mostrar resultados
        System.out.printf("Altura media de la clase: %.2f %n", media);
        System.out.println("Alumnos con altura superior a la media: " + contadorMayores);
        System.out.println("Alumnos con altura inferior a la media: " + contadorMenores);

    }

}
