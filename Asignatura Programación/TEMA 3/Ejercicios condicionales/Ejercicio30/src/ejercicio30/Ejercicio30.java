/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1, lado2, lado3;
        
        System.out.print("Introduce el primer lado: ");
        lado1 = sc.nextInt();
        System.out.print("Introduce el segundo lado: ");
        lado2 = sc.nextInt();
        System.out.print("Introduce el tercer lado: ");
        lado3 = sc.nextInt();
        
        int suma1 = lado2 + lado3;
        int suma2 = lado1 + lado3;
        int suma3 = lado2 + lado1;
        
        if (lado1 > suma1 || lado2 > suma2 || lado3 > suma3) {
            System.out.println("Algun lado es mayor que la suma de los otros lados");
        } else {
            System.out.println("Pueden formar un triangulo");
        }
        
    }
    
}
