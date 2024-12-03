/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, altura;
        do {
            do {
                System.out.println("Introduce la altura (min. 3): ");
                altura = sc.nextInt();
            } while (altura < 3);

            do {
                System.out.println("Introduce la base (min. 3): ");
                base = sc.nextInt();
            } while (base < 3);
        } while (base == altura);

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {
                if (i == 1 || i == altura || j == 1 || j == base) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
