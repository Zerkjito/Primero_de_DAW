/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados27;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, a, b;
        double resultado = 0;
        boolean sumar = true;
        
        do {
            System.out.print("Introduce el valor de N > 1: ");
            N = sc.nextInt();
            if (N <= 1) {
                System.out.println("Debe ser > 1");
            }
        } while (N <= 1);
        
        do {
            System.out.print("Introduce el valor de a > 1: ");
            a = sc.nextInt();
            if (a <= 1) {
                System.out.println("Debe ser > 1");
            }
        } while (a <= 1);
        
        do {
            System.out.print("Introduce el valor de b > 1: ");
            b = sc.nextInt();
            if (b <= 1) {
                System.out.println("Debe ser > 1");
            }
        } while (b <= 1);
        
        for (int i = 1; i <= N; i++) {  //(*)
            if (sumar) {
                resultado = resultado + Math.pow(i, a) / Math.pow(2 * i, b);
            } else {
                resultado = resultado - Math.pow(i, b) / Math.pow(2 * i, a);
            }
            sumar = !sumar;
        }
        System.out.printf("Resultado: %.4f%n", resultado);
    }

}
// (*) Si nos fijamos en el ejemplo, se trata de sumar y restar fraciones de forma alternativa
//     Para saber si hay que sumar o restar se utiliza la variable boolean sumar. En el ejercicio 26 se explica como funciona
//     Además en el ejemplo podemos ver que el numerador de las fraciones es la secuencia 1 2 3 4 5 6 7 ....
//     que coincide con el valor de i, por lo que para el numerador puedo utilizar la i
//     En el denominador la secuencia de números es 2 4 6 8 10 ....
//     puedo tener una variable que empiece en 2 y le vamos sumando 2 en cada vuelta del for
//     o podemos hacer como en la solución ya que esos valores son el doble de lo que vale i en cada momento