/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean coincide = false;
        int num, cifras = 0;
        do {
            do {
                System.out.print("Introduce un numero de 3 o mas cifras: ");
                num = sc.nextInt();
                if (num < 100 && num != 0) {
                    System.out.println("Error: el numero debe tener al menos 3 cifras");
                }
            } while (num < 100 && num != 0);
            int aux = num;
            while (aux >= 100) {
                aux/=10;
            }
            System.out.println(aux);
            
            System.out.print("Divisores: ");
            if (num != 0) {
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        System.out.print(i + " ");
                        if (i == aux) {
                            coincide = true;
                        }
                    }

                    
                }
                System.out.println();
                if (coincide) {
                    System.out.println("Las dos primeras cifras del numero SI coinciden con uno de sus divisores");
                } else {
                    System.out.println("Las dos primeras cifras del numero NO coinciden con nignuno de sus divisores");
                }
                coincide = !coincide;
                System.out.println();
            }
        } while (num != 0);
        System.out.println("Fin programa !");
        sc.close();
    }

}
