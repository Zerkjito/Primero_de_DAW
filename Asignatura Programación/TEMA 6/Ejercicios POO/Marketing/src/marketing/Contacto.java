/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marketing;

import java.util.Objects;

/**
 *
 * @author Erick
 */
public class Contacto implements Comparable<Contacto>{
    private String nombre;
    private String telefono;
    private Direccion direccion;
    private int numeroDeLlamadas = 0;
    private static int limiteLlamadas = 10;

    public Contacto(String nombre, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Contacto() {
    }
    
      public Contacto(Contacto c) {
        this.nombre = c.nombre;
        this.telefono = c.telefono;
        this.direccion = c.direccion;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getNumeroDeLlamadas() {
        return numeroDeLlamadas;
    }

    public void setNumeroDeLlamadas(int numeroDeLlamadas) {
        this.numeroDeLlamadas = numeroDeLlamadas;
    }

    public static int getLimiteLlamadas() {
        return limiteLlamadas;
    }

    public static void setLimiteLlamadas(int limiteLlamadas) {
        Contacto.limiteLlamadas = limiteLlamadas;
    }
    
    public void incrementarNumeroDeLlamdas() {
        this.numeroDeLlamadas++;
    }
    
    public boolean alcanzadoLimiteLlamadas() {
        return this.numeroDeLlamadas == limiteLlamadas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre contacto -> ").append(this.nombre).append("\n");
        sb.append("Telefono -> ").append(this.telefono).append("\n");
        sb.append(this.direccion).append("\n");
        sb.append("Numero de llamadas -> ").append(this.numeroDeLlamadas);
        return sb.toString();
    }

    @Override
    public int compareTo(Contacto o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nombre);
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
        
        Contacto other = (Contacto) obj;
        return this.nombre.equalsIgnoreCase(other.nombre);
    }
    
    
    
    
    
}
