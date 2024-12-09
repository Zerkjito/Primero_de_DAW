/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Introduce el numero A: ");
        a = sc.nextInt();
        System.out.print("Introduce el numero B: ");
        b = sc.nextInt();
        
        System.out.println(a + " * " + b + " = " + calcularProducto (a, b));
        
    }
    static int calcularProducto(int a, int b) {
        int resultado = 0;
        boolean esNegativo = false;
        
        if (a < 0 && b >= 0 || a >= 0 && b < 0) {
            esNegativo = true;
        }
        
        a = Math.abs(a);
        b = Math.abs(b);
        
        for (int i = 0; i < b; i++) {
            resultado+=a;    
        }
        if (esNegativo) {
            resultado = -resultado;
        }
        
        return resultado;
    }
    
}
