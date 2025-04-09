
package gestionactores;

import java.util.Objects;

public abstract class Animal implements Comparable<Animal>{
    private String id;
    private String nombre;

    public Animal() {
    }

    public Animal(String identificador, String nombre) {
        this.id = identificador;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(" ").append(nombre);
        return sb.toString();
    }

    @Override
    public int compareTo(Animal t) {
       return this.nombre.compareToIgnoreCase(t.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Animal other = (Animal) obj;
        if (!this.id.equalsIgnoreCase(other.id)) {
            return false;
        }
        return true;
    }
}
