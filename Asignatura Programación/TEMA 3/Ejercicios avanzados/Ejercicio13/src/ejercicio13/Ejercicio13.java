/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author zerkje
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1;
        boolean sumar = true;
        
        System.out.print(n + " ");
                
        do {
            if (sumar) {
                n = n + 4;
            } else {
                n = n - 2;
            }
            sumar = !sumar;
            System.out.print(n + " ");
        } while (n != 23);
            
    }
    
}
