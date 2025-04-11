/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeactoresv1;

import java.util.Objects;

/**
 *
 * @author zerkje
 */
public abstract class Animal {
    private String id;
    private String nombre;

    public Animal() {
    }

    public Animal(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPerro ").append(id).append(" ").append(nombre); // "Perro" no deberia ir aqui, ya que es la clase Animal
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
            
        }
        
        if (obj instanceof Animal other) {
            return this.id != null && this.id.equals(other.id);
        }
        
        if (obj instanceof Actor other) {
            return this.id != null && this.id.equals(other.getNif());
        }
        return false;
    }
    
    public abstract void mostrarInfo();
    
}
