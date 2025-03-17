/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio03 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Alumno> alumnos = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            mostrarOpcionesMenu();
            System.out.print("Introduzca opcion [1-9]: ");
            while (!sc.hasNextInt()) {
                System.out.println("[Error: Entrada invalida, introduce un numero valido] ");
                sc.nextLine();
                System.out.print("Introduzca opcion [1-9]: ");
            }
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                    ordenarPorNombre();
                    break;
                case 3:
                    buscarPorNiF();
                    break;
                case 4:
                    darBaja();
                    break;
                case 5:
                    modificarAlumno();
                    break;
                case 6:
                    double media = mediaGlobalAlumnos();
                    mostrarMedia(media);
                    break;
                case 7:
                    reasginarLimiteFaltas();
                    break;
                case 8:
                    mostrarFaltasGraves();
                    break;
                case 9:
                    mostrarExpulsiones();
                    break;
                case 10:

            }
        } while (opcion != 0);

    }

    public static void mostrarOpcionesMenu() {
        System.out.println("\n1. Nuevo alumno");
        System.out.println("2. Mostrar alumnos");
        System.out.println("3. Buscar alumnos");
        System.out.println("4. Bajas de alumnos");
        System.out.println("5. Modificar alumnos");
        System.out.println("6. Calcular la media de todos los alumnos");
        System.out.println("7. Modificar el limite de las faltas graves");
        System.out.println("8. Mostrar alumnos con faltas graves");
        System.out.println("9. Mostrar los alumnos expulsados");
        System.out.println("0. FIN");
    }

    public static void agregarAlumno() {
        Alumno a = new Alumno();
        a.leer(alumnos);
        alumnos.add(a);
        System.out.println("Alumno(a) " + a.getNombre() + " agregado(a) exitosamente.");
    }

    public static void ordenarPorNombre() {
        if (alumnos == null || alumnos.isEmpty()) {
            System.out.println("[Error: Lista de alumnos vacia]");
        } else {
            Collections.sort(alumnos);
            for (Alumno a : alumnos) {
                System.out.println("\n" + a);
            }
        }
    }

    public static boolean buscarPorNiF() {
        Nif nifAlu = new Nif();
        for (Alumno a : alumnos) {
            if (a.getNif() != null && a.getNif().equals(nifAlu)) {
                System.out.println(a);
                return true;
            }
        }
        System.out.println("Error: El NIF no se encuentra registrado.");
        return false;
    }

    public static boolean darBaja() {
        Nif nifAlu = new Nif();
        for (Alumno a : alumnos) {
            if (a.getNif() != null && a.getNif().equals(nifAlu)) {
                alumnos.remove(a);
                System.out.println("Alumno(a) con " + nifAlu + " dado de bajo exitosamente.");
                return true;
            }
        }
        System.out.println("[Error: No se encontro al alumno(a) con el NIF proporcionado]");
        return false;
    }

    public static boolean modificarAlumno() {
        if (alumnos == null || alumnos.isEmpty()) {
            System.out.println("[Error: Lista vacia o no inicializada]");
            return false;
        }
        Nif nifAlu = new Nif();
        for (Alumno a : alumnos) {
            if (a != null && a.getNif().equals(nifAlu)) {
                a.modificarDatos();
                System.out.println("Alumno(a) con " + nifAlu + " modificado exitosamente.");
                return true;
            }
        }
        System.out.println("[Error: No se encontro al alumno(a) con el NIF proporcionado]");
        return false;
    }

    public static double mediaGlobalAlumnos() {
        double suma = 0;
        if (alumnos == null || alumnos.isEmpty()) {
            System.out.println("[Error: Lista vacia o no inicializada]");
            return Double.NaN;
        }
        for (Alumno a : alumnos) {
            if (a != null && a.getNotaMedia() > 0) {
                suma += a.getNotaMedia();
            }
        }
        if (suma == 0) {
            System.out.println("[Error: No se puede calcular la media si todas las notas son 0]");
            return Double.NaN;
        }
        return suma / alumnos.size();
    }

    public static void mostrarMedia(double mediaGlobal) {
        if (Double.isNaN(mediaGlobal)) {
            System.out.println("[Error: No se pudo calcular la media]");
        } else {
            System.out.printf("Media global de todos los alumnos: %.2f%n", mediaGlobal);
        }
    }

    public static void reasginarLimiteFaltas() {
        int nuevoLimite;
        System.out.println("\nLimite de faltas graves actual: " + Alumno.getLimiteFaltasGraves());
        do {
            System.out.print("Nuevo limite de faltas: ");
            while (!sc.hasNextInt()) {
                System.out.println("[Error: Entrada invalida, debe ser un numero valido]");
                sc.nextLine();
                System.out.print("Nuevo limite de faltas: ");
            }
            nuevoLimite = sc.nextInt();
            sc.nextLine();

            if (nuevoLimite <= 0) {
                System.out.println("[Error: Limite de faltas no puede ser negativo]");
            }
        } while (nuevoLimite <= 0);
        Alumno.setLimiteFaltasGraves(nuevoLimite);
        System.out.println("Limite de faltas reasignado exitosamente.");
    }

    public static void mostrarFaltasGraves() {
        if (alumnos == null || alumnos.isEmpty()) {
            System.out.println("[Error: Lista de alumnos vacia o no inicializada]");
            return;
        }

        int cont = 0;
        alumnos.sort(Comparator.comparingInt(Alumno::getFaltasGraves));
        for (Alumno a : alumnos) {
            if (a != null && a.getFaltasGraves() > 0) {
                cont++;

                System.out.println("Alumno(a) con faltas:");
                System.out.println("\n" + a);
            }
        }
        if (cont == 0) {
            System.out.println("Actualmente ningun alumno tiene faltas graves.");
        } else {
            System.out.println("Total de alumnos con faltas graves: " + cont);
        }
    }

    public static void mostrarExpulsiones() {
        if (alumnos == null || alumnos.isEmpty()) {
            System.out.println("[Error: Lista de alumnos vacia o no inicializada]");
            return;
        }

        int cont = 0;
        for (Alumno a : alumnos) {
            if (a != null && a.getFaltasGraves() == Alumno.getLimiteFaltasGraves()) {
                cont++;
                System.out.println("Alumno(a) expulsado:");
                System.out.println("\n" + a);
            }
        }
        if (cont == 0) {
            System.out.println("Actualmente ningun alumno esta expulsado.");
        } else {
            System.out.println("Total de alumnos expulsados: " + cont);
        }
    }

}
