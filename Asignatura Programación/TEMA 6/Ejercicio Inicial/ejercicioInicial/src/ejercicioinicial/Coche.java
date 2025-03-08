/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioinicial;

/**
 *
 * @author Erick
 */
public class Coche implements Comparable<Coche>{

    private String matricula;
    private String marca;
    private int año;
    private boolean electrico;

    public Coche(String matricula, String marca, int año, boolean electrico) {
        this.matricula = matricula;
        this.marca = marca;
        this.año = año;
        this.electrico = electrico;
    }

    public Coche(Coche c) {
        this(c.matricula, c.marca, c.año, c.electrico);
    }

    public Coche() {
    }

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public Coche(int año) {
        this.año = año;
    }

    public Coche(boolean electrico) {
        this.electrico = electrico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(matricula).append(" ");
        sb.append(marca).append(" ");
        sb.append("Año: ");
        sb.append(año);
        sb.append((electrico ? " electrico" : " no electrico"));
        return sb.toString();
    }

    @Override
    public int compareTo(Coche o) {
        return this.marca.compareTo(o.marca);
    }

}
