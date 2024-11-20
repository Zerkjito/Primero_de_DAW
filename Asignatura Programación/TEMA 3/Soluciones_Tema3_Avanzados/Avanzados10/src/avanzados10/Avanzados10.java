/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados10;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados10 {

    public static void main(String[] args) {
        int numero, cifra, nuevoNumero;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        } while (numero <= 0);
        
        nuevoNumero = 0;
        
        while (numero != 0) {
            cifra = numero % 10;     // obtengo la ultima cifra
            numero = numero / 10;    // se la quito al número
            nuevoNumero = nuevoNumero * 10 + cifra; // se la añado al nuevo número
        }
        
        System.out.println("Número con las cifras invertidas :" + nuevoNumero);
    }
    
}
