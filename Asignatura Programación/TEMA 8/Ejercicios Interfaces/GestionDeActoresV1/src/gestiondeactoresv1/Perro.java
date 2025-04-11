/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeactoresv1;

/**
 *
 * @author zerkje
 */
public class Perro extends Animal {

    private RazaPerro raza;
    private int edad;

    public Perro(String id, String nombre, RazaPerro raza, int edad) {
        super(id, nombre);
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public void mostrarInfo() {
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" Raza: ").append(raza).append(" Edad: ").append(edad);
        return sb.toString();
    }

}
