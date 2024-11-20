/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados16;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, mayor;
        boolean negativo = false;

        //Lectura del primer número 
        System.out.print("Introduce número, para acabar introduce 0: ");
        n = sc.nextInt(); 

        mayor = n; //guardamos el primer número introducido como el mayor

        while (n != 0) { //mientras el número introducido no sea 0
            if (n > mayor) { //si el número introducido es mayor que el mayor actual
                mayor = n;  //se toma como nuevo mayor
            }
            if (n < 0) {          //si es negativo
                negativo = true;  //saignamos a la variable boolean el valor true para indicar que hay un negativo 
            }
            System.out.print("Introduce número, para acabar introduce 0: ");
            n = sc.nextInt(); //leemos el siguiente número
        }

        if (mayor == 0) {//si mayor es cero significa que el primer número que se ha introducido ha sido el cero y por lo tanto el programa ha finalizado
            System.out.println("El primer número introducido ha sido el cero");
        } else {
            System.out.println("El mayor número introducido ha sido: " + mayor);
            if (negativo) { //compruebo si se ha leído algún negativo. Es lo mismo que escribir if(negativo == true)
                System.out.println("Se han introducido números negativos");
            } else {
                System.out.println("No se han introducido números negativos");
            }
        }
    }

}
