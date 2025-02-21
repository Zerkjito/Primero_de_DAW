/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio07 {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d1, d2;
        ArrayList<Double> listaAleatoria = generarListaAleatoria();
        d1 = generarNumAleatorio();
        d2 = generarNumAleatorio();
        System.out.println("Lista original:");
        System.out.println(listaAleatoria);
        System.out.println("\nValor de A -> " + d1);
        System.out.println("Valor de B -> " + d2);
        modificarLista(listaAleatoria, d1, d2);
        System.out.println("\nLista modificada:");
        System.out.println(listaAleatoria);
    }

    public static ArrayList<Double> generarListaAleatoria() {
        double aleatorio;
        ArrayList<Double> l = new ArrayList<>();
        for (int i = 0; i < rnd.nextInt(3, 10 + 1); i++) {
            aleatorio = rnd.nextDouble(0.0, 2.0);
            aleatorio = Math.floor(aleatorio * 10) / 10;
            l.add(aleatorio);
        }
        return l;
    }

    public static double generarNumAleatorio() {
        double num = rnd.nextDouble(0.0, 2.0);
        return Math.floor(num * 10) / 10;
    }

    public static void modificarLista(ArrayList<Double> lista, double d1, double d2) {
        boolean contieneA = lista.contains(d1);
        boolean contieneB = lista.contains(d2);

        if (contieneA) {
            lista.remove(d1);
        }
        
        if (contieneB) {
            lista.remove(d2);
        }
        
        if (!contieneA && !contieneB) {
            double mayor = Math.max(d1, d2);
            double menor = Math.min(d1, d2);
            lista.add(0, mayor);
            lista.add(menor);
        }
    }

}
