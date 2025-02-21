/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_05;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class String_05 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String s, clave;
        System.out.println("Introduce texto: ");
        s = sc.nextLine();
        System.out.print("Introduce secuencia de caracteres: ");
        clave = sc.nextLine();
        
        //Este problema podemos solucionarlo de dos formas
        //El ejercicio no indica cómo hay que hacerlo por lo que se muestran las dos soluciones
        
        //Solución 1.
        int n = buscarCadena(s,clave);
        System.out.println("Solución 1 -> Encontrado " + n + " veces");
        
        //Solución 2.
        n = buscarCadena1(s,clave);
        System.out.println("Solución 2 -> Encontrado " + n + " veces");
    }

    //Método que devuelve las veces que una cadena está contenida dentro de otra
    //No tiene en cuenta si parte de la cadena a buscar forma parte de un resultado anterior
    //Por ejemplo si el texto es "aaaaa" y la clave es "aa" este método devolverá 4
    public static int buscarCadena(String s, String c) {
        int contador = 0, pos;
        s = s.trim(); //eliminar los posibles espacios en blanco al principio y al final
        pos = s.indexOf(c);
        while (pos != -1) {
            contador++;
            pos = s.indexOf(c, pos + 1);
        }
        return contador;
    }
    
    //buscar cadenas unicas no contenidas ya en otras cadenas
    //Método que devuelve las veces que una cadena está contenida dentro de otra
    //Tiene en cuenta si parte de la cadena a buscar forma parte de un resultado anterior
    //Por ejemplo si el texto es "aaaaa" y la clave es "aa" este método devolverá 2
    public static int buscarCadena1(String s, String c) {
        int contador = 0, pos;
        s = s.trim(); //eliminar los posibles espacios en blanco al principio y al final
        pos = s.indexOf(c);
        while (pos != -1) {
            contador++;
            pos = s.indexOf(c, pos + c.length());
        }
        return contador;
    }
    
}
