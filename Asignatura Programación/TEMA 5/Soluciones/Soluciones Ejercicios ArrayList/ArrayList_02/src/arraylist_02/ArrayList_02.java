/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArrayList_02 {

    public static void main(String[] args) {
        ArrayList<Integer> array = leerValores();
        double suma = calcularSuma(array);
        mostrarResultados(array, suma);
    }

    //método que crea un ArrayList de tipo Integer
    //pide por teclado números enteros y los almacena en el ArrayList
    //cuando finaliza la lectura de números devuelve el ArrayList
    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> valores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce entero. -99 para acabar: ");
        n = sc.nextInt();
        while (n != -99) {
            valores.add(n);
            System.out.print("Introduce entero. -99 para acabar: ");
            n = sc.nextInt();
        }
        return valores;
    }

    //método que calcula y devuelve la suma de los elementos de un ArrayList de enteros que recibe como parámetro
    //en este método el ArrayList se recorre con un iterador
    public static double calcularSuma(ArrayList<Integer> valores) {
        double suma = 0;
        Iterator<Integer> it = valores.iterator();
        while (it.hasNext()) {
            suma = suma + it.next();
        }
        return suma;
    }

    //método para mostrar resultados por pantalla
    public static void mostrarResultados(ArrayList<Integer> valores, double suma) {
        if (!valores.isEmpty()) { //si el ArrayList contiene alementos
            int cont = 0;
            System.out.println("Valores introducidos: ");
            System.out.println(valores);
            System.out.println("Suma: " + suma);
            double media = suma /valores.size();
            System.out.printf("Media: %.2f %n", media);
            for (Integer i : valores) {
                if (i > media) {
                    cont++;
                }
            }
            System.out.println(cont + " valores superiores a la media");
        } else {
            System.out.println("No se han introducido valores");
        }
    }
    
}
