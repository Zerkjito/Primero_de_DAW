/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int contador, vueltas;
        System.out.print("Por favor, introduzca una cadena de caraceteres: ");
        cadena = sc.nextLine();
        System.out.print("Por favor, introduzca el numero de veces que desea repetirlo: ");
        contador = sc.nextInt();
        for (vueltas = 1; vueltas <= contador; vueltas++) {
            System.out.println(cadena);
        }
        
        
    }
    
}
