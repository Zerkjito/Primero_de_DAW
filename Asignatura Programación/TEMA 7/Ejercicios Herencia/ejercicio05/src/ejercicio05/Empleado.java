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

    public Empleado(LocalTime horaEntrada, LocalTime horaSalida, String nif, String nombre, Direccion direccion, LocalDate fechaNacimiento) {
        super(nif, nombre, direccion, fechaNacimiento);
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.horaEntrada);
        hash = 37 * hash + Objects.hashCode(this.horaSalida);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Empleado other = (Empleado) obj;
        return Objects.equals(this.horaEntrada, other.horaEntrada);
    }

}
