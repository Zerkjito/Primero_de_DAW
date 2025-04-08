/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio04 {
    static Scanner sc = new Scanner(System.in);
    static Vehiculo[] garaje = new Vehiculo[100];
    static int indice = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Menu m = new Menu();
        do {
            m.mostrar();
            opcion = m.opcion();
            switch (opcion) {
                case 1: 
                case 2:
                case 3:
            }
        } while (opcion != 0);
    }
    
    public static void alquilarPlaza() {
        int opcionAlquilar;
        
    }
    
}
