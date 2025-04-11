/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrerapopular;

/**
 *
 * @author zerkje
 */
public class Bicicleta extends Vehiculo implements Carrera {

    private TipoBicicleta tipo;

    public Bicicleta(Persona conductor, double peso, TipoBicicleta tipo) {
        super(conductor, peso);
        this.tipo = tipo;
    }


    public TipoBicicleta getTipo() {
        return tipo;
    }

    public void setTipo(TipoBicicleta tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bicicleta\n").append(super.toString());
        sb.append("\nBicicleta de ").append(tipo).append("\nDistancia recorrida: ").append(getDistanciaRecorrida());
        sb.append("\n--------------------------------------------------");
        return sb.toString();
    }

    @Override
    public int avanzar() {
        if (isEnCarrera()) {
            if (getPeso() < 10) {
                this.setDistanciaRecorrida(getDistanciaRecorrida() + 20);
            } else {
                this.setDistanciaRecorrida(getDistanciaRecorrida() + 10);
            }
            return getDistanciaRecorrida();
        }
        return -1;
    }

    @Override
    public boolean amonestar() {
        if (isEnCarrera()) {
            setContadorAmonestaciones(getContadorAmonestaciones() + 1);
            if (getContadorAmonestaciones() == 2) {
                this.setEnCarrera(false);
            }
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
