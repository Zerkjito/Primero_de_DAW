/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor, menor, n;
        int nota;
        do {
            System.out.print("Introduce la cantidad de alumnos: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Valor no valido. Debe haber al menos 1 alumno");
            }
        } while (n < 1);

        do {
            System.out.print("Nota del alumno 1: ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota errónea. Debe estar comprendida entre 0-10.");
            }
        } while (nota < 0 || nota > 10);
        
        mayor  = nota;
        menor = nota;
        
        for (int i = 2; i <= n; i++) {
            do {
                System.out.print("Nota del alumno " + i + ": ");
                nota = sc.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota errónea. Debe estar comprendida entre 0-10.");
                }
            } while (nota < 0 || nota > 10);
            
            if (nota > mayor) {
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }
        System.out.println("Nota mayor -> " + mayor);
        System.out.println("Nota menor -> " + menor);

    }

}
