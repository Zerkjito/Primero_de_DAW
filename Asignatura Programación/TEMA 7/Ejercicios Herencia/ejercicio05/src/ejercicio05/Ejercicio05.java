/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio05 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Empleado> empleados = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        int n;
        do {
            System.out.print("Introduce el numero de empleados a leer: ");
            while (!sc.hasNextInt()) {
                System.out.println("error: entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el numero de empleados a leer: ");
            }
            n = sc.nextInt();
            sc.nextLine();
            if (n <= 0) {
                System.out.println("error: empleados a leer no puede ser negativo.");
            }
        } while (n <= 0);

        String nif, nombre, calle, puerta, poblacion, provincia;
        int numCalle;
        LocalDate fnac;
        LocalTime horaEntrada, horaSalida;
        for (int i = 0; i < n; i++) {
            do {
                nif = pedirNif(i);
                if (esNifRepetido(nif)) {
                    System.out.println("Error: NIF " + nif + " ya esta registrado.");
                }
            } while (esNifRepetido(nif));
            nombre = pedirNombre();
            calle = pedirCalle();
            numCalle = pedirNumeroCalle();
            puerta = pedirPuerta();
            poblacion = pedirPoblacion();
            provincia = pedirProvincia();
            Direccion direccion = new Direccion(calle, numCalle, puerta, poblacion, provincia);
            fnac = pedirFnac();
            horaEntrada = pedirHoraEntrada();
            horaSalida = pedirHoraSalida();
            empleados.add(new Empleado(nif, nombre, direccion, fnac, horaEntrada, horaSalida));
        }

        mostrarEmpleadosABC();
        empleadoEntraMasPronto();
        empleadoEntraMasTarde();
        mayores40();
        ordenarPorHoraEntradaAsc();

    }

    public static boolean esNifRepetido(String nif) {
        return empleados.contains(new Empleado(nif));
    }

    public static String pedirNif(int i) {
        String nif;
        System.out.print("Introduce el NIF del empleado " + (i + 1) + ": ");
        nif = sc.nextLine().trim();
        while (!nif.matches("^[1-9][0-9]{7}[A-Z]$")) {
            System.out.println("Error: nif invalido.");
            System.out.print("Introduce el NIF del empleado " + (i + 1) + ": ");
            nif = sc.nextLine().trim();
        }
        return nif;
    }

    public static String pedirNombre() {
        String nombre;
        System.out.print("Nombre: ");
        nombre = sc.nextLine().trim();
        while (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}$")) {
            System.out.println("Error: nombre invalido.");
            System.out.print("Nombre: ");
            nombre = sc.nextLine().trim();
        }
        return nombre;
    }

    public static String pedirCalle() {
        String calle;
        System.out.print("Calle: ");
        calle = sc.nextLine().trim();
        while (!calle.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}$")) {
            System.out.println("Error: nombre calle invalido.");
            System.out.print("Calle: ");
            calle = sc.nextLine().trim();
        }
        return calle;
    }

    public static int pedirNumeroCalle() {
        int numCalle;
        do {
            System.out.print("Numero de calle: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: entrada invalida.");
                sc.nextLine();
                System.out.print("Numero de calle: ");
            }
            numCalle = sc.nextInt();
            sc.nextLine();

            if (numCalle <= 0) {
                System.out.println("error: numero de calle no puede ser negativo.");
            }
        } while (numCalle <= 0);
        return numCalle;
    }

    public static String pedirPuerta() {
        String puerta;
        System.out.print("Puerta: ");
        puerta = sc.nextLine().trim();
        while (!puerta.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9 ]{1,50}$")) {
            System.out.println("Error: numero puerta invalido.");
            System.out.print("Puerta: ");
            puerta = sc.nextLine().trim();
        }
        return puerta;
    }

    public static String pedirPoblacion() {
        String poblacion;
        System.out.print("Poblacion: ");
        poblacion = sc.nextLine().trim();
        while (!poblacion.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9 ]{2,50}$")) {
            System.out.println("Error: nombre de poblacion invalido.");
            System.out.print("Poblacion: ");
            poblacion = sc.nextLine().trim();
        }
        return poblacion;
    }

    public static String pedirProvincia() {
        String provincia;
        System.out.print("Provincia: ");
        provincia = sc.nextLine().trim();
        while (!provincia.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}$")) {
            System.out.println("Error: nombre de provincia invalido.");
            System.out.print("Provincia: ");
            provincia = sc.nextLine().trim();
        }
        return provincia;
    }

    public static LocalDate pedirFnac() {
        String fnacString;
        LocalDate fnac;
        System.out.print("Fecha nacimiento (dia/mes/año): ");
        fnacString = sc.nextLine().trim();
        while (!esFechaValida(fnacString)) {
            System.out.println("Error: formato fecha invalido.");
            System.out.print("Fecha nacimiento (dia/mes/año): ");
            fnacString = sc.nextLine().trim();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fnac = LocalDate.parse(fnacString, formatter);
        return fnac;
    }

    public static LocalTime pedirHoraEntrada() {
        String horaEntradaString;
        LocalTime horaEntrada;
        System.out.print("Hora de entrada (horas:minutos:segundos): ");
        horaEntradaString = sc.nextLine().trim();
        while (!esHoraEntradaSalidaValida(horaEntradaString)) {
            System.out.println("Error: hora de entrada invalida.");
            System.out.print("Hora de entrada (horas:minutos:segundos): ");
            horaEntradaString = sc.nextLine().trim();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        horaEntrada = LocalTime.parse(horaEntradaString, formatter);
        return horaEntrada;
    }

    public static LocalTime pedirHoraSalida() {
        String horaSalidaString;
        LocalTime horaSalida;
        System.out.print("Hora de salida (horas:minutos:segundos): ");
        horaSalidaString = sc.nextLine().trim();
        while (!esHoraEntradaSalidaValida(horaSalidaString)) {
            System.out.println("Error: hora de salida invalida.");
            System.out.print("Hora de salida (horas:minutos:segundos): ");
            horaSalidaString = sc.nextLine().trim();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        horaSalida = LocalTime.parse(horaSalidaString, formatter);
        return horaSalida;
    }

    public static boolean esFechaValida(String fecha) {
        if (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaParseada = LocalDate.parse(fecha, formatter);
        return fechaParseada != null;
    }

    public static boolean esHoraEntradaSalidaValida(String hora) {
        if (!hora.matches("\\d{2}:\\d{2}:\\d{2}")) {
            return false;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        try {
            LocalTime horaEntradaSalida = LocalTime.parse(hora, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void mostrarEmpleadosABC() {
        if (empleados.isEmpty()) {
            System.out.println("error: registro de empleados vacio actualmente.");
            return;
        }
        empleados.sort(Comparator.comparing(Empleado::getNombre, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Empelados ordenados alfabeticamente: ");
        for (Empleado e : empleados) {
            System.out.println("\n" + e);
        }
    }

    public static void empleadoEntraMasPronto() {
        if (empleados.isEmpty()) {
            System.out.println("error: registro de empleados vacio actualmente.");
            return;
        }

        empleados.sort(Comparator.comparing(Empleado::getHoraEntradaEnMinutos));
        Empleado empleadoMasTemprano = empleados.get(0);
        System.out.println("Empleado que entra mas temprano:");
        System.out.println("\n" + empleadoMasTemprano);
    }

    public static void empleadoEntraMasTarde() {
        if (empleados.isEmpty()) {
            System.out.println("error: registro de empleados vacio actualmente.");
            return;
        }
        
        empleados.sort(Comparator.comparing(Empleado::getHoraSalidaEnMinutos).reversed());
        Empleado empleadoMasTardio = empleados.get(0);
        System.out.println("Empleado que entra mas tarde:");
        System.out.println("\n" + empleadoMasTardio);
    }

    public static void mayores40() {
        if (empleados.isEmpty()) {
            System.out.println("error: registro de empleados vacio actualmente.");
            return;
        }

        ArrayList<Empleado> empleadosFiltrados = new ArrayList<>();

        LocalTime horaSalida = LocalTime.of(20, 0, 0);
        for (Empleado e : empleados) {
            if (e.edad() > 40 && e.getHoraSalida().isAfter(horaSalida)) {
                empleadosFiltrados.add(e);
            }
        }

        if (empleadosFiltrados.isEmpty()) {
            System.out.println("No se encontraron empleados que cumplan los filtros aplicados.");
        } else {
            System.out.println("Empleados mayores de 40 años que salen despues de las 20:00 :");
            for (Empleado e : empleadosFiltrados) {
                System.out.println("\n" + e);
            }
        }
    }

    public static void ordenarPorHoraEntradaAsc() {
        if (empleados.isEmpty()) {
            System.out.println("error: registro de empleados vacio actualmente.");
            return;
        }
        
        empleados.sort(Comparator.comparing(Empleado::getHoraEntrada));
        System.out.println("Empleados ordenados por hora de entrada ascendentemente: ");
        for (Empleado e : empleados) {
            System.out.println("\n" + e);
        }
    }
}
