/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio02 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        ArrayList<Integer> nums = new ArrayList<>();
        do {
            System.out.print("Introduce un numero (-99 para finalizar): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida");
                sc.nextLine();
                System.out.print("Introduce un numero (-99 para finalizar): ");
            }
            n = sc.nextInt();
            if (n != -99) {
                nums.add(n);
            }
        } while (n != -99);
        mostrarStats(nums);
    }

    public static void mostrarArrList(ArrayList<Integer> al) {
        System.out.println("\nValores introducidos");
        System.out.println(al);
    }

    public static void mostrarStats(ArrayList<Integer> al) {
        int mayorMedia = 0;
        if (!al.isEmpty()) {
            mostrarArrList(al);
            System.out.println("Total numeros introducidos: " + al.size());
            int suma = calcularSuma(al);
            System.out.println("Suma de los numeros introducidos: " + suma);

            double media = suma / al.size();
            for (Integer a : al) {
                if (a > media) {
                    mayorMedia++;
                }
            }
            int menorMedia = al.size() - mayorMedia;
            System.out.println("Media de los numeros introducidos: " + media);
            System.out.println("Cantida de mayores que la media: " + mayorMedia);
            System.out.println("Cantida de menores que la media: " + menorMedia);
        } else {
            System.out.println("No se han introducido numeros");
        }

    }

    public static int calcularSuma(ArrayList<Integer> al) {
        int suma = 0;
        for (Integer a : al) {
            suma += a;
        }
        return suma;
    }
}
