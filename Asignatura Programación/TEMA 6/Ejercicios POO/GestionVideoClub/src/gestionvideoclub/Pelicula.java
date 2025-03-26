/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvideoclub;

/**
 *
 * @author zerkje
 */
public class Pelicula {
    private String titulo;
    private String director;
    private String genero;
    private String codigo;
    private int copiasDisponibles;

    public Pelicula(String titulo, String director, String genero, String codigo, int copiasDisponibles) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.codigo = codigo;
        this.copiasDisponibles = copiasDisponibles;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }
    
    public boolean estaDisponible() {
        return this.copiasDisponibles > 0;
    }
    
    public boolean alquilar() {
        if (estaDisponible()) {
            this.copiasDisponibles--;
            return true;
        } else {
            return false;
        }
    }
    
    public void devolver() {
        this.copiasDisponibles++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{");
        sb.append("titulo=").append(titulo);
        sb.append(", director=").append(director);
        sb.append(", genero=").append(genero);
        sb.append(", codigo=").append(codigo);
        sb.append(", copiasDisponibles=").append(copiasDisponibles);
        return sb.toString();
    }
    
    
    
    
}
