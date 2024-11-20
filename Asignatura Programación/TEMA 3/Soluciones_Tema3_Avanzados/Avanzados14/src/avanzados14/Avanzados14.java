/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados14;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados14 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        int cont = 0;      //variable para contar los números introducidos en secuencia ascendente
        int anterior = 0;  //variable donde se guarda el numero leído anterior al actual. 

        do {

            do {//introducimos por teclado un número positivo
                System.out.print("Introduce numero positivo: ");
                num = sc.nextInt();
                if (num <= 0) {
                    System.out.println("Debe ser > 0");
                }
            } while (num <= 0);

            if (num >= anterior) { //si el numero leido es mayor o igual que el anterior
                anterior = num;   //se guarda el numero que acabamos de leer como anterior
                cont++;          //se incrementa el contador de números introducidos
            }

        } while (num >= anterior);   // el do while acaba cuando se lee un numero menor que el anterior

        System.out.println("El número que rompe la secuencia ascendente es " + num);
        System.out.println("Cantidad de números introducidos en secuencia ascendente: " + cont);
    }

}
