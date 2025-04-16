/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author zerkje
 */
public class Articulo implements Tienda {

    private int codigo;
    private String descripcion;
    private double precio;
    private boolean oferta;

    public Articulo(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.oferta = false;
    }

    public Articulo(int codigo) {
        this.codigo = codigo;
    }

    public Articulo() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        int hash = 3;
        hash = 71 * hash + this.codigo;
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
        Articulo other = (Articulo) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nArticulo ").append(codigo);
        sb.append("\nDescripcion: ").append(descripcion);
        sb.append("\nPrecio ");
        if (oferta) {
            sb.append(" EN OFERTA: ");
        } else {
            sb.append(": ");
        }
        sb.append(String.format("%.2f EUR", obtenerPrecio()));
        return sb.toString();
    }

    @Override
    public double obtenerPrecio() {
        if (!enOferta()) {
            return getPrecio();
        }
        return getPrecio() * 1.10;
    }

    @Override
    public boolean enOferta() {
        return isOferta();
    }

    @Override
    public boolean aplicarOferta() {
        if (enOferta()) {
            setOferta(false);
            return true;
        } else if (!enOferta() && precio > 5) {
            setOferta(true);
            return true;
        }
        return false;
    }

}
