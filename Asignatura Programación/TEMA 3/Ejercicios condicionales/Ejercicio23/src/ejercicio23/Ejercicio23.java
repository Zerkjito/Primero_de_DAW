/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String genero = "";
        int edad;
        char respuesta;
        double frCardMax;

        System.out.print("Por favor, introduzca su genero: ");
        genero = sc.nextLine().toUpperCase();
        System.out.print("Por favor, introduzca su edad: ");
        edad = sc.nextInt();
        System.out.println("Por favor, indique si hace ejercicio mediante 'S' (si) o 'N' (no): ");
        respuesta = sc.nextLine().toUpperCase().charAt(0);
        if (respuesta == 'N') {
            if (genero.equals("MUJER")) {
                frCardMax = 226 - edad;
            } else if (genero.equals("HOMBRE")) {
                frCardMax = 220 - edad;
            }
        } else if (respuesta == 'S' && genero.equals("HOMBRE") || genero.equals("MUJER")) {
            frCardMax = 208 - (0.7 * edad);
        }
    }

}
