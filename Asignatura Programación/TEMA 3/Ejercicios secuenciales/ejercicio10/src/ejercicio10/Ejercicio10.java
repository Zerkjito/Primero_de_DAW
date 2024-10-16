/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costeTotal, horas, minutos, precioMinuto = 0.85, precioHora = 51;
        System.out.print("Introduzca horas: ");
        horas = sc.nextDouble();
        System.out.print("Introduzca minutos: ");
        minutos = sc.nextDouble();
        costeTotal = minutos * precioMinuto + horas * precioHora;
        System.out.print("Coste total del trabajo " +" -> " + costeTotal);
        
        
    }
    
}
