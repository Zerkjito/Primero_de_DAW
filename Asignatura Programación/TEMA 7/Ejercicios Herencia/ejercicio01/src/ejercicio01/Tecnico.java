/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Erick
 */
public class Tecnico extends Operario {

    public Tecnico(String nombre) {
        super(nombre);
    }

    public Tecnico() {
        System.out.println("Constructor de Tencico");
    }

    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}
