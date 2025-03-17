/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio04 {

    static Biblioteca biblioteca = new Biblioteca();
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = elegirOpcion();
            switch (opcion) {
                case 1:
                    leerLibro();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    todosTitulos();
                    break;
            }
        } while (opcion != 0);

    }

    public static void mostrarOpciones() {
        System.out.println("1. Agregar un libro nuevo");
        System.out.println("2. Eliminar un libro por referencia");
        System.out.println("3. Eliminar un libro por posicion");
        System.out.println("4. Realizar un prestamo");
        System.out.println("5. Realizar una devolucion");
        System.out.println("6. Listado alfabetico por titulo de libros disponibles");
        System.out.println("7. Listado alfabetico por titulo de todos los libros");
        System.out.println("0. Salir");
    }

    public static int elegirOpcion() {
        int opcion;
        do {
            System.out.print("Elige una opcion [1-7]: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida, vuelve a intentarlo.");
                sc.nextLine();
                System.out.print("Elige una opcion [1-7]: ");
            }
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion < 0 || opcion > 7) {
                System.out.println("Error: Rango invalido, vuelve a intentarlo.");
            }
        } while (opcion < 0 || opcion > 7);
        return opcion;
    }

    public static void leerLibro() {
        String ref, titulo, autor;
        int ejemplares, ejemplaresPrestados;

        do {
            System.out.print("\nReferencia del libro: ");
            ref = sc.nextLine().trim();
            
            while (!ref.matches("^(978|979)[0-9]{10}$")) {
                System.out.println("Error: Referencia debe contener exactamente 13 digitos numericos.");
                System.out.print("Referencia del libro: ");
                ref = sc.nextLine().trim();
            }
            
            if (biblioteca.verificarReferencia(ref)) {
                System.out.println("Error: La referencia " + ref + " ya existe en la biblioteca.");
            }
        } while (biblioteca.verificarReferencia(ref));
        
        String formateadoRef = formatRef(ref);

        System.out.print("\nTitulo: ");
        titulo = sc.nextLine().trim();

        while (!titulo.matches("^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\\!\\?\\¿\\¡\\- ]{1,100}$")) {
            System.out.println("Error: Nombre de titulo invalido, vuelve a intentarlo");
            System.out.print("Titulo: ");
            titulo = sc.nextLine().trim();
        }

        System.out.print("\nAutor: ");
        autor = sc.nextLine();
        while (!autor.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}$")) {
            System.out.println("Error: Nombre de autor invalido, vuelve a intentarlo.");
            System.out.print("Autor: ");
            autor = sc.nextLine();
        }

        System.out.print("\nEjemplares disponibles: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida, introduce un digito numerico.");
                sc.nextLine();
                System.out.print("Ejemplares disponibles: ");
            }
            ejemplares = sc.nextInt();
            sc.nextLine();

            if (ejemplares < 0) {
                System.out.println("Error: Cantidad ejemplares no puede ser negativa.");
            }
        } while (ejemplares < 0);

        System.out.print("\nEjemplares prestados: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida, introduce un digito numerico.");
                sc.nextLine();
                System.out.print("Ejemplares disponibles: ");
            }
            ejemplaresPrestados = sc.nextInt();
            sc.nextLine();

            if (ejemplaresPrestados < 0) {
                System.out.println("Error: Cantidad ejemplares prestados no puede ser negativa.");
            }
        } while (ejemplaresPrestados < 0);
        
        biblioteca.agregar(new Libro(formateadoRef, titulo, autor, ejemplares, ejemplaresPrestados));

    }
    
    public static void todosTitulos() {
        biblioteca.ordenarABC();
    }

    public static String formatRef(String ref) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ref.length(); i++) {
            if (i == 3 || i == 4 || i == 6 || i == 8) {
                sb.append("-");
            }
            sb.append(ref.charAt(i));
        }
        return sb.toString();
    }
}
