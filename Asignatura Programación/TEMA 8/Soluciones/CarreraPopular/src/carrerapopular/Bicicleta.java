package carrerapopular;

public class Bicicleta extends Vehiculo implements Carrera {

    private TipoBicicleta tipo;

    public TipoBicicleta getTipo() {
        return tipo;
    }

    public void setTipo(TipoBicicleta tipo) {
        this.tipo = tipo;
    }

    @Override
    public int avanzar() {
        if (isEnCarrera()) {
            if (this.getPeso() < 10) {
                this.setDistanciaRecorrida(this.getDistanciaRecorrida() + 20);
            } else {
                this.setDistanciaRecorrida(this.getDistanciaRecorrida() + 10);
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
        sb.append("Bicicleta:\n");
        sb.append(super.toString());
        sb.append("\nBicicleta de ");
        sb.append(tipo);
        sb.append("\nDistancia Recorrida: ");
        sb.append(this.getDistanciaRecorrida());
        return sb.toString();

    }

}
