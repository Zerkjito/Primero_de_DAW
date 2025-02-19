/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArrayList_06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        int N, i, numero;
        do {
            System.out.print("Cuantos elementos tendrá el ArrayList (>0)? ");
            N = sc.nextInt();
        } while (N <= 0);

        System.out.println("Elementos del ArrayList a: ");
        for (i = 1; i <= N; i++) {  //llenamos el ArrayList A
            System.out.print("Elemento " + i + ": ");
            A.add(sc.nextInt());
        }

        //creamos un ArrayList auxiliar copia del original
        ArrayList<Integer> aux = new ArrayList<>(A);
        for (i = 0; i < aux.size(); i++) { //recorremos el array aux
            numero = aux.get(i);
            if (numero < 0) {   //si el valor es negativo
                B.add(numero);  //se añade al array B
                aux.remove(i);  //y se elimina del array aux
                i--;
            }
        }
        B.addAll(aux); //se añaden al final de B los que quedan en aux (los positivos)

////////////////////////////////////////////////////////////////////////////////
//        Forma clásica de resolverlo: Hacer dos recorridos sobre el ArrayList
//        en el primero se pasan los negativos y en el segundo los positivos
//
//        for (i = 0; i < N; i++) { //recorremos el array A para pasar a B los negativos
//            if (A.get(i) < 0) {   //si el valor es negativo
//                B.add(A.get(i));  //se añade al array B
//            }
//        }
//        for (i = 0; i < N; i++) { //recorremos el array A para pasar a B los positivos
//            if (A.get(i) >= 0) {   //si el valor no es negativo
//                B.add(A.get(i));  //se añade al array B
//            }
//        }
////////////////////////////////////////////////////////////////////////////////
        System.out.println("ArrayList A: ");
        System.out.println(A);
        System.out.println("ArrayList B: ");
        System.out.println(B);

    }

}
