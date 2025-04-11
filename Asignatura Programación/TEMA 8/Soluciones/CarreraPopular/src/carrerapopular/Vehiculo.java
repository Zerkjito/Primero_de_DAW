package carrerapopular;

public abstract class Vehiculo {

    private int dorsal;
    private Persona conductor;
    private double peso;
    private int distanciaRecorrida;
    private int contadorAmonestaciones;
    private boolean enCarrera;

    public Vehiculo() {
        this.conductor = new Persona();
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
        this.conductor = new Persona(conductor);
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dorsal: ");
        sb.append(dorsal);
        sb.append("\nPeso: ");
        sb.append(peso);
        sb.append("\nConductor: ");
        sb.append(conductor);
        sb.append("\nAmonestaciones: ");
        sb.append(contadorAmonestaciones);
        return sb.toString();
    }
}
