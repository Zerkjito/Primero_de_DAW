/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carcity;

import java.util.Objects;

/**
 *
 * @author zerkje
 */
public class Coche implements Comparable<Coche>{
    private Matricula matricula;
    private int añoMatriculacion;
    private String marca;
    private boolean electrico;

    public Coche() {
    }

    public Coche(Matricula matricula, int añoMatriculacion, String marca, boolean electrico) {
        this.matricula = matricula;
        this.añoMatriculacion = añoMatriculacion;
        this.marca = marca;
        this.electrico = electrico;
    }

    public Coche(Matricula matricula) {
        this.matricula = matricula;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public int getAñoMatriculacion() {
        return añoMatriculacion;
    }

    public void setAñoMatriculacion(int añoMatriculacion) {
        this.añoMatriculacion = añoMatriculacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Coche other = (Coche) obj;
        return this.matricula.equals(other.matricula);
    }

    @Override
    public int compareTo(Coche o) {
        return Integer.compare(this.añoMatriculacion, o.añoMatriculacion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca -> ").append(this.marca).append("\n");
        sb.append("Matricula -> ").append(this.matricula).append("\n");
        sb.append("Año matriculacion -> ").append(this.añoMatriculacion).append("\n");
        String valor = this.electrico ? "SI" : "NO";
        sb.append("Es electrico -> ").append(valor).append("\n");
        return sb.toString();
    }
    
    
    
}
