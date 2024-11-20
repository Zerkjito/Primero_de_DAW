/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados24;

import java.util.Random;

/**
 *
 * @author enrique
 */
public class Avanzados24 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int N, cifras, aux, primeraCifra, ultimaCifra;
        do {
            N = rnd.nextInt(1000, 1000000); //obtenemos al azar un número entre 100 y 999999 (número de entre 3 y 6 cifras)
            System.out.print(N);//lo mostramos por pantalla
            if (N % 10 != 0) {//si la última cifra del número no es cero 
                
                //calculamos las cifras que tiene el número
                cifras = 0;
                aux = N;
                while (aux != 0) {
                    aux = aux / 10;
                    cifras++;
                }
           
                primeraCifra = N / (int) Math.pow(10, cifras - 1);//obtenemos la primera cifra
                ultimaCifra = N % 10;//obtenemos la última
                if (primeraCifra == ultimaCifra) {
                    System.out.println(" -> Primera y última cifra iguales");
                } else {
                    System.out.println(" -> Primera y última cifra distintas");
                }
            }
        } while (N % 10 != 0);//repetimos el proceso mientras la última cifra del número obtenido sea distinta de cero
        System.out.println(" -> Fin programa");
    }

}
