/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author zerkje
 */
public class Fecha {

    private int dia;
    private int mes;
    private int año;

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

    public void asignarFecha(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAño(a);
    }

    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, anyoCorrecto;
        anyoCorrecto = (año > 0);
        mesCorrecto = (mes >= 1) && (mes <= 12);
        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = (dia >= 1 && dia <= 29);
                } else {
                    diaCorrecto = (dia >= 1 && dia <= 28);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = (dia >= 1 && dia <= 30);
                break;
            default:
                diaCorrecto = (dia >= 1 && dia <= 31);
        }
        return diaCorrecto && mesCorrecto && anyoCorrecto;
    }

    private boolean esBisiesto() {
        return ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0));
    }

    public String fechaCorta() {
        LocalDate fecha = LocalDate.of(this.año, this.mes, this.dia);
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fecha.format(formatoCorto);
    }

    public String fechaLarga() {
        LocalDate fecha = LocalDate.of(this.año, this.mes, this.dia);
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        return fecha.format(formatoLargo);
    }

    public void diaSiguiente() {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (esBisiesto()) {
            diasPorMes[1] = 29;
        }

        this.dia++;
        if (this.dia > diasPorMes[this.mes - 1]) {
            this.dia = 1;
            this.mes++;
        }

        if (this.mes > 12) {
            this.mes = 1;
            this.año++;
        }
        System.out.println("\n" + fechaCorta());
    }
}
