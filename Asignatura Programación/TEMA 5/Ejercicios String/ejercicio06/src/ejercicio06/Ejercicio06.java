/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio06 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto;
        char caracter;
        ArrayList<Integer> repeticiones;
        do {
            System.out.print("Introduce texto: ");
            texto = sc.nextLine();
            if (texto.isBlank()) {
                System.out.println("Error, no puede estar vacio");
            }
        } while (texto.isBlank());

        do {
            System.out.print("Introduce el caracter a buscar: ");
            String input = sc.nextLine();
            if (input.length() != 1 || input.charAt(0) == ' ') {
                System.out.println("Error. Debes introducir solo un caracter sin espacios.");
            } else {
                caracter = input.toLowerCase().charAt(0);
                break;
            }
        } while (true);

        repeticiones = repeticionesCaracter(texto, caracter);
        int numVeces = repeticiones.size();
        String veces = numVeces == 1 ? " vez" : " veces";
        if (numVeces == 0) {
            System.out.println("No hay coincidencias en el texto introducido");
        } else {
            System.out.println("El caracter '" + caracter + "' aparece " + numVeces + veces + " en el texto");
            System.out.println("Posiciones en las que fue encontrado comenzando desde 0 -> " + repeticiones);
        }
    }

    public static ArrayList<Integer> repeticionesCaracter(String texto, char caracter) {
        ArrayList<Integer> posiciones = new ArrayList<>();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.toLowerCase().charAt(i) == caracter) {
                posiciones.add(i);
            }
        }
        return posiciones;
    }
}
