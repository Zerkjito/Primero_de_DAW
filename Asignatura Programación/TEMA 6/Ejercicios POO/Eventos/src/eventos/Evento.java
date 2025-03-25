/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author zerkje
 */
public class Evento {
    private String nombre;
    private String fecha; // dd//MM//yyyy
    private Ubicacion ubicacion;
    private int aforoMaximo;
    private int aforo;
    private ArrayList<String> asistentes = new ArrayList<>();

    public Evento(String nombre, String fecha, Ubicacion ubicacion, int aforoMaximo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.aforoMaximo = aforoMaximo;
        this.aforo = 0;
    }

    public Evento() {
    }

    public Evento(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public ArrayList<String> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(ArrayList<String> asistentes) {
        this.asistentes = asistentes;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
    
    
    
    public void realizarRegistroAsist(String nombreAsistente) {
        this.asistentes.add(nombreAsistente);
        this.aforo++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del evento: ").append(this.nombre).append("\n");
        sb.append("Fecha: ").append(this.fecha).append("\n");
        sb.append(this.ubicacion).append("\n");
        sb.append("Asistentes registrados: ").append(this.aforo).append("\n"); // o seria mejor poner this.aforo?
        sb.append("Aforo maximo: ").append(this.aforoMaximo);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.fecha);
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
        
        Evento other = (Evento) obj;
        
        return this.fecha.equals(other.fecha) && this.nombre.equalsIgnoreCase(other.nombre);
    }
    
    
    

    
}
