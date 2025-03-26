/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionvideoclub;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class GestionVideoClub {

    static Scanner sc = new Scanner(System.in);
    static VideoClub videoClub = new VideoClub();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu m = new Menu();
        int opcion;
        do {
            m.mostrar();
            opcion = m.leer();
            switch (opcion) {
                case 1:
                    añadirNuevaPelicula();
                    break;
                case 2:
                    eliminarPeliculaPorCod();
                    break;
                case 3:
                    alquilarPeli();
                    break;
                case 4:
                    devolverPeli();
                    break;
                case 5:
                    mostrarPelisDisponibles();
                    break;
                case 6:
                    mostrarTodasPelis();
                    break;
            }
        } while (opcion != 0);
        System.out.println("Saliendo del sitema...");
    }

    public static void añadirNuevaPelicula() {
        String titulo, director, genero, codigo;
        int copiasDisponibles;
        titulo = pedirTitulo();
        director = pedirDirector();
        genero = pedirGenero();
        codigo = pedirCodigo();
        copiasDisponibles = pedirCopiasDisponibles();
        videoClub.agregarPelicula(new Pelicula(titulo, director, genero, codigo, copiasDisponibles));
    }

    public static String pedirTitulo() {
        System.out.print("\nTitulo de la pelicula: ");
        String titulo = sc.nextLine().trim();
        while (!titulo.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9,\\. ]{1,50}$")) {
            System.out.println("Error: Titulo de pelicula invalido.");
            System.out.print("Titulo de la pelicula: ");
            titulo = sc.nextLine().trim();
        }
        return titulo;
    }

    public static String pedirDirector() {
        System.out.print("\nDirector: ");
        String director = sc.nextLine().trim();
        while (!director.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}$")) {
            System.out.println("Error: Nombre de director invalido.");
            System.out.print("Introduce el nombre del titulo: ");
            director = sc.nextLine().trim();
        }
        return director;
    }

    public static String pedirGenero() {
        System.out.print("\nGenero: ");
        String genero = sc.nextLine().trim();
        while (!genero.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}$")) {
            System.out.println("Error: Nombre de genero invalido.");
            System.out.print("Genero: ");
            genero = sc.nextLine().trim();
        }
        return genero;
    }

    public static String pedirCodigo() {
        System.out.print("\nCodigo: ");
        String codigo = sc.nextLine().trim();
        while (!codigo.matches("^[a-zA-Z0-9]{3,10}$")) {
            System.out.println("Error: Codigo invalido.");
            System.out.print("Codigo: ");
            codigo = sc.nextLine().trim();
        }
        return codigo;
    }

    public static int pedirCopiasDisponibles() {
        int copias;
        do {
            System.out.println("\nCopias disponibles: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: entrada invalida.");
                sc.nextLine();
                System.out.println("\nCopias disponibles: ");
            }
            copias = sc.nextInt();
            sc.nextLine();

            if (copias <= 0) {
                System.out.println("Error: Rango invalido.");
            }
        } while (copias <= 0);
        return copias;
    }

    public static void eliminarPeliculaPorCod() {
        System.out.println("Introduce el codigo: ");
        String cod = pedirCodigo();
        videoClub.eliminarPeliculaPorCodigo(cod);
    }

    public static void alquilarPeli() {
        String nomCliente, codPeli, fechaAlquiler;
        System.out.print("Nombre del cliente: ");
        nomCliente = pedirNomCliente();
        codPeli = pedirCodigo();
        fechaAlquiler = pedirFecha();
        videoClub.realizarAlquiler(nomCliente, codPeli, fechaAlquiler);
    }
    
    public static void devolverPeli() {
        String codPeli, nomCliente;
        codPeli = pedirCodigo();
        nomCliente = pedirNomCliente();
        videoClub.realizarDevolucion(codPeli, nomCliente);
    }
    
    public static void mostrarPelisDisponibles() {
        videoClub.listarPeliculasDisponibles();
    }
    
    public static void mostrarTodasPelis() {
        videoClub.listarTodasLasPeliculas();
    }

    public static String pedirFecha() {
        System.out.println("Introduce fecha de reserva(dia/mes/año)");
        String fecha = sc.nextLine().trim();
        while (!esFechaValida(fecha)) {
            System.out.println("Error: Fecha invalida.");
            System.out.println("Introduce fecha de reserva(dia/mes/año)");
            fecha = sc.nextLine().trim();
        }
        return fecha;
    }

    public static String pedirNomCliente() {
        System.out.print("Introduce el nombre del cliente: ");
        String nombre = sc.nextLine().trim();
        while (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}$")) {
            System.out.println("Error: Nombre invalido.");
            System.out.print("Introduce el nombre del cliente: ");
            nombre = sc.nextLine().trim();
        }
        return nombre;
    }

    public static boolean esFechaValida(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false);

        Date fechaParseada = formatoFecha.parse(fecha, new java.text.ParsePosition(0));
        return fechaParseada != null && formatoFecha.format(fechaParseada).equals(fecha);
    }

}
