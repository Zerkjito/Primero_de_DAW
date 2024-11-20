/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados11;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados11 {

    public static void main(String[] args) {
         int N, cifra, uno, dos, aux, contadorTotal = 0;
        Scanner sc = new Scanner(System.in);

        do {
            do {  //se repite mientras no sea un entero de 4 cifras o un cero
                System.out.print("Introduce un numero de 4 cifras (0 para acabar): ");
                N = sc.nextInt();
                if(N != 0 && (N < 1000 || N > 9999)){
                    System.out.println("Debe tener 4 cifras");
                }
            } while (N != 0 && (N < 1000 || N > 9999));

            if (N != 0) {   //si no se ha leido un cero se realiza el proceso

                uno = dos = 0; //contadores a cero. 
                //Esto se llama asignación múltiple. 
                //es lo mismo que hacer:
                //uno = 0;
                //dos = 0;

                aux = N; //guardamos el valor de N en una variable auxiliar
                while (aux != 0) {//se obtiene cada cifra del número y se comprueba si es 1 o 2 
                    cifra = aux % 10;
                    if (cifra == 1) {
                        uno++;
                    } else if (cifra == 2) {
                        dos++;
                    }
                    aux = aux / 10;
                }

                if (uno == 0 || dos == 0) {
                    System.out.println("El número debe contener al menos un 1 y un 2");
                } else if (uno > dos) {
                    contadorTotal++;
                    System.out.println("El número tiene más 1 que 2");
                } else if (uno < dos) {
                    System.out.println("El número tiene más 2 que 1");
                } else {
                    System.out.println("Hay igual 1 que 2");
                }
            }
        } while (N != 0);
        System.out.println("Ha introducido " + contadorTotal + " números en los que hay más 1 que 2");
    }
    
}
