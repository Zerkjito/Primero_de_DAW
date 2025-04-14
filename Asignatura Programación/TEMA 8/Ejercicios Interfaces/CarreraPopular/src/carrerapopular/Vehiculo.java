/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrerapopular;

/**
 *
 * @author zerkje
 */
public abstract class Vehiculo {
    private int dorsal = 0;
    private Persona conductor;
    private double peso;
    private int distanciaRecorrida;
    private int contadorAmonestaciones;
    private boolean enCarrera;
    

    public Vehiculo() {
    }

    public Vehiculo(Persona conductor, double peso) {
        this.conductor = conductor;
        this.peso = peso;
        this.dorsal = GenerarDorsal.siguienteDorsal();
        this.distanciaRecorrida = 0;
        this.contadorAmonestaciones = 0;
        this.enCarrera = true;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getContadorAmonestaciones() {
        return contadorAmonestaciones;
    }

    public void setContadorAmonestaciones(int contadorAmonestaciones) {
        this.contadorAmonestaciones = contadorAmonestaciones;
    }

    public boolean isEnCarrera() {
        return enCarrera;
    }

    public void setEnCarrera(boolean enCarrera) {
        this.enCarrera = enCarrera;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dorsal: ").append(dorsal);
        sb.append(String.format("\nPeso: %.2f", peso));
        sb.append("\nConductor: ").append(conductor);
        sb.append("\nAmonestaciones: ").append(contadorAmonestaciones);
        if (contadorAmonestaciones == 2) {
            sb.append(" (ELIMINADO)");
        }
        return sb.toString();
    }
}
