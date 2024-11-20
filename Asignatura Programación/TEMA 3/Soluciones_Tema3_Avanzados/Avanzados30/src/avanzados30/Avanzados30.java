/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados30;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados30 {

    public static void main(String[] args) {
        int horaEntrada, minutoEntrada, segundoEntrada, diaEntrada, mesEntrada, añoEntrada;
        Scanner sc = new Scanner(System.in);
        
        //introducimos la fecha de entrada y hora de entrada al parking
        System.out.println("Introduce fecha de entrada");
        do {
            System.out.print("dia: ");
            diaEntrada = sc.nextInt();
        } while (diaEntrada < 0 || diaEntrada > 31);
        do {
            System.out.print("mes: ");
            mesEntrada = sc.nextInt();
        } while (mesEntrada < 0 || mesEntrada > 12);
        do {
            System.out.print("año: ");
            añoEntrada = sc.nextInt();
        } while (añoEntrada < 1900);
        do {
            System.out.print("Introduce hora de entrada: ");
            horaEntrada = sc.nextInt();
        } while (horaEntrada < 0 || horaEntrada > 23);
        do {
            System.out.print("Introduce minuto de entrada: ");
            minutoEntrada = sc.nextInt();
        } while (minutoEntrada < 0 || minutoEntrada > 59);
        do {
            System.out.print("Introduce segundo de entrada: ");
            segundoEntrada = sc.nextInt();
        } while (segundoEntrada < 0 || segundoEntrada > 59);
        
        //obtenemos un objeto LocalDateTime con la fecha y hora de entrada al parking
        LocalDateTime entrada = LocalDateTime.of(añoEntrada, mesEntrada, diaEntrada, horaEntrada, minutoEntrada, segundoEntrada);
        
        //La fecha y hora de salida es la del sistema
        LocalDateTime salida = LocalDateTime.now();
        
        //Obtenemos el tiempo transcurrido desde la entrada hasta la salida mediante la clase Duration
        Duration tiempo = Duration.between(entrada, salida);
        
        long minutos = tiempo.getSeconds() / 60;
        System.out.println("Total minutos-> " + minutos);
        System.out.printf("Importe a pagar: %.2f€%n", minutos * 0.05);
    }
    
}
