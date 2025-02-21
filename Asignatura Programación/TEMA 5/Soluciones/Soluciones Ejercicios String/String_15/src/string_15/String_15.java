/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_15;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author enrique
 */
public class String_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original;
        boolean correcto;
        do {
            correcto = true;
            System.out.println("Introduce números separados por comas y espacios en blanco: ");
            original = sc.nextLine();
            if (original.isBlank() || !numeroValido(original)) {
                System.out.println("Número entero no válido");
                correcto = false;
            }
        } while (!correcto);

        String modificado = metodo(original);
        //String modificado = metodo2(original);

        System.out.println("String modificado: " + modificado);
    }

    //Método que comprueba si el String solo contiene dígitos, comas o espacios en blanco
    public static boolean numeroValido(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) < '0' || s.charAt(i) > '9') && s.charAt(i) != ' ' && s.charAt(i) != ',') {
                return false;
            }
        }
        return true;
    }

    //
    //-->> Solución utilizando StringTokenizer
    //
    public static String metodo(String s) {
        //Creamos un StringBuilder vacío para ir formando el String resultante
        StringBuilder sb = new StringBuilder();
        //Creamos un StringTokenizer a partir del String que recibe el método
        //En este caso los delimitadores son la coma y el espacio en blanco
        StringTokenizer st = new StringTokenizer(s, " ,");

        //Nos guardamos la cantidad de tokens obtenidos en total
        int n = st.countTokens();

        while (st.hasMoreTokens()) {//mientras haya más tokens
            sb.append(st.nextToken());//extraemos un token y lo añadimos al StringBuilder
            if (st.countTokens() > 0) {//Si no es el último token añadimos un guión a continuación
                sb.append("-");
            }
        }
        if (n < 5) { //Si el número total de tokens es menor que cinco 
            sb.append("*"); //se añade un asterisco al final
            sb.insert(0, "*");//y otro al principio
        }

        //se convierte el Stringbuilder a String y se devuelve
        return sb.toString();
    }

    //
    //-->> Solución utilizando split
    //
    public static String metodo2(String s) {
        //Creamos un StringBuilder vacío para ir formando el String resultante
        StringBuilder sb = new StringBuilder();
        //Creamos un array de String a partir del String que se recibe como parámetro
        //En este caso los delimitadores son la coma y el espacio en blanco
        //el signo + indica que si los delimitadores aparecen juntos se tratan como uno solo
        String[] array = s.split("[ ,]+");

        //recorremos el array que ha creado el método split
        //añadimos cada elemento de este array al StringBuilder
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {//Si no es el último elemento añadimos un guión a continuación
                sb.append("-");
            }
        }
        if (array.length < 5) { //Si el número total de elementos del array es menor que cinco 
            sb.append("*"); //se añade un asterisco al final
            sb.insert(0, "*");//y otro al principio
        }

        //se convierte el Stringbuilder a String y se devuelve
        return sb.toString();
    }

}
