/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author Erick
 */
public class Empleado extends Persona {

    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public Empleado(String nif, String nombre, Direccion direccion, LocalDate fechaNacimiento, LocalTime horaEntrada, LocalTime horaSalida) {
        super(nif, nombre, direccion, fechaNacimiento);
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public Empleado(String nif) {
        super(nif);
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        try {
            if (horaEntrada == null) {
                throw new IllegalArgumentException("La hora de entrada no puede ser nula.");
            }
            this.horaEntrada = horaEntrada;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        try {
            if (horaSalida == null) {
                throw new IllegalArgumentException("La hora de salida no puede ser nula.");
            }
            if (horaEntrada != null && horaSalida.isBefore(horaEntrada)) {
                throw new IllegalArgumentException("La hora de salida no puede ser anterior a la hora de entrada.");
            }
            this.horaSalida = horaSalida;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public int getHoraSalidaEnMinutos() {
        int horas = horaSalida.getHour();
        int minutos = horaSalida.getMinute();
        return horas * 60 + minutos;
    }

    public int getHoraEntradaEnMinutos() {
        int horas = horaEntrada.getHour();
        int minutos = horaEntrada.getMinute();
        return horas * 60 + minutos;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getNif());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Empleado other = (Empleado) obj;
        return Objects.equals(this.getNif(), other.getNif());
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Hora de Entrada: ").append(horaEntrada.format(formatter));
        sb.append(" Hora de Salida: ").append(horaSalida.format(formatter));
        return sb.toString();
    }
}
