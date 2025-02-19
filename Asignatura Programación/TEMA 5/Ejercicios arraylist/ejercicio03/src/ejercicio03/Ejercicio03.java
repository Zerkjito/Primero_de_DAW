/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio03 {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = generarArrList();
        girarDerecha(lista);
        System.out.println("ArrayList despues de mover 1 elemento a la derecha: " + lista);
        
    }
    
    public static ArrayList<Integer> generarArrList() {
        ArrayList<Integer> al = new ArrayList<>();
        int n;
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
    
    public static void girarDerecha(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            return;
        }
        int ultimoElemento = lista.remove(lista.size() - 1);
        lista.add(0, ultimoElemento);
    }
    
    
}
