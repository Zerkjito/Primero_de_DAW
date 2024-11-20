/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados01;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, suma = 0;

        do {
            System.out.print("Introduce un número entero positivo: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Valor no válido. Debe ser positivo");
            }
        } while (N <= 0);

        for (int j = 1; j < N; j++) {  // j son los divisores. Se divide N desde 1 hasta N-1 
            if (N % j == 0) {          //si j es divisor de N
                suma = suma + j;       //se suma el divisor
            }
        }
        if (N == suma) {  // si el numero es igual a la suma de sus divisores es perfecto
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }

}
