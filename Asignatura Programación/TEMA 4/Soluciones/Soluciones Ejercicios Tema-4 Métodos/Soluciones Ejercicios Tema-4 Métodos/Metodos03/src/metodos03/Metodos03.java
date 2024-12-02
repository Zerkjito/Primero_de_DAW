/*
 *3. Escribe un método que reciba un número entero 
  y devuelva el número de cifras que tiene.
 */
package metodos03;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Introduce número: ");
        x = sc.nextInt();
        System.out.println("El número " + x + " tiene " + contarCifras(x) + " cifras");
    }
    
    
    //método que recibe un entero y devuelve el número de cifras que tiene
    public static int contarCifras(int n){
        int contador = 0;
        while(n != 0){
            n = n / 10;
            contador++;
        }
        return contador;
    }
    
}
