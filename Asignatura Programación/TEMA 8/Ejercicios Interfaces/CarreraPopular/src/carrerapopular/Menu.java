/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrerapopular;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println("\n1. Mostrar carrera");
        System.out.println("2. Avanzar");
        System.out.println("3. Amonestar");
        System.out.println("4. Mostrar ganadores");
        System.out.println("5. Mostrar ganadores por categorías");
        System.out.println("6. Mostrar posición final del participante más joven");
        System.out.println("0. FIN");
    }

    public int leerOpcion() {
        opcion = UtilidadesInput.leerEnteroEnRango("Introduzca opcion: ", 0, 6, "Error: Opcion fuera de rango.");
        return opcion;
    }
}
