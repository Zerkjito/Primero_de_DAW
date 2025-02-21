/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class String_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        char car;

        System.out.println("Introduce texto: ");
        s = sc.nextLine();
        System.out.print("Introduce un carácter: ");
        car = sc.nextLine().charAt(0);
        
        //Obtener las posiciones en las que aparece el carácter en el texto
        ArrayList<Integer> posiciones = buscarCaracter(s, car);
        
        
        if (!posiciones.isEmpty()) { 
            System.out.println("Encontrado " + posiciones.size() + " veces en las posiciones:");
            System.out.println(posiciones);
        } else {
            System.out.println("El texto no contiene el carácter " + car);
        }
    }
    
    //Método que busca un carácter en un String
    //Devuelve un ArrayList de enteros con las posiciones en las que se ha encontrado el carácter
    public static ArrayList<Integer> buscarCaracter(String s, char c) {
        ArrayList<Integer> posiciones = new ArrayList<>();
        int pos;
        s = s.trim(); //eliminar los posibles espacios en blanco al principio y al final
        pos = s.indexOf(c);
        while (pos != -1) {
            posiciones.add(pos);
            pos = s.indexOf(c, pos + 1);
        }   
        return posiciones;
    }
    
}
