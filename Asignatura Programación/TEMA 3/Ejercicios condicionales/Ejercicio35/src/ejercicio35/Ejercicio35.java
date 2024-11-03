/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio35;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Introduzca primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo numero: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer numero: ");
        n3 = sc.nextInt();
        
        if (n1 == n2 && n1 == n3) {
            System.out.println("Todos iguales");
        } else if (n1 == n2) {
            System.out.println("Primero y segundo iguales");
        } else if (n1 == n3) {
            System.out.println("Primero y tercero iguales");
        } else if (n2 == n3) {
            System.out.println("Segundo y tecero iguales");
        } else {
            System.out.println("Todos distintos");
        }
        
    }
    
}
