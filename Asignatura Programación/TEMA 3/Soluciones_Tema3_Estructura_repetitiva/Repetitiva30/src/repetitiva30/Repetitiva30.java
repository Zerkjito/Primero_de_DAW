/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetitiva30;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Repetitiva30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cifras = 0; //cifras contendrá el número de cifras del número
        int aux; //esta variable la usaremos para contar las cifras del número
        int primera, ultima; //estas variables contendrán la primera cifra del número y la última

        //leer`por teclado el número positivo
        do {
            System.out.print("Introduce un número entero positivo: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Valor no válido. Debe introducir un número positivo");
            }
        } while (n <= 0);

        if (n < 10) {
            System.out.println("El número solo tiene una cifra");
        } else {
            //calcular el número de cifras del número
            aux = n; //asignamos el valor de n a la variable aux
            //esto es necesario ya que para calcular las cifras del número lo vamos a modificar dividiendolo entr 10 varias veces hasta llegar a 0
            while (aux != 0) {    //mientras al número le queden cifras
                aux = aux / 10;   //le quitamos al número la última cifra 
                cifras++;         //sumamos 1 al contador de cifras
            }

            //obtenemos la primera cifra del número. 
            //Para ello dividimos el número por 10 elevado al número de cifras-1
            //Si por ejemplo n = 78024 
            //El número de cifras es 5
            //para obtener la primera cifra (7) hay que dividir por 10000 -> 10 elevado a 4
            //Si n = 932
            //El número de cifras es 3
            //para obtener la primera cifra (9) hay que dividir por 100 -> 10 elevado a 2
            //En general para obtener la primera cifra de un númreo entero hay que dividir el número por 10 elevado a cifras-1
            primera = n / (int) Math.pow(10, cifras - 1);
            ultima = n % 10; //obtenemos la última cifra del número

            if (primera == ultima) {
                System.out.println("Primera y última cifra iguales");
            } else {
                System.out.println("Primera y última cifra distintas");
            }
        }
    }

}
