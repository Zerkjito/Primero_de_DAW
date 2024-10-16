/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unaCifra, dosCifra, tresCifra, cuatroCifra, cincoCifra, numero;
        System.out.print("Por favor, introduzca un numero entero de 5 cifras: ");
        numero = sc.nextInt();
        unaCifra = numero % 10;
        dosCifra = numero % 100;
        tresCifra = numero % 1000;
        cuatroCifra = numero % 10000;
        cincoCifra = numero;
        System.out.println(unaCifra);
        System.out.println(dosCifra);
        System.out.println(tresCifra);
        System.out.println(cuatroCifra);
        System.out.println(cincoCifra);

        
       
    }
    
}
