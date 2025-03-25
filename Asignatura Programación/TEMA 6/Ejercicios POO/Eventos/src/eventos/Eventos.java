/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Eventos {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Evento> eventos = new ArrayList<>();

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
                    nuevoEvento();
                    break;
                case 2:
                    registrarAsistente();
                    break;
                case 3:
                    mostrarEventos();
                    break;
                case 4:
                    buscarEventosPorCiudad();
                    break;
                case 5:
                    modificarAforo();
                    break;
            }
        } while (opcion != 0);

    }

    public static void nuevoEvento() {
        String eventoNombre, fecha, ciudad, pais;
        int aforoMaximo;
        Evento tempEvent = new Evento();
        do {
            eventoNombre = pedirNombreEvento();
            tempEvent.setNombre(eventoNombre);
            fecha = pedirFechaEvento();
            tempEvent.setFecha(fecha);
        } while (eventos.contains(tempEvent));

        ciudad = pedirCiudad();
        pais = pedirPais();
        Ubicacion ubi = new Ubicacion(ciudad, pais);
        aforoMaximo = pedirAforoMaximo();
        eventos.add(new Evento(eventoNombre, fecha, ubi, aforoMaximo));
    }

    public static String pedirNombreEvento() {
        String eventoNombre;
        System.out.print("\nIntroduce el nombre del evento: ");
        eventoNombre = sc.nextLine().trim();
        while (!eventoNombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9 ]{3,50}$")) { // validacion del nombre del evento correcto
            System.out.println("Error: Nombre evento invalido.");
            System.out.print("\nIntroduce el nombre del evento: ");
            eventoNombre = sc.nextLine().trim();
        }
        return eventoNombre;
    }

    public static String pedirFechaEvento() {
        String fecha;
        System.out.print("Introduce la fecha del evento (dia-mes-año): ");
        fecha = sc.nextLine();

        while (!esFechaValida(fecha)) {
            System.out.println("Error: Formato de fecha invalido."); // validacion del formato correcto de fecha mediante SimpleDateFormat
            System.out.print("Introduce la fecha del evento (dia-mes-año): ");
            fecha = sc.nextLine();
        }
        return fecha;
    }

    public static String pedirCiudad() {
        String ciudad;
        System.out.print("Ciduad donde se realiza: ");
        ciudad = sc.nextLine().trim();

        while (!ciudad.matches("^[a-z-A-ZáéíóúÁÉÍÓÚñÑ ]{3,50}$")) { // validacion del nombre de la ciudad
            System.out.println("Error: Nombre de ciudad invalido.");
            System.out.print("Ciduad donde se realiza: ");
            ciudad = sc.nextLine().trim();
        }
        return ciudad;
    }

    public static String pedirPais() {
        String pais;
        System.out.print("Pais donde se realiza: ");
        pais = sc.nextLine().trim();

        while (!pais.matches("^[a-z-A-ZáéíóúÁÉÍÓÚñÑ ]{3,50}$")) { // validacion del nombre del pais
            System.out.println("Error: Nombre de ciudad invalido.");
            System.out.print("Ciduad donde se realiza: ");
            pais = sc.nextLine().trim();
        }
        return pais;
    }

    public static String pedirNombreAsistente() {
        String nombre;
        System.out.print("Nombre del asistente(a): ");
        nombre = sc.nextLine().trim();
        while (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}$")) {
            System.out.println("Error: Nombre invalido.");
            System.out.print("Nombre del asistente(a): ");
            nombre = sc.nextLine().trim();
        }
        return nombre;
    }

    public static int pedirAforoMaximo() {
        int aforoMaximo;
        do {
            System.out.print("Introduce el aforo maximo del evento: "); // validacion del aforo 
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el aforo maximo del evento: ");
            }
            aforoMaximo = sc.nextInt();
            sc.nextLine();

            if (aforoMaximo <= 0) {
                System.out.println("Error: Aforo maximo no puede ser negativo.");
            }
        } while (aforoMaximo <= 0);
        return aforoMaximo;
    }

    public static void registrarAsistente() {
        if (eventos.isEmpty()) {
            System.out.println("Error: Actualmente no hay eventos disponibles para registrar asistentes.");
            return;
        }
        String nombreEvento = pedirNombreEvento();
        String nombreAsist = pedirNombreAsistente();

        boolean encontrado = false;
        for (Evento e : eventos) {
            if (e.getNombre().equalsIgnoreCase(nombreEvento) && e.getAforo() < e.getAforoMaximo()) {
                e.realizarRegistroAsist(nombreAsist);
                System.out.println("Asistente(a) " + nombreAsist + " registrado correctamente.");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Error: No se encontro el evento con nombre " + nombreEvento + " o no hay aforo disponible.");
        }
    }

    public static void mostrarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Error: No hay eventos registrados actualmente.");
            return;
        }

        Collections.sort(eventos, Comparator.comparing(Evento::getNombre)); // ordeno alfabeticamente por nombre
        for (Evento e : eventos) {
            System.out.println("\n" + e);
        }
    }

    public static void buscarEventosPorCiudad() {
        if (eventos.isEmpty()) {
            System.out.println("Error: No hay eventos registrados actualmente.");
            return;
        }

        String ciudad = pedirCiudad();
        int coincidencias = 0;
        for (Evento e : eventos) {
            if (e.getUbicacion().getCuidad().equals(ciudad)) {
                System.out.println("\n" + e);
                coincidencias++;
            }
        }
        if (coincidencias == 0) {
            System.out.println("No se encontraron coincidencias para eventos realizados en " + ciudad);
        }
    }

    public static void modificarAforo() {
        if (eventos.isEmpty()) {
            System.out.println("Error: No hay eventos registrados actualmente.");
            return;
        }

        String nombreEvento = pedirNombreEvento();
        int nuevoAforoMax;
        boolean encontrado = false;
        for (Evento e : eventos) {
            if (e.getNombre().equals(nombreEvento)) {
                do {
                    System.out.print("Introduce el nuevo aforo maximo para el evento " + e.getNombre() + " (DEBE SER MAYOR QUE " + e.getAsistentes().size() + "): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Error: Entrada invalida.");
                        System.out.print("Introduce el nuevo aforo maximo para el evento " + e.getNombre() + " (DEBE SER MAYOR QUE " + e.getAsistentes().size() + "): ");
                        sc.nextLine();
                    }
                    nuevoAforoMax = sc.nextInt();
                    sc.nextLine();

                    if (nuevoAforoMax < e.getAsistentes().size()) {
                        System.out.println("Error: Capacidad aforo invalida.");
                    }
                } while (nuevoAforoMax < e.getAsistentes().size());
                e.setAforoMaximo(nuevoAforoMax);
                encontrado = true;
                System.out.println("Aforo máximo actualizado a " + nuevoAforoMax + " para el evento " + e.getNombre());
            }
        }
        if (!encontrado) {
            System.out.println("Error: No se encontro el evento con nombre " + nombreEvento);
        }
    }

    public static boolean esFechaValida(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        formatoFecha.setLenient(false);

        Date fechaParseada = formatoFecha.parse(fecha, new java.text.ParsePosition(0));
        return fechaParseada != null && formatoFecha.format(fechaParseada).equals(fecha);
    }

}
