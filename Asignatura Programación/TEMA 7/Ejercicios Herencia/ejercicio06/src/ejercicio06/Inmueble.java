/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

import java.util.Objects;

/**
 *
 * @author Erick
 */
public class Inmueble {
    private String referencia;
    private String poblacion;
    private double precioBase;
    private boolean alquilado;
    private static double descuento = 0;

    public Inmueble(String referencia, String poblacion, double precioBase) {
        this.referencia = referencia;
        this.poblacion = poblacion;
        this.precioBase = precioBase;
        this.alquilado = false;
    }

    public Inmueble() {
    }

    public Inmueble(String referencia) {
        this.referencia = referencia;
    }
    
    

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        Inmueble.descuento = Math.min(Math.max(descuento, 0), 100);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.referencia);
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
        Inmueble other = (Inmueble) obj;
        return this.referencia.equals(other.referencia);
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(referencia).append(" ");
        sb.append(poblacion);
        sb.append(" PRECIO BASE: ").append(String.format("%.2f€", precioBase));
        return sb.toString();
    }

    
    
    
}
