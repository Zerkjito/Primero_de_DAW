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
        double gradosC, gradosK;
        char respuesta;
        System.out.print("Por favor, introduzca la temperatura en ºC: ");
        gradosC = sc.nextDouble();
        gradosK = gradosC + 273.15;
        sc.nextLine();
        System.out.println(gradosC + "ºC equivalen a " + gradosK + " ºK");
        System.out.print("¿Repetir proceso? ('S' para continuar): ");
        respuesta = sc.nextLine().toUpperCase().charAt(0);
        if (respuesta == 'S') {
            do {
                System.out.print("Por favor, introduzca la temperatura en ºC: ");
                gradosC = sc.nextDouble();
                gradosK = gradosC + 273.15;
                sc.nextLine();
                System.out.println(gradosC + "ºC equivalen a " + gradosK + " ºK");
                System.out.print("¿Repetir proceso? ('S' para continuar): ");
                respuesta = sc.nextLine().toUpperCase().charAt(0);
            } while (respuesta == 'S');
        }
    }

}
