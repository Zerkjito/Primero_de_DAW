/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva19while;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva19While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;
        System.out.print("Introduce un número entero (0 para finalizar): ");
        n = sc.nextInt();
        while (n != 0) {
            contador++;       //esta variable contendrá cuántos números se han leído.
            System.out.print("Introduce un número entero (0 para finalizar): ");
            n = sc.nextInt();
        }
        System.out.println("Ha introducido " + contador + (contador == 1 ? " número" : " números"));
    }

}
