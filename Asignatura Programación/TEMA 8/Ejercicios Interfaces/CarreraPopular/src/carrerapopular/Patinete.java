/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrerapopular;

/**
 *
 * @author zerkje
 */
public class Patinete extends Vehiculo implements Carrera {

    private int numeroDeRuedas;

    public Patinete(Persona conductor, double peso, int numeroDeRuedas) {
        super(conductor, peso);
        this.numeroDeRuedas = numeroDeRuedas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patinete\n").append(super.toString());
        sb.append("\nNumero de ruedas: ").append(numeroDeRuedas).append("\nDistancia recorrida: ").append(getDistanciaRecorrida());
        sb.append("\n--------------------------------------------------");
        return sb.toString();
    }

    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    @Override
    public int avanzar() {
        if (isEnCarrera()) {
            if (getPeso() < 1) {
                this.setDistanciaRecorrida(getDistanciaRecorrida() + 5);
            } else {
                this.setDistanciaRecorrida(getDistanciaRecorrida() + 3);
            }
            return getDistanciaRecorrida();
        }
        return -1;
    }

    @Override
    public boolean amonestar() {
        if (isEnCarrera()) {
            setContadorAmonestaciones(getContadorAmonestaciones() + 1);
            return true;
        }
        return false;
    }

    @Override
    public int obtenerDistanciaRecorrida() {
        if (isEnCarrera()) {
            return getDistanciaRecorrida();
        }
        return -1;
    }

    @Override
    public boolean enCarrera() {
        return isEnCarrera();
    }

}
