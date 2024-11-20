/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados13;

/**
 *
 * @author enrique
 */
public class Avanzados13 {

    public static void main(String[] args) {
        int n = 1;
        boolean sumar = true; //este boolean lo usaremos para sabr si hay que sumar 4 o restar 2
                              //Cuando sumar sea true sumaremos 4 
                              //Cuando sumar sea false sumaremos 2
        
        System.out.print(n + " ");
        
        do {
            if (sumar) { //si sumar es true se suma 4
                n = n + 4;
            } else {     //si es false se resta 2
                n = n - 2;
            }
            sumar = !sumar; //cambiamos el valor de la variable boolean
            System.out.print(n + " ");
        } while (n != 23);
        
        System.out.println();
    }
    
}
