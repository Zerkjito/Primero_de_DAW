/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioinicial;


public class Coche {
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

    //Punto 5 del ejercicio. Necesitamos el constructor copia
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
    
    //Punto 3 del ejercicio. Crear método toString
    @Override
    public String toString() {
        return matricula + " " + marca + " Año: " + añoMatriculacion + (this.isElectrico() ? " electrico" : " No electrico");
    }
    
    
}
