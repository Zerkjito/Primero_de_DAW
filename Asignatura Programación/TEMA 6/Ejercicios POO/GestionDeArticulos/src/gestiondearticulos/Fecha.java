/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondearticulos;

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

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Fecha() {
    }

    public void asignarFecha(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAño(a);
    }

    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = (this.año >= 1900);
        mesCorrecto = (this.mes >= 1 && this.mes <= 12);
        switch (this.mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = (this.dia >= 1 && this.dia <= 29);
                } else {
                    diaCorrecto = (this.dia >= 1 && this.dia <= 28);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = (this.dia >= 1 && this.dia <= 30);
                break;
            default:
                diaCorrecto = (this.dia >= 1 && this.dia <= 31);
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }

    public boolean esBisiesto() {
        return ((this.año % 4 == 0) && (this.año % 100 != 0) || (this.año % 400 == 0));
    }

    public String fechaCorta() {
        LocalDate hoy = LocalDate.of(this.año, this.mes, this.dia);
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return hoy.format(formatoCorto);
    }

    public String fechaLarga() {
        LocalDate hoy = LocalDate.of(this.año, this.mes, this.dia);
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        return hoy.format(formatoLargo);
    }

    public boolean caducado() {
        LocalDate hoy = LocalDate.now();
        LocalDate fechaProducto = LocalDate.of(año, mes, dia);
        
        return fechaProducto.isBefore(hoy);
    }
}
