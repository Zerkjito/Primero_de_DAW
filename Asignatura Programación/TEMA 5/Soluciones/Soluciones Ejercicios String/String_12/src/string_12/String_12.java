/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_12;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author enrique
 */

//
//--->> Solución utilizando el método split
//
public class String_12 {

    public static void main(String[] args) {
        //Array con las cadenas de caracteres
        String[] cadenas = {"Gómez Sanlucar, Ricardo", 
                            "Campos Luján, Ramón", 
                            "Ruíz Reverte, Leopoldo", 
                            "Fernández Rubio, Alba"};
        
        //Se crean los tres ArrayList
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> apellidos1 = new ArrayList<>();
        ArrayList<String> apellidos2 = new ArrayList<>();
      
        //Se recorre el array de String
        for (String s : cadenas) {           
            //para cada String dentro del array cadenas
            //se obtiene un array que contendrá los dos apellidos y el nombre por separado
             //el primer apellido estará en el primer elemento del array
            //el segundo apellido estará en el segundo elemento del array
            //el nombre estará en el tercer elemento del array
            //lo dividimos mediante split
            //Los delimitadores son el espacio en blanco y la coma
            //el signo + indica que si los delimitadores aparecen juntos
            //se tratan como uno solo
            String [] aux = s.split("[ ,]+");
            //El array aux que se crea para cada String contiene 3 elementos
            //el primer apellido, el segundo apellido y el nombre
            apellidos1.add(aux[0]);
            apellidos2.add(aux[1]);
            nombres.add(aux[2]);
        }
        
        //Se muestran los apellidos y el nombre contenidos en los ArrayList
        for (int i = 0; i < nombres.size(); i++) {
            System.out.printf("%-15s %-15s %-15s %n", apellidos1.get(i), apellidos2.get(i), nombres.get(i));
        }
    }
}


//
//--->> Solución utilizando StringTokenizer
//
//public class String_12 {
//
//    public static void main(String[] args) {
//        //Array con las cadenas de caracteres
//        String[] cadenas = {"Gómez Sanlucar, Ricardo", 
//                            "Campos Luján, Ramón", 
//                            "Ruíz Reverte, Leopoldo", 
//                            "Fernández Rubio, Alba"};
//        
//        //Se crean los tres ArrayList
//        ArrayList<String> nombres = new ArrayList<>();
//        ArrayList<String> apellidos1 = new ArrayList<>();
//        ArrayList<String> apellidos2 = new ArrayList<>();
//        
//        StringTokenizer st;
//       
//        //Se recorre el array de String
//        for (String s : cadenas) {
//            
//            //para cada String dentro del array cadenas
//            //se crea un StringTokenizer para separar el String en tokens
//            //Los delimitadores son el espacio en blanco y la coma
//            st = new StringTokenizer(s, " ,");
//            //El StringTokenizer que se crea para cada String contiene 3 tokens:
//            //el primer apellido, el segundo apellido y el nombre
//            //se extrae el primer token que es el primer apellido y se añade al ArrayList apellidos1
//            apellidos1.add(st.nextToken());
//            //se extrae el segundo token que es el segundo apellido y se añade al ArrayList apellidos2
//            apellidos2.add(st.nextToken());
//            //se extrae el tercer token que es el nombre y se añade al ArrayList nombres
//            nombres.add(st.nextToken());
//        }
//        
//        //Se muestran los apellidos y el nombre contenidos en los ArrayList
//        for (int i = 0; i < nombres.size(); i++) {
//            System.out.printf("%-15s %-15s %-15s %n", apellidos1.get(i), apellidos2.get(i), nombres.get(i));
//        }
//    }
//}

    

