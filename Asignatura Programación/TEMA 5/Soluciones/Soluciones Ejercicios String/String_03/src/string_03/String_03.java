/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_03;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class String_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        char caracter;
        do {
            System.out.println("Introduce texto: ");
            texto = sc.nextLine();
        } while (texto.isBlank());
        System.out.print("Introduce un carácter: ");
        caracter = sc.nextLine().charAt(0);
        int numeroDeVeces = contarCaracteres(texto, caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");
    }

    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(caracter); //se busca la primera vez que aparece
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;     //se cuenta
            posicion = cadena.indexOf(caracter, posicion + 1); //se busca de nuevo a partir de la posición siguiente a la encontrada
        }
        return contador;
    }

}
