/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, primerMult=0;
        int contador = 0;
        int contadorMult3 = 0;
        double sumaMultiplos = 0;
        boolean encontrado = false;
        do {
            System.out.print("Por favor, introduzca un numero: ");
            n = sc.nextDouble();

            if (n > 0) {
                contador++;
                if (n % 3 == 0 && n != 0) {
                    contadorMult3++;
                    sumaMultiplos += n;

                    if (!encontrado) {
                        primerMult = n;
                        encontrado = true;
                    }
                }
            }

        } while (n > 0);
        
        if (contador > 0) {
            System.out.println("Numeros introducidos: " + contador);
            if (contadorMult3 > 0) {
                System.out.println("Multiplos de 3introducidos: " + contadorMult3);
                System.out.printf("Media de multiplos introducidos: %.2f%n", sumaMultiplos / contadorMult3);
                System.out.println("Primer multiplo de 3 introducido: " + primerMult);
            } else {
                System.out.println("No se ha introducido ningun multiplo de 3");
            }
            
        } else {
            System.out.println("El primer numero introducido ha sido <= 0");
        }

    }

}
