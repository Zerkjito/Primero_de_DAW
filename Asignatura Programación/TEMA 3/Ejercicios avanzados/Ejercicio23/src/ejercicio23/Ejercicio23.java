/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author zerkje
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int num;
        char seguir;
        do {
            num = rnd.nextInt(10, 1000 + 1);
            System.out.println("Tabla de multiplicar del numero " + num + ":\n");

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
            System.out.print("\nMostrar otra trabla?(SI/NO) ");
            seguir = sc.next().toUpperCase().charAt(0);
        } while (seguir == 'S');
        System.out.println("Fin programa. Gracias!");
    }

}
