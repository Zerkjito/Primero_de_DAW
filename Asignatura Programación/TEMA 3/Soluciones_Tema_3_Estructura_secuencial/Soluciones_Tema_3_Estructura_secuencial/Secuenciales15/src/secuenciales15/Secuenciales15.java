/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales15;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales15 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int A, B, C, AUX;
        System.out.print("Introduzca valor de A: ");
        A = sc.nextInt();
        System.out.print("Introduzca Valor de B: ");
        B = sc.nextInt();
        System.out.print("Introduzca Valor de C: ");
        C = sc.nextInt();
        System.out.println("Valores iniciales: A = " + A + "   B = " + B + "   C = " + C);
        
        //instrucciones para hacer el intercambio
        //se utiliza una variable auxiliar
        AUX = B;
	B = A;                                                  
	A = C;
        C = AUX;
        
	System.out.println("Valores intercambiados: A = " + A + "   B = " + B + "   C = " + C);
    }
    
}
