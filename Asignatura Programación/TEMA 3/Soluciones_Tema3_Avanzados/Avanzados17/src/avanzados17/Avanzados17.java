/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados17;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados17 {

    public static void main(String[] args) {
        int num, aux, posicionMayor, cifra, mayor, pos;
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
            mayor = 0; //Esta variable contendrá el valor de la cifra mayor. Inicialmente le damos el valor 0 que es el menor valor de cualquier cifra del número.
            posicionMayor = 0; //variable que contendrá la posición donde se encuentra la cifra mayor del número
            pos = 0; //variable que contendrá la posición de la cifra con la que estamos trabajando 
            
            while (aux != 0) {
                pos++;
                cifra = aux % 10;//obtenemos la última cifra del número (la de la derecha)
                if (cifra >= mayor) { //si la cifra es mayor o igual que la mayor actual 
                    mayor = cifra; // la tomamos como nueva mayor
                    posicionMayor = pos; //y guardamos su posición
                }
                aux = aux / 10; //le quitamos al número su última cifra de la derecha. Se repite el proceso mientras al número le queden cifras (aux!=0)
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
