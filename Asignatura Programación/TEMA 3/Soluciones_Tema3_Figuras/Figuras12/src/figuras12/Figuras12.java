/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras12;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras12 {

    public static void main(String[] args) {
        int filas, cont = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce número de filas (2 - 9): ");
            filas = sc.nextInt();
        } while (filas < 2 || filas > 9);

        for (int i = filas; i >= 1; i--) { //filas
            for (int j = 1; j <= filas; j++) { //columnas
                if (i == j) {
                    System.out.print(cont++ + " ");
                    //System.out.print((filas - i + 1) + " "); //forma alternativa para mostrar el número sin usar un contador
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        //En este ejercicio se trata de escribir en la diagonal inversa del cuadrado un valor empezando por 1.
        //Una forma de saber cuando nos encontramos en la diagonal inversa es hacer el for de las filas "al revés"
        //Es decir, darle a i como valor inicial el número de filas y terminar este for cuando i sea igual a 0
        //El for de las columnas empieza en 1 y termina cuando j sea mayor que el número de columnas
        //Si por ejemplo filas = 5 los valores de i serán 5,4,3,2,1,0
        //y para cada valor de i los valores de j serán   1,2,3,4,5,6
        //de esta forma podemos saber si estamos en la diagonal inversa preguntado si i == j
        //El valor numérico a mostrar lo obtenemos de un contador que incrementamos en 1 cada vez que se muestra
        //También podemos obtener el valor a mostrar mediante esta operación: filas - i + 1 y no tendríamos el contador
        //Realiza la traza si no te ha quedado claro el funcionamiento.

    }
    
}
