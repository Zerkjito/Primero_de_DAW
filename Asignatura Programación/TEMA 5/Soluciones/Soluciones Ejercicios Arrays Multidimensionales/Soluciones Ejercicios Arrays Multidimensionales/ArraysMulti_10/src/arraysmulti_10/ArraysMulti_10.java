/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_10;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //creamos el array de tipo boolean
        //el valor inicial de los elementos de un array de tipo boolean es false
        boolean[] numeros = new boolean[101];
        int n, cont = 0;
        double suma = 0;
        
        do {
            System.out.print("Introduce número entre 1 y 100 (0 para finalizar): ");
            n = sc.nextInt();
            if (n != 0) {
                if (n < 1 || n > 100) {
                    System.out.println("Valor no válido");
                } else if (numeros[n]) { //if numeros[n] == true significa que ya se ha introducido ese número anteriormente
                    System.out.println("Valor repetido");
                } else {
                    numeros[n] = true; //utilizamos el número introducido como índice del array y asignamos el valor true a ese elemento 
                }
            }
        } while (n != 0);
        
        //mostramos los valores que se han introducido
        //Si un elemento del array tiene el valor true se muestra su indice
        System.out.println("Valores introducidos:");
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i]) {
                System.out.print(i + " ");
                suma = suma + i;
                cont++;
            }
        }
        System.out.println("\nSuma: " + suma);
        System.out.printf("Media: %.2f%n", suma / cont);

    }
}
