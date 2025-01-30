/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int [] contadorSuma = new int[19];
        int tiradas;

        System.out.print("Introduce numero de jugadas: ");
        tiradas = sc.nextInt();
        for (int i = 1; i <= tiradas; i++) {
            int res1 = rnd.nextInt(1, 6+1);
            int res2 = rnd.nextInt(1, 6+1);
            int res3 = rnd.nextInt(1, 6+1);
            
            int total = res1 + res2 + res3;
            
            contadorSuma[total]++;  // <-- Esto se encarga de incrementar el valor para el caso de suma que se haya dado, por ejemplo
                                        //si total es 3 se habra dado el caso de suma 3, que es indice 0, y despues
                                        //se incrementa en uno su contenido, asi sucesivamente para todos los casos desde 3 hasta 18, con el detalle de que
                                        //el indice 19 nunca se accede debido a que daria 19, y el maximo resultado de suma es 18.
        }
        
        for (int i = 3; i <= 18 ; i++) {    
            String veces = contadorSuma[i] == 1 ? "vez" : "veces"; // <-- Forma muy versátil de controlar el singular y plural
            System.out.println("Suma " + i + "-> " + contadorSuma[i] + " " + veces);                                                       
        }
        sc.close();
    }

}
