/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Erick
 */
public class Vivienda extends Inmueble{
    private int numeroDeHabitaciones;

    public Vivienda(int numeroDeHabitaciones, String referencia, String poblacion, double precioBase) {
        super(referencia, poblacion, precioBase);
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }

    public Vivienda() {
    }
    
    

    public int getNumeroDeHabitaciones() {
        return numeroDeHabitaciones;
    }

    public void setNumeroDeHabitaciones(int numeroDeHabitaciones) {
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }
    
    
}
