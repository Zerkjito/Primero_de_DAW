/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados26;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, a, b;
        double resultado = 0;
        boolean sumar = true;
        
        do {
            System.out.print("Introduce un valor para N > 1: ");
            N = sc.nextInt();
            if(N <= 1){
                System.out.println("Debe ser > 1");
            }
        } while (N <= 1);
        
        do {
            System.out.print("Introduce el valor de a > 0: ");
            a = sc.nextInt();
            if(a <= 0){
                System.out.println("Debe ser > 0");
            }

        } while (a <= 0);
        
        do {
            System.out.print("Introduce el valor de b > 0: ");
            b = sc.nextInt();
            if(b <= 0){
                System.out.println("Debe ser > 0");
            }
        } while (b <= 0);
        
        //i es el término de la serie por el que vamos. Será desde 1 hasta N
        //j es el número que vamos a elevear a a o a b
        //j empieza en 1 que es el primer número de la serie y se va incrementando en 2: 1 3 5 7 9 ...
        for (int i = 1, j = 1; i <= N; i++, j += 2) {
            if (sumar) {//el boolean nos sirve para saber la operación que tenemos que realizar (*)
                resultado = resultado + Math.pow(j, a);
            } else {
                resultado = resultado - Math.pow(j, b);
            }
            sumar = !sumar; //aquí se cambia el valor del boolean para que en la siguiente vuelta del for se haga lo contrario
        }
        System.out.printf("Resultado: %.0f%n", resultado);
    }

}
//(*) A la variable boolean sumar le asignamos al principio el valor true
//    En cada iteración del for si sumar es true hay que sumar y si es false hay que restar
//    además según se ve en el enunciado cuando se suma, el número se eleva al valor de a
//    cuando se resta se elevaba a b
//    con la instrucción: sumar = !sumar; cambiamos el valor del boolean
//    Si vale true pasará a valer false y vicecersa
//    De esta forma en cada vuelta del for se realizará la suma o la resta de forma alternativa