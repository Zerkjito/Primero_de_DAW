/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_07;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author enrique
 */
public class String_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Introduce texto: ");
        s = sc.nextLine();
        System.out.println("Texto introducido: ");
        System.out.println(s);
        s = eliminarBlancos(s);
        //s = eliminarBlancos2(s);
        //s = eliminarBlancos3(s);
        System.out.println("Texto modificado: ");
        System.out.println(s);
    }

    //Se presentan tres soluciones para resolver este ejercicio
    //-->> Solución utilizando StringTokenizer
    public static String eliminarBlancos(String s) {
        //Creamos un StringBuilder vacío para ir formando el String resultante
        StringBuilder sb = new StringBuilder();

        //Creamos un StringTokenizer a partir del String que recibe el método
        //En este caso el delimitador (separador de tokens) será el espacio en blanco 
        //que es el delimitador por defecto. Por eso no es necesario indicarlo
        StringTokenizer st = new StringTokenizer(s);

        //Se recorre el StringTokenizer
        //En este caso cada token obtenido es una palabra del String
        while (st.hasMoreTokens()) { //mientras haya tokens
            sb.append(st.nextToken()); //se extrae el token y se añade al StringBuilder
            sb.append(" ");//a continuación de cada palabra añadida se añade un espacio en blanco
        }

        //se convierte el Stringbuilder a String
        //se elimina el espacio en blanco añadido después de la última palabra
        //y se devuelve
        return sb.toString().trim();
    }

    //-->> Solución utilizando el método split
    public static String eliminarBlancos2(String s) {
        //Se divide el String en palabras y se obtiene un array de String con el resultado
        //Las palabras se encuentran separadas por uno o más espacios en blanco
        //En la expresión regular, \\s significa un espacio en blanco y el + indica que puede aparecer una o más veces
        String[] palabras = s.split("\\s+");
        //Creamos un StringBuilder vacío para ir formando el String resultante
        StringBuilder sb = new StringBuilder();
        //Se recorre el array palabras y se pasan sus elementos al StringBuilder
        for (String palabra : palabras) {
            sb.append(palabra);
            sb.append(" ");
        }
        //se convierte el Stringbuilder a String
        //se elimina el espacio en blanco añadido después de la última palabra
        //y se devuelve
        return sb.toString().trim();
    }

    //-->> Solución utilizando el método replaceAll de String
    //El método replaceAll sustituye una cadena por otra dentro de la cadena original
    //Lo que tiene que modificar se ha indicado mediante la expresión regular \\s+
    // \\s significa un espacio en blanco y el + indica una o más veces
    //En la expresión regular estamos indicando que si aparece un espacio en blanco una o más veces
    //lo sustituya por un espacio en blanco
    public static String eliminarBlancos3(String s) {
        String cadena = s.replaceAll("\\s+", " ");
        return cadena.trim();  //método trim() para eliminar los blancos al principio y al final si los hay  
    }

}
