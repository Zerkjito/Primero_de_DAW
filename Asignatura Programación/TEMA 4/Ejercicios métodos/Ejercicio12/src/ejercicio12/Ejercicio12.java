/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce un numero entero positivo: ");
            n = sc.nextInt();
        } while (n <= 0);
        
        boolean resultado = sonPrimeraYUltimaIguales(n);
        if (resultado) {
            System.out.println("La primera cifra y la ultima son iguales");
        } else {
            System.out.println("La primera cifra y la ultima NO son iguales");
        }
        
    }
    
    public static boolean sonPrimeraYUltimaIguales(int n) {
        int primeraCifra = n;
        int ultimaCifra = n % 10;
        while (primeraCifra >= 10) {
            primeraCifra/=10; 
        }
        return primeraCifra == ultimaCifra;
    }

}
