/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marketing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Marketing {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contacto> contactos = new ArrayList<>();
    static ArrayList<Contacto> llamarHoy = new ArrayList<>();
    static ArrayList<Contacto> noDisponibles = new ArrayList<>();

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
                    nuevoContacto();
                    break;
                case 2:
                    llamadasParaHoy();
                    break;
                case 3:
                    mostrarContactos();
                    break;
                case 4:
                    contactosDeUnaPoblacion();
                    break;
                case 5:
                    inicializar();
                    break;
                case 6:
                    modificarLimiteLLamadas();
                    break;
            }
        } while (opcion != 0);

    }

    public static void nuevoContacto() {
        String nombre, tlf, poblacion, provincia;
        do {
            System.out.print("\nNombre del contacto: ");
            nombre = sc.nextLine().trim();
            while (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}$")) {
                System.out.println("Error: Nombre invalido.");
                System.out.print("\nNombre del contacto: ");
                nombre = sc.nextLine();
            }

            if (contactoRepetido(nombre)) {
                System.out.println("Error: Nombre ya registrado.");
            }
        } while (contactoRepetido(nombre));

        System.out.print("Introduce el telefono: ");
        tlf = sc.nextLine();
        while (!tlf.matches("^[67][0-9]{8}$")) {
            System.out.println("Error: Telefono invalido, debe comenzar por 6 o 7 y contener 9 digitos");
            System.out.print("\nIntroduce el telefono: ");
            tlf = sc.nextLine().trim();
        }

        System.out.print("Introduce la poblacion: ");
        poblacion = sc.nextLine().trim();
        while (!poblacion.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}$")) {
            System.out.println("Error: Nombre de poblacion invalido.");
            System.out.print("\nIntroduce la poblacion: ");
            poblacion = sc.nextLine().trim();
        }

        System.out.print("Introduce la provincia: ");
        provincia = sc.nextLine().trim();
        while (!provincia.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}$")) {
            System.out.println("Error: Nombre de provincia invalido.");
            System.out.print("\nIntroduce la provincia: ");
            provincia = sc.nextLine().trim();
        }
        Direccion direccion = new Direccion(poblacion, provincia);

        contactos.add(new Contacto(nombre, tlf, direccion));
    }

    public static void llamadasParaHoy() {
        llamarHoy.clear();

        if (contactos.isEmpty()) {
            System.out.println("Error: Agenda de contactos vacia. ");
            return;
        }

        int maxContactos = contactos.size() - noDisponibles.size();

        if (maxContactos <= 0) {
            System.out.println("Error: No hay contactos disponibles para llamar.");
            return;
        }

        int n;
        do {
            System.out.print("Numero de clientes que se llamaran hoy: ");
            while (!sc.hasNextInt()) {
                System.out.println("Errror: Entrada invalida.");
                sc.nextLine();
                System.out.print("Numero de clientes que se llamaran hoy: ");
            }
            n = sc.nextInt();
            sc.nextLine();

            if (n < 1 || n > maxContactos) {
                System.out.println("Error: Numero de llamadas debe estar comprendido entre 1 y " + maxContactos + ".");
            }
        } while (n < 1 || n > maxContactos);

        Contacto contactoAleatorio;
        int indiceContacto;
        for (int i = 0; i < n; i++) {
            do {
                indiceContacto = rnd.nextInt(contactos.size());
                contactoAleatorio = contactos.get(indiceContacto);
            } while (llamarHoy.contains(contactoAleatorio) || noDisponibles.contains(contactoAleatorio));
            contactos.get(indiceContacto).incrementarNumeroDeLlamdas();

            if (contactos.get(indiceContacto).alcanzadoLimiteLlamadas()) {
                noDisponibles.add(contactos.get(indiceContacto));
            }
            llamarHoy.add(contactos.get(indiceContacto));
        }
    }

    public static void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("Error: Agenda de contactos vacia.");
            return;

        }
        Collections.sort(contactos, Comparator.comparing(Contacto::getNombre, String.CASE_INSENSITIVE_ORDER));
        for (Contacto c : contactos) { // contenido del arraylist contactos ordenado alfabeticamente por nombre
            System.out.println("\n" + c);
        }

        if (noDisponibles.isEmpty()) {
            System.out.println("\nLista de contactos no disponibles vacia.");
        } else {
            System.out.println("\nContactos no disponibles ordenados alfabeticamente por nombre:");
            Collections.sort(noDisponibles, Comparator.comparing(Contacto::getNombre, String.CASE_INSENSITIVE_ORDER));
            for (Contacto noDisp : noDisponibles) { // contenido del arraylist noDisponibles ordenado alfabeticamente por nombre
                System.out.println("\n" + noDisp);
            }
        }

        if (llamarHoy.isEmpty()) {
            System.out.println("\nLista de contactos para llamar hoy vacia.");
        } else {
            System.out.println("\nContactos para llamar hoy ordenados descendentemente por numero de llamadas.");
            Collections.sort(llamarHoy, Comparator.comparing(Contacto::getNumeroDeLlamadas).reversed()
                    .thenComparing(Contacto::getNombre, String.CASE_INSENSITIVE_ORDER));
            for (Contacto llamadaHoy : llamarHoy) {
                /*El contenido del ArrayList llamarHoy ordenado por número de llamadas de mayor a menor. Si varios
                                                contactos tienen el mismo número de llamadas aparecerán ordenados alfabéticamente por nombre.
                 */
                System.out.println("\n" + llamadaHoy);
            }
        }
        System.out.println("\nValor actual del limite de llamdas: " + Contacto.getLimiteLlamadas());

    }

    public static void contactosDeUnaPoblacion() {
        String poblacion;
        if (contactos.isEmpty()) {
            System.out.println("Error: Agenda de contactos vacia, no hay poblaciones que verificar.");
            return;
        }

        System.out.print("Introduce el nombre de la poblacion: ");
        poblacion = sc.nextLine().trim();

        while (!poblacion.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}$")) {
            System.out.println("Error: Nombre de poblacion invalido.");
            System.out.print("\nIntroduce la poblacion: ");
            poblacion = sc.nextLine().trim();
        }

        int coincidencias = 0;
        for (Contacto c : contactos) {
            if (c != null && c.getDireccion().getPoblacion().equalsIgnoreCase(poblacion)) {
                System.out.println("\n" + c);
                coincidencias++;
            }
        }
        if (coincidencias == 0) {
            System.out.println("No se encontraron contactos de " + poblacion + ".");
        }
    }

    public static void inicializar() {
        int respuesta;
        do {
            System.out.print("\nEstas seguro que realmente deseas inicializar los contactos? (1 -> SI, 2 -> NO): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("\nEstas seguro que realmente deseas inicializar los contactos? (1 -> SI, 2 -> NO): ");
            }
            respuesta = sc.nextInt();
            sc.nextLine();

            if (respuesta != 1 && respuesta != 2) {
                System.out.println("Error: Rango invalido, debe ser 1 o 2.");
            }
        } while (respuesta != 1 && respuesta != 2);

        if (respuesta == 2) {
            return;
        }

        noDisponibles.clear();
        for (Contacto c : contactos) {
            c.setNumeroDeLlamadas(0);
        }
        System.out.println("Los contactos han sido inicializados correctamente.");
    }

    public static void modificarLimiteLLamadas() {
        int limiteLlamadas;
        System.out.println("Valor original del limite de llamdas: " + Contacto.getLimiteLlamadas());
        do {
            System.out.println("Nuevo valor del limite de llamadas: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.println("Nuevo valor del limite de llamadas: ");
            }
            limiteLlamadas = sc.nextInt();
            sc.nextLine();

            if (limiteLlamadas <= 0) {
                System.out.println("Error: Limite llamadas debe ser mayor a 0.");
            }
        } while (limiteLlamadas <= 0);

        Contacto.setLimiteLlamadas(limiteLlamadas);

        noDisponibles.clear();
        for (Contacto c : contactos) {
            if (c.getNumeroDeLlamadas() >= limiteLlamadas) {
                noDisponibles.add(c);
            }
        }
        System.out.println("Cambios realizados correctamente.");
    }

    public static boolean contactoRepetido(String nombre) {
        for (Contacto c : contactos) {
            if (c != null && c.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}
