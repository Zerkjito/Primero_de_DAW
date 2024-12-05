/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author zerkje
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int num, primerDigito, segundoDigito, ultimoDigito;
        
        do {
            num = rnd.nextInt(100, 1000);
            primerDigito = num / 100;
            segundoDigito = (num / 10) % 10;
            ultimoDigito = num % 10;
        } while (primerDigito == segundoDigito || segundoDigito == ultimoDigito || primerDigito == ultimoDigito);
        System.out.println("Digito generado con 3 cifras distintas: " + num);
        sc.close();
    }


}
