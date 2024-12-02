/*
 11. Escribe un método que reciba un número entero y muestre todas las tablas
 de multiplicar desde la tabla del 2 hasta la tabla del número recibido.
 */
package metodos11;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce número >= 2: ");
            n = sc.nextInt();
        } while (n < 2);
        tablasDeMultiplicar(n);
    }
    
    //método que muestra las tablas de multiplicar desde la tabla del 2 hasta la tabla del número que recibe como parámetro
    public static void tablasDeMultiplicar(int N){
        System.out.println("Tabas del multiplicar desde la tabla del 2 hasta la tabla del " + N);
        for(int i = 2; i <= N; i++){
            System.out.println("Tabla del " + i);
            System.out.println("------------------");
            for(int j = 1; j <= 10; j++){
                System.out.printf("%4d * %2d = %4d%n", i, j, i*j);
            }
            System.out.println();
        }
    }

}
