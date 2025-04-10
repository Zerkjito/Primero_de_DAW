/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeactoresv1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

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

    public Amateur(String nif) {
        super(nif);
    }
    
    public int getNumeroDeHoras() {
        return numeroDeHoras;
    }

    public void setNumeroDeHoras(int numeroDeHoras) {
        this.numeroDeHoras = numeroDeHoras;
    }
    

    @Override
    public double calcularSueldo() {
        return getNumeroDeHoras() * getImporteHoras();
    }

    @Override
    public void mostrarInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nActor Amateur: ");
        sb.append(super.toString()).append(" Horas: ").append(numeroDeHoras);
        
        NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        
        String sueldoFormteado = nf.format(calcularSueldo());
        sb.append("Sueldo: ").append(sueldoFormteado).append(" EUR");
        System.out.println(sb.toString());
        
    }
    
}
