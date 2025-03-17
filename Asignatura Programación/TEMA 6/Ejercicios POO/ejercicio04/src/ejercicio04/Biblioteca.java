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

    public boolean eliminar(String ref) {
        if (libros == null || libros.length == 0) {
            System.out.println("Error: No hay libros en el sistema.");
            return false;
        }

        int indicePorEliminar = -1;
        boolean encontrado = false;
        for (int i = 0; i < libros.length; i++) {
            if (ref.equals(libros[i].getReferencia())) {
                indicePorEliminar = i;
                encontrado = true;
                break;
            }
        }
        for (int i = indicePorEliminar; i < libros.length - 1; i++) {
            libros[i] = libros[i + 1];
        }

        if (indice == -1) {
            System.out.println("Libro con referencia " + ref + " no encontrado.");
            return false;
        }
        this.libros = Arrays.copyOf(libros, libros.length - 1);
        System.out.println("Libro con referencia " + ref + " eliminado exitosamente.");
        return true;
    }
}
