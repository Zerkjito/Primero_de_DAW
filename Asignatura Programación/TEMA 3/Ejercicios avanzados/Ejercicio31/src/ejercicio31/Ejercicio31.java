/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Random;
import java.time.format.DateTimeFormatter;

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
        Random rnd = new Random();
        int año, dias, diaAleatorio;

        do {
            do {
                System.out.print("Introduce un anyo (0 para terminar): ");
                año = sc.nextInt();
            } while (año < 1900 && año != 0);
            if (año != 0) {
                LocalDate fecha = LocalDate.of(año, 1, 1);
                dias = fecha.lengthOfYear();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd//MM/yyyy EEEE");
                for (int i = 1; i <= 2; i++) {
                    diaAleatorio = rnd.nextInt(dias);
                    fecha = fecha.plusDays(diaAleatorio);
                    System.out.println(fecha.format(formato));
                    fecha = LocalDate.of(año, 1, 1);
                }
            }
        } while (año != 0);
    }

}
