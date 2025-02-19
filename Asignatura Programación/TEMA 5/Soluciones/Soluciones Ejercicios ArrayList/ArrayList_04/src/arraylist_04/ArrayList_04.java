/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArrayList_04 {

    public static void main(String[] args) {
        //se crean los 3 ArrayList
        ArrayList<Double> V1 = new ArrayList<>();
        ArrayList<Double> V2 = new ArrayList<>();
        ArrayList<Double> V3 = new ArrayList<>();

        //introducir elementos en ArrayList V1
        System.out.println("Lectura de datos del ArrayList V1");
        leerArray(V1);

        //introducir elementos en ArrayList V2
        System.out.println("Lectura de datos del ArrayList V2");
        leerArray(V2);

        mezclarArrays(V1, V2, V3);

        System.out.println("ArrayList V1: ");
        mostrar(V1);
        System.out.println("ArrayList V2: ");
        mostrar(V2);
        System.out.println("ArrayList V3: ");
        mostrar(V3);
    }

    //método que lee valores por teclado y los añade al ArrayList que recibe como parámetro
    public static void leerArray(ArrayList<Double> v) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Introduce número (<0 para acabar): ");
        n = sc.nextDouble();
        while (n >= 0) {
            v.add(n);
            System.out.print("Introduce número (<0 para acabar): ");
            n = sc.nextDouble();
        }
    }

    //método que recibe tres ArrayList a, b y c
    //mezcla el contenido de a y b en el ArrayList c
    public static void mezclarArrays(ArrayList<Double> a, ArrayList<Double> b, ArrayList<Double> c) {
        Iterator<Double> it1 = a.iterator();
        Iterator<Double> it2 = b.iterator();
        while (it1.hasNext() && it2.hasNext()) { //mientras haya elementos en los dos arrays
            c.add(it1.next());
            c.add(it2.next());
        }
        //El while anterior se ejecuta mientras haya elementos en los dos arrays
        //cuando acaba el while anterior pueden quedar elementos en el array a o en el b
        while (it1.hasNext()) { //si quedan elementos en a se pasan a c
            c.add(it1.next());
        }
        while (it2.hasNext()) { //si quedan elementos en b se pansa a c
            c.add(it2.next());
        }
    }

    //método para mostrar el ArrayList
    public static void mostrar(ArrayList<Double> v) {
        for (Double v1 : v) {
            System.out.print(v1 + " ");
        }
        System.out.println();
    }
}
