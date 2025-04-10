/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeactoresv1;

/**
 *
 * @author Erick
 */
public class Amateur extends Actor{
    private int numeroDeHoras;

    public Amateur(String nif, String nombre, int edad, Genero genero, int numeroDeHoras) {
        super(nif, nombre, edad, genero);
        this.numeroDeHoras = numeroDeHoras;
    }

    public Amateur() {
    }

    public int getNumeroDeHoras() {
        return numeroDeHoras;
    }

    public void setNumeroDeHoras(int numeroDeHoras) {
        this.numeroDeHoras = numeroDeHoras;
    }
    

    @Override
    public double calcularSueldo() {
    }
    
    
}
