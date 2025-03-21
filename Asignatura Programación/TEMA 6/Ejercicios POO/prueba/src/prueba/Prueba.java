/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el codigo: ");
        String texto = sc.nextLine().trim();
        while (!texto.matches("^$")) {
            System.out.println("Error");
            System.out.print("Introduce el codigo: ");
            texto = sc.nextLine().trim();
        }
    }
}
