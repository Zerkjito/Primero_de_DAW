/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva25;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, mayor = 0, contador = 0, posicionMayor = 0;
        do {
            System.out.print("Introduce un número (0 para finalizar): ");
            N = sc.nextInt();
            if (N != 0) {
                contador++;
                if (contador == 1) { //si es el primer número introducido se toma como mayor
                    mayor = N;
                    posicionMayor = 1;
                } else if (N > mayor) { //si no es el primero se compara con el mayor actual (*)
                    mayor = N;
                    posicionMayor = contador;
                }
            }
        } while (N != 0);
        if (contador != 0) {
            System.out.println("Número mayor -> " + mayor);
            System.out.println("Introducido en la posición -> " + posicionMayor);
        } else {
            System.out.println("No se han introducido números");
        }
    }
}
/*
    (*)  El ejercicio pide que si el mayor se ha introducido varias veces mostremos la posición del primer introducido
         Para eso en la condición escribimos if(N > mayor)
         Si nos piden que mostremos la posición del último mayor introducido, la condición
         la debemos escribir así:   if(N >= mayor)
*/