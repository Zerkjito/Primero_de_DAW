/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_02;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class String_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        do {
            System.out.println("Introduce texto: ");
            texto = sc.nextLine();
        } while (texto.isBlank()); //se debe introducir texto
        texto = eliminarUltimaPalabra(texto);
        System.out.println("Texto modificado: ");
        System.out.println(texto);
    }

    public static String eliminarUltimaPalabra(String s) {
        int pos;
        s = s.trim(); //elimina los posibles espacios en blanco al principio y al final del texto
        pos = s.lastIndexOf(" "); //se busca el último espacio en blanco dentro del String
        if (pos != -1) {//si existe
            //se obtiene una cadena desde el principio hasta la posición anterior a ese espacio
            s = s.substring(0, pos);
        } else { //si no existe significa que solo se ha introducido una palabra
            s = "";
        }
        return s;
    }

}
