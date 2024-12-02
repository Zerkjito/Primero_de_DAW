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
        int operacion;
        char respuesta;

        do {
            System.out.print("Introduce el primero numero: ");
            n1 = sc.nextDouble();
            System.out.print("Introduce el segundo numero: ");
            n2 = sc.nextDouble();

            do {

                do {
                    System.out.println("1 -> Sumar");
                    System.out.println("2 -> Restar");
                    System.out.println("3 -> Multiplicar");
                    System.out.println("4 -> Dividir");
                    System.out.print("Elige opcion: ");
                    operacion = sc.nextInt();
                    if (operacion < 1 || operacion > 4) {
                        System.out.println("Elige una opcion correcta");
                    }
                } while (operacion < 1 || operacion > 4);

                switch (operacion) {
                    case 1:
                        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                        break;
                    case 4:
                        if (n2 != 0) {
                            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                            break;
                        } else {
                            System.out.println("Error. No se puede dividir por cero");
                        }

                }
                
                sc.nextLine();
                do {
                    System.out.print("Deseas mantener los mismo numeros? ");
                    respuesta = sc.nextLine().toUpperCase().charAt(0);
                } while (respuesta != 'S' && respuesta != 'N');
            } while (respuesta == 'S');
            do {
                System.out.print("Deseas leer mas numeros? ");
                respuesta = sc.nextLine().toUpperCase().charAt(0);
            } while (respuesta != 'S' && respuesta != 'N');
        } while (respuesta == 'S');
        System.out.println("Fin programa, gracias.");
    }

}
