/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Erick
 */
public class Persona {
    private String nif;
    private String nombre;
    private Direccion direccion;
    private LocalDate fechaNacimiento;

    public Persona(String nif, String nombre, Direccion direccion, LocalDate fechaNacimiento) {
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
    }

    public Persona(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int edad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - this.getFechaNacimiento().getYear();
        
        if (fechaActual.getDayOfYear() < this.getFechaNacimiento().getDayOfYear()) { // IMPORTANTE ASEGURARSE DE QUE AUN NO HA LLEGADO A CUMPLIR AÑOS
            edad--;
        }
        return edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NIF: ").append(nif).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append(direccion).append("\n");
        sb.append("Fecha nacimiento: ").append(fechaNacimiento);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null ||getClass() != obj.getClass()) {
            return false;
        }
        
        Persona other = (Persona) obj;
        return this.nif.equals(other.nif);
    }
    
    
}
