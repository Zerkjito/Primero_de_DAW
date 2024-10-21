/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17v2;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio17V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        String nombreMes;
        System.out.println("Por favor, introduzca un número de mes.");
        mes = sc.nextInt();

        nombreMes = switch (mes) {
            case 1 ->
                "Enero. No contiene 30 días.";
            case 2 ->
                "Febrero. No contiene 30 días.";
            case 3 ->
                "Marzo. No contiene 30 días.";
            case 4 ->
                "Abril. Contiene 30 días.";
            case 5 ->
                "Mayo. No contiene 30 días.";
            case 6 ->
                "Junio. Contiene 30 días.";
            case 7 ->
                "Julio. No contiene 30 días.";
            case 8 ->
                "Agosto. No contiene 30 días.";
            case 9 ->
                "Septiembre. Contiene 30 días.";
            case 10 ->
                "Octubre. No contiene 30 días.";
            case 11 ->
                "Noviembre. Contiene 30 días.";
            case 12 ->
                "Diciembre. No contiene 30 días.";
            default ->
                "Valor no válido";
        };
        System.out.println(nombreMes);
    }

}
