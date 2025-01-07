/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        
        System.out.print("Introduce el numero A: ");
        a = sc.nextDouble();
        System.out.print("Introduce el numero B: ");
        b = sc.nextDouble();
        
        String resultado = devolverTresDecimales(a, b);
        System.out.println(resultado);
        
    }
    
    public static String devolverTresDecimales (double a, double b) {
        return String.format("a = %.3f b = %.3f", a, b).replace('.', ',');
        
    }
    
}
