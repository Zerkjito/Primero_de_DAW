/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio37;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e, f, aux;

        System.out.print("Introduce el valor A: ");
        a = sc.nextDouble();
        System.out.print("Introduce el valor B: ");
        b = sc.nextDouble();
        System.out.print("Introduce el valor C: ");
        c = sc.nextDouble();
        System.out.print("Introduce el valor D: ");
        d = sc.nextDouble();
        System.out.print("Introduce el valor E: ");
        e = sc.nextDouble();
        System.out.print("Introduce el valor F: ");
        f = sc.nextDouble();
        
        aux = a * e - b * d;
        
        if (aux == 0) {
            System.out.println("El sistema no tiene solucion");
        } else {
            double x = (c * e - b * f) / aux;
            double y = (a * f - c * d) / aux;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

    }

}
