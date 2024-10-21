/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos;
        
        System.out.print("Por favor, introduzca las horas: ");
        horas = sc.nextInt();
        System.out.print("Por favor, introduzca los minutos: ");
        minutos = sc.nextInt();
        System.out.print("Por favor, introduzca los segundos: ");
        segundos = sc.nextInt();
        if (horas > 23 || minutos > 59 || segundos > 59) {
            System.out.println("Hora no válida.");
        } else {
            System.out.println("Hora válida.");
        }
    }
    
}
