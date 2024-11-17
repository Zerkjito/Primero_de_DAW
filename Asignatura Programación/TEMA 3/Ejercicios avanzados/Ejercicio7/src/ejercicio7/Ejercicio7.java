/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fact = 0, resultado = 1;
        System.out.print("Introduce hasta que numero quieres verificar: ");
        fact = sc.nextLong();
        
        for (int i = 1; i <= fact; i++) {
            resultado *= i;
            System.out.println(i + "! = " + resultado);
        }        
    }
    
}
