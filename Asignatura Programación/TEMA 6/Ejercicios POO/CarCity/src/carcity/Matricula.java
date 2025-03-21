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
public class Matricula {
    private String numeros;
    private String letras;

    public Matricula() {
    }

    public Matricula(String numeros, String letras) {
        this.numeros = numeros;
        this.letras = letras;
    }

    public Matricula(String numeros) {
        this.numeros = numeros;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.numeros);
        hash = 37 * hash + Objects.hashCode(this.letras);
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
        
        Matricula other = (Matricula) obj;
        
        if (!Objects.equals(this.numeros, other.numeros)) {
            return false;
        }
        return this.numeros.equals(other.numeros) && this.letras.equalsIgnoreCase(other.letras);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.numeros).append("-").append(this.letras);
        return sb.toString();
    }
    
    
    
}
