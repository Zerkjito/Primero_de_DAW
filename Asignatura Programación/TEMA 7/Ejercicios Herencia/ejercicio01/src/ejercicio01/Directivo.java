/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Erick
 */
public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    public Directivo() {
        System.out.println("Constructor de Directivo");
    }

    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }

}
