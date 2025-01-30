/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*
 * Arrays1_09 Programa que lea el nombre y el sueldo de 20 empleados y escriba 
 * el nombre y el sueldo del empleado que más gana. 
 * Utiliza un array para los nombres y otro para los sueldos.
 */
package arrays1_09;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] empleados = new String[20]; //Array para guardar los nombres de los empleados
        double[] sueldos = new double[20]; //Array para guardar los sueldos

        double mayorSueldo;
        String nombreMayorSueldo;

        System.out.println("Lectura de nombres y sueldos de empleados: ");

        //se lee el primer empleado
        System.out.print("Empleado 1: ");
        empleados[0] = sc.nextLine();
        do {
            System.out.print("Sueldo: ");
            sueldos[0] = sc.nextDouble();
        } while (sueldos[0] <= 0);
        
        //se toma el primer empleado como el mayor
        mayorSueldo = sueldos[0];
        nombreMayorSueldo = empleados[0];

        //se leen el resto de empleados
        for (int i = 1; i < empleados.length; i++) {
            sc.nextLine(); //limpiar el buffer
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextDouble();
            if (sueldos[i] > mayorSueldo) {//si el sueldo introducido es mayor que el mayor actual se toma como mayor
                mayorSueldo = sueldos[i];
                nombreMayorSueldo = empleados[i];
            }
        }

        //Mostrar resultados
        System.out.println("Empleado con mayor sueldo: " + nombreMayorSueldo);
        System.out.println("Sueldo: " + mayorSueldo);

    }

}
