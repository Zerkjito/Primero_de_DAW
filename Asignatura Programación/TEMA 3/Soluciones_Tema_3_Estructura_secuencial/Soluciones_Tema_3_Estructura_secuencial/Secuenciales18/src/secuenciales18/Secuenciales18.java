/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales18;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        
        System.out.print("Introduzca número de 4 cifras: ");
        N = sc.nextInt(); //supondremos que el número introducido tiene 4 cifras
        
	System.out.println("Primera cifra de " + N + " -> " + N/1000);
        System.out.println("Última cifra de " + N + "  -> " + N%10);
    }
    
}
