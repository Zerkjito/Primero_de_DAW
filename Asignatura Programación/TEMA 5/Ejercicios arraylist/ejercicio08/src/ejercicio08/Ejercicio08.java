/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author zerkje
 */
public class Ejercicio08 {
    static Random rnd = new Random();
    static int[] a = new int[rnd.nextInt(2, 12+1)];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = crearLista();
        llenarArray(a);
        System.out.println("Array original:");
        mostrarArr(a);
        System.out.println("\nLista original:");
        System.out.println(lista);
        modificarOrden(a, lista);
        System.out.println("\nLista modificada:");
        System.out.println(lista);
        
        
    }
    
    public static void mostrarArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    
    public static ArrayList<Integer> crearLista() {
        ArrayList<Integer> l = new ArrayList<>();
        int tamaño = rnd.nextInt(2, 12+1);
        for (int i = 0; i < tamaño; i++) {
            l.add(rnd.nextInt(1, 20+1));
        }
        return l;
    }
    
    public static void llenarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 20+1);
        }
    }
    
    public static void modificarOrden(int[] arr, ArrayList<Integer> lista) {
        boolean ocurrenciaBorrada = false;
        int mayor = arr[0];
        
        for (int num : arr) {
            if (num > mayor) {
                mayor = num;
            }
        }
        
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            int numero = it.next();
            if (numero == mayor) {
                it.remove();
                ocurrenciaBorrada = true;
            }
        }
        
        if (!ocurrenciaBorrada) {
            if (lista.size() < 5) {
                lista.add(mayor);
            } else {
                lista.add(0, mayor);
            }
        }
    }
    
}
