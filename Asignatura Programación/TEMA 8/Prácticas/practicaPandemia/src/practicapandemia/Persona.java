/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapandemia;

import java.util.Objects;

/**
 *
 * @author zerkje
 */
public class Persona implements Analizable{

    private String id;
    private int añoNacimiento;
    private Genero genero;
    private boolean sintomatico;
    private boolean positivo;

    public Persona() {
    }

    public Persona(String id, int añoNacimiento, Genero genero, boolean sintomatico) {
        this.id = id;
        this.añoNacimiento = añoNacimiento;
        this.genero = genero;
        this.sintomatico = sintomatico;
        this.positivo = false;
    }

    public Persona(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public boolean isSintomatico() {
        return sintomatico;
    }

    public void setSintomatico(boolean sintomatico) {
        this.sintomatico = sintomatico;
    }

    public boolean isPositivo() {
        return positivo;
    }

    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        Persona other = (Persona) obj;
        return this.id.equals(other.id);
    }

    @Override
    public void contagiar() {
        setPositivo(true);
    }

    @Override
    public String obtenerTipo() {
        return "CIV";
    }

    @Override
    public String obtenerId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", a\u00f1oNacimiento=").append(añoNacimiento);
        sb.append(", genero=").append(genero);
        sb.append(", sintomatico=").append(sintomatico);
        sb.append(", positivo=").append(positivo);
        return sb.toString();
    }
    
    

}
