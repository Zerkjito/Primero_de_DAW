/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados09;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados09 {

   
    public static void main(String[] args) {
        int num, numCifras, aux, i, digito, cifra;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
            if(num <= 0){
                System.out.println("Debe ser > 0");
            }
        } while (num <= 0);

        do {
            System.out.print("Introduce cifra (0 a 9): ");
            cifra = sc.nextInt();
            if(cifra < 0 || cifra > 9){
                System.out.println("Debe ser de 0 a 9");
            }
        } while (cifra < 0 || cifra > 9);

        //calcular el número de cifras que tiene el número
        aux = num;     // copiamos el número en una variable auxiliar
        numCifras = 0; // contendrá el número de cifras que tiene el número
        while (aux != 0) {
            aux = aux / 10;
            numCifras++;
        }

        for (i = numCifras - 1; i >= 0; i--) {
            digito = num / (int) Math.pow(10, i); // obtengo la primera cifra de num
            if (digito == cifra) { // la comparo con la cifra leida
                System.out.print("*"); // si es igual escribo *
            } else {
                System.out.print(digito);     // sino escribo el digito
            }
            num = num % (int) Math.pow(10, i); // quito la cifra a num y se repite el proceso
        }
        System.out.println();
    }
    
}
