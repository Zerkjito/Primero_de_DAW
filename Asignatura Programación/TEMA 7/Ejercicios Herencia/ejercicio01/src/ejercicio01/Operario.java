/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Erick
 */
public class Operario extends Empleado {

    public Operario(String nombre) {
        super(nombre);
    }

    public Operario() {
        System.out.println("Constructor de Operario");
    }

    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }

}
