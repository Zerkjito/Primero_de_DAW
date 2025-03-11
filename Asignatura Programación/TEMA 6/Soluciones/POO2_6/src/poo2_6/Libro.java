/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2_6;

public class Libro {

    private String referencia;
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
    public Libro(String referencia, String titulo, String autor, int ejemplares) {
        this.referencia = referencia;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
    }
    

    //constructor copia
    public Libro(Libro l) {
        this.referencia = l.referencia;
        this.titulo = l.titulo;
        this.autor = l.autor;
        this.ejemplares = l.ejemplares;
        this.prestados = l.prestados;
    }
    
    //métodos setters/getters
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
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
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
    
    //método que comprueba si hay ejemplares del libro para prestar
    public boolean estaDisponible() {
        return prestados < ejemplares;
    }

    //método que devuelve el número de ejemplares disponibles para prestar
    public int numeroDeEjemplaresDisponibles() {
        return ejemplares - prestados;
    }

    //método toString()devuelve un String con los datos del libro
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
