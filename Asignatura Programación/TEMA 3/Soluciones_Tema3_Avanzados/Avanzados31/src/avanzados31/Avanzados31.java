/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados31;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int año, dias, diaAleatorio;
        do {
            do {
                System.out.print("Introduce un año (0 para terminar): ");
                año = sc.nextInt();
            } while (año < 1900 && año != 0);
            if (año != 0) {
                //creamos un objeto LocalDate llamado fecha a partir del año introducido. El día es el 1 y el mes es el 1
                //fecha contendrá la fecha: 1/1/año
                LocalDate fecha = LocalDate.of(año, 1, 1);
                dias = fecha.lengthOfYear();//obtenenos los días totales del año que hemos introducido (serán 365 o 366 si es bisiesto)
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE"); //creamos el formato de fecha que queremos mostrar por pantalla
                for (int i = 1; i <= 2; i++) { //queremos obtener 2 días al azar 
                    //para obtener un día del año al azar lo que haremos será obtener un entero entre el total de días del año y sumárselo a la fecha
                    //La fecha la hemos creado con el valor 1 para el día y el valor 1 para el mes.
                    //Si le sumamos x días (número que obtenemos al azar) a esa fecha ya tenemos un día del año al azar.
                    diaAleatorio = rnd.nextInt(dias); //obtenemos un número al azar entre 0 y dias-1. Será un valor entre 0 y 364 ó entre 0 y 365 según el año sea bisiesto o no
                    fecha = fecha.plusDays(diaAleatorio);//sumamos ese número de días a la fecha que hemos creado. 
                    System.out.println(fecha.format(formato));//mostramos la fecha obtenida
                    fecha = LocalDate.of(año, 1, 1);//volvemos al 1 de enero para repetir el proceso
                }
            }
        } while (año != 0);

    }

}
