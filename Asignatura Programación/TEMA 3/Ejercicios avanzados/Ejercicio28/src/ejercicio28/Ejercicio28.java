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
        int n;
        double resultado = 0;
        boolean sumar = true;
        
        do {
            System.out.print("Introduce el numero de terminos: ");
            n = sc.nextInt();
        } while (n <= 0);
     
        for (int i = 1, j = 1; i <= n; i++, j += 2) {
            if (sumar) {
                resultado = resultado + Math.pow(i, i * 2) / (Math.sqrt(j));
            } else {
                resultado = resultado - Math.pow(i, i * 2) / (Math.sqrt(j));
            }
            sumar = !sumar;
        }
        System.out.printf("El resultado es -> %.5f\n", resultado);

    }

}
