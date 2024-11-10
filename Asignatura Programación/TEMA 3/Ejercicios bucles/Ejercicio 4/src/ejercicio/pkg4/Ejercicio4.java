/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        while (n >= 1) {
            System.out.println(n--);
            n = sc.nextLine().toUpperCase().charAt(0);
        }
    }
    
}
