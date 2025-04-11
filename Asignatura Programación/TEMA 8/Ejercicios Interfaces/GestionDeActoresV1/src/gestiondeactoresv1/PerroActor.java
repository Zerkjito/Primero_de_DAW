/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeactoresv1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author zerkje
 */
public class PerroActor extends Perro implements Contratable {

    private double sueldo;

    public PerroActor(String id, String nombre, RazaPerro raza, int edad, double sueldo) {
        super(id, nombre, raza, edad);
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
        if (getRaza() == RazaPerro.PASTORALEMAN && getEdad() > 10) {
            return sueldo * 1.10;
        }
        return sueldo;
    }

    @Override
    public void mostrarInfo() {
        StringBuilder sb = new StringBuilder();
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        String sueldoFormateado = nf.format(calcularSueldo());
        
        sb.append(super.toString()).append(" Sueldo: ").append(sueldoFormateado);
        System.out.println(sb.toString());
    }

    /**
     * En este contexto, el NIF y el ID del animal se consideran equivalentes.
     *
     * @return
     */
    @Override
    public String getNif() {
        return getId();
    }

}
