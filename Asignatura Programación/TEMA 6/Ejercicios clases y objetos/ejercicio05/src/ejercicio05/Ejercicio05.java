/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author zerkje
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l1 = new Libro("Rios de sangre", "Federico Garcia Lorca", 10, 2);
        Libro l2 = new Libro("Cuando el Alma llama", "Zapin", 5, 3);
        System.out.println("Datos del libro 1:");
        System.out.println(l1);
        System.out.println("\nDatos del libro 2:");
        System.out.println(l2);
        System.out.println("\nEjemplares de " +  l1.getTitulo() + ": " + l1.getEjemplares());
        System.out.println("Ejemplares prestados de " + l1.getTitulo() + ": " + l1.getEjemplaresPrestados());
        l1.prestamo();
        System.out.println("Ejemplares de " +  l1.getTitulo() + " despues de realizar un prestamo: " + l1.getEjemplares());
        System.out.println("Ejemplares prestados de " + l1.getTitulo() + " despues de realizar un prestamo: " + l1.getEjemplaresPrestados());
        l1.devolucion();
        l1.devolucion();
        System.out.println("\nEjemplares de " +  l1.getTitulo() + " despues de realizar 2 devoluciones: " + l1.getEjemplares());
        System.out.println("Ejemplares prestados de " + l1.getTitulo() + " despues de realizar 2 devoluciones: " + l1.getEjemplaresPrestados());
    }
}
