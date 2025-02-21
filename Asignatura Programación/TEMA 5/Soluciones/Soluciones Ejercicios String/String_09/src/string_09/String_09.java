/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_09;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author enrique
 */
///////////////////////////////////////////////////////////////////////////
//---> Solución utilizando StringTokenizer
//////////////////////////////////////////////////////////////////////////
public class String_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int i=0;
        System.out.println("Introduce números enteros separados por espacios: ");
        s = sc.nextLine();
        
        //Creamos un StringTokenizer a partir del String introducido por teclado
        //En este caso el delimitador (separador de tokens) será el espacio en blanco 
        //que es el delimitador por defecto. Por eso no es necesario indicarlo
        StringTokenizer st = new StringTokenizer(s);
        
        //Creamos un array de tipo int
        //El tamaño será el número de tokens obtenidos que coindice con la cantidad de 
        //números que contiene el String introducido por teclado
        int [] numeros = new int[st.countTokens()];
        
        //Se recorre el StringTokenizer
        while(st.hasMoreTokens()){
            //Extraemos los tokens y los guardamos en el array de enteros.
            //El método nextToken obtiene y devuelve el siguiente token.
            //Los tokens que se extraen mediante el método nextToken son de tipo String.
            //En este caso cada token es un String que contiene un número entero.
            //Para poder asignarlos al array de enteros tenemos antes que 
            //convertir el token (String) a int
            //Esto se hace utilizando el método Integer.parseInt()
            numeros[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        
        //Se ordena el array de menor a mayor
        Arrays.sort(numeros);
        
        //Se muestra el array de enteros
        for(i=0;i<numeros.length;i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
    
}

///////////////////////////////////////////////////////////////////////////
//---> Solución utilizando el método split
//////////////////////////////////////////////////////////////////////////
//public class String_09 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s;
//        System.out.println("Introduce números enteros separados por espacios: ");
//        s = sc.nextLine();
//
//        //Utilizamos el método split para separar los números de la cadena
//        //La expresión regular indica que el separador es uno o más espacios en blanco
//        //el signo + indica que si los espacios aparecen juntos se tratan como uno solo
//        //En cada elemento del array que se obtiene hay un String que contiene un número
//        String[] cadenas = s.split("\\s+");
//
//        //Se crea un array de números enteros del mismo tamaño que el array cadenas
//        int [] numeros = new int[cadenas.length];
//        
//        Se recorre el array cadenas y pasamos cada elemeno al array números
//        for(int i = 0; i < cadenas.length; i++){
//            Para poder asignar el contenido del array cadenas (de tipo String)
//            al array de enteros tenemos antes que convertir cada elemento
//            del array cadenas a int
//            Esto se hace utilizando Integer.parseInt()
//            numeros[i] = Integer.parseInt(cadenas[i]);
//        }
//
//        //Se ordena el array números de menor a mayor
//        Arrays.sort(numeros);
//
//        //Se muestra el array numeros
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.print(numeros[i] + " ");
//        }
//        System.out.println();
//    }
//}
