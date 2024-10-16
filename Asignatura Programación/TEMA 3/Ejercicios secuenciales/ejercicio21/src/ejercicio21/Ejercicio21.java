/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primerasCifras, centralesCifras, ultimasCifras, numero;
        System.out.print("Por favor, introduzca un numero entero de 6 cifras: ");
        numero = sc.nextInt();
        primerasCifras = numero / 10000;
        centralesCifras = numero / 100 % 100;
        ultimasCifras = numero % 100;
        System.out.println(primerasCifras);
        System.out.println(centralesCifras);
        System.out.println(ultimasCifras);
        
        
    }
    
}
