/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author zerkje
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int numPerf = 1; numPerf <= 1000; numPerf++) {
            int suma = 0;
            for (int i = 1; i < numPerf; i++) {
                if (numPerf % i == 0) {
                    suma += i;
                }
            }
            if (suma == numPerf) {
                System.out.println(numPerf + " es perfecto");
            }
        }
    }  
}
