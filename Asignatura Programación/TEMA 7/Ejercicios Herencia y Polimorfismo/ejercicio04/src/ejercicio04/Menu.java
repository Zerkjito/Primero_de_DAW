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

    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%23s", "1-> Alquilar plaza de garaje"));
        sb.append(String.format("%23s", "2-> Mostrar vehiculos"));
        sb.append(String.format("%23s", "3-> Calcular cuota"));
        sb.append(String.format("%23s", "0-> FIN"));
        System.out.println(sb.toString());
    }

    public int opcion() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.print("Introduce opcion: ");

            try {
                opcion = sc.nextInt();
                if (opcion < 1 || opcion > 3) {
                    System.out.println("Error: Rango invalido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un numero");
                sc.nextLine();
            }
        } while (opcion < 0 || opcion > 3);
        return opcion;
    }
    
    public void tipoVehiculo() {
        
    }
}
