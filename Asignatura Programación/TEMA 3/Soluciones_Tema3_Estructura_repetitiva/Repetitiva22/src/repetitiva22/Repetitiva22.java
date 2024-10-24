/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva22;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0, multiplos = 0, primerMultiplo3 = 0;
        double suma = 0;
        boolean primero = true; //variable que utulizaremos para saber si un múltiplo de 3 es el primero introducido
        
        //lectura de números enteros. finaliza cuando se introduce un número <= 0
        do {
            System.out.print("Introduce un número entero (<= 0 para finalizar): ");
            n = sc.nextInt();
            if (n > 0) { //si el número introducido es > 0
                contador++;  //se incrementa la variable contador. Esta variable contendrá la cantidad total de números introducidos
                if (n % 3 == 0) { //si el número es múltiplo de 3
                    multiplos++;  //se incrementa la variable multiplos. Esta variable contendrá la cantidad de números múltiplos de 3 introducidos
                    suma += n;    //Se acumula el número introducido. La variable suma contendrá la suma de todos los números múltiplos de 3 introducidos
                    if (primero) { //si la variable boolean primero es true significa que es el primer múltiplo de 3 que se ha introducido
                        primerMultiplo3 = n; //guardamos el número en la variable primerMultiplo3
                        primero = false; //ponemos la variable boolean a false para que no se vuelva a entrar en este if
                    }
                }
            }
        } while (n > 0);
        
        //mostramos mensajes
        if (contador > 0) {
            System.out.println("Números introducidos: " + contador);
            if (multiplos > 0) {
                System.out.println("Múltiplos de 3 introducidos: " + multiplos);
                System.out.printf("Suma de los múltiplos de 3: %.0f%n", suma);
                System.out.printf("Media de los múltiplos de 3: %.2f%n", suma / multiplos);
                System.out.println("Primer múltiplo de 3 introducido: " + primerMultiplo3);
            } else {
                System.out.println("No se han introducido múltiplos de 3");
            }

        }else{
            System.out.println("El primer número introducido ha sido <= 0");
        }
    }
}
