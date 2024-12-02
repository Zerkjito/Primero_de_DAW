/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contadorPos = 0, contadorNeg = 0;
        int mayor = 0;
        boolean negativo = false;
        boolean primerNum = true;
        
        do {
            System.out.print("Introduce un numero positivo o negativo (0 para finalizar): ");
            n = sc.nextInt();
            if (primerNum) {
                mayor = n;
                primerNum = false;
            } else if (n > mayor) {
                mayor = n;
            }
            
            if (n > 0) {
                contadorPos++;
            } else if (n < 0) {
              contadorNeg++;
              negativo = true;
            }
            
        } while (n != 0);
        System.out.println("El mayor numero introducido ha sido -> " + mayor);
        System.out.println("Se han introducido " + contadorPos + " numeros positivos");
        if (negativo) {
            System.out.println("Se han introducido numeros negativos");
        } else {
            System.out.println("No se han introducido numeros negativos");
        }
    }

}
