/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, resultado = 0;
        int operacion = 0, modalidad = 0;
        char respuesta, respuestaConfig;

        do {
            if (operacion == 0) {
                
            }
            System.out.print("Primer numero: ");
            n1 = sc.nextDouble();
            System.out.print("Segundo numero: ");
            n2 = sc.nextDouble();

            System.out.println("Elige una operacion 1.Suma | 2.Resta | 3.Multiplicacion | 4.Division");
            operacion = sc.nextInt();

            switch (operacion) {
                case 1:
                    resultado = n1 + n2;
                    break;
                case 2:
                    resultado = n1 - n2;
                    break;
                case 3:
                    resultado = n1 * n2;
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Error. No se puede dividir entre 0");                        
                    }
                    resultado = n1 / n2;
                    break;
            }
            System.out.printf("El resultado es %.2f%n", resultado);
            System.out.print("Leer mas numeros (S/N)? ");
            respuesta = sc.next().toUpperCase().charAt(0);
            if (respuesta == 'S') {
                System.out.print("Deseas mantener los mismos numeros? ");
                respuestaConfig = sc.next().toUpperCase().charAt(0);
                if (respuestaConfig == 'N') {
                    operacion = 0;
                }
            }
        } while (respuesta == 'S');
    }

}
