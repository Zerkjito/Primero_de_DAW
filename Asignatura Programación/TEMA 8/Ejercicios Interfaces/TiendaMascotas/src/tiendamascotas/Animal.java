/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author zerkje
 */
public abstract class Animal implements Tienda {

    private int codigo;
    private double precio;
    private boolean oferta;

    public Animal(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
        this.oferta = false;
    }

    public Animal(int codigo) {
        this.codigo = codigo;
    }

    public Animal() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Animal other = (Animal) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codigo);
        sb.append("\nPrecio ");
        if (oferta) {
            sb.append(" EN OFERTA: ");
        } else {
            sb.append(": ");
        }
        sb.append(String.format("%.2f EUR", obtenerPrecio()));
        return sb.toString();
    }

}
