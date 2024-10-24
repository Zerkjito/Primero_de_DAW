/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva10;

/**
 *
 * @author enrique
 */
public class Repetitiva10 {

    public static void main(String[] args) {
        //////Sabemos que el primer par es 2 y el resto se obtienen sumando 2 por lo que
        //////este ejercicio se puede resolver de esta forma:
        System.out.println("Numeros pares entre 1 y 300: ");
        for (int i = 2; i <= 300; i += 2) {
            System.out.println(i);
        }

        //////Otra forma de hacerlo es comprobar para cada número desde 1 hasta 300 si es par
        //    for (int i = 1; i <= 300; i++) {
        //         if (i % 2 == 0) {
        //             System.out.println(i);
        //         }
        //    }
    }

}
