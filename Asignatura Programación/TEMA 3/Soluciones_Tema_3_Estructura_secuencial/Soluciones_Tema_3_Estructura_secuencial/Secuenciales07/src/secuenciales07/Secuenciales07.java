/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales07;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.print("Introduce un número entero: ");
        A = sc.nextInt(); //se lee el valor del radio por teclado

        System.out.print("Introduce otro número entero: ");
        B = sc.nextInt(); //se lee el valor del radio por teclado
        
        //mostrar los valores iniciales de las variables A y B
        System.out.println("Valores iniciales A = " + A + " B = " + B); 
        
        //intercambio de los valores de las variables
        //para el intercambio se utiliza una variable auxiliar que hemos llamado AUX aunque podemos darle cuarquier otro nombre: C, D VariableAuxiliar, ....
        int AUX = A;
        A = B;
        B = AUX;
        
        //mostrar los valores De las variables A y B tras realizar el intercambio
        System.out.println("Valores finales A = " + A + " B = " + B); 

    }

}
