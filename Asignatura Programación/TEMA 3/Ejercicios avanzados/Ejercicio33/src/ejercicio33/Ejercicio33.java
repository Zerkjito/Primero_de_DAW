/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio33;

/**
 *
 * @author zerkje
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String abc = "ZYWXVUTSRQPONMLKJIHGFEDCBA";
        int longitud = abc.length();
        
        for (int i = 0; i < longitud; i++) {
            System.out.println(abc.substring(i));
           
        }
    }
    
}
