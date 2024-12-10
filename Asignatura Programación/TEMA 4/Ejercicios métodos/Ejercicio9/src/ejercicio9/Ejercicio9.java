/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        char [] vocales = {'a', 'e', 'i', 'o', 'u'};
        System.out.print("Introduce una letra: ");
        letra = sc.next().toLowerCase().charAt(0);
        if (averiguarVocal(letra, vocales)) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra no es una vocal");
        }
    }
    
    public static boolean averiguarVocal(char letra, char []vocales) {
        boolean esVocal = false;
        for (char vocal : vocales) {
            if (letra == vocal) {
                return true;
            }
        }
        return false;
    }
    
}
