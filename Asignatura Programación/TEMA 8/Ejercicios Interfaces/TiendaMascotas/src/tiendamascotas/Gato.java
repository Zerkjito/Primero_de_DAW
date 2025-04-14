/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author zerkje
 */
public class Gato extends Animal{
    private RazaGato raza;

    public Gato(int codigo, double precio, RazaGato raza) {
        super(codigo, precio);
        this.raza = raza;
    }

    
    
    
    public RazaGato getRaza() {
        return raza;
    }

    public void setRaza(RazaGato raza) {
        this.raza = raza;
    }

    @Override
    public double obtenerPrecio() {
        if(!enOferta()) return getPrecio();
        return getPrecio() *  1.25;
    }

    @Override
    public boolean enOferta() {
        return isOferta();
    }
    
}
