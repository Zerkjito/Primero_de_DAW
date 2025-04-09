/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionactores;

/**
 *
 * @author enrique
 */
public class PerroActor extends Perro implements Contratable{

    private double sueldo;

    public PerroActor() {
    }

    public PerroActor(double sueldo, RazaPerro raza, int edad, String identificador, String nombre) {
        super(raza, edad, identificador, nombre);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public double calcularSueldo() {
        if(this.getRaza() == RazaPerro.PASTORALEMAN && this.getEdad() >= 10){
            return this.sueldo + this.sueldo * 10 / 100;
        }
        return this.sueldo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perro ");
        sb.append(super.toString());
        sb.append(String.format(" sueldo: %,.2f\n", calcularSueldo()));
        return sb.toString();
    }
    
}
