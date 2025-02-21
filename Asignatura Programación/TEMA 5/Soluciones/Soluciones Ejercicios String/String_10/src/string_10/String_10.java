/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_10;

import java.util.StringTokenizer;

/**
 *
 * @author enrique
 */

//
//--->> Solución utilizando el métod split
//
public class String_10 {

    public static void main(String[] args) {
        String s = "23-239 12-120:-23=5203 28340:23\n238";
        //Mediante el método split obtenemos un array de String a partir del String original
        //en la expresión regular indicamos todos los separadores entre corchetes. 
        //el signo + indica que si los delimitadores aparecen juntos se tratan como uno solo
        String[] numeros = s.split("[-:=\n ]+");
        System.out.println("Hay " + numeros.length + " números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + ")" + numeros[i] + " Quedan " + (numeros.length - i - 1));
        }
    }

}

//
//--->> Solución utilizando StringTokenizer
//
//public class String_10 {
//
//    public static void main(String[] args) {
//        String s = "23-239 12-120:-23=5203 28340:23\n238";
//        
//        //Creamos un StringTokenizer a partir del String s
//        //En este caso los delimitadores son los caracteres -:=\n y el espacio en blanco
//        StringTokenizer st = new StringTokenizer(s, "-:=\n ");
//        
//        int cont = st.countTokens(); //Obtenemos el número de tokens total
//        System.out.println("Hay " + cont + " números:");
//        for (int i = 1; i <= cont; i++) {
//            //En cada iteración del for extraemos un token y mostramos cuántos quedan
//            System.out.println(i + ")" + st.nextToken() + " Quedan " + st.countTokens());
//        }
//  }
//}