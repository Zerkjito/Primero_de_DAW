/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.Duration;

/**
 *
 * @author zerkje
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        int hora, minutos, segundos;
        
        do {
            System.out.print("Introduce el dia de entrada: ");
            dia = sc.nextInt();
        } while (dia > 31 || dia < 1);
        
        do {
            System.out.print("Introduce el mes de entrada: ");
            mes = sc.nextInt();
        } while (mes > 12 || mes < 1);
        
        do {
            System.out.print("Introduce el anyo de entrada: ");
            año = sc.nextInt();
        } while (año < 1900);
        
        do {
            System.out.print("Introduce la hora de entrada: ");
            hora = sc.nextInt();
        } while (hora > 23 || hora < 0);
        
        do {
            System.out.print("Introduce el minuto de entrada: ");
            minutos = sc.nextInt();
        } while (minutos > 59|| minutos < 0);
        
        do {
            System.out.print("Introduce el segundo de entrada: ");
            segundos = sc.nextInt();
        } while (segundos > 59 || segundos < 0);
        
        LocalDateTime entrada = LocalDateTime.of(año, mes, dia, hora, minutos, segundos);
        LocalDateTime salida = LocalDateTime.now();
        Duration tiempo = Duration.between(entrada, salida);
        
        long minuto = tiempo.getSeconds() / 60;
        System.out.println("Total minutos -> " + minuto);
        System.out.printf("Total a pagar -> %.2f€%n", minuto * 0.05);
        
    }
    
}
