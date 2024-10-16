/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales12;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosC, gradosR, gradosK;
        
        System.out.print("Introduzca grados centígrados: ");
        gradosC = sc.nextDouble();
        
        gradosR = 0.8 * gradosC;
        gradosK = gradosC + 273.15;
        
        System.out.printf("\n%.2f ºC equivalen a %.2f ºR y a %.2f ºK \n", gradosC, gradosR, gradosK);
    }
    
}
