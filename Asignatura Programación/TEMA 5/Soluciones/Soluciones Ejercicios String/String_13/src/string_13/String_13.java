/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_13;

import java.util.StringTokenizer;

/**
 *
 * @author enrique
 */
//
//--->> Solución utilizando StringTokenizer
//
public class String_13 {

    public static void main(String[] args) {
         String cadena = "Messi=Fútbol;Gasol=Baloncesto;Nadal=Tenis;Jordan=Baloncesto;";
        
        //Creamos un primer StringTokenizer a partir del String cadena
        //En este caso el delimitador que vamos a usar será el punto y coma
        //Con este StringTokenizer los tokens que obtenemos son:
        //Messi=Fútbol
        //Gasol=Baloncesto
        //etc.
        StringTokenizer st = new StringTokenizer(cadena, ";");
        
        //Obtenemos el número de deportistas que hay
        int cont = st.countTokens();
        System.out.println("Hay " + cont + " deportistas:");
        
        //Ahora vamos mostrar en cada línea el deportista y su deporte
        //Para ello recorremos el StringTokenizer st que hemos creado y a cada uno de
        //los tokens que vamos extrayendo le aplicamos de nuevo otro StringTokenizer
        //que tendrá como delimitador el carácter '='
        //Para cada uno de los tokens de st obtendremos ahora dos tokens: el deportista y el deporte.
        System.out.printf("%-15s %-15s %n", "Deportista", "Deporte");
        StringTokenizer st1;
        while (st.hasMoreTokens()) {//mientras haya más tokens en st
            //obtenemos el token y le aplicamos a su vez un StringTokenizer para separar depostista y deporte
            st1 = new StringTokenizer(st.nextToken(), "=");
            //Extraemos el primero token (deportista) y el segundo (deporte) y lo mostramos por pantalla
            System.out.printf("%-15s %-15s %n", st1.nextToken(), st1.nextToken());
        }
    }
}
//
//--->> Solución utilizando split
//
//public class String_13 {
//
//    public static void main(String[] args) {
//        String cadena = "Messi=Fútbol;Gasol=Baloncesto;Nadal=Tenis;Jordan=Baloncesto;";
//        //separamos el String mediante el método split
//        //los delimitadores son los caracteres = y ;        
//        String[] jugadores = cadena.split("[=;]");
//
//        //Obtenemos el número de deportistas que hay
//        //Los elementos del array jugadores contienen primero un deportista y a continuación el deporte
//        //El número de elementos del array jugadores es el doble que el número de deportistas   
//        System.out.println("Hay " + jugadores.length / 2 + " deportistas:");
//
//        //se recorre el array jugadores y se muestran los jugadores y su deporte
//        System.out.printf("%-15s %-15s %n", "Deportista", "Deporte");
//        for (int i = 0; i < jugadores.length; i += 2) {
//            System.out.printf("%-15s %-15s %n", jugadores[i], jugadores[i + 1]);
//        }
//    }
//}