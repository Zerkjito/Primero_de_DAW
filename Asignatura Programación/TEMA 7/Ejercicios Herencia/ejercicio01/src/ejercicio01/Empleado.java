/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Erick
 */
public class Empleado {

    private String nombre;

    public Empleado() {
        System.out.println("Constructor de Empleado");
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor de empleado");
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
        sb.append("Empleado: ").append(nombre);
        return sb.toString();
    }

}
