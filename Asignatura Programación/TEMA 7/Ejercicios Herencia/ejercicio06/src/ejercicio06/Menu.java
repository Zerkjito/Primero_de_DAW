/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Menu {

    static Scanner sc = new Scanner(System.in);

    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%n%-25s %-25s%n", "1-> Nuevo inmueble", "2-> Modificar descuento"));
        sb.append(String.format("%-25s %-25s%n", "3-> Alquilar", "4-> Devolver"));
        sb.append(String.format("%-25s %-25s%n", "5-> Mostrar inmuebles", "0-> FIN"));
        System.out.print(sb.toString());
    }

    public void tipoInmueble() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%n%-25s %-25s%n", "1-> Vivienda", "2-> Local"));
        sb.append(String.format("%-25s%n", "3-> Volver"));
        System.out.print(sb.toString());
    }

    public int opcionMenu() {
        int opcion;
        do {
            System.out.print("\nIntroduzca opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: entrada invalida");
                sc.nextLine();
                System.out.print("\nIntroduzca opcion: ");
            }
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion < 0 || opcion > 5) {
                System.out.println("Error: rango invalido");
            }
        } while (opcion < 0 || opcion > 5);
        return opcion;
    }

    public int opcionInmueble() {
        int opcion;
        do {
            System.out.print("\nIntroduzca opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("\nIntroduzca opcion: ");
            }
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion <= 0 || opcion > 3) {
                System.out.println("Error: Rango invalido.");
            }
        } while (opcion <= 0 || opcion > 3);
        return opcion;
    }
}
