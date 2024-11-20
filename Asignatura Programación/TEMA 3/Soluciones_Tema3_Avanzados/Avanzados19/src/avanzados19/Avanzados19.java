/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados19;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados19 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int N, suspensos = 0, suspendenLosTres = 0, sobresalientes = 0, aprobados;
        double nota1, nota2, nota3, media;

        //lectura del número de alumnos de la clase
        do {
            System.out.print("Número de alumnos de la clase: ");
            N = sc.nextInt();
            if (N < 15 || N > 24) {
                System.out.println("Valor no válido");
            }
        } while (N < 15 || N > 24);

        //lectura de notas de los N alumnos de la clase
        for (int i = 1; i <= N; i++) {
            //leer las 3 notas de cada alumno
            do {
                System.out.print("Nota 1 del alumno " + i + ": ");
                nota1 = sc.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("nota no válida");
                }
            } while (nota1 < 0 || nota1 > 10);
            do {
                System.out.print("Nota 2 del alumno " + i + ": ");
                nota2 = sc.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("nota no válida");
                }
            } while (nota2 < 0 || nota2 > 10);
            do {
                System.out.print("Nota 3 del alumno " + i + ": ");
                nota3 = sc.nextDouble();
                if (nota3 < 0 || nota3 > 10) {
                    System.out.println("nota no válida");
                }
            } while (nota3 < 0 || nota3 > 10);
            
            //calcular la media del alumno
            media = (nota1 + nota2 + nota3) / 3;
            
            //mostrar la media del alumno con dos decimales
            System.out.printf("Media del alumno %2d: %.2f%n%n", i, media);//%n es un salto de línea
            
            //contar cuantos suspensos hay
            if (media < 5) {
                suspensos++;
            }
            
            //contar cuantos suspenden los 3 exámenes
            if (nota1 < 5 && nota2 < 5 && nota3 < 5) {
                suspendenLosTres++;
            }
            
            //contar cuántos han sacado sobresaliente 
            if (nota1 >= 9 && nota2 >= 9 && nota3 >= 9) {
                sobresalientes++;
            }
        }
        
        System.out.println("Alumnos que suspenden la evaluación: " + suspensos);
        System.out.println("Alumnos que suspenden los tres exámenes: " + suspendenLosTres);
        System.out.println("Alumnos con sobresaliente en los tres exámenes: " + sobresalientes);
        aprobados = N - suspensos;
        System.out.printf("Porcentaje de aprobados: %.2f%%%n", aprobados * 100.0 / N); 
        System.out.printf("Porcentaje de suspendidos: %.2f%%%n", suspensos * 100.0 / N);
        //en un printf si queremos mostrar el carácter % se debe poner repetido: %%
        //es este caso se han escrito %% después de %.2f para que se muestre por pantalla el carácter %
    }
    
}
