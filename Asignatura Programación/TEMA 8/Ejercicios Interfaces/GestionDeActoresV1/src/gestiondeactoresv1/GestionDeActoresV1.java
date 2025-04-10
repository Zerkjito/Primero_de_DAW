/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondeactoresv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class GestionDeActoresV1 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contratable> actores = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        leerImportes();
        leerActores();
        mostrarTodos();
    }

    public static void leerImportes() {
        String mssg = "\nImporte fijo: ";
        int importeFijo, importeHoras;
        importeFijo = UtilidadesInput.leerEnteroEnRangoMin(mssg, 1, "Error: Importe fijo no puede ser negativo");
        Actor.setImporteFijo(importeFijo);

        mssg = "\nImporte horas: ";
        importeHoras = UtilidadesInput.leerEnteroEnRangoMin(mssg, 1, "Error: Importe horas no puede ser negativo");
        Actor.setImporteHoras(importeHoras);
        System.out.println("\nValores asignados correctamente.");
    }

    public static void leerActores() {
        leerProfesional();
        leerAmateur();
    }

    public static void leerProfesional() {
        String nif, nombre;
        int edad, numRepresentaciones;
        Genero genero;

        int cantidad = UtilidadesInput.leerEnteroEnRangoMin("Numero de profesionales a leer: ", 1, "Error: Minimo de profesionales a leer es 1.");
        for (int i = 0; i < cantidad; i++) {
            do {
                nif = pedirNif();
                if (esNifRepetido(nif)) {
                    System.out.println("Error: NIF " + nif + " ya registrado.");
                }
            } while (esNifRepetido(nif));
            nombre = pedirNombre();
            edad = pedirEdad();
            genero = pedirGenero();
            numRepresentaciones = pedirRepresentaciones();
            actores.add(new Profesional(nif, nombre, edad, genero, numRepresentaciones));
            System.out.println("Actor/actriz profesional " + nombre + " añadido correctamente.");
        }
    }

    public static void leerAmateur() {
        String nif, nombre;
        int edad, numHoras;
        Genero genero;

        int cantidad = UtilidadesInput.leerEnteroEnRangoMin("Numero de amateurs a leer: ", 1, "Error: Minimo de profesionales a leer es 1.");
        for (int i = 0; i < cantidad; i++) {
            do {
                nif = pedirNif();
                if (esNifRepetido(nif)) {
                    System.out.println("Error: NIF " + nif + " ya registrado.");
                }
            } while (esNifRepetido(nif));
            nombre = pedirNombre();
            edad = pedirEdad();
            genero = pedirGenero();
            numHoras = pedirRepresentaciones();
            actores.add(new Amateur(nif, nombre, edad, genero, numHoras));
            System.out.println("Actor/actriz amateur " + nombre + " añadido correctamente.");
        }
    }

    public static String pedirNif() {
        String mssg = "\nNIF: ";
        String nif = UtilidadesInput.leerString(mssg);
        while (!nif.matches("^[0-9]{8}[A-Z]{1}$")) {
            System.out.println("Error: NIF invalido.");
            nif = UtilidadesInput.leerString(mssg);
        }
        return nif;
    }

    public static String pedirNombre() {
        String mssg = "\nNombre: ";
        String nombre = UtilidadesInput.leerString(mssg);
        while (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}$")) {
            System.out.println("Error: Nombre invalido.");
            nombre = UtilidadesInput.leerString(mssg);
        }
        return nombre;
    }

    public static Genero pedirGenero() {
        Genero g;
        int n = UtilidadesInput.leerEnteroEnRango("\nGenero (1. -> Hombre, 2 -> Mujer): ", 1, 2, "Error: Rango invalido, debe ser entre ");
        g = Genero.values()[n - 1];
        return g;
    }

    public static int pedirEdad() {
        return UtilidadesInput.leerEnteroEnRangoMin("\nEdad: ", 18, "Error: Rango invalido");
    }

    public static int pedirRepresentaciones() {
        return UtilidadesInput.leerEnteroEnRangoMin("\nCantidad representaciones realizadas: ", 1, "Error: Cantidad representaciones no puede ser negativa.");
    }

    public static boolean esNifRepetido(String nif) {
        for (Contratable a : actores) {
            if (a.getNif().equals(nif)) {
                return true;
            }
        }
        return false;
    }

    public static void mostrarTodos() {
        if (actores.isEmpty()) {
            System.out.println("Error: No hay actores/actrices registrados.");
            return;
        }
        
        actores.sort(Comparator.comparing(Contratable::calcularSueldo));
        System.out.println("Actores ordenados ascendentemente por sueldo:");
        for (Contratable a : actores) {
            a.mostrarInfo();
        }
    }

}
