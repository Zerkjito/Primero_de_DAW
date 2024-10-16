/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Por favor, introduzca un año: ");
        año = sc.nextInt();
        System.out.println(año + (año % 4 == 0 && año % 100 != 0 || año % 400 == 0 ? " es bisiesto " : " no es bisiesto "));
    }
    
}
