/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos;
        
        System.out.print("Por favor introduce las horas: ");
        horas = sc.nextInt();
        System.out.print("Por favor introduce los minutos: ");
        minutos = sc.nextInt();
        System.out.print("Por favor introduce los segundos: ");
        segundos = sc.nextInt();
        
        if (horas > 23 || horas < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0) {
            System.out.println("Hora erronea");
        } else {
            System.out.println("Hora introducida: " + horas + ":" + minutos + ":" + segundos);
            segundos++;
            if (segundos == 60) {
                segundos = 00;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 00;
                    }
                } 
                System.out.println("Hora +1 segundo: " + horas + ":" + minutos + ":" + segundos);
            }
        }

    }
    
}
