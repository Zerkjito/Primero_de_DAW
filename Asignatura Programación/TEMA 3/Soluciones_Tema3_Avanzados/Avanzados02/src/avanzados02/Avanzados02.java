/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados02;

/**
 *
 * @author enrique
 */
public class Avanzados02 {

    public static void main(String[] args) {
        int i, j, suma;
        System.out.println("Números perfectos desde 1 hasta que 1000: ");
        for (i = 1; i <= 1000; i++) { // i es el número que vamos a comprobar si es perfecto o no
            suma = 0;                 //para cada número inicializamos la suma de sus divisores
            for (j = 1; j < i; j++) { // j son los divisores. Se divide desde 1 hasta i-1 
                if (i % j == 0) {
                    suma = suma + j;  // si j es divisor de i se suma
                }
            }
            if (i == suma) {          // si el numero es igual a la suma de sus divisores es perfecto
                System.out.println(i);
            }
        }
    }

}
