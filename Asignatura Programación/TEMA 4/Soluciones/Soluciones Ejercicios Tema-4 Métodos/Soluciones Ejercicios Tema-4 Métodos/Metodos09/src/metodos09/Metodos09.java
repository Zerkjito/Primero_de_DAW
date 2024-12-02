/*
 9. Escribe un método que compruebe si un carácter que se le pasa como 
    parámetro es una vocal o no. El método devolverá true si es una vocal 
    o false si no lo es.
 */
package metodos09;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter;
        System.out.print("Introduce un carácter: ");
        caracter = sc.nextLine().charAt(0);
        if (esVocal(caracter)) {
            System.out.println("Es vocal");
        } else {
            System.out.println("No es vocal");
        }
    }

    //método que recibe un carácter y comprueba si es una vocal
    public static boolean esVocal(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
        }
        return false;
    }

}
