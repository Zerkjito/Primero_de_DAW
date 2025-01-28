/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        int mediaPos, contadorPos = 0, sumaPos = 0;
        int mediaNeg, contadorNeg = 0, sumaNeg = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.print("Introduce el valor de la posicion " + (i + 1) + ": ");
            n[i] = sc.nextInt();
            if (n[i] > 0) {
                sumaPos += n[i];
                contadorPos++;
            } else {
                sumaNeg += n[i];
                contadorNeg++;
            }
        }
        if (contadorPos > 0) {
            mediaPos = sumaPos / contadorPos;
            System.out.println("Media de numeros positivos introducidos: " + mediaPos);
        } else {
            System.out.println("No se introdujeron numeros positivos");
        }

        if (contadorNeg > 0) {
            mediaNeg = sumaNeg / contadorNeg;
            System.out.println("Media de numeros negativos introducidos: " + mediaNeg);
        } else {
            System.out.println("No se introdujeron numeros negativos");
            
        }
        sc.close();
    }

}
