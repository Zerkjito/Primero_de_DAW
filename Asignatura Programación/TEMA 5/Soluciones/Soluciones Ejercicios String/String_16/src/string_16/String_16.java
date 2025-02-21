/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_16;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author enrique
 */
public class String_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String original;
        System.out.println("Introduce caracteres separados por comas, guiones y espacios en blanco: ");
        original = sc.nextLine();
        //String modificado = metodo(original);
        //String modificado = metodo2(original); 
        String modificado = metodo3(original); 
        System.out.println("String modificado: " + modificado);
    }

    //
    //-->> solución utilizando StringTokenizer
    //
    public static String metodo(String s) {
        //Creamos un StringBuilder vacío para ir formando el String resultante
        StringBuilder sb = new StringBuilder();
        //Creamos un StringTokenizer a partir del String que recibe el método
        //En este caso los delimitadores son la coma, el guión y el espacio en blanco
        StringTokenizer st = new StringTokenizer(s, " ,-");

        while (st.hasMoreTokens()) { //mientras haya más tokens
            sb.append(st.nextToken()); //extraemos un token y lo añadimos al StringBuilder
            sb.append(" "); //a continuación se añade un espacio en blanco
        }

        //se convierte el Stringbuilder a String
        //se elimina el espacio en blanco añadido después de la última palabra
        //y se devuelve
        return sb.toString().trim();
    }

    //
    //-->> solución utilizando split
    //
    public static String metodo2(String s) {
        //Creamos un StringBuilder vacío para ir formando el String resultante
        StringBuilder sb = new StringBuilder();
        //Creamos un array de String a partir del String que recibe el método
        //En este caso los delimitadores son la coma, el espacio en blanco y el guión 
        //el signo + indica que si los delimitadores aparecen juntos se tratan como uno solo
        String[] auxiliar = s.split("[ ,-]+");

        //recorremos el array obtenido para formar el StringBuilder
        for (String s1 : auxiliar) {
            sb.append(s1);
            sb.append(" ");
        }

        //se convierte el Stringbuilder a String
        //se elimina el espacio en blanco añadido después de la última palabra
        //y se devuelve
        return sb.toString().trim();
    }

    //
    //-->> solución utilizando replaceAll
    //
    public static String metodo3(String s) {
        //modificamos el String s que se recibe como parámetro
        //sustituyendo las comas y guiones por espacios en blanco
        String cadena = s.replaceAll("[,-]", " ");
        //devolvemos el String modificado
        return cadena.trim();  //método trim() para eliminar los blancos al principio y al final si los hay  
    }
    
}
