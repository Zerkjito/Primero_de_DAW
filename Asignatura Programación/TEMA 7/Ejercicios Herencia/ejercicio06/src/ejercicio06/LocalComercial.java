/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Erick
 */
public class LocalComercial extends Inmueble{
    private int tamaño;
    private boolean reformado;

    public LocalComercial(int tamaño, boolean reformado, String referencia, String poblacion, double precioBase) {
        super(referencia, poblacion, precioBase);
        this.tamaño = tamaño;
        this.reformado = reformado;
    }

    public LocalComercial() {
    }
    
    

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isReformado() {
        return reformado;
    }

    public void setReformado(boolean reformado) {
        this.reformado = reformado;
    }
    
    
}
