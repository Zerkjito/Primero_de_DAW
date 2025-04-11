/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeactoresv1;

import java.util.Objects;

/**
 *
 * @author Erick
 */
public abstract class Actor implements Contratable {

    private String nif;
    private String nombre;
    private int edad;
    private Genero genero;
    private static double importeFijo;
    private static double importeHoras;

    public Actor() {
    }

    public Actor(String nif, String nombre, int edad, Genero genero) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Actor(String nif) {
        this.nif = nif;
    }

    @Override
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public static double getImporteFijo() {
        return importeFijo;
    }

    public static void setImporteFijo(double importeFijo) {
        Actor.importeFijo = importeFijo;
    }

    public static double getImporteHoras() {
        return importeHoras;
    }

    public static void setImporteHoras(double importeHoras) {
        Actor.importeHoras = importeHoras;
    }

    @Override
    public int hashCode() {
        return nif != null ? nif.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        
        if (obj instanceof Animal other) {
            return this.nif != null && this.nif.equals(other.getId());
        }
        
        if (obj instanceof Actor other) {
            return this.nif != null && this.nif.equals(other.nif);
        }
        
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nif).append(" ").append(nombre).append(" Edad: ").append(edad);
        sb.append(" ").append(genero);
        return sb.toString();
    }

    @Override
    public abstract void mostrarInfo();
}
