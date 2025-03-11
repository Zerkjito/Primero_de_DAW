/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2_4;

import java.util.Scanner;

public class POO2_4 {

    static Biblioteca biblioteca = new Biblioteca();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Menu menu = new Menu();
        int opcion;
        do {
            menu.mostrar();
            opcion = menu.leer();
            switch (opcion) {
                case 1 -> libroNuevo();
                case 2 -> mostrarLibros();
                case 3 -> buscarLibros();
                case 4 -> darDeBajaLibroPorReferencia();
                case 5 -> darDeBajaLibroPorPosicion();
                case 6 -> realizarPrestamo();
                case 7 -> realizarDevolucion();
                case 8 -> mostrarLibrosDisponibles();
            }
        } while (opcion != 0);
    }

    public static void libroNuevo() {
        if (biblioteca.hayEspacio()) {
            System.out.println("\nIntroduzca los datos del libro");
            String referencia, titulo, autor;
            int ejemplares;
            System.out.print("Referencia: ");
            referencia = sc.nextLine();
            Libro libro = biblioteca.get(referencia);
            if (libro == null) {
                System.out.print("Título: ");
                titulo = sc.nextLine();
                System.out.print("Autor: ");
                autor = sc.nextLine();
                System.out.print("Número de ejemplares: ");
                ejemplares = sc.nextInt();
                sc.nextLine();//limpiar buffer
                libro = new Libro(referencia, titulo, autor, ejemplares);
                biblioteca.nuevoLibro(libro);
            } else {
                System.out.println("Ya existe un libro con esa referencia");
            }
        } else {
            System.out.println("\nNo hay espacio en la biblioteca para más libros\n");
        }
    }

    public static void mostrarLibros() {
        if (biblioteca.hayLibros()) {
            System.out.println("\nListado alfabético de libros\n");
            biblioteca.ordenar();
            System.out.println(biblioteca);
        } else {
            System.out.println("\nBiblioteca sin libros\n");
        }

    }

    //método para buscar un libro en la biblioteca
    //se introduce por teclado la referencia del libro a buscar
    //se muestra por pantalla el libro
    //si la referencia no existe se muestra un mensaje indicándolo
    public static void buscarLibros() {
        if (biblioteca.hayLibros()) {
            System.out.println("\nBuscar libros por referencia");
            String referencia;
            System.out.print("Referencia: ");
            referencia = sc.nextLine();
            Libro libro = biblioteca.get(referencia);
            if (libro != null) {
                System.out.println(libro);
            } else {
                System.out.println("\nEl libro no se encuentra en la biblioteca\n");
            }
        } else {
            System.out.println("\nBiblioteca sin libros\n");
        }
    }

    //método para dar de baja un libro por referencia
    //se introduce la referencia del libro a dar de baja y se elimina de la biblioteca
    //si la referencia no existe se muestra un mensaje indicándolo
    public static void darDeBajaLibroPorReferencia() {
        if (biblioteca.hayLibros()) {
            System.out.println("\nBajas de libros por referencia");
            String referencia;
            char car;
            System.out.print("Referencia: ");
            referencia = sc.nextLine();
            Libro libro = biblioteca.get(referencia);
            if (libro != null) {
                System.out.println(libro);
                do {
                    System.out.print("Dar de baja? (S/N)");
                    car = sc.nextLine().charAt(0);
                } while (Character.toUpperCase(car) != 'S' && Character.toUpperCase(car) != 'N');
                if (Character.toUpperCase(car) == 'S') {
                    biblioteca.eliminar(referencia);
                }
            } else {
                System.out.println("\nEl libro no se encuentra en la biblioteca\n");
            }
        } else {
            System.out.println("\nBiblioteca sin libros\n");
        }
    }

    //método para dar de baja un libro por posición
    //se introduce la posición del libro a dar de baja dentro del array y se elimina de la biblioteca
    public static void darDeBajaLibroPorPosicion() {
        if (biblioteca.hayLibros()) {
            System.out.println("\nBajas de libros por posición");
            System.out.println("\nPosiciones válidas desde 0 hasta " + (biblioteca.getIndice() - 1));
            int posicion;
            char car;
            do {
                System.out.print("Posición a dar de baja: ");
                posicion = sc.nextInt();
            } while (posicion < 0 || posicion >= biblioteca.getIndice());
            sc.nextLine();
            Libro libro = biblioteca.getLibros()[posicion];
            System.out.println(libro);
            do {
                System.out.print("Dar de baja? (S/N)");
                car = sc.nextLine().charAt(0);
            } while (Character.toUpperCase(car) != 'S' && Character.toUpperCase(car) != 'N');
            if (Character.toUpperCase(car) == 'S') {
                biblioteca.eliminar(posicion);
            }
        } else {
            System.out.println("\nBiblioteca sin libros\n");
        }
    }

    //método para realizar el préstamo de un libro
    //se introduce por teclado la referencia del libro a prestar y se realiza el préstamo
    //se debe comprobar que la referencia sea válida y que haya ejemplares del libro para prestar
    public static void realizarPrestamo() {
        if (biblioteca.hayLibros()) {
            System.out.println("\nGestión de préstamos");
            String referencia;
            System.out.print("Referencia del libro a prestar: ");
            referencia = sc.nextLine();
            Libro libro = biblioteca.get(referencia);
            if (libro != null) {
                System.out.println(libro);
                if (!libro.prestamo()) {
                    System.out.println("\nNo hay ejemplares disponibles de este libro para prestar\n");
                } else {
                    System.out.println("\nPréstamo realizado\n");
                    System.out.println("\nQuedan " + libro.numeroDeEjemplaresDisponibles() + " ejemplares de este libro para prestar\n");
                }
            } else {
                System.out.println("\nLibro no encontrado");
            }
        } else {
            System.out.println("\nBiblioteca sin libros\n");
        }
    }

    //método para realizar la devolución de un libro
    //se introduce por teclado la referencia del libro a devolver y se realiza la devolución
    //se debe comprobar que la referencia sea válida y que haya ejemplares prestados del libro para poder devolver
    public static void realizarDevolucion() {
        if (biblioteca.hayLibros()) {
            System.out.println("\nGestión de devoluciones");
            String referencia;
            System.out.print("Referencia del libro a devolver: ");
            referencia = sc.nextLine();
            Libro libro = biblioteca.get(referencia);
            if (libro != null) {
                System.out.println(libro);
                if (!libro.devolucion()) {
                    System.out.println("\nNo hay ejemplares prestados de este libro\n");
                } else {
                    System.out.println("\nPréstamo devuelto\n");
                    System.out.println("\nQuedan " + libro.numeroDeEjemplaresDisponibles() + " ejemplares de este libro para prestar\n");
                }
            } else {
                System.out.println("\nLibro no encontrado");
            }
        } else {
            System.out.println("\nBiblioteca sin libros\n");
        }
    }

    //método que muestra un listado alfabético de libros disponibles para prestar
    public static void mostrarLibrosDisponibles() {
        if (biblioteca.hayLibros()) {
            System.out.println("\nListado alfabético de libros disponibles\n");
            if (biblioteca.disponibles() == 0) {
                System.out.println("No hay libros disponibles\n");
            } else {
                biblioteca.ordenar();
                biblioteca.mostrarDisponibles();
            }
        } else {
            System.out.println("\nBiblioteca sin libros\n");
        }
    }
}