/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras09;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, altura;
        do {
            do {
                System.out.print("Introduce altura del rectángulo (>=3): ");
                altura = sc.nextInt();
            } while (altura < 3);
            do {
                System.out.print("Introduce base del rectángulo (>=3): ");
                base = sc.nextInt();
            } while (base < 3);
            if (base == altura) {
                System.out.println("Base y altura no pueden ser iguales");
            }
        } while (base == altura);
        for (int i = 1; i <= altura; i++) { //filas
            for (int j = 1; j <= base; j++) { //columnas
                if (i == 1 || i == altura || j == 1 || j == base) { //Se muestra * en la primera fila, en la última fila, en la primera columna o en la última columna
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
