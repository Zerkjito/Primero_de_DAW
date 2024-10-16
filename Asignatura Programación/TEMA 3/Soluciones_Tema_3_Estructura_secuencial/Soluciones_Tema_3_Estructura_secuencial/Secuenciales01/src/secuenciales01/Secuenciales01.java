/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales01;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales01 {

    public static void main(String[] args) {
        //declaración de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        
        //leer el primer número 
        System.out.print("Introduce un número entero: "); //muestra mensaje
        n1 = sc.nextInt();      //lee un entero por teclado
       
         
        //leer el segundo número
        System.out.print("Introduce otro número entero: "); //muestra mensaje
        n2 = sc.nextInt();      //lee un entero por teclado
        
        //mostrar resultado
        System.out.println("Ha introducido los números " + n1 + " y " + n2);
    }
    
}
