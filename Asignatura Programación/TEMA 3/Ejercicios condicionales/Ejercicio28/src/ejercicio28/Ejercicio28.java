/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioSegundo = 0, precioTotal;
        int duracion;

        System.out.print("Introduce la duracion de la llamada: ");
        duracion = sc.nextInt();

        if (duracion > 0) {
            precioSegundo = 0.25 / 60;
            precioTotal = precioSegundo * duracion;

            if (duracion > 180) {
                precioSegundo = 0.40 / 60;
                precioTotal = precioSegundo * duracion;
            }
        }
        

    }

}
