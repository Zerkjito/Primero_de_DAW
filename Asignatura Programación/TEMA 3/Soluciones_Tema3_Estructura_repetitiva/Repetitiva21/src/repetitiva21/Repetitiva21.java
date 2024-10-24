/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva21;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double nota, suma = 0;

        //Introducir por teclado el número de alumnos que hay en la clase
        do {
            System.out.print("Introduce numero de alumnos: ");
            n = sc.nextInt();  //n contiene el número de alumnos
            if(n < 2){ //si son menos de 2
                System.out.println("Valor no válido. Deben ser al menos 2 alumnos");
            }
        } while (n < 2);

        //leer las notas de los n alumnos de la clase
        for (int i = 1; i <= n; i++) {  // leemos desde el alumno 1 hasta el n
            System.out.print("Nota del alumno " + i + ": "); 
            nota = sc.nextDouble();
            suma = suma + nota; //sumamos todas las notas
        }
        System.out.printf("Nota media de la clase: %.4f%n", suma / n);
    }
    
}
