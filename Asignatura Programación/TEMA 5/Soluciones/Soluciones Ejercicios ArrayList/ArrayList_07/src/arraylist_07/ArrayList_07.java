/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_07;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author enrique
 */
public class ArrayList_07 {
    //Para probar el método vamos a utilizar:
    //- un ArrayList con números aleatorios distintos entre 0.0 y 2.0 con un decimal
    //  la cantidad de números que vamos a guardar en el ArrayList también lo vamos
    //  a obtener de forma aleatoria.
    //- Dos números double obtenidos de forma aleatoria entre 0.0 y 2.0

    public static void main(String[] args) {
        Random rnd = new Random();
        double A, B;
        ArrayList<Double> numeros = new ArrayList<>();
        llenarConAleatoriosDouble(numeros);
        do {
            A = rnd.nextDouble() * (2);//double aleatorio entre 0.0 y 2.0
            A = Math.floor(A * 10) / 10;//truncar el número para que solo tenga una cifra decimal
            B = rnd.nextDouble() * (2);
            B = Math.floor(B * 10) / 10;//truncar el número para que solo tenga una cifra decimal
        } while (A == B); //los números A y B deben ser distintos
        //mostramos el ArrayList y los dos números
        System.out.println("ArrayList: ");
        System.out.println(numeros);
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        metodo(numeros, A, B);//este método es el que pide el ejercicio

        //mostramos el ArrayList modificado después de haberse ejecutado el método
        System.out.println("ArrayList modificado: ");
        System.out.println(numeros);

    }

    public static void llenarConAleatoriosDouble(ArrayList<Double> x) {
        Random rnd = new Random();
        int N = rnd.nextInt(10) + 1;//cantidad total de números aleatorios entre 1 y 10
        double aleatorio;
        for (int i = 0; i < N; i++) {//obtener N números aleatorios
            do {
                aleatorio = rnd.nextDouble() * (2);//double aleatorio entre 0.0 y 2.0 
                aleatorio = Math.floor(aleatorio * 10) / 10;//para truncar el número aleatorio a una cifra decimal
            } while (x.contains(aleatorio));//si el ArrayList ya contiene el número se obtiene otro
            x.add(aleatorio);
        }
    }

    //
    //--->>> Este método es el que pide el ejercicio
    //
    public static void metodo(ArrayList<Double> numeros, double A, double B) {
        double mayor, menor;
        if (numeros.contains(A) || numeros.contains(B)) { //Si contiene uno de los dos o los dos números
            if (numeros.contains(A)) {
                numeros.remove(A);
            }
            if (numeros.contains(B)) {
                numeros.remove(B);
            }
        } else { ///Si no contiene ninguno de los dos números
            ////calculamos cual es el mayor y el menor
            if (A > B) {
                mayor = A;
                menor = B;
            } else {
                mayor = B;
                menor = A;
            }
            numeros.add(0, mayor); //añadimos el mayor al principio
            numeros.add(menor); //añadimos el menor al final
        }
    }
}
