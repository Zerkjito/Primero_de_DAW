/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

import java.util.Objects;

/**
 *
 * @author Erick
 */
public class Vivienda extends Inmueble {

    private int numeroDeHabitaciones;

    public Vivienda(String referencia, String poblacion, double precioBase, int numeroDeHabitaciones) {
        super(referencia, poblacion, precioBase);
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }

    public Vivienda() {
    }

    public Vivienda(String referencia) {
        super(referencia);
    }

    public int getNumeroDeHabitaciones() {
        return numeroDeHabitaciones;
    }

    public void setNumeroDeHabitaciones(int numeroDeHabitaciones) {
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }

    public double calcularPrecio() {
        double precioFinalAlquiler = this.getPrecioBase();
        if (this.numeroDeHabitaciones > 3) {
            precioFinalAlquiler += 200;
        }
        double descuento = precioFinalAlquiler * (Inmueble.getDescuento() / 100);
        return precioFinalAlquiler - descuento;
    }

    public void alquilar() {
        if (!this.isAlquilado()) {
            this.setAlquilado(true);
        }
    }

    public void devolver() {
        if (this.isAlquilado()) {
            this.setAlquilado(false);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getReferencia());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vivienda other = (Vivienda) obj;
        return Objects.equals(this.getReferencia(), other.getReferencia());
    }

    @Override
    public String toString() {
        String disponibilidad = this.isAlquilado() ? " DISPONIBLE" : " AQLUILADO";

        StringBuilder sb = new StringBuilder();
        sb.append("\nVIVIENDA ");
        sb.append(super.toString());
        sb.append(" HABITACIONES: ").append(numeroDeHabitaciones).append(disponibilidad);
        sb.append(" PRECIO ALQUILER: ").append(String.format("%.2f€%n", this.calcularPrecio()));
        return sb.toString();
    }

}
