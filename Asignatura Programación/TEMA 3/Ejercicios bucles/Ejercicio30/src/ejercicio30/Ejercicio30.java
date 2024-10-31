/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean sonIguales = false;
        
        do {
            System.out.print("Introduce un numero entero positivo: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Error. El numero debe ser mayor a 0");
            }
        } while (n <= 0);
        
        int ultimaCifra = n % 10;
        int primeraCifra = n;

        
        while (primeraCifra >= 10) {
            primeraCifra = primeraCifra / 10;
            
            if (primeraCifra == ultimaCifra) {
                sonIguales = true;
            }
        }
        if (n >= 10) {
            if (sonIguales) {
                System.out.println("La primera cifra de " + n + " y la ultima son iguales");
            } else {
                System.out.println("La primera cifra de " + n + " y la ultima no son iguales");
            }
        } else if (n < 10){
            System.out.println("El numero introducido solo tiene una cifra");
        }
        
    }
    
}
