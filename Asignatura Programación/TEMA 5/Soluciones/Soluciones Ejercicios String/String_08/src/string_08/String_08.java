/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_08;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author enrique
 */
public class String_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Introduce texto: ");
        s = sc.nextLine();
        System.out.println("Texto introducido: " + s);
        s = eliminarUltimaPalabra(s);
        //s = eliminarUltimaPalabra2(s);
        System.out.println("Texto modificado: " + s);
    }

    ///-->>> Solución 1. Utilizando StringTokenizer
    public static String eliminarUltimaPalabra(String s) {
        //Creamos un StringBuilder vacío para ir formando el String resultante
        StringBuilder sb = new StringBuilder();

        //Creamos un StringTokenizer a partir del String que recibe el método
        //En este caso el delimitador (separador de tokens) será el espacio en blanco 
        //que es el delimitador por defecto. Por eso no es necesario indicarlo
        StringTokenizer st = new StringTokenizer(s);

        //El método countTokens() devuelve el número de tokens que aún quedan por extraer
        //Este valor va cambiando según el método nextToken va extrayendo tokens
        //cada vez que nextToken extrae un token el método countToken nos dirá 
        //cuantos tokens quedan aún por extraer 
        while (st.countTokens() > 1) { //mientras quede más de un token por extraer
            sb.append(st.nextToken()); //se extrae el token y se añade al StringBuilder 
            sb.append(" "); //a continuación de cada palabra añadida se añade un espacio en blanco   
        }//el while termina cuando solo quede un token por extraer que será la última palabra del String.

        //se convierte el Stringbuilder a String
        //se elimina el espacio en blanco añadido después de la última palabra
        //y se devuelve
        return sb.toString().trim();
    }

    ///-->>> Solución 2. Utilizando el método split
    public static String eliminarUltimaPalabra2(String s) {
        //Se divide el String en palabras y se obtiene un array de String con el resultado
        //Las palabras se encuentran separadas por un espacio en blanco
        String[] palabras = s.split(" ");
        //Creamos un StringBuilder vacío para ir formando el String resultante
        StringBuilder sb = new StringBuilder();
        //Se recorre el array palabras desde el primer elemento hasta el penúltimo
        //y se pasan sus elementos al StringBuilder
        //la última palabra del String s no se añade al StringBuilder
        for (int i = 0; i < palabras.length - 1; i++) {
            sb.append(palabras[i]);
            sb.append(" ");
        }
        //se convierte el Stringbuilder a String
        //se elimina el espacio en blanco añadido después de la última palabra
        //y se devuelve
        return sb.toString().trim();
    }

}
