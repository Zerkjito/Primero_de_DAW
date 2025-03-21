/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

import java.util.Arrays;
import java.util.Comparator;

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
            System.out.println("Libro agregado exitosamente.");
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

    public boolean eliminarMedianteRef(String ref) {
        if (libros == null || indice == 0) {
            System.out.println("Error: No hay libros en el sistema.");
            return false;
        }

        int indicePorEliminar = -1;
        for (int i = 0; i < indice; i++) {
            if (libros[i] != null && ref.equals(libros[i].getReferencia())) { // se busca el índice a partir del cual hay que desplazar el libro hasta el final
                indicePorEliminar = i;
                break;
            }
        }
        if (indicePorEliminar == -1) { // he de verificar antes de desplazar para evitar conflictos
            System.out.println("Libro con referencia " + ref + " no encontrado.");
            return false;
        }

        for (int i = indicePorEliminar; i < libros.length - 1; i++) {
            libros[i] = libros[i + 1]; // se desplaza el libro que se quiere eliminar hasta el final para que ocupe la última posición
        }

        libros[indice - 1] = null;
        indice--;
        System.out.println("Libro con referencia " + ref + " eliminado exitosamente.");
        return true;
    }

    public boolean eliminarMedianteIndice(int posicion) {
        if (libros == null || indice == 0) {
            System.out.println("Error: No hay libros en el sistema.");
            return false;
        }

        if (posicion < 0 || posicion >= indice) {
            System.out.println("Error: Posicion invalida o no inicializada.");
            return false;
        }

        for (int i = posicion; i < libros.length - 1; i++) {
            libros[i] = libros[i + 1];
        }

        libros[indice - 1] = null;
        indice--;
        System.out.println("Libro en la posicion " + posicion + " eliminado exitosamente.");
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

        Libro[] librosValidos = Arrays.copyOf(libros, indice);

        Arrays.sort(librosValidos, Comparator.comparing(Libro::getTitulo, String.CASE_INSENSITIVE_ORDER));

        System.out.println("\nLibros en la biblioteca (ordenados alfabeticamente):");
        for (Libro l : librosValidos) {
            System.out.println("\n" + l);
        }
    }

    public void ordenarDisponiblesABC() {
        if (libros == null || indice == 0) {
            System.out.println("\nError: No hay libros que mostrar.\n");
            return;
        }
        

        Libro[] librosValidos = Arrays.copyOf(libros, indice);

        Arrays.sort(librosValidos, Comparator.comparing(Libro::getTitulo, String.CASE_INSENSITIVE_ORDER));

        System.out.println("\nLibros en la biblioteca disponibles (ordenados alfabeticamente):");
        for (Libro l : librosValidos) {
            if (l.getEjemplares() != 0) {
                System.out.println("\n" + l);
            }

        }
    }

    public void realizarPrestamo(String ref) {
        if (libros == null || indice == 0) {
            System.out.println("\nError: No hay libros en la biblioteca actualmente para realizar prestamos.\n");
            return;
        }

        for (int i = 0; i < indice; i++) {
            if (libros[i] != null && ref.equals(libros[i].getReferencia())) {
                boolean exito = libros[i].prestamo();
                if (exito) {
                    System.out.println("Prestamo exitoso de: " + libros[i].getTitulo());
                }
                return;
            }
        }
        System.out.println("Error: No se encontro el libro con la referencia " + ref + ".");
    }

    public void realizarDevolucion(String ref) {
        if (libros == null || indice == 0) {
            System.out.println("\nError: No hay libros en la biblioteca actualmente para realizar devoluciones.\n");
            return;
        }

        for (int i = 0; i < indice; i++) {
            if (libros[i] != null && ref.equals(libros[i].getReferencia())) {
                boolean exito = libros[i].devolucion();
                if (exito) {
                    System.out.println("Devolcuion exitosa de: " + libros[i].getTitulo());
                }
                return;
            }
        }
        System.out.println("Error: No se encontro el libro con la referencia " + ref + ".");
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

    public void mosrarBiblioteca() {
        if (libros == null || indice == 0) {
            System.out.println("Error: No hay libros en el sistema.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        Libro[] librosValidos = Arrays.copyOf(libros, indice);

        System.out.println("Datos biblioteca ordenada alfabeticamente:");
        Arrays.sort(librosValidos, Comparator.comparing(Libro::getTitulo, String.CASE_INSENSITIVE_ORDER));
        for (Libro l : librosValidos) {
            sb.append("\nTitulo: ").append(l.getTitulo()).append("\n");
            sb.append("Autor: ").append(l.getAutor()).append("\n");
            sb.append("Ejemplares disponibles: ").append(l.getEjemplares()).append("\n");
            sb.append("Ejemplares prestados: ").append(l.getEjemplaresPrestados()).append("\n");
        }
        System.out.println(sb.toString());
    }

}
