/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/* 
 * Arrays1_03 Programa que crea un array de 20 elementos y guarde los 20
 * primeros números pares. Mostrar por pantalla el contenido del array creado
 */

package arrays1_03;

/**
 *
 * @author enrique
 */
public class Arrays1_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea el array de 20 elementos de tipo int
        int[] pares = new int[20];
        
        //A cada elemento se le asigna un número par
        //--->>> Consideramos el 0 como el primer número par
        for (int i = 0; i < pares.length; i++) {
            pares[i] = 2*i;
        }
        
        //Se muestra el array
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }

    }
    
}
