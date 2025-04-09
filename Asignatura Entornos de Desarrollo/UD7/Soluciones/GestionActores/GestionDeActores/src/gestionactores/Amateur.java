package gestionactores;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Amateur extends Actor {
 
    private final static Logger LOGGER = Logger.getLogger(Amateur.class.getName());
    
    private int numeroHoras;

    public Amateur() {
    }

    public Amateur(String nif, String nombre, int edad, Genero genero, int numeroHoras) {
        super(nif, nombre, edad, genero);
        this.numeroHoras = numeroHoras;
        LOGGER.log(Level.INFO, "Constructor Amateur(" + nif + "," + nombre + "," + edad + "," + genero + "," + numeroHoras+")");
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public double calcularSueldo() {
        return numeroHoras * Actor.getPrecioHora();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Actor Amateur ");
        sb.append(super.toString());
        sb.append(" Horas: ");
        sb.append(numeroHoras);
        sb.append(String.format(" Sueldo: %,.2f", calcularSueldo()));
        sb.append("\n");
        return sb.toString();
    }
    
}
