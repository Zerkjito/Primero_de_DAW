/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados25;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class Avanzados25 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int N, cifra1, cifra2, cifra3;
        boolean repetir;
        do {
            repetir = false;
            N = rnd.nextInt(100, 1000); //obtenemos un número de tres cifras
            cifra1 = N / 100; //obtenemos cada una de las cifras del número
            cifra2 = N / 10 % 10;
            cifra3 = N % 10;
            if (cifra1 == cifra2 || cifra1 == cifra3 || cifra2 == cifra3) {//comprobamos si hay alguna repetida
                repetir = true;
            }
        } while (repetir);//mientras se obtenga un número con cifras repetidas

        System.out.println("Número obtenido: " + N);

    }

}
