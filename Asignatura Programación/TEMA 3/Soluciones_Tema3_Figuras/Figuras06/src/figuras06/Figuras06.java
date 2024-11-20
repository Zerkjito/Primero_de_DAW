/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras06;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Figuras06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, cont = 1;
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        } while (filas <= 0);
        for (int i = 1; i <= filas; i++) { //filas
            for (int j = i; j <= filas; j++) { //columnas. 
                System.out.print(cont % 10 + " ");
                cont++;
            }
            System.out.println();
        }
        //En esta figura el número de columnas de cada fila aparece de la siguiente forma:
        //En la primera fila hay tantas columnas como número de filas
        //En cada una de las filas siguientes hay una columna menos
        //hasta llegar a la última que solo tiene una columna
        //para conseguirlo, en el for para las columnas se escribe como valor valor inicial de j el número de la fila correspondiente por la que vamos
        //de esta forma si por ejemplo filas = 5
        //la primera fila tendrá 5 columnas: for(j = 1; mientras que j <= 5; j++)
        //la segunda fila tendrá 4 columnas: for(j = 2; mientras que j <= 5; j++)
        //la tercera fila tendrá 3 columnas: for(j = 3; mientras que j <= 5; j++) 
        //etc.
        //si no lo ves claro realiza la traza para entender el funcionamiento
    }

}
