package carcity;

import java.util.Objects;

public class Matricula {

    private String numeros;
    private String letras;

    public Matricula() {
    }

    public Matricula(String numeros, String letras) {
        this.numeros = numeros;
        this.letras = letras;
    }
    
     public Matricula(Matricula m) {
        this.numeros = m.numeros;
        this.letras = m.letras;
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
        hash = 53 * hash + Objects.hashCode(this.numeros);
        hash = 53 * hash + Objects.hashCode(this.letras);
        return hash;
    }

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
        final Matricula other = (Matricula) obj;
        if (!this.numeros.equalsIgnoreCase(other.numeros)) {
            return false;
        }
        if (!this.letras.equalsIgnoreCase(other.letras)) {
            return false;
        }
        return true;
    }
 
    @Override
    public String toString() {
        return numeros + letras.toUpperCase();
    }

}
