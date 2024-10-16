/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;


/**
 *
 * @author zerkje
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grados, F;
        System.out.println("Por favor, introduzca los grados centígrdos");
        grados = sc.nextDouble();
        F = 32 + 9 * grados / 5;
        System.out.println(grados + " ºC -> " + F + "ºF");
    }
    
}
