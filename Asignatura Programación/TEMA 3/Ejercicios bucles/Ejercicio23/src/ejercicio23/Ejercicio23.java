/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        int contador = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        
        do {
            System.out.println("Introduce un numero: ");
            n = sc.nextDouble();
            if (n != 0) {
                contador++;
                if (n % 2 == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
            }
        } while (n != 0);
        if (contador > 0) {
            if (contadorPares > 0 && contadorImpares > 0) {
                if (contadorPares > contadorImpares) {
                    System.out.println("Se han introducido mas pares que impares");
                } else if (contadorPares < contadorImpares) {
                    System.out.println("Se han introducido mas impares que pares");
                } else if (contadorPares == contadorImpares) {
                    System.out.println("Se han introducido la misma cantidad de pares e impares");
                }
                
            } else if (contadorPares > 0 && contadorImpares == 0) {
                System.out.println("No se ha introducido ningun impar");
            } else if (contadorImpares > 0 && contadorPares == 0) {
                System.out.println("No se ha introducido ningun par");
            }
        } else {
            System.out.println("El primer numero introducido ha sido 0");
        }
    }

}
