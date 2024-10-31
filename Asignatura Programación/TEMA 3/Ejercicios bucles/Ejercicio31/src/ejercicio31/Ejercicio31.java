/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d;
        
        do {
            System.out.print("Introduce un numero de 2 o mas cifras: ");
            n = sc.nextInt();
            if (n < 10) {
                System.out.println("Error");
            }
        } while(n < 10);
        
        do {
            System.out.print("Introduce un numero del 0 al 9: ");
            d = sc.nextInt();
            if (d < 0 || d > 9) {
                System.out.println("Error");
            }
        } while(d < 0 || d > 9);
        
        int contador = 0;
        int numero = n;
        while (numero > 0) {
            int digitoActual = numero % 10;
            if (digitoActual == d) {
                contador++;
            }
            numero /= 10;
        }
        
        int primeraCifra = n;
        
        while (primeraCifra >= 10) {
            primeraCifra /= 10;
        }
        int segundaCifra = n;
        while (segundaCifra >= 100) {
            segundaCifra /= 10;
        }
        segundaCifra %= 10;
        
        if (contador == 0) {
            System.out.println("El digito introducido no aparece ninguna vez en el numero " + n);
        } else {
            System.out.println("El digito " + d + " aparece " + contador + " veces en el numero " + n );
        }
        if (primeraCifra == d) {
            System.out.println("La primera cifra de " + n + " coincide con el digito " + d);
        } else {
            System.out.println("La primera cifra de " + n + " no coincide con el digito " + d);
        }
        if (segundaCifra == d) {
            System.out.println("La segunda cifra de " + n + " coincide con el digito " + d);
        } else {
            System.out.println("La segunda cifra de " + n + " no coincide con el digito " + d);
        }
    }
    
}
