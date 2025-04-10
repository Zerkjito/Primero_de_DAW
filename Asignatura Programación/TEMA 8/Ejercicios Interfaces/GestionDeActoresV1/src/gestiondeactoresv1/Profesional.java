/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeactoresv1;

/**
 *
 * @author Erick
 */
public class Profesional extends Actor{
    private int numeroDeRepresentaciones;

    public Profesional(String nif, String nombre, int edad, Genero genero, int numeroDeRepresentaciones) {
        super(nif, nombre, edad, genero);
        this.numeroDeRepresentaciones = numeroDeRepresentaciones;
    }

    public Profesional() {
    }

    public int getNumeroDeRepresentaciones() {
        return numeroDeRepresentaciones;
    }

    public void setNumeroDeRepresentaciones(int numeroDeRepresentaciones) {
        this.numeroDeRepresentaciones = numeroDeRepresentaciones;
    }

    @Override
    public double calcularSueldo() {
    }
    
    
}
