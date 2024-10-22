/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n, contador = 1;
//        System.out.print("Por favor, introduzca un número: ");
//        n = sc.nextInt();
//        while (contador <= n)
//        {
//            System.out.println(contador++);
//        }

//        Scanner sc = new Scanner(System.in);
//        int n, contador = 1;
//        System.out.print("Por favor introduzca un número: ");
//        n = sc.nextInt();
//        do {
//            System.out.println(contador++);
//        } while(contador <= n);

        Scanner sc = new Scanner(System.in);
        int n, contador;
        System.out.print("Por favor introduzca un número: ");
        n = sc.nextInt();
        for(contador = 1; contador <= n; contador++) {
            System.out.println(contador);
        }
    }
    
}
