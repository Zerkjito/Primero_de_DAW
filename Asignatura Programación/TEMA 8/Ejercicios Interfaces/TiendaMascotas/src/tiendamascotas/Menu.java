/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println("\n1. Mostrar");
        System.out.println("2. Ofertas");
        System.out.println("0. FIN");
    }

    public int leerOpcion() {
        return UtilidadesInput.leerEnteroEnRango("\nIntroduce opcion: ", "Error: Rango invalido.", 0, 2);
    }
}
