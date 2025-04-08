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
public class Coche extends Vehiculo{
    private int numPlazas;

    public Coche(String matricula, int potencia) {
        super(matricula, potencia);
    }

    public Coche() {
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
        
    
}
