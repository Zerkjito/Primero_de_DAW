/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva17;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosC;
        char car;
        do {
            System.out.print("Introduce temperatura en ºC: ");
            gradosC = sc.nextDouble();
            sc.nextLine(); //limpiar buffer
            System.out.printf("\n%.2f ºC equivalen a %.2f ºK \n", gradosC, gradosC + 273.15);
            System.out.print("Repetir proceso? (S para continuar): ");
            car = sc.nextLine().charAt(0);
        } while (car == 'S' || car == 's');
    }

}
