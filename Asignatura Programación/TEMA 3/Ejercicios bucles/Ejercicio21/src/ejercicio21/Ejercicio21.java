/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, suma = 0;
        int n;
        
        do {
            System.out.print("Introduce la cantidad de alumnos: ");
            n = sc.nextInt();
            if (n < 2) {
                System.out.println("Valor no valido. Deben ser al menos 2 alumnos.");
            }
        } while (n < 2);
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Introduce la nota del alumno " + i);
            nota = sc.nextDouble();
            suma += nota;
        }
        System.out.printf("La nota media de los alumnos es: %.4f%n",suma / n);

    }

}
