/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contadorMayoresUno = 0;
        while (true) {
            System.out.print("Introduce un numero de 4 cifras (0 para salir): ");
            n = sc.nextInt();
            
            if (n == 0) {
                break;
            }
            
            if (n >= 1000 && n <= 9999) {
                int contadorUnos = 0; 
                int contadorDoses = 0;
                int aux = n;
                boolean tieneUno = false;
                boolean tieneDos = false;
                
                while (aux > 0) {
                    int cifra = aux % 10;
                    if (cifra == 1) {
                        contadorUnos++;
                        tieneUno = true;
                    } else if (cifra == 2) {
                        contadorDoses++;
                        tieneDos = true;
                    }
                    aux/=10;
                }
                
                if (tieneUno && tieneDos) {
                    if (contadorUnos > contadorDoses) {
                        System.out.println(n + " tiene mas unos (1) que doses (2)");
                        contadorMayoresUno++;
                        System.out.println();
                    } else if (contadorDoses > contadorUnos) {
                        System.out.println(n + " tiene mas doses (2) que unos (1)");
                        System.out.println();
                    } else {
                        System.out.println(n + " tienen la misma cantidad de unos que doses");
                        System.out.println();
                    }
                } else {
                    System.out.println(n + " no tiene al menos un 1 y un 2 para comparar");
                    System.out.println();
                }
                
            } else {
                System.out.println("El numero no tiene 4 cifras. Intentalo de nuevo");
                System.out.println();
            }
        }
        System.out.println("Numeros introducidos con mas unos que doses: " + contadorMayoresUno);

    }

}