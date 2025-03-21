/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

import java.util.Objects;

/**
 *
 * @author zerkje
 */
public class Libro implements Comparable<Libro> {

    private String referencia;
    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro(String referencia, String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
        this.referencia = referencia;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Libro() {
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        if (ejemplares < 0) {
            this.ejemplares = 0;
        }
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public boolean prestamo() {
        if (this.ejemplares == 0) {
            System.out.println("Error: No hay ejemplares de " + titulo + " en existencia.");
            return false;
        }

        this.ejemplares--;
        this.ejemplaresPrestados++;
        return true;
    }

    public boolean devolucion() {
        if (this.ejemplaresPrestados > 0) {
            this.ejemplares++;
            this.ejemplaresPrestados--;
            return true;
        }
        System.out.println("Error: No hay ejemplares prestados de " + titulo + " para devolver.");
        return false;
    }

    public boolean estaDisponible() {
        return this.ejemplares > 0;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-30s - %30s", this.titulo, this.autor));
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.referencia);
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

        final Libro other = (Libro) obj;
        return Objects.equals(this.referencia, other.referencia);
    }

    @Override
    public int compareTo(Libro o) {
        return this.titulo.compareToIgnoreCase(o.titulo);
    }

}
