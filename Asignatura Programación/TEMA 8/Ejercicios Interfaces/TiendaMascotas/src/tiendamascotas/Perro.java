/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author zerkje
 */
public class Perro extends Animal {

    private RazaPerro raza;

    public Perro(int codigo, double precio, RazaPerro raza) {
        super(codigo, precio);
        this.raza = raza;
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    @Override
    public double obtenerPrecio() {
        if (!enOferta()) {
            return getPrecio();
        }

        double factor = raza == RazaPerro.LABRADOR ? 1.25 : 1.20;
        return getPrecio() * factor;
    }

    @Override
    public boolean enOferta() {
        return isOferta();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perro ").append(super.toString());
        return sb.toString();
    }

    @Override
    public boolean aplicarOferta() {
        if (enOferta()) {
            setOferta(false);
            return true;
        } else if (!enOferta() && getPrecio() > 5) {
            setOferta(true);
            return true;
        }
        return false;
    }
}
