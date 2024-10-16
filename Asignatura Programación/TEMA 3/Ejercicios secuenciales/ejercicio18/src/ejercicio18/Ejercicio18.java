/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, primeraCifra, ultimaCifra;
        System.out.print("Por favor, introduzca un numero entero de 4 cifras: ");
        numero = sc.nextInt();
        primeraCifra = numero / 1000;
        ultimaCifra = numero % 10;
        System.out.println("La primera cifra es --> " + primeraCifra);
        System.out.println("La ultima cifra es --> " + ultimaCifra);
        
        
    }
    
}
