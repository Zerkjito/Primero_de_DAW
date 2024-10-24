/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidadKm, velocidadMs;
        char respuesta;
//        do {
//            System.out.print("Introduce velocidad (Km/h): ");
//            velocidadKm = sc.nextDouble();
//            velocidadMs = velocidadKm * 3.6;
//            System.out.println(velocidadKm + "Km/h => " + velocidadMs);
//            System.out.println("¿Repetir proceso?: ");
//            char respuesta = sc.nextLine().toUpperCase().charAt(0);
//        } while(respuesta != 'N');

        System.out.print("Introduce velocidad (Km/h): ");
        velocidadKm = sc.nextDouble();
        velocidadMs = velocidadKm * 3.6;
        sc.nextLine();
        System.out.println(velocidadKm + " Km/h => " + velocidadMs + " m/s");
        System.out.print("¿Repetir proceso? (N para finalizar): ");
        respuesta = sc.nextLine().toUpperCase().charAt(0);
        if (respuesta == 'S') {
            do {
                System.out.print("Introduce velocidad (Km/h): ");
                velocidadKm = sc.nextDouble();
                velocidadMs = velocidadKm * 3.6;
                sc.nextLine();
                System.out.println(velocidadKm + " Km/h => " + velocidadMs + " m/s");
                System.out.print("¿Repetir proceso? (N para finalizar): ");
                respuesta = sc.nextLine().toUpperCase().charAt(0);
            } while (respuesta != 'N');
        } else {
            System.out.println("Proceso finalizado");
        }

    }

}
