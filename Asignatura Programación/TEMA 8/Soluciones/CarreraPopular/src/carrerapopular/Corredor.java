package carrerapopular;

public class Corredor extends Persona implements Carrera {

    private int dorsal;
    private int distanciaRecorrida;
    private int contadorAmonestaciones;
    private boolean enCarrera;

    public Corredor(int dorsal, String nombre, int edad) {
        super(nombre, edad);
        this.dorsal = dorsal;
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

    public boolean isEnCarrera() {
        return enCarrera;
    }

    public void setEnCarrera(boolean enCarrera) {
        this.enCarrera = enCarrera;
    }

    public int getContadorAmonestaciones() {
        return contadorAmonestaciones;
    }

    public void setContadorAmonestaciones(int contadorAmonestaciones) {
        this.contadorAmonestaciones = contadorAmonestaciones;
    }

    @Override
    public int avanzar() {
        if (this.enCarrera) {
            if (this.getEdad() < 40) {
                distanciaRecorrida += 15;
            } else {
                distanciaRecorrida += 10;
            }
            return this.distanciaRecorrida;
        }
        return -1;
    }

    @Override
    public boolean amonestar() {
        if (this.isEnCarrera()) {
            contadorAmonestaciones++;
            if (contadorAmonestaciones == 2) {
                this.setEnCarrera(false);
            }
            return true;
        }
        return false;
    }

    @Override
    public int obtenerDistanciaRecorrida() {
        return this.distanciaRecorrida;
    }

    @Override
    public boolean enCarrera() {
        return this.enCarrera;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Corredor\n");
        sb.append("Dorsal: ");
        sb.append(dorsal);
        sb.append(super.toString());
        sb.append("\nAmonestaciones: ");
        sb.append(contadorAmonestaciones);
        sb.append("\nDistancia Recorrida: ");
        sb.append(distanciaRecorrida);
        return sb.toString();
    }
}
