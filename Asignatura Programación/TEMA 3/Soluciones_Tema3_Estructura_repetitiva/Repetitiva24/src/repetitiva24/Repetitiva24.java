/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva24;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int nota, mayor, menor;
        System.out.println("Mayor y menor nota de una clase");
        System.out.println("-------------------------------");

        //Introducir el número de alumnos de la clase
        do {
            System.out.print("Número de alumnos de la clase: ");
            n = sc.nextInt();  //n contiene el número de alumnos
            if (n < 1) {
                System.out.println("Valor no válido. Debe haber al menos 1 alumno");
            }
        } while (n < 1); //repetir mientras que el valor de n sea < 1

        //Para calcular la nota mayor y la menor de la clase primero leeremos la nota del primer alumno
        //y esa nota será la que tomemos como mayor y menor ya que es la única que tenemos hasta este momento
        do {
            System.out.print("Nota del alumno 1: ");
            nota = sc.nextInt(); // leemos la nota del primer alumno
            if (nota < 0 || nota > 10) {
                System.out.println("Valor no válido. Debe ser entre 0 y 10");
            }
        } while (nota < 0 || nota > 10);

        mayor = nota; //tomamos la nota del primer alumno como nota mayor y menor 
        menor = nota;

        // leemos las notas del resto de alumnos desde el alumno 2 hasta el n
        for (int i = 2; i <= n; i++) {

            do {
                System.out.print("Nota del alumno " + i + ": ");
                nota = sc.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("Valor no válido. Debe ser entre 0 y 10");
                }
            } while (nota < 0 || nota > 10);

            // se compara la nota introducida con la mayor y con la menor actual
            if (nota > mayor) { //si la nota introducida es mayor que la mayor actual
                mayor = nota;   //se guarda como la nota mayor
            } else if (nota < menor) { //si la nota introducida es menor que la menor actual
                menor = nota;          //se guarda como la nota menor
            }
        }
        
        //mostrar nota mayor y menor de la clase
        System.out.println("Nota mayor -> " + mayor);
        System.out.println("Nota menor -> " + menor);
    }

}
