/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author zerkje
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatoCompleto = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'del año' yyyy");
        System.out.println(fechaActual.format(formatoCompleto));
        
        formatoCompleto = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");
        System.out.println(fechaActual.format(formatoCompleto));
        
        formatoCompleto = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(fechaActual.format(formatoCompleto));
        
        Locale locale = Locale.getDefault();
        System.out.println("Dia -> " + fechaActual.getDayOfMonth() + fechaActual.getDayOfWeek().getDisplayName(TextStyle.FULL, locale));
        System.out.println("Mes -> " + fechaActual.getMonthValue() + fechaActual.getMonth().getDisplayName(TextStyle.FULL, locale));
        System.out.println("Ano -> " + fechaActual.getYear() + " " + (fechaActual.isLeapYear() ? " bisiesto " : " no bisiesto "));
        */
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatoCompleto = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'del ano' yyyy");
        System.out.println(fechaActual.format(formatoCompleto));
        
        formatoCompleto = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");
        System.out.println(fechaActual.format(formatoCompleto));
        
        formatoCompleto = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(fechaActual.format(formatoCompleto));
        
        Locale locale = Locale.getDefault();
        System.out.println("Dia -> " + fechaActual.getDayOfMonth() + " " + fechaActual.getDayOfWeek().getDisplayName(TextStyle.FULL, locale));
        System.out.println("Mes -> " + fechaActual.getMonthValue() + " " + fechaActual.getMonth().getDisplayName(TextStyle.FULL, locale));
        System.out.println("Anio -> " + fechaActual.getYear() + " " + (fechaActual.isLeapYear() ? " bisiesto " : " no bisiesto "));
        
        
    }
    
}
