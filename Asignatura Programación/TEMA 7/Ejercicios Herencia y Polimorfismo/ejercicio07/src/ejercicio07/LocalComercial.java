/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Erick
 */
public class LocalComercial extends Inmueble {

    private int tamaño;
    private boolean reformado;

    public LocalComercial(String referencia, String poblacion, double precioBase, int tamaño, boolean reformado) {
        super(referencia, poblacion, precioBase);
        this.tamaño = tamaño;
        this.reformado = reformado;
    }

    public LocalComercial() {
    }

    public LocalComercial(String referencia) {
        super(referencia);
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isReformado() {
        return reformado;
    }

    public void setReformado(boolean reformado) {
        this.reformado = reformado;
    }

    public void alquilar() {
        if (!this.isAlquilado()) {
            this.setAlquilado(true);
        }
    }

    public void devolver() {
        if (this.isAlquilado()) {
            this.setAlquilado(false);
        }
    }

    @Override
    public String toString() {
        String reforma = this.isReformado() ? " REFORMADO" : " NO REFORMADO";
        String disponibilidad = this.isAlquilado() ? " ALQUILADO" : " DISPONIBLE";

        StringBuilder sb = new StringBuilder();

        sb.append("\nLOCAL ").append(super.toString()).append(" SUPERFICIE: ").append(this.tamaño).append("m2");
        sb.append(reforma).append(disponibilidad).append(String.format(" PRECIO ALQUILER: %.2f€%n", this.calcularPrecio()));
        return sb.toString();
    }

    @Override
    public double calcularPrecio() {
        double precioFinalAlquiler = this.getPrecioBase();
        if (reformado) {
            precioFinalAlquiler += 100;
        }

        if (tamaño > 200) {
            precioFinalAlquiler += 100;
        }

        double descuento = precioFinalAlquiler * (Inmueble.getDescuento() / 100);
        return precioFinalAlquiler - descuento;
    }

}
