/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasofigura;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class RepasoFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = leerNumero();
        System.out.println(filas);
        


        
    }
    
    public static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce numero mayor a 0: ");
        while (!sc.hasNextInt() || (n = sc.nextInt()) <= 0) {
            System.out.println("Error. Caracter o numero invalido");
            sc.nextLine();
            System.out.println("Introduce numero mayor a 0: ");
        }
        return n;
    }
    
}
