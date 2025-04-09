package gestionactores;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Actor implements Contratable {

    private final static Logger LOGGER = Logger.getLogger(Actor.class.getName());
    
    private String nif;
    private String nombre;
    private int edad;
    private Genero genero;
    private static double importeFijo;
    private static double precioHora;

    public Actor() {
    }

    public Actor(String nif, String nombre, int edad, Genero genero) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        LOGGER.log(Level.INFO, "Constructor Actor(" + nif + "," + nombre + "," + edad + "," + genero + ")");
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public static double getImporteFijo() {
        return importeFijo;
    }

    public static void setImporteFijo(double importeFijo) {
        Actor.importeFijo = importeFijo;
    }

    public static double getPrecioHora() {
        return precioHora;
    }

    public static void setPrecioHora(double precioHora) {
        Actor.precioHora = precioHora;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nif);
        sb.append(" ");
        sb.append(nombre);
        sb.append(" Edad: ");
        sb.append(edad);
        sb.append(" ");
        sb.append(genero);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nif);
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
        final Actor other = (Actor) obj;
        if (!this.nif.equalsIgnoreCase(other.nif)) {
            return false;
        }
        return true;
    }

    
}
