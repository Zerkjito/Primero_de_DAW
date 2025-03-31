/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema6erickhurtado;

import java.util.Objects;

/**
 *
 * @author lliurex
 */
public class Perro {

    private String identificador;
    private String nombre;
    private Dueño dueño;
    private int ingresos;
    private static double precio = 50;
    private static int limite = 5;

    public Perro(String identificador, String nombre, Dueño dueño) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.dueño = dueño;
    }

    public Perro(Perro p) {
        this.identificador = p.identificador;
        this.nombre = p.nombre;
        this.dueño = p.dueño;
    }

    public Perro() {
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public static double getPrecio() {
        return precio;
    }

    public static void setPrecio(double precio) {
        Perro.precio = precio;
    }

    public static int getLimite() {
        return limite;
    }

    public static void setLimite(int limite) {
        Perro.limite = limite;
    }

    public Perro(String identificador) {
        this.identificador = identificador;
    }
    
    public boolean superaLimite() {
        return this.ingresos >  limite;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID perro: ").append(identificador).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append(dueño).append("\n");
        sb.append("Numero de ingresos: ").append(ingresos);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.identificador);
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

        Perro other = (Perro) obj;
        return this.identificador.equals(other.identificador);
    }

}
