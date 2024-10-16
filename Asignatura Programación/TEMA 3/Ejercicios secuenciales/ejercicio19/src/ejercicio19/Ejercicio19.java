/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, primeraCifra, segundaCifra, terceraCifra, cuartaCifra, quintaCifra;
        System.out.print("Por favor, introduzca un numero entero de 5 cifras: ");
        numero = sc.nextInt();
        primeraCifra = numero / 10000;
        segundaCifra = numero / 1000;
        terceraCifra = numero / 100;
        cuartaCifra = numero / 10;
        quintaCifra = numero;
        System.out.println(primeraCifra);
        System.out.println(segundaCifra);
        System.out.println(terceraCifra);
        System.out.println(cuartaCifra);
        System.out.println(quintaCifra);

        
        
    }
    
}
