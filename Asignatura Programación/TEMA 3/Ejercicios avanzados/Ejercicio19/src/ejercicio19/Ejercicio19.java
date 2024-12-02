/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos, contadorSusp = 0, contadorApr = 0, contador3Susp = 0, contador3Sobre = 0;
        double nota, sumaNotas = 0, media = 0;
        
        System.out.println("NOTAS DE LA CLASE DE 1DAW");
        System.out.println("----------------------------------------------");
        do {
            System.out.print("Especifica la cantidad de alumnos: ");
            alumnos = sc.nextInt();
            if (alumnos < 15 || alumnos > 24) {
                System.out.println("[Error. La cantidad de alumnos debe ser entre 15 y 24]");
            }
        } while (alumnos < 15 || alumnos > 24);

        for (int i = 1; i <= alumnos; i++) {
            sumaNotas = 0;
            for (int j = 1; j <= 3; j++) {
                do {
                    System.out.print("Nota del alumno " + i + " del " + j + " examen: ");
                    nota = sc.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Error. Nota invalida, debe ser entre 0-10");
                    }
                } while (nota < 0 || nota > 10);
                
                sumaNotas = sumaNotas + nota;
            }
            if (sumaNotas <= 14.97) {
                contador3Susp++;
            } else if (sumaNotas >= 27) {
                contador3Sobre++;
            }
            media = sumaNotas / 3;
            if (media < 5) {
                contadorSusp++;
            } else if (media >= 5){
                contadorApr++;
            }
            System.out.printf("Media del alumno: %.2f%n", media);
            System.out.println();
        }
        double porcentajeApr = (double) contadorApr / alumnos * 100;
        double porcentajeSusp = (double) contadorSusp / alumnos * 100;
        
        System.out.println("Han suspendido la evaluacion un total de " + contadorSusp + " alumnos");
        System.out.println("Han suspendido los 3 examenes un total de " + contador3Susp + " alumnos");
        System.out.println("Han sacado sobresaliente en los 3 examenes un total de " + contador3Sobre + " alumnos");
        System.out.printf("Porcentaje de alumnos aprobados -> %.2f%%%n" , porcentajeApr);
        System.out.printf("Porcentaje de alumnos suspendidos -> %.2f%%%n" , porcentajeSusp);
        
        sc.close();
    }

}
