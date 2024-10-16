/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales03;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número entero: ");
        numero = sc.nextInt(); //Lee un int

        System.out.println("Número introducido: " + numero);
        System.out.println("El doble de " + numero + " es " + 2 * numero);
        System.out.println("El triple de " + numero + " es " + 3 * numero);
    }

}
