/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

import java.time.LocalDate;
import java.time.LocalTime;
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
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
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
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Hora entrada: ").append(horaEntrada).append("\n");
        sb.append("Hora salida: ").append(horaSalida).append("\n");
        return sb.toString();
    }

}
