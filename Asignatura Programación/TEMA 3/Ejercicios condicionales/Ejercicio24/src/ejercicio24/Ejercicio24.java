/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.print("Introduce una nota: ");
        nota = sc.nextDouble();
        int notaEntera = (int) nota;
        
        switch (notaEntera) {
            case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente");
            case 5, 6 -> System.out.println("Suficiente");
            case 7, 8 -> System.out.println("Notable");
            case 9 -> System.out.println("Sobresaliente");
            case 10 -> System.out.println("Matricula de honor");
            default -> System.out.println("Nota no valida");
        }
        
    }
    
}
