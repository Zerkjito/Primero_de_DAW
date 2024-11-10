/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos, horas;
        
        System.out.print("Introduce minutos: ");
        minutos = sc.nextInt();
        
        horas = minutos / 60;
        
        if (minutos % 60 != 0) {
            horas++;
        }
        System.out.printf("El precio final es de %.2f euros\n", horas * 1.50);

    }
    
}
