/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema6erickhurtado;

/**
 *
 * @author lliurex
 */
public class Dueño {
    private String nombre;
    private String telefono;

    public Dueño(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Dueño() {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dueño(a): ").append(nombre).append("\n");
        sb.append("Telefono dueño(a): ").append(telefono).append("\n");
        return sb.toString();
    }
    
    
}
