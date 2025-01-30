/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /* 
 * Arrays1_10 Programa que lea una serie de valores numéricos desde el teclado, 
 * la lectura termina cuando se introduzca -99. A continuación imprimir: 
 * el número de valores leídos, su suma, su media. Por último se mostrarán todos
 * los valores leídos, indicando cuántos de ellos son mayores que la media.
 * Para hacer este ejercicio, cono no sabemos a priori cuántos números se van a
 * introducir, tendremos que crear un array de un tamaño que consideremos 
 * suficiente. Al introducir cada número tendremos que comprobar que queda 
 * espacio en el array por lo tanto la lectura de números finaliza cuando se
 * introduzca -99 o cuando el array ya esté lleno.
 */
package arrays1_10;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //como no sabemos cuántos números se van a introducir
        //fijamos el número máximo de elementos que podremos leer por ejemplo en 100
        //y creamos un array de ese tamaño
        //Utilizamos una constante llamada LIMITE que tendrá el tamaño del array creado
        //Utilziando una constante nos facilita el trabajo si en algún momento 
        //queremos cambiar el tamaño del array. Bastará con cambiar el valor 
        //asignado a la constante pero no será necesario modificar nada en el 
        //resto del código.
        final int LIMITE = 100;
        int[] numeros = new int[LIMITE];

        int i = 0, cont = 0;
        double suma = 0, media;
        System.out.println("Lectura de numeros (maximo " + LIMITE + ")");
        System.out.println("Para dejar de introducir numeros escriba -99");
        System.out.print("Numero " + (i + 1) + ": ");
        numeros[i] = sc.nextInt();
        while (numeros[i] != -99 && i < LIMITE) {
            suma = suma + numeros[i];
            i++; 
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        if (i == 0) { //la variable i contiene el número de elementos introducidos en el array
            System.out.println("El primer valor introducido ha sido -99.");
        } else {
            media = suma / i;

            System.out.println("Valores leidos:");
            for (int k = 0; k < i; k++) {  //el array contiene i valores
                System.out.print(numeros[k] + " ");
                if (numeros[k] > media) {
                    cont++;
                }
            }
            System.out.println();
            System.out.println("Numero de valores leidos: " + i);
            System.out.println("Suma: " + suma);
            System.out.printf("Media: %.2f %n", media);
            System.out.println("Hay " + cont + " numeros mayores que la media");
        }

    }

}
