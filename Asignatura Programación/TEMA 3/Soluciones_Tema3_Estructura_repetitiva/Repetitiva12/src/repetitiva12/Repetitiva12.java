/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva12;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        String texto;
        System.out.print("Introduce un texto: ");
        texto = sc.nextLine();
        System.out.print("Introduce un número de veces a repetir: ");
        N = sc.nextInt();
        System.out.println("Texto repetido " + N + " veces");
        for (int i = 1; i <= N; i++) {
            System.out.println(texto);
        }
    }
    
}
