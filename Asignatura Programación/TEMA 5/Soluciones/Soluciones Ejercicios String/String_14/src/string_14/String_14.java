/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_14;

import java.util.StringTokenizer;

/**
 *
 * @author enrique
 */
public class String_14 {

    public static void main(String[] args) {
         String nifs = "43434321-A 65473820-T 33238765-D 32994102-X 74771234-F";
        System.out.println("Nifs con guiones: " + nifs);
        //String nifsSinGuiones = metodo(nifs);
        String nifsSinGuiones = metodo2(nifs);
        System.out.println("Nifs sin guiones: " + nifsSinGuiones);
        
        
    }
    
    //
    //--->> solución utilizando StringTokenizer
    //
    public static String metodo(String s) {
        //Creamos un StringBuilder vacío para ir formando el String resultante
        StringBuilder sb = new StringBuilder();
        //Creamos un StringTokenizer a partir del String que recibe el método
        //En este caso el delimitador (separador de tokens) será el guión 
        StringTokenizer st = new StringTokenizer(s, "-");
        
        while (st.hasMoreTokens()) {//Mientras haya más tokens
            sb.append(st.nextToken());//Se extrae el token y se añade al StringBuilder
        }
        
        //se convierte el Stringbuilder a String y se devuelve
        return sb.toString();
    }
    
    //
    //--->> solución utilizando split
    //
    public static String metodo2(String s) {
        //mediante el método split creamos un array de String a partir del String que recibe el método
        //El delimitador es el carácter -
        String [] array = s.split("-");
        //Creamos un StringBuilder vacío para ir formando el String resultante
        StringBuilder sb = new StringBuilder();
        //Recorremos el array de Strings que nos ha creado split
        //cada elemento del array lo añadimos al StringBuilder
        for (String nif : array) {
            sb.append(nif); 
        }       
        //se convierte el Stringbuilder a String y se devuelve
        return sb.toString();
    }
    
}
