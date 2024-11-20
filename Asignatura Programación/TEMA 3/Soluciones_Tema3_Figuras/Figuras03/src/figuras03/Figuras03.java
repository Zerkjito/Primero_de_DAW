/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras03;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, altura;
        char caracter;
        do {
            System.out.print("Introduce base del rectángulo (columnas): ");
            base = sc.nextInt();
        } while (base <= 0);
        do {
            System.out.print("Introduce altura del rectángulo (filas): ");
            altura = sc.nextInt();
        } while (altura <= 0);
        sc.nextLine(); //limpiar el buffer
        System.out.print("Introduce caracter de relleno: ");
        caracter = sc.nextLine().charAt(0);
        for (int i = 1; i <= altura; i++) { //filas
            for (int j = 1; j <= base; j++) { //columnas
                System.out.print(caracter);
            }
            System.out.println();
        }

    }

}
