/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, variable1, variable2;
        System.out.println("Introduce un numero entero");
        numero1 = sc.nextInt();
        System.out.println("Introduce otro numero entero");
        numero2 = sc.nextInt();
        System.out.println("Valores iniciales A = " +numero1 + " B = " +numero2);
        variable1 = numero2;
        variable2 = numero1;
        System.out.println("Valores finales A = " +variable1 + " B = " +variable2);
        
        
        
    }
    
}
