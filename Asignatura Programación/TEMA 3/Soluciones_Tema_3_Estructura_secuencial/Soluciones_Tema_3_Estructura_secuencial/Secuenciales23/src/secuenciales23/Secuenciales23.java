/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales23;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;

        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt();
        System.out.print("Introduzca valor de M: ");
        M = sc.nextInt();

        N = N / (int) Math.pow(10, M); //Math.pow devuelve un número de tipo double
        //es necesario convertirlo a int para hacer la 
        //división entre enteros
        System.out.println("Número modificado " + N);
    }

}
