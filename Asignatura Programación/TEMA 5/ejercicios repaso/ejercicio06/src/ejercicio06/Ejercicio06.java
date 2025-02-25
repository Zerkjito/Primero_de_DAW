/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zerkje
 */
public class Ejercicio06 {

    /**
     6. Escribe un método que reciba dos ArrayList A y B con elementos de tipo entero. El ArrayList A no contiene valores
repetidos. El método modifica los ArrayList de esta forma:
Se obtiene el mayor elemento de A y se suma este valor a todos los elementos del array B.
Se obtiene la suma de los elementos de B y se sustituye el valor del elemento mayor de A por la suma de los
elementos de B.
Ejemplo: ArrayList A = [2, 5, -4, 3, 10, -5, -15, -3]
ArrayList B = [8, 4, 3, 10, 1]
Mayor de A = 10
Nuevo contenido del ArrayList B = [18, 14, 13, 20, 11]
Suma de los elementos de B = 76
Se sustituye el mayor de A (10) por la suma de B (76):
ArrayList A = [2, 5, -4, 3, 76, -5, -15, -3]
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista1.add(2);
        lista1.add(5);
        lista1.add(-4);
        lista1.add(3);
        lista1.add(10);
        lista1.add(-5);
        lista1.add(-15);
        lista1.add(-3);

        lista2.add(8);
        lista2.add(4);
        lista2.add(3);
        lista2.add(10);
        lista2.add(1);
        
        modificarListas(lista1, lista2);
    }
    
    public static void modificarListas(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        int mayor1 = l1.get(0);
        for (Integer num : l1) {
            if (num > mayor1) {
                mayor1 = num;
            }
        }
        System.out.println("ArrayList A: " + l1);
        System.out.println("ArrayList B: " + l2);
        System.out.println("Mayor de A: " + mayor1);
        
        for (int i = 0; i < l2.size(); i++) {
            l2.set(i, l2.get(i) + mayor1);
        }

        System.out.println("Nuevo contenido del ArrayList B: " + l2);
        
        int suma = 0;
        for (Integer num : l2) {
            suma+=num;
        }
        System.out.println("Suma de los elementos de B: " + suma);
        
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) == mayor1) {
                l1.set(i, suma);
            }
        }
        System.out.println("ArrayList A modificado: " + l1);
    }
    
}