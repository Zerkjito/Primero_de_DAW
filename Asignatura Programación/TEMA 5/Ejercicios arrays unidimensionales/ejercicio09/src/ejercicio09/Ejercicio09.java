/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombre = new String[5];
        int[] sueldo = new int[5];

        for (int i = 0; i < sueldo.length; i++) {
            System.out.print("Introduce el nombre del empleado " + (i + 1) + ": ");
            while (true) {
                nombre[i] = sc.nextLine().trim();
                if (!nombre[i].isEmpty()) {
                    break;
                } else {
                    System.out.println("El nombre no puede estar vacio, intenta de nuevo.");
                    System.out.print("Introduce el nombre del empleado " + (i + 1) + ": ");
                }
            }

            System.out.print("Introduce el sueldo del empleado " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el sueldo del empleado " + (i + 1) + ": ");
            }
            sueldo[i] = sc.nextInt();
            sc.nextLine();

        }

        int sueldoMax = sueldo[0];
        int indiceMax = 0;

        for (int i = 1; i < sueldo.length; i++) {
            if (sueldo[i] > sueldoMax) {
                sueldoMax = sueldo[i];
                indiceMax = i;
            }
        }
        int sueldoMin = sueldo[0];
        int indiceMin = 0;

        for (int i = 0; i < sueldo.length; i++) {
            if (sueldo[i] < sueldoMin) {
                sueldoMin = sueldo[i];
                indiceMin = i;
            }
        }

        System.out.println("\n--------------DATOS DE LOS EMPLEADOS----------------------");

        for (int i = 0; i < sueldo.length; i++) {
            System.out.printf("Sueldo del empleado %-15s -> $%-10d\n", nombre[i], sueldo[i]); // el (-)  se encarga de alinear a la izquierda con 15 espacios
        }

        int[] sueldoOrdenado = sueldo.clone(); // clonamos el array original al nuevo array 
        Arrays.sort(sueldoOrdenado); // método que ordena el array int de menor a mayor 
        System.out.println("\n--------------SUELDOS ORDENADOS DE MENOR A MAYOR---------------------");
        for (int i = 0; i < sueldoOrdenado.length; i++) {
            for (int j = 0; j < sueldo.length; j++) {
                if (sueldoOrdenado[i] == sueldo[j]) {
                    System.out.printf("Sueldo del empleado %-15s -> $%-10d\n", nombre[j], sueldo[j]);
                    break;
                }
            }
        }
        System.out.println("\nEl sueldo mas alto fue del empleado " + nombre[indiceMax] + " con $" + sueldo[indiceMax]);
        System.out.println("El sueldo mas bajo fue del empleado " + nombre[indiceMin] + " con $" + sueldo[indiceMin]);
    }

}
