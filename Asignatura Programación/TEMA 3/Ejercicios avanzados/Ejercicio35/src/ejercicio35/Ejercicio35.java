/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio35;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            do {
                System.out.print("Introduce un numero entero positivo (0 para finalizar): ");
                n = sc.nextInt();
                if (n < 0) {
                    System.out.println("Error. Debe ser numero positivo");
                }
            } while (n != 0 && n < 0);
            if (n != 0) {
                int aux = n;
                int digito = 0;
                int suma = 0;
                while (aux > 0) {
                    digito = aux % 10;
                    suma = suma + (int) Math.pow (digito, 3);
                    aux/=10;
                }
                if (suma == n) {
                    System.out.println("Es cubico perfecto");
                } else {
                    System.out.println("NO es cubico perfecto");
                }
            }
        } while (n != 0);
        System.out.println("Fin programa");
        sc.close();
    }

}
