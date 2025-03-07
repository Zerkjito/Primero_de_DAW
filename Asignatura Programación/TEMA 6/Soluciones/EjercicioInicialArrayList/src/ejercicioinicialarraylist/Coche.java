/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioinicialarraylist;

import java.util.Objects;


//---------------->implements Comparable<Coche>    necesario para que en la clase principal la instrucción Collections.sort(coches) pueda ordenar por marca
public class Coche implements Comparable<Coche>{
    private String matricula;
    private String marca;
    private int añoMatriculacion;
    private boolean electrico;

    public Coche() {
    }

    public Coche(String matricula, String marca, int añoMatriculacion, boolean electrico) {
        this.matricula = matricula;
        this.marca = marca;
        this.añoMatriculacion = añoMatriculacion;
        this.electrico = electrico;
    }
    
    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public Coche(Coche c) {
        this.matricula = c.matricula;
        this.marca = c.marca;
        this.añoMatriculacion = c.añoMatriculacion;
        this.electrico = c.electrico;
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

    public int getAñoMatriculacion() {
        return añoMatriculacion;
    }

    public void setAñoMatriculacion(int añoMatriculacion) {
        this.añoMatriculacion = añoMatriculacion;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
    
    @Override
    public String toString() {
        return matricula + " " + marca + " Año: " + añoMatriculacion + (this.isElectrico() ? " electrico" : " No electrico");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    //--->> necesario para poder utilizar contains en la clase principal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coche other = (Coche) obj;
        return this.matricula.equalsIgnoreCase(other.matricula);
    }

    //método que se genera al implementar Comparable
    //Aquí se debe indicar el atributo por el que se realizarán las ordenaciones. En este caso el atributo marca
    @Override
    public int compareTo(Coche o) {
        return this.marca.compareToIgnoreCase(o.marca);
        //el método compara la marca de dos objetos y devuelve el resultado de la comparación:  == 0   > 0    < 0
        //este resultado lo utiliza el método sort para determinar si tiene que intercambiar o no lo dos objetos dentro del ArrayList
    }
    
}
