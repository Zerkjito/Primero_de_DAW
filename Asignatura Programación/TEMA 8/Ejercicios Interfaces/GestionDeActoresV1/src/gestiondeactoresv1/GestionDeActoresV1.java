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
        mostrarPerros();
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
        leerPerrosActores();
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

        int cantidadLeida = UtilidadesInput.leerEnteroEnRangoMin("Numero de amateurs a leer: ", 1, "Error: Minimo de amateurs a leer es 1.");
        for (int i = 0; i < cantidadLeida; i++) {
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

    public static void leerPerrosActores() {
        String id, nombre;
        RazaPerro raza;
        int edad;
        double sueldo;

        int cantidadLeida = UtilidadesInput.leerEnteroEnRangoMin("Numero de perros actores a leer: ", 1, "Error: Minimo de perros actores a leer es 1.");
        for (int i = 0; i < cantidadLeida; i++) {
            do {
                id = pedirNif();
                if (esNifRepetido(id)) {
                    System.out.println("Error: ID " + id + " ya registrado.");
                }
            } while (esNifRepetido(id));
            nombre = pedirNombre();
            raza = pedirRaza();
            edad = pedirEdad();
            sueldo = UtilidadesInput.leerDoubleEnRangoMin("Sueldo: ", 1., "Error: Sueldo de perros no puede ser negativo.");
            actores.add(new PerroActor(id, nombre, raza, edad, sueldo));
            System.out.println("Perro actor leido añadido correctamente.");
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
        return g = Genero.values()[n - 1];
    }

    public static RazaPerro pedirRaza() {
        RazaPerro r;
        String errorMssg = "Error: Rango invalido, debe ser entre ";
        int n = UtilidadesInput.leerEnteroEnRango("Raza (1. -> Chihuahua, 2 -> Boxer, 3 -> Pastor Aleman, 4 -> Labrado): ", 1, 4, errorMssg);
        return r = RazaPerro.values()[n - 1];
    }

    public static int pedirEdad() {
        return UtilidadesInput.leerEnteroEnRangoMin("\nEdad: ", 1, "Error: Rango invalido");
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

    public static void mostrarPerros() {
        if (actores.isEmpty()) {
            System.out.println("Error: No hay actores/actrices registrados.");
            return;
        }
        
        ArrayList<PerroActor> perros = new ArrayList<>();
        for (Contratable a : actores) {
            if (a instanceof PerroActor p) {
                perros.add(p);
            }
        }
        
        perros.sort(Comparator.comparing(PerroActor::getNombre, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Perros ordendados ascendentemente por nombre:");
        for (PerroActor p : perros) {
            p.mostrarInfo();
        }
    }

}
