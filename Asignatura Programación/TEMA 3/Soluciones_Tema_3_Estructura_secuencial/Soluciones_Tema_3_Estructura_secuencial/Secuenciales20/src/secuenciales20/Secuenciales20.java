/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales20;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca Número de 5 cifras: ");
        N = sc.nextInt();  //supondremos que el número introducido tiene 5 cifras
        System.out.println(N % 10);
        System.out.println(N % 100);
        System.out.println(N % 1000);
        System.out.println(N % 10000);
        System.out.println(N);
    }

}
