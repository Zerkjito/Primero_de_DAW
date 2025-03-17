/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author zerkje
 */
class Libro {
    
    private String referencia;
    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro(String referencia, String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
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
        sb.append("Referencia: ").append(this.referencia).append("\n");
        sb.append("Titulo: ").append(this.titulo).append("\n");;
        sb.append("Autor: ").append(this.autor).append("\n");;
        sb.append("Ejemplares: ").append(this.ejemplares).append("\n");
        sb.append("Ejemplares prestados: ").append(this.ejemplaresPrestados).append("\n");
        return sb.toString();
    }

}
