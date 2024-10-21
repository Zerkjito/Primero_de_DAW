/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        
        System.out.print("Por favor, introduzca un número del mes: ");
        mes = sc.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("El valor introducido es incorrecto.");
        } else {
            if (mes == 1) {
                System.out.println("El número introducido corresonde a enero. No es un mes de 30 días.");
            } else if (mes == 2) {
                System.out.println("El número introducido corresonde a febrero. No es un mes de 30 días.");
            } else if (mes == 3) {
                System.out.println("El número introducido corresonde a marzo. No es un mes de 30 días.");
            } else if (mes == 4) {
                System.out.println("El número introducido corresonde a abril. Es un mes de 30 días.");
            } else if (mes == 5) {
                System.out.println("El número introducido corresonde a mayo. No es un mes de 30 días.");
            } else if (mes == 6) {
                System.out.println("El número introducido corresonde a junio. Es un mes de 30 días.");
            } else if (mes == 7) {
                System.out.println("El número introducido corresonde a julio. No es un mes de 30 días.");
            } else if (mes == 8) {
                System.out.println("El número introducido corresonde a agosto. No es un mes de 30 días.");
            } else if (mes == 9) {
                System.out.println("El número introducido corresonde a septiembre. Es un mes de 30 días.");
            } else if (mes == 10) {
                System.out.println("El número introducido corresonde a octubre. No es un mes de 30 días.");
            } else if (mes == 11 ) {
                System.out.println("El número introducido corresonde a noviembre. Es un mes de 30 días.");
            } else if (mes == 12) {
                System.out.println("El número introducido corresonde a diciembre. No es un mes de 30 días.");
            }
        }
        
    }
    
}
