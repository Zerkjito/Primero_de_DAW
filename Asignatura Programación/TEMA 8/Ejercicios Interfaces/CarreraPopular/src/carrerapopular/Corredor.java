/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrerapopular;

/**
 *
 * @author zerkje
 */
public class Corredor extends Persona implements Carrera {

    private int dorsal;
    private int distanciaRecorrida;
    private int contadorAmonestaciones;
    private boolean enCarrera;

    public Corredor(String nombre, int edad) {
        super(nombre, edad);
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
        sb.append("Corredor").append("\nDorsal: ").append(dorsal).append("\nNombre: ").append(super.toString());
        sb.append("\nAmonestaciones: ").append(contadorAmonestaciones).append("\nDistancia recorrida: ").append(distanciaRecorrida);
        sb.append("\n--------------------------------------------------");
        return sb.toString();
    }

    @Override
    public int avanzar() {
        if (isEnCarrera()) {
            if (getEdad() < 40) {
                distanciaRecorrida += 15;
            } else {
                distanciaRecorrida += 10;
            }
            return distanciaRecorrida;
        }
        return -1;
    }

    @Override
    public boolean amonestar() {
        if (isEnCarrera()) {
            contadorAmonestaciones += 1;
            return true;
        }
        return false;
    }

    @Override
    public int obtenerDistanciaRecorrida() {
        if (isEnCarrera()) {
            return distanciaRecorrida;
        }
        return -1;
    }

    @Override
    public boolean enCarrera() {
        return isEnCarrera();
    }

}
