/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados08;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados08 {

    public static void main(String[] args) {
        int num, numCifras, aux, i, digito;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
            if(num <= 0){
                System.out.println("El número debe ser > 0");
            }
        } while (num <= 0);

        //tenemos que calcular el número de cifras que tiene el número
        aux = num;     // copiamos el número en una variable auxiliar
        numCifras = 0; // numCifras es un contador. Contendrá el número de cifras que tiene el número

        //para contar las cifras dividimos el número entre 10. El resultado de esa división
        //se vuelve a dividir entre 10, etc. Las divisiones acaban cuando el resultado es cero
        //En cada división se suma 1 al contador.
        while (aux != 0) {
            aux = aux / 10;
            numCifras++;
        }

        for (i = numCifras - 1; i >= 0; i--) {
            digito = num / (int) Math.pow(10, i); // obtengo la primera cifra de num
            System.out.print(digito + " ");     //  se muestra la cifra por pantalla
            num = num % (int) Math.pow(10, i); // quito esa cifra a num y se repite el proceso
        }
    }

}
