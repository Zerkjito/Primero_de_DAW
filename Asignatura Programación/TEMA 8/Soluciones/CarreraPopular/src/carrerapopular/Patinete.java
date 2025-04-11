package carrerapopular;

public class Patinete extends Vehiculo implements Carrera {

    private int numeroDeRuedas;

    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    @Override
    public int avanzar() {
        if (this.isEnCarrera()) {
            if (this.getPeso() < 1) {
                this.setDistanciaRecorrida(this.getDistanciaRecorrida() + 5);
            } else {
                this.setDistanciaRecorrida(this.getDistanciaRecorrida() + 3);
            }
            return this.getDistanciaRecorrida();
        }
        return -1;
    }

    @Override
    public boolean amonestar() {
        if (this.isEnCarrera()) {
            this.setContadorAmonestaciones(this.getContadorAmonestaciones() + 1);
            if (this.getContadorAmonestaciones() == 2) {
                this.setEnCarrera(false);
            }
            return true;
        }
        return false;
    }

    @Override
    public int obtenerDistanciaRecorrida() {
        return this.getDistanciaRecorrida();
    }

    @Override
    public boolean enCarrera() {
        return this.isEnCarrera();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patinete:\n");
        sb.append(super.toString());
        sb.append("\nNumero de ruedas: ");
        sb.append(numeroDeRuedas);
        sb.append("\nDistancia Recorrida: ");
        sb.append(this.getDistanciaRecorrida());
        return sb.toString();
    }
}
