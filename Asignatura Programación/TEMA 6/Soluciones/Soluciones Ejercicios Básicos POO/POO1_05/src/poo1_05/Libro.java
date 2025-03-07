/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1_05;

public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    //Constructor por defecto
    public Libro() {
    }

    //Constructor con parámetros
    //Cuando se crea un nuevo Libro el atributo prestados es cero (valor por defecto)
    //por lo tanto no es necesario enviar ese valor al constructor para crear el objeto
    public Libro(String t, String a, int n) {
        titulo = t;
        autor = a;
        ejemplares = n;
    }

    //Constructor copia
    public Libro(Libro l) {
        titulo = l.titulo;
        autor = l.autor;
        ejemplares = l.ejemplares;
        prestados = l.prestados;
    }

    //métodos setters/getters
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
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //método préstamo
    public boolean prestamo() {
        if (prestados < ejemplares) {
            prestados++;
            return true;
        }
        return false;
    }

    //método devolución
    public boolean devolucion() {
        if (prestados == 0) {
            return false;
        }
        prestados--;
        return true;
    }

    //método toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ");
        sb.append(titulo);
        sb.append("\nAutor: ");
        sb.append(autor);
        sb.append("\nEjemplares: ");
        sb.append(ejemplares);
        sb.append("\nPrestados: ");
        sb.append(prestados);
        return sb.toString();
    }
}
