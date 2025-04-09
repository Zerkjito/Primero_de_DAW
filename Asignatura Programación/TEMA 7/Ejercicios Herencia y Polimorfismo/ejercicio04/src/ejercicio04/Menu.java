/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Menu {

    public void mostrarMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n1-> Alquilar plaza de garaje   ");
        sb.append("2-> Mostrar vehiculos   ");
        sb.append("3-> Calcular cuota   ");
        sb.append("0-> FIN");
        System.out.println(sb.toString());
    }

    public int opcionMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.print("Introduce opcion: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine();
                if (opcion < 0 || opcion > 3) {
                    System.out.println("Error: Rango invalido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero.");
                sc.nextLine();
            }
        } while (opcion < 0 || opcion > 3);
        return opcion;
    }

    public void mostrarVehiculos() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n1-> Plaza coche   ");
        sb.append("2-> Plaza moto   ");
        sb.append("0-> VOLVER");
        System.out.println(sb.toString());
    }

    public int opcionVehiculo() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.print("Introduce opcion: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine();
                if (opcion < 0 || opcion > 2) {
                    System.out.println("Error: Rango invalido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero.");
                sc.nextLine();
            }
        } while (opcion < 0 || opcion > 2);
        return opcion;
    }
}
