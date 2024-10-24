/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva26;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, numero;
        int positivos = 0;     // esta variable contará los números positivos
        int negativos = 0;     // esta variable contará los números negativos
        int ceros = 0;         // esta variable contará los ceros
        int primerPositivoDosCifras = 0, posicion = 0; //estas variables contendrán el primer número positivo de dos cifras y su posición
        boolean primero = true; //esta variable se utiliza para saber si un número de dos cifras es el primero introducido o no
        boolean pares = false;  //esta variable se utiliza para saber si entre los 5 primeros números introducidos hay algún número par
        boolean menores1000 = true; //esta variable se utiliza para saber si todos los números introducidos son menores que 1000 o no lo son
        
        //introducir la cantidad de números a leer
        do {
            System.out.print("Cantidad de números a introducir ( >0 ): ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Valor no válido. Debe ser > 0");
            }
        } while (N <= 0);
        
        //introducir los N números
        for (int i = 1; i <= N; i++) {
            
            System.out.print("Introduce numero " + i + ": ");
            numero = sc.nextInt();
            
            if (numero > 0) {
                positivos++;
                if(numero > 9 && numero < 100 && primero){ //si tiene dos cifras y es el primero introducido
                    primerPositivoDosCifras = numero;
                    posicion = i;
                    primero = false;
                }
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
            
            if(i <= 5 && numero % 2 == 0){ //si estamos introduciendo uno de los 5 primeros números y el número que se ha introducido es par
                pares = true;
            }
            
            if(numero >= 1000){ 
                menores1000 = false; 
            }
        }
        
        //mostrar resultados
        System.out.println("\nSe han introducido:");
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        if(positivos > 0){
            if(posicion == 0){
                System.out.println("No se han introducido números positivos de dos cifras");
            }else{
                System.out.println("Primer positivo de dos cifras: " + primerPositivoDosCifras + " en la posición " + posicion);
            }
        }
        if(pares){
            System.out.println("Entre los 5 primeros números introducidos hay algún número par");
        }else{
            System.out.println("Entre los 5 primeros números introducidos no hay números pares");
        }
        if(menores1000){
            System.out.println("Todos los números introducidos son menores que 1000");
        }else{
            System.out.println("Se han introducido números mayores o iguales a 1000");
        }
    }

}
