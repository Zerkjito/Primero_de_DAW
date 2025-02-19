/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArrayList_03 {

    public static void main(String[] args) {
        ArrayList<Integer> A = leerArray();
        mostrar(A);

        //Se resulve el ejercicio de dos formas
        //1-> desplazar los elementos utilizando el método clásico
        desplazarDerecha(A);
        mostrar(A);

        //2-> desplazar los elementos utilizando solo los métodos de ArrayList
        desplazarDerecha2(A);
        mostrar(A);
    }

    //método que crea un ArrayList de enteros y lo llena de valores que se introducen por teclado
    //al finalizar la lectura de números el método devuelve el ArrayList
    public static ArrayList<Integer> leerArray() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int N;
        do {
            System.out.print("Número de elementos del array (>0): ");
            N = sc.nextInt();
        } while (N <= 0);
        for (int i = 1; i <= N; i++) {
            System.out.print("elemento " + i + " = ");
            numeros.add(sc.nextInt());
        }
        return numeros;
    }

    //1-> método clásico: 
    //guardamos en un auxiliar el elemento que se encuantra en la última posición del ArrayList 
    //desplazamos todos los elementos una posición a la derecha
    //finalmente modificamos el primer elemento del ArrayList sustituyéndolo por el valor guardado en el auxiliar
    public static void desplazarDerecha(ArrayList<Integer> a) {
        int i;
        int aux = a.get(a.size() - 1); //guardamos el último elemento en una variable auxiliar
        for (i = a.size() - 1; i > 0; i--) { //for para desplazar los elementos
            a.set(i, a.get(i - 1)); //a cada elemento se le asigna el anterior
        }
        a.set(0, aux); //asignamos al primer elemento el valor guardado en aux
    }

    //2-> Utilizando métodos de ArrayList: 
    //guardamos el último elemento en un auxiliar
    //insertamos este elemento al principio
    //eliminamos el último elemento
    public static void desplazarDerecha2(ArrayList<Integer> a) {
        int aux = a.get(a.size() - 1);
        a.add(0, aux);
        a.remove(a.size() - 1);
    }

    //método para mostrar el ArrayList
    public static void mostrar(ArrayList<Integer> a) {
        System.out.println(a);
    }

}
