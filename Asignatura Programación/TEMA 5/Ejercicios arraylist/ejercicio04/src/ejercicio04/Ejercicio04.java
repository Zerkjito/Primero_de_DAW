/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio04 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Valores para la lista 1:");
        ArrayList<Double> lista1 = leerLista();
        System.out.println("\nValores para la lista 2:");
        ArrayList<Double> lista2 = leerLista();
        System.out.println("\nLista 1:");
        mostrarLista(lista1);
        System.out.println("\nLista 2:");
        mostrarLista(lista2);
        ArrayList<Double> listaFusionada = fusionarListas(lista1, lista2);
        System.out.println("\nLista fusionada:");
        mostrarLista(listaFusionada);
    }

    public static ArrayList<Double> leerLista() {
        ArrayList<Double> al = new ArrayList<>();
        double n;
        do {
            System.out.print("Introduce un numero entero (0 para finalizar): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada inválida");
                sc.nextLine();
                System.out.print("Introduce un numero entero (0 para finalizar): ");
            }
            n = sc.nextInt();
            if (n != 0) {
                al.add(n);
            }
        } while (n != 0);
        return al;
    }

    public static ArrayList<Double> fusionarListas(ArrayList<Double> l1, ArrayList<Double> l2) {
        ArrayList<Double> l3 = new ArrayList<>();
        if (l1.isEmpty() || l2.isEmpty()) {
            System.out.println("Valores vacios.");
            return l3;
        }

        int maxLength = Math.max(l1.size(), l2.size());
        for (int i = 0; i < maxLength; i++) {
            if (i < l1.size()) {
                l3.add(l1.get(i));
            }
            if (i < l2.size()) {
                l3.add(l2.get(i));
            }
        }
        return l3;
    }

    public static void mostrarLista(ArrayList<Double> l) {
        if (l.isEmpty()) {
            System.out.println("La lista esta vacía");
        } else {
            System.out.println(l);
        }
    }

}
