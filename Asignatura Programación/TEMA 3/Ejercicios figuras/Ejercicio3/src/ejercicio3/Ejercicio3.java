/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, altura;
        char filler;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce la altura del rectangulo: ");
            altura = sc.nextInt();
        } while (altura <= 0);
        
        do {
            System.out.print("Introduce la base del rectangulo: ");
            base = sc.nextInt();
        } while (base <= 0);
        sc.nextLine();
        
        System.out.print("Introduce el caracter de relleno: ");
        filler = sc.next().charAt(0);
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {
                System.out.print(filler);
            }
            System.out.println();
        }
    }

}
