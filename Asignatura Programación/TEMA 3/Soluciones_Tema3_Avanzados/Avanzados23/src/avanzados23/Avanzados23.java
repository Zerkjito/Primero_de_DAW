/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados23;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados23 {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int N;
        String respuesta;
        
        do {
            N = rnd.nextInt(10, 1001); //obtenemos un número aleatorio entre 10 y 1000 ambos incluidos 
            System.out.println("\nTabla del " + N);
            System.out.println("---------------------");
            for (int i = 1; i <= 10; i++) {//mostramos la tabla del número N
                System.out.printf("%2d * %2d = %4d%n", N, i, N * i);
            }
            System.out.println();
            do {
                System.out.print("Mostrar otra tabla (SI/NO): ");
                respuesta = sc.nextLine();
                if(!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO")){
                    System.out.println("Debe introducir SI/NO");
                }
            } while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO"));
            
        } while (respuesta.equalsIgnoreCase("SI"));//repetir el primeco mientras la respuesta sea SI
    }

}
