/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cifraCentro;
        System.out.print("Por favor, introduzca un numero entero de 3 cifras: ");
        numero = sc.nextInt();
        cifraCentro = numero / 10 % 10;
        System.out.println("La cifra del centro es --> " + cifraCentro);
        
        
    }
    
}
