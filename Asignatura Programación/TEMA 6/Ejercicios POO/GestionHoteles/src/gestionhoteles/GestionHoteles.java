/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionhoteles;

import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class GestionHoteles {

    static ArrayList<Huesped> huespedes = new ArrayList<>();
    static ArrayList<Huesped> reservasHoy = new ArrayList<>();
    static ArrayList<Huesped> noDisponibles = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu m = new Menu();
        int opcion;
        do {
            m.mostrar();
            opcion = m.leer();
            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
            }
        } while (opcion != 0);
        

    }

}
