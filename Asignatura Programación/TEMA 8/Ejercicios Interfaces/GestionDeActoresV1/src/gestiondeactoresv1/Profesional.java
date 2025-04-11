/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeactoresv1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Erick
 */
public class Profesional extends Actor {

    private int numeroDeRepresentaciones;

    public Profesional(String nif, String nombre, int edad, Genero genero, int numeroDeRepresentaciones) {
        super(nif, nombre, edad, genero);
        this.numeroDeRepresentaciones = numeroDeRepresentaciones;
    }

    public Profesional() {
    }

    public Profesional(String nif) {
        super(nif);
    }

    public int getNumeroDeRepresentaciones() {
        return numeroDeRepresentaciones;
    }

    public void setNumeroDeRepresentaciones(int numeroDeRepresentaciones) {
        this.numeroDeRepresentaciones = numeroDeRepresentaciones;
    }

    @Override
    public double calcularSueldo() {
        return getNumeroDeRepresentaciones() * getImporteFijo();
    }

    @Override
    public void mostrarInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nActor Profesional: ");
        sb.append(super.toString()).append(" Representaciones: ").append(numeroDeRepresentaciones);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale ("es", "ES"));
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        String sueldoFormateado = nf.format(calcularSueldo());
        
        sb.append(" Sueldo: ").append(sueldoFormateado).append(" EUR");
        System.out.println(sb.toString());
    }

}
