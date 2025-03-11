/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2_6;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class POO2_6 {

  
    static Pila pilaDeLibros = new Pila();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        int opcion;
        do {
            menu.mostrar();
            opcion = menu.leer();
            switch (opcion) {
                case 1 -> añadirLibro();
                case 2 -> extraerLibro();
                case 3 -> verCima();
                case 4 -> mostrarPila();
                case 5 -> eliminarPila();
            }
        } while (opcion != 0);
    }

    public static void añadirLibro() {
        System.out.println("\nAñadir libro a la pila");
        System.out.println("\nIntroduzca los datos del libro");
        String referencia, titulo, autor;
        int ejemplares;
        System.out.print("Referencia: ");
        referencia = sc.nextLine();
        System.out.print("Título: ");
        titulo = sc.nextLine();
        System.out.print("Autor: ");
        autor = sc.nextLine();
        System.out.print("Número de ejemplares: ");
        ejemplares = sc.nextInt();
        sc.nextLine();
        Libro libro = new Libro(referencia, titulo, autor, ejemplares);
        pilaDeLibros.push(libro);

    }

    public static void extraerLibro() {
        System.out.println("\nExtraer un libro de la pila");
        if (pilaDeLibros.size() == 0) {
            System.out.println("\nPila vacía\n");
        } else {
            System.out.println("Libro: ");
            System.out.println(pilaDeLibros.pop());
        }
    }

    public static void verCima() {
        System.out.println("\nMostrar el libro que está en la cima de la pila");
        if (pilaDeLibros.size() == 0) {
            System.out.println("\nPila vacía\n");
        } else {
            System.out.println("Libro: ");
            System.out.println(pilaDeLibros.cima());
        }
    }

    public static void mostrarPila() {
        System.out.println("\nMostrar el contenido de la pila");
        if (pilaDeLibros.size() == 0) {
            System.out.println("\nPila vacía\n");
        } else {
            System.out.println(pilaDeLibros);
        }
    }

    public static void eliminarPila() {
        System.out.println("\nEliminar todos los elementos de la pila");
        String respuesta;
        if (pilaDeLibros.size() == 0) {
            System.out.println("\nPila vacía\n");
        } else {
            do {
                System.out.println("TODAS LOS LIBROS SE ELIMINARÁN. ESTÁ SEGURO? (SI/NO");
                respuesta = sc.nextLine();
            } while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO"));
            if (respuesta.equalsIgnoreCase("SI")) {
                pilaDeLibros.clear();
            }
        }
    }
}

