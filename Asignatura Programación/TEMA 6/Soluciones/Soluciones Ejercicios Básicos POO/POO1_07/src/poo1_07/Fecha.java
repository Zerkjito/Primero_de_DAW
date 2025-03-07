/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
     private int dia;
    private int mes;
    private int año;

    //Métodos get/set
    public void setDia(int d) {
        dia = d;
    }

    public void setMes(int m) {
        mes = m;
    }

    public void setAño(int a) {
        año = a;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    //Método para asignar un dia, mes y año a los atributos de la clase
    public void asignarFecha(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAño(a);
    }

    //Método para comprobar si la fecha es correcta
    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, anyoCorrecto;
        anyoCorrecto = (año > 0);
        mesCorrecto = (mes >= 1) && (mes <= 12);
        switch (mes) {
            case 2 -> {
                if (esBisiesto()) {
                    diaCorrecto = (dia >= 1 && dia <= 29);
                } else {
                    diaCorrecto = (dia >= 1 && dia <= 28);
                }
             }
            case 4, 6, 9, 11 -> diaCorrecto = (dia >= 1 && dia <= 30);
            default -> diaCorrecto = (dia >= 1 && dia <= 31);
        }
        return diaCorrecto && mesCorrecto && anyoCorrecto;
    }

    //Método para comprobar si un año es bisiesto
    //Es private porque no queremos que se utilice con objetos de tipo Fecha desde fuera de la clase
    //Lo utiliza el método fechaCorrecta
    private boolean esBisiesto() {
        return ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0));
    }

    //Devuelve un String con la fecha en formato dd-mm-aaaa
    public String fechaCorta() {     
        LocalDate fecha = LocalDate.of(año, mes, dia);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fecha.format(f);
    }

    //Devuelve un String con la fecha en formato:
    //nombreDiaDeLaSemana dd de nombreMes de aaaa 
    public String fechaLarga() {
        LocalDate fecha = LocalDate.of(año, mes, dia);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        return fecha.format(f);
    }

    //Cambia los valores de los atributos para que contengan la fecha del día siguiente
    public void diaSiguiente() {   
        LocalDate fecha = LocalDate.of(año, mes, dia);
        fecha = fecha.plusDays(1);
        año = fecha.getYear();
        mes = fecha.getMonthValue();
        dia = fecha.getDayOfMonth();
    }
}
