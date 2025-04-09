/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author Erick
 */
public class Moto extends Vehiculo{

    public Moto(String matricula, int potencia) {
        super(matricula, potencia);
    }

    public Moto() {
    }
    
    
    @Override
    public void mostrarInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMoto:\n");
        sb.append("Matricula: ").append(getMatricula()).append("\n");
        sb.append("Potencia: ").append(getPotencia()).append("CV");
        System.out.println(sb.toString());
        
    }

    @Override
    public double calcularCuota() {
        return getPotencia() * 2;
    }
     
}
