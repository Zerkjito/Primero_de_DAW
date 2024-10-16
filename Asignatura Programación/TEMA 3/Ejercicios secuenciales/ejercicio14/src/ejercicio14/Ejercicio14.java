/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double areaTriangulo, lado1, lado2, lado3, p;
        System.out.print("Por favor, introduzca la longitud del primer lado: ");
        lado1 = sc.nextDouble();
        System.out.print("Por favor, introduzca la longitud del segundo lado: ");
        lado2 = sc.nextDouble();
        System.out.print("Por favor, introduzca la longitud del terce lado: ");
        lado3 = sc.nextDouble();
        p = (lado1 + lado2 + lado3) / 2;
        areaTriangulo = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
        System.out.println("El area del triangulo es --> " + areaTriangulo);
        
        
       
       
    }
    
}
