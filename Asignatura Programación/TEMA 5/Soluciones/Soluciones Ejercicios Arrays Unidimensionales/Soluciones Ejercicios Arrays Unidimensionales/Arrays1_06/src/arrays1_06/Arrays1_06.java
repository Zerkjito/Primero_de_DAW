/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /* 
 * Arrays1_06 Escribe un programa que lea 20 enteros y los guarde en un array. 
 * Calcula y muestra el mayor y el menor elemento y qué posición ocupan 
 * dentro del array.
 */
package arrays1_06;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays1_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, mayor, menor, posMayor, posMenor;

        int[] numeros = new int[20];

        System.out.println("Lectura de los elementos del array: ");
        //se lee el primer elemento del array y se guarda como mayor y menor
        //------------------------------------------------------------------------------------
        System.out.print("numeros[" + i + "]= ");
        numeros[i] = sc.nextInt();

        //El primer elemento se toma como mayor y menor
        mayor = numeros[i];
        menor = numeros[i];

        //se toma la posición 1 como posición del mayor y del menor
        posMayor = posMenor = 1;
        //
        //La línea anterior se llama asignación múltiple.
        //El lo mismo que hacer:
        //posMayor = 1;
        //posMenor = 1;
        //
        //------------------------------------------------------------------------------------

        //Se leen el resto de números
        for (i = 1; i < numeros.length; i++) { //desde el segundo elemento (i = 1) hasta el final del array
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();//se lee el número por teclado
            if (numeros[i] > mayor) { //si el número introducido es mayor que el mayor actual se guarda como mayor junto con su posición
                mayor = numeros[i];
                posMayor = i;
            } else if (numeros[i] < menor) { //si es menor que el menor actual se guarda como menor junto con su posición
                menor = numeros[i];
                posMenor = i;
            }
        }

        //Mostrar resultados
        System.out.println("El mayor es: " + mayor + " en la posicion " + posMayor);
        System.out.println("El menor es: " + menor + " en la posicion " + posMenor);

    }

}
