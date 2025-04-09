/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio07 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Vivienda> viviendas = new ArrayList<>();
    static ArrayList<LocalComercial> locales = new ArrayList<>();
    static Menu m = new Menu();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            m.mostrar();
            opcion = m.opcionMenu();
            switch (opcion) {
                case 1 ->
                    nuevoInmueble();
                case 2 ->
                    modificarDescuento();
                case 3 ->
                    alquilarInmueble();
                case 4 ->
                    devolverInmueble();
                case 5 ->
                    mostrarInmuebles();
            }
        } while (opcion != 0);
        System.out.println("[FIN PROGRAMA]");
    }

    public static void nuevoInmueble() {
        int opcionInmueble;
        m.tipoInmueble();
        opcionInmueble = m.opcionInmueble();
        switch (opcionInmueble) {
            case 1:
                nuevaVivienda();
                break;
            case 2:
                nuevoLocal();
                break;
            case 3:
                return;
        }
        System.out.println("");
    }

    public static void nuevaVivienda() {
        String ref;
        do {
            ref = pedirReferencia();
            if (existeInmueble(ref)) {
                System.out.println("Error: Inmueble con ref. " + ref + " ya registrada.");
            }
        } while (existeInmueble(ref));
        String poblacion = pedirPoblacion();
        double precioBase = pedirPrecioBase();
        int numHabitaciones = pedirNumHabitaciones();
        viviendas.add(new Vivienda(ref, poblacion, precioBase, numHabitaciones));
        System.out.println("Vivienda con REF. " + ref + " registrada correctamente.");
    }

    public static void nuevoLocal() {
        String ref;

        do {
            ref = pedirReferencia();
            if (existeInmueble(ref)) {
                System.out.println("Error: Inmueble con ref. " + ref + " ya registrado.");
            }
        } while (existeInmueble(ref));
        String poblacion = pedirPoblacion();
        double precioBase = pedirPrecioBase();
        int tamaño = pedirMetros();
        boolean reformado = estaReformado();
        locales.add(new LocalComercial(ref, poblacion, precioBase, tamaño, reformado));
        System.out.println("Local con REF. " + ref + " registrado correctamente.");
    }

    public static String pedirReferencia() {
        System.out.print("\nReferencia inmueble (entre 4 y 12 caracteres alfanumericos): ");
        String ref = sc.nextLine().trim();
        while (!ref.matches("^(?=.*[0-9])(?=.*[a-zA-Z])[a-zA-Z0-9]{4,12}$")) {
            System.out.println("Error: Referencia invalida.");
            System.out.print("\nReferencia inmueble (entre 4 y 12 caracteres alfanumericos): ");
            ref = sc.nextLine().trim();
        }
        return ref;
    }

    public static String pedirPoblacion() {
        System.out.print("\nPoblacion:  ");
        String poblacion = sc.nextLine().trim();
        while (!poblacion.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}$")) {
            System.out.println("Error: Poblacion invalida.");
            System.out.print("\nPoblacion:  ");
            poblacion = sc.nextLine().trim();
        }
        return poblacion;
    }

    public static double pedirPrecioBase() {
        double pb;
        do {
            System.out.print("\nPrecio base:  ");
            while (!sc.hasNextDouble()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("\nPrecio base:  ");
            }
            pb = sc.nextDouble();
            sc.nextLine();

            if (pb <= 0) {
                System.out.println("Error: Precio base no puede ser negativo.");
            }
        } while (pb <= 0);
        return pb;
    }

    public static int pedirNumHabitaciones() {
        int numHabitaciones;
        do {
            System.out.print("\nNumero habitaciones:  ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("\nNumero habitaciones:  ");
            }
            numHabitaciones = sc.nextInt();
            sc.nextLine();

            if (numHabitaciones < 0) {
                System.out.println("Error: Numero habitaciones no puede ser negativo.");
            }
        } while (numHabitaciones < 0);
        return numHabitaciones;
    }

    public static int pedirMetros() {
        int metros;
        do {
            System.out.print("\nMetros cuadrados: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: entrada invalida.");
                sc.nextLine();
                System.out.print("\nMetros cuadrados: ");
            }
            metros = sc.nextInt();
            sc.nextLine();

            if (metros <= 0) {
                System.out.println("Error: Tamaño en metros cuadrados no puede ser negativo.");
            }
        } while (metros <= 0);
        return metros;
    }

    public static boolean estaReformado() {
        int opcion;
        do {
            System.out.print("\nEsta reformado? (1 -> SI, 2 -> NO): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("\nEsta reformado? (1 -> SI, 2 -> NO): ");
            }
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion != 1 && opcion != 2) {
                System.out.println("Error: Rango invalido.");
            }
        } while (opcion != 1 && opcion != 2);
        return opcion == 1;
    }

    public static boolean existeInmueble(String ref) {
        return viviendas.contains(new Vivienda(ref)) || locales.contains(new LocalComercial(ref));
    }

    public static void modificarDescuento() {
        double nuevoDescuento;
        System.out.printf("Valor actual: %.2f%%%n", Inmueble.getDescuento());
        do {
            System.out.print("Nuevo valor: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Nuevo valor: ");
            }
            nuevoDescuento = sc.nextDouble();
            sc.nextLine();

            if (nuevoDescuento <= 0 || nuevoDescuento > 100) {
                System.out.println("Error: Descuento debe ser entre 0 y 100.");
            }
        } while (nuevoDescuento < 0 || nuevoDescuento > 100);
        Inmueble.setDescuento(nuevoDescuento);
        System.out.println("Nuevo valor asginado correctamente.");
    }

    public static void alquilarInmueble() {
        if (viviendas.isEmpty() && locales.isEmpty()) {
            System.out.println("Actualmente no hay ningun local o vivienda registrada.");
            return;
        }

        int viviendasDisponibles = 0, localesDisponibles = 0;

        for (Vivienda v : viviendas) {
            if (!v.isAlquilado()) {
                viviendasDisponibles++;
            }
        }

        for (LocalComercial l : locales) {
            if (!l.isAlquilado()) {
                localesDisponibles++;
            }
        }

        if (viviendasDisponibles == 0 && localesDisponibles == 0) {
            System.out.println("Actualmente no hay inmuebles disponibles.");
            return;
        }

        System.out.println("Viviendas disponibles: " + viviendasDisponibles);
        System.out.println("Locales disponibles: " + localesDisponibles);

        int opcion = queDeseaAlquilar();
        String ref = pedirReferencia();
        boolean encontrado = false;
        boolean yaAlquilado = false;
        List<? extends Inmueble> lista = (opcion == 1) ? viviendas : locales;
        for (Inmueble i : lista) {
            if (i.getReferencia().equals(ref)) {
                if (!i.isAlquilado()) {
                    switch (i) {
                        case Vivienda vivienda ->
                            vivienda.alquilar();
                        case LocalComercial local ->
                            local.alquilar();
                        default -> {
                        }
                    }
                    System.out.print(i);
                    System.out.println("Inmueble con REF. " + i.getReferencia() + " alquilado correctamente.");
                    return;
                } else {
                    yaAlquilado = true;
                    break;
                }
            }
        }

        if (yaAlquilado) {
            System.out.println("Error: Este inmueble ya se encuentra alquilado.");
        } else {
            System.out.println("No se encontró el inmueble con REF. " + ref);
        }
    }

    public static void devolverInmueble() {
        if (viviendas.isEmpty() && locales.isEmpty()) {
            System.out.println("Error: Actualmente no hay viviendas ni locales registrados.");
            return;
        }

        /*En el ejercicio se obliga a recorrer el foreach dos veces manualmente, de modo que aqui
        no se puede usar el switch pattern para recorrer el ArayList indicado */
        boolean hayAlquilados = false;
        for (Vivienda v : viviendas) {
            if (v.isAlquilado()) {
                hayAlquilados = true;
                break;
            }
        }
        if (!hayAlquilados) {
            for (LocalComercial l : locales) {
                if (l.isAlquilado()) {
                    hayAlquilados = true;
                    break;
                }
            }
        }

        if (!hayAlquilados) {
            System.out.println("No hay inmuebles alquilados actualmente.");
            return;
        }

        String ref = pedirReferencia();
        boolean encontrado = false;

        for (Vivienda v : viviendas) {
            if (v.getReferencia().equals(ref)) {
                encontrado = true;
                if (v.isAlquilado()) {
                    v.devolver();
                    System.out.println("VIVIENDA DEVUELTA:");
                    System.out.println("\n" + v);
                    System.out.println("Vivienda con REF. " + ref + " devuelta correctamente.");
                    return;
                } else {
                    System.out.println("Error: La vivienda con REF. " + ref + " no esta alquilada.");
                }
                return;
            }
        }

        for (LocalComercial l : locales) {
            if (l.getReferencia().equals(ref)) {
                encontrado = true;
                if (l.isAlquilado()) {
                    l.devolver();
                    System.out.println("LOCAL DEVUELTO:");
                    System.out.println("\n" + l);
                    System.out.println("Local con REF. " + ref + " devuelto correctamente.");
                } else {
                    System.out.println("Error: El local con REF. " + ref + " no esta alquilado.");
                }
                return;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro el inmueble con REF. " + ref);
        }
    }

    public static int queDeseaAlquilar() {
        int opcion;
        do {
            System.out.print("Que desea alquilar? (1 -> Vivienda, 2 -> Local): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Que desea alquilar? (1 -> Vivienda, 2 -> Local): ");
            }
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion != 1 && opcion != 2) {
                System.out.println("Error: Rango invalido.");
            }

        } while (opcion != 1 && opcion != 2);
        return opcion;
    }

    public static void mostrarInmuebles() {
        if (viviendas.isEmpty() && locales.isEmpty()) {
            System.out.println("Error: Actualmente no hay viviendas ni locales registrados.");
            return;
        }
        /*
        1º Se muestran todas las viviendas ordenadas por precio final de menor a mayor.
        2º Se muestran todos los locales ordenados por precio final de mayor a menor.
        3º Se muestran todas las viviendas disponibles sin alquilar ordenadas alfabéticamente por población.
        3º Se muestran todos los locales disponibles sin alquilar ordenados alfabéticamente por población.
         */
        if (!viviendas.isEmpty()) {
            viviendas.sort(Comparator.comparing(Vivienda::calcularPrecio));
            System.out.println("VIVIENDAS ORDENDAS POR PRECIO ASCENDENTEMENTE:");
            for (Vivienda v : viviendas) {
                System.out.println(v);
            }
        } else {
            System.out.println("No hay viviendas registradas actualmente.");
        }

        if (!locales.isEmpty()) {
            locales.sort(Comparator.comparing(LocalComercial::calcularPrecio).reversed());
            System.out.println("LOCALES ORDENADOS POR PRECIO DESCENDENTEMENTE:");
            for (LocalComercial l : locales) {
                System.out.println(l);
            }
        } else {
            System.out.println("No hay locales registrados actualmente.");
        }

        if (!viviendas.isEmpty()) {
            ArrayList<Vivienda> viviendasDisponibles = new ArrayList<>();
            for (Vivienda v : viviendas) {
                if (!v.isAlquilado()) {
                    viviendasDisponibles.add(v);
                }
            }

            if (!viviendasDisponibles.isEmpty()) {
                viviendasDisponibles.sort(Comparator.comparing(Vivienda::getPoblacion, String.CASE_INSENSITIVE_ORDER));
                System.out.println("VIVIENDAS DISPONIBLES ORDENADAS ALFABETICAMENTE POR POBLACION:");
                for (Vivienda vDisp : viviendasDisponibles) {
                    System.out.println(vDisp);
                }
            } else {
                System.out.println("No hay viviendas disponibles para alquilar actualmente.");
            }
        }

        if (!locales.isEmpty()) {
            ArrayList<LocalComercial> localesDisponibles = new ArrayList<>();
            for (LocalComercial l : locales) {
                if (!l.isAlquilado()) {
                    localesDisponibles.add(l);
                }
            }

            if (!localesDisponibles.isEmpty()) {
                localesDisponibles.sort(Comparator.comparing(LocalComercial::getPoblacion, String.CASE_INSENSITIVE_ORDER));
                System.out.println("LOCALES DISPONIBLES ORDENADOS ALFABETICAMENTE POR POBLACION:");
                for (LocalComercial lDisp : localesDisponibles) {
                    System.out.println(lDisp);
                }
            } else {
                System.out.println("No hay locales disponibles para alquilar actualmente.");
            }
        }
    }

}
