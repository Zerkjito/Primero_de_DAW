/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

import java.util.Objects;

/**
 *
 * @author Erick
 */
public class Coche extends Vehiculo {

    private int numPlazas;

    public Coche(String matricula, int potencia, int numPlazas) {
        super(matricula, potencia);
        this.numPlazas = numPlazas;
    }

    public Coche() {
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public void mostrarInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCoche:\n");
        sb.append("Matricula: ").append(getMatricula()).append("\n");
        sb.append("Potencia: ").append(getPotencia()).append("CV");
        System.out.println(sb.toString());
    }
}
