/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados29;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author enrique
 */
public class Avanzados29 {

    public static void main(String[] args) {
        
        LocalDate fechaActual = LocalDate.now(); //obtenemos la fecha actual del sistema
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'del año' yyyy");
        System.out.println(fechaActual.format(formato)); //muestra la fecha actual con ese formato
        
        formato = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");
        System.out.println(fechaActual.format(formato));
        
        formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(fechaActual.format(formato));
        
        Locale locale = Locale.getDefault();
        System.out.println("Dia -> " + fechaActual.getDayOfMonth() + " " + fechaActual.getDayOfWeek().getDisplayName(TextStyle.FULL, locale));
        System.out.println("Mes -> " + fechaActual.getMonthValue() + " " + fechaActual.getMonth().getDisplayName(TextStyle.FULL, locale));
        System.out.println("Año -> " + fechaActual.getYear() + " " + (fechaActual.isLeapYear() ? " bisiesto " : " no bisiesto "));
    }

}
