/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados18;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados18 {

    public static void main(String[] args) {
        int num, aux, posicionMayor, cifra, mayor, pos, numCifras;
        String respuesta;
        Scanner sc = new Scanner(System.in);
        do {
            
            do {
                System.out.print("Introduce numero entero >0: ");
                num = sc.nextInt();
                if(num <= 0){
                    System.out.println("Debe ser > 0");
                }
            } while (num <= 0);

            aux = num; //guardamos en número introducido en una variable auxiliar
            //obtenemos el número de cifras que tiene el número introducido
            numCifras = 0;
            while (aux != 0) {
                numCifras++;
                aux = aux / 10;
            }

            mayor = 0;//Esta variable contendrá el valor de la cifra mayor. Inicialmente le damos el valor 0 que es el menor valor de cualquier cifra del número.
            posicionMayor = 0; //variable que contendrá la posición donde se encuentra la cifra mayor del número
            pos = 0; //variable que contendrá la posición de la cifra con la que estamos trabajando 
            
            for(int i = numCifras-1; i >= 0; i--){ 
                pos++;
                cifra = num / (int)Math.pow(10, i); //obtenemos la primera cifra de la izquierda del número
                if (cifra > mayor) { //si es mayor que la mayor actual
                    mayor = cifra; // la tomamos como nueva mayor
                    posicionMayor = pos; //y guardamos su posición
                }
                num = num % (int)Math.pow(10, i); //le quitamos al número su primera cifra de la izquierda.
            }
            
            //mostramos la cifra mayor con su nombre
            System.out.print("Cifra mayor: ");
            switch (mayor) {
                case 0 -> System.out.print("cero ");
                case 1 -> System.out.print("uno ");
                case 2 -> System.out.print("dos ");
                case 3 -> System.out.print("tres ");
                case 4 -> System.out.print("cuatro ");
                case 5 -> System.out.print("cinco ");
                case 6 -> System.out.print("seis ");
                case 7 -> System.out.print("siete ");
                case 8 -> System.out.print("ocho ");
                case 9 -> System.out.print("nueve ");
            }
            
            //mostramos la posición de la cifra mayor
            System.out.println(" Posición: " + posicionMayor);
            
            sc.nextLine();//limpiamos el buffer
            
            do {//preguntar si queremos leer otro número controlando que solo sean válidas las respuestas SI o NO tanto en mayúsculas como en minúsculas
                System.out.print("Leer otro número (SI/NO)? :");
                respuesta = sc.nextLine();
            } while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO"));
            
        } while (respuesta.equalsIgnoreCase("SI")); //repetimos el proceso si la respuesta es SI
    }
    
}
