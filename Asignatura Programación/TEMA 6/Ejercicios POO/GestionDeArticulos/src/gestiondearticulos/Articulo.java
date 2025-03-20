/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondearticulos;

import java.util.Objects;

/**
 *
 * @author zerkje
 */
public class Articulo implements Comparable<Articulo>{
    private String codigo;
    private String descripcion;
    private double precio;
    private Fecha fechaCaducidad;
    private boolean productoEstrella = false;
    private static double porcentajeDescuento = 30;

    public Articulo() {
    }

    public Articulo(String codigo, String descripcion, double precio, Fecha fechaCaducidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad;
    };

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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

    public Fecha getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Fecha fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public boolean isProductoEstrella() {
        return productoEstrella;
    }

    public void setProductoEstrella(boolean productoEstrella) {
        this.productoEstrella = productoEstrella;
    }

    public static double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public static void setPorcentajeDescuento(double porcentajeDescuento) {
        Articulo.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codigo);
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
        return this.codigo.equals(other.codigo);
    }
    
    
    
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Articulo -> ").append(this.descripcion).append("\n");
        sb.append("Codigo -> ").append(this.codigo).append("\n");
        sb.append(String.format("Precio %.2f EUR", this.precio)).append("\n");
        sb.append("Fecha caducidad -> ").append(this.fechaCaducidad.fechaCorta()).append("\n");
        String valor = this.productoEstrella ? "SI" : "NO";
        sb.append("Es producto estrella -> ").append(valor);
        return sb.toString();
    }

    @Override
    public int compareTo(Articulo o) {
        return this.descripcion.compareTo(o.descripcion);
    }
    
    
    
}
