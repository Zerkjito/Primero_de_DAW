/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

import java.util.Arrays;

/**
 *
 * @author Erick
 */
public class Biblioteca {

    private Libro[] libros;
    private int indice;

    public Biblioteca() {
        this.libros = new Libro[100];
    }

    public boolean agregar(Libro l) {
        if (indice < libros.length) {
            libros[indice] = l;
            indice++;
            return true;
        }
        return false;
    }
    
    public boolean verificarReferencia(String ref) {
        if (libros == null || libros.length == 0) {
            return false;
        }
        
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getReferencia().equals(ref)) {
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String ref) {
        if (libros == null || libros.length == 0) {
            System.out.println("Error: No hay libros en el sistema.");
            return false;
        }

        int indicePorEliminar = -1;
        for (int i = 0; i < libros.length; i++) {
            if (ref.equals(libros[i].getReferencia())) { // se busca el índice a partir del cual hay que desplazar el libro hasta el final
                indicePorEliminar = i;
                break;
            }
        }
        for (int i = indicePorEliminar; i < libros.length - 1; i++) {
            libros[i] = libros[i + 1]; // se desplaza el libro que se quiere eliminar hasta el final para que ocupe la última posición
        }

        if (indice == -1) {
            System.out.println("Libro con referencia " + ref + " no encontrado.");
            return false;
        }
        this.libros = Arrays.copyOf(libros, libros.length - 1);
        System.out.println("Libro con referencia " + ref + " eliminado exitosamente.");
        return true;
    }

    public boolean eliminarMedianteIndice(int posicion) {
        if (libros == null || libros.length == 0) {
            System.out.println("Error: No hay libros en el sistema.");
            return false;
        }

        if (posicion < 0 || posicion > libros.length) {
            System.out.println("Error: Posicion invalida.");
            return false;
        }

        int indicePorEliminar = -1;
        for (int i = 0; i < libros.length; i++) {
            if (i == posicion) {
                indicePorEliminar = i;
                break;
            }
        }

        for (int i = indicePorEliminar; i < libros.length - 1; i++) {
            libros[i] = libros[i + 1];
        }

        if (indice == -1) {
            System.out.println("Libro con posicion " + posicion + " no encontrado.");
            return false;
        }
        this.libros = Arrays.copyOf(libros, libros.length - 1);
        System.out.println("Libro con posicion " + posicion + " eliminado exitosamente.");
        return true;
    }

    public int disponibilidad() {
        if (libros == null || libros.length == 0) {
            return 0;
        }

        int total = 0;
        for (Libro l : libros) {
            int disponibles = l.getEjemplares() - l.getEjemplaresPrestados();
            total += Math.max(disponibles, 0); // manejar posibles valores negativos
        }
        return total;
    }
    
    public void ordenarABC() {
        if (libros == null || indice == 0) {
            System.out.println("\nError: No hay libros que mostrar.\n");
            return;
        }
        
        Arrays.sort(libros, 0, indice);
        System.out.println("\nLibros en la biblioteca (ordenados alfabeticamente):");
        for (int i = 0; i < indice; i++) {
            System.out.println("\n" + libros[i]);
        }
    }

    public boolean contiene(String ref) {
        if (libros == null || libros.length == 0) {
            return false;
        }

        for (Libro l : libros) {
            if (ref.equals(l.getReferencia())) {
                return true;
            }
        }
        return false;
    }

    public Libro getLibro(String ref) {
        if (libros == null || libros.length == 0) {
            System.out.println("Error: No hay libros en el sistema.");
            return null;
        }

        for (Libro l : libros) {
            if (ref.equals(l.getReferencia())) {
                return l;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        
        if (libros == null || libros.length == 0) {
            return "No hay libros en la biblioteca.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Libros de la biblioteca:\n");
        for (Libro l : libros) {
            sb.append(l.getTitulo()).append(" - ").append(l.getAutor()).append(System.lineSeparator()); // compatbilidad de OS con el salto de linea
        }
        return sb.toString();
    }

}
