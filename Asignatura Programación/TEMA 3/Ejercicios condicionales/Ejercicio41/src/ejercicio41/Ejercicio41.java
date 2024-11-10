/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio41;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 *
 * @author zerkje
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, dia, mes, año, diaActual, mesActual, añoActual;
        
        System.out.print("Introduce el dia de nacimiento: ");
        dia = sc.nextInt();
        System.out.print("Introduce el mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.print("Introduce el año de nacimiento: ");
        año = sc.nextInt();
        
        LocalDate fechaActual = LocalDate.now();
        
        diaActual = fechaActual.getDayOfMonth();
        mesActual = fechaActual.getMonthValue();
        añoActual = fechaActual.getYear();
        
        System.out.printf("Fecha actual: %02d/%02d/%d%n", diaActual, mesActual, añoActual);
        System.out.printf("Fecha nacimiento: %02d/%02d/%d%n", dia, mes, año);
        
        edad = añoActual - año;
        
        if (mes > mesActual)  {
            edad--;
        } else if (mes == mesActual) {
            if (dia > diaActual) {
                edad--;
            } else if (dia == diaActual) {
                System.out.println("Felicidades hoy es tu cumpleanios!");
            }
        }
        System.out.println("Edad: " + edad);
        
    }
    
}
