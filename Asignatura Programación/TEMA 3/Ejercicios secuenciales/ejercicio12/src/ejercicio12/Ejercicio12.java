/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosC, gradosR, gradosK;
        System.out.print("Por favor introduzca los grados centigrados: ");
        gradosC = sc.nextDouble();
        gradosR = 0.8 * gradosC;
        gradosK = gradosC + 273.15;
        System.out.println(gradosC + " ºC " + " --> " + gradosR + " ºR ");
        System.out.println(gradosC + " ºC " + " --> " + gradosK + " ºK ");

    }
    
}
