/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_01;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class String_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        int pos;
        do {
            System.out.println("Introduce texto: ");
            texto = sc.nextLine();
        } while (texto.isBlank()); //se debe introducir texto

        texto = texto.trim(); //elimina los posibles espacios en blanco al principio y al final del texto
        pos = texto.lastIndexOf(" "); //se busca el último espacio en blanco dentro del String
        if (pos != -1) { //si existe
            //se obtiene una cadena desde el principio hasta la posición anterior a ese espacio
            texto = texto.substring(0, pos); 
        } else { //si no existe significa que solo se ha introducido una palabra
            texto = "";
        }
        System.out.println("Texto modificado: ");
        System.out.println(texto);
    }
    
}
