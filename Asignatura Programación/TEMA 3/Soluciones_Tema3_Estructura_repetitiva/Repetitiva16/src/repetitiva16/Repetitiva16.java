/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva16;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velocidad;
        char car;
        do {
            System.out.print("Introduce velocidad (Km/h): ");
            velocidad = sc.nextInt();
            System.out.println(velocidad + " Km/h => " + velocidad * 1000.0 / 3600 + " m/s");
            sc.nextLine(); //limpiar buffer
            System.out.print("Repetir proceso? (N para finalizar): ");
            car = sc.nextLine().charAt(0);
        } while (car != 'N' && car != 'n');
    }

}
