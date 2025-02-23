/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zerkje
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String deportistas = "Messi=Fútbol;Gasol=Baloncesto;Nadal=Tenis;Jordan=Baloncesto;";
        String parejas[] = deportistas.split(";");
        System.out.println("Hay " + parejas.length + " deportistas:");
        System.out.println("Deportista\tDeporte");
        System.out.println("======================");
        for (String pareja : parejas) {
            if (!pareja.isEmpty()) {
                String[] deportistaDeporte = pareja.split("=");
                String deportista = deportistaDeporte[0];
                String deporte = deportistaDeporte[1];
                System.out.println(deportista + "\t\t" + deporte);
            }
        }
    }
    
}
