/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados22;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados22 {

    public static void main(String[] args) {
        int num, i, aux, contadorCifras, cifra;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce numero entero positivo (0 para finalizar): ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Número no válido");
            } else if (num != 0) {

                //contamos las cifras del número
                aux = num;
                contadorCifras = 0;
                while (aux != 0) {
                    aux = aux / 10;
                    contadorCifras++;
                }

                aux = num; //volvemos a guardar el número en una variable auxiliar para trabajar con ella
                for (i = contadorCifras - 1; i >= 0; i--) {
                    cifra = aux / (int) Math.pow(10, i); //obtenemoso la primera cifra del número (la del la izquierda)
                    //mostramos la cifra con su nombre
                    switch (cifra) {
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
                    if (i != 0) { //si no es la última cifra mostramos un guion a continuación del nombre de la cifra
                        System.out.print(" - ");
                    }
                    aux = aux % (int) Math.pow(10, i); //quitamos al número su primera cifra
                }
                System.out.println();
            }
        } while (num != 0); //el proceso se repite mientras no se introduzca un cero

        System.out.println("Fin de programa");
    }

}
