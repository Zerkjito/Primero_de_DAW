/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados28;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("Introduce el valor de N > 0: ");
            N = sc.nextInt();
            if(N <= 0){
                System.out.println("Debe ser > 0");
            }
        } while (N <= 0);

        double resultado = 0;
        boolean sumar = true;
        
        for (int i = 1, j = 1; i <= N; i++, j += 2) {
            if (sumar) {
                resultado = resultado + Math.pow(i, i * 2) / Math.sqrt(j);
            } else {
                resultado = resultado - Math.pow(i, i * 2) / Math.sqrt(j);
            }
            sumar = !sumar;
        }
        System.out.printf("Resultado: %.5f%n", resultado);
    }

}
