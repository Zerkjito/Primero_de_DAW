/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio06 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = leerLista();
        mostrarLista("Lista introducida:",lista);
        ArrayList<Integer> listaOrdenada = separarNegativosYpositivos(lista);
        mostrarLista("Lista precedida por negativos y seguida de positivos:", listaOrdenada);
    }

    public static ArrayList<Integer> leerLista() {
        int n;
        ArrayList<Integer> l = new ArrayList<>();
        do {
            System.out.print("Añade un numero entero a la lista (0 para finalizar): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Añade un numero entero a la lista (0 para finalizar): ");
            }
            n = sc.nextInt();
            if (n != 0) {
                l.add(n);
            }
        } while (n != 0);
        return l;
    }

    public static ArrayList<Integer> separarNegativosYpositivos(ArrayList<Integer> lista) {
        ArrayList<Integer> negativos = new ArrayList<>();
        ArrayList<Integer> positivos = new ArrayList<>();
        for (Integer num : lista) {
            if (num > 0) {
                positivos.add(num);
            } else {
                negativos.add(num);
            }
        }
        negativos.addAll(positivos);
        return negativos;
    }
    
    public static void mostrarLista(String mensaje, ArrayList<Integer> l) {
        System.out.println();
        System.out.println(mensaje);
        System.out.println(l);
    }
}
