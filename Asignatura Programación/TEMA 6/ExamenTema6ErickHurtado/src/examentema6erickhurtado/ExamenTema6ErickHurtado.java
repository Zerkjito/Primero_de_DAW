/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examentema6erickhurtado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lliurex
 */
public class ExamenTema6ErickHurtado {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static ArrayList<Perro> perros = new ArrayList<>();
    static ArrayList<Perro> ingresados = new ArrayList<>();

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
                    leerPerros();
                    break;
                case 2:
                    mostrarPerros();
                    break;
                case 3:
                    gestionarIngresos();
                    break;
                case 4:
                    consultarIngresos();
                    break;
                case 5:
                    modificarValores();
                    break;
            }
        } while (opcion != 0);
    }

    public static void leerPerros() {
        String idPerro, nombrePerro, nombreDueño, telefonoDueño;
        Perro perroTemp = new Perro();
        int opcion;
        do {
            do {
                idPerro = pedirIdPerro();
                perroTemp.setIdentificador(idPerro);

                if (esPerroRepetido(perroTemp)) {
                    System.out.println("Error: Perro con ID " + idPerro + " ya registrado.");
                }
            } while (esPerroRepetido(perroTemp));

            nombrePerro = pedirNombrePerro();
            nombreDueño = pedirNombreDueño();
            telefonoDueño = pedirTelefonoDueño();
            Dueño dueño = new Dueño(nombreDueño, telefonoDueño);
            perros.add(new Perro(idPerro, nombrePerro, dueño));
            System.out.println("Perro " + nombrePerro + " leido correctamente.");
            do {
                System.out.print("\nDesea volver a leer un perro? (1 -> SI, 2 -> NO): ");
                while (!sc.hasNextInt()) {
                    System.out.println("error: entrada invalida");
                    sc.nextLine();
                    System.out.print("\nDesea volver a leer un perro? (1 -> SI, 2 -> NO): ");
                }
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion != 1 && opcion != 2) {
                    System.out.println("error: rango invalido");
                }
            } while (opcion != 1 && opcion != 2);

        } while (opcion == 1);

    }

    public static String pedirIdPerro() {
        System.out.print("\nID del perro (debe comenzar por letra y contener 6 caracteres): ");
        String id = sc.nextLine().trim();
        while (!id.matches("^[a-zA-Z]{1}[a-zA-Z0-9]{5}$")) {
            System.out.println("Error: ID invalido.");
            System.out.print("\nID del perro (debe comenzar por letra y contener 6 caracteres): ");
            id = sc.nextLine().trim();
        }
        return id;
    }

    public static String pedirNombrePerro() {
        System.out.print("\nNombre del perro: ");
        String nombre = sc.nextLine().trim();
        while (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}$")) {
            System.out.println("Error: Nombre invalido.");
            System.out.print("\nNombre del perro: ");
            nombre = sc.nextLine().trim();
        }
        return nombre;
    }

    public static String pedirNombreDueño() {
        System.out.print("\nNombre del dueño: ");
        String nombre = sc.nextLine().trim();
        while (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}$")) {
            System.out.println("Error: Nombre dueño invalido.");
            System.out.print("\nNombre del dueño: ");
            nombre = sc.nextLine().trim();
        }
        return nombre;
    }

    public static String pedirTelefonoDueño() {
        System.out.print("\nTelefono dueño: ");
        String dueñotlf = sc.nextLine().trim();
        while (!dueñotlf.matches("^[67][0-9]{8}$")) {
            System.out.println("Error: Telefono dueño invalido.");
            System.out.print("\nTelefono dueño: ");
            dueñotlf = sc.nextLine().trim();
        }
        return dueñotlf;
    }

    public static boolean esPerroRepetido(Perro p) {
        return perros.contains(p);
    }

    public static void mostrarPerros() {
        if (perros.isEmpty()) {
            System.out.println("error: no hay perros registrados que mostrar actualmente.");
            return;
        }

        perros.sort(Comparator.comparing(Perro::getNombre, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Perros ordenados alfabeticamente por nombre:");
        for (Perro p : perros) {
            System.out.println("\n" + p);
        }

        if (ingresados.isEmpty()) {
            System.out.println("\nActualmente no hay perros ingresados que mostrar.");
        } else {
            ingresados.sort(Comparator.comparing(Perro::getIngresos).reversed());
            System.out.println("Perros ingresados ordenados por número de ingresos:");
            for (Perro ingresado : ingresados) {
                System.out.println("\n" + ingresado);
            }
        }
    }

    public static void gestionarIngresos() {
        if (perros.isEmpty()) {
            System.out.println("error: no hay perros registrados que mostrar actualmente.");
            return;
        }

        double importe = Perro.getPrecio();
        int indicePerro = rnd.nextInt(perros.size());
        Perro perroTemp = perros.get(indicePerro);
        if (perros.contains(perroTemp)) {
            System.out.println("\nSe da de alta el perro:");
            System.out.println(perros.get(indicePerro));
            if (perros.get(indicePerro).superaLimite()) {
                importe += 30;
                System.out.printf("\nImporte a pagar: %.2f€%n", importe);
            } else {
                System.out.printf("\nImporte a pagar: %.2f€%n", importe);
            }
        } else {
            int ingresos = perros.get(indicePerro).getIngresos();
            perros.get(indicePerro).setIngresos(ingresos + 1);
            ingresados.add(perros.get(indicePerro));
            System.out.println(perros.get(indicePerro));
        }
    }

    public static void consultarIngresos() {
        String nombreDueño = pedirNombreDueño();

        int coincidencias = 0;
        double  importeTotal = 0;
        for (Perro p : perros) {
            if (p.getDueño().getNombre().equals(nombreDueño)) {
                System.out.println("\n" + p);
                if (p.superaLimite()) {
                    importeTotal += Perro.getPrecio() + 30; // lo mas corecto creo que habria sido declarar un atributo static llamado importeExtra y asignarle el 30 o lo que sea
                } else {
                    importeTotal += Perro.getPrecio();
                }
                coincidencias++;
            }
        }

        if (coincidencias == 0) {
            System.out.println("Error: No se encontraron perros vinculados a " + nombreDueño);
        } else {
            System.out.printf("Importe total a pagar: %.2f€%n", importeTotal);
        }
    }

    public static void modificarValores() {
        int nuevoPrecio, nuevoLimite;
        System.out.println("\nValor actual del coste por consulta: " + Perro.getPrecio());
        do {
            System.out.print("Nuevo valor para el coste por consulta: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida");
                sc.nextLine();
                System.out.print("\nNuevo valor para el coste por consulta: ");
            }
            nuevoPrecio = sc.nextInt();
            sc.nextLine();

            if (nuevoPrecio <= 0) {
                System.out.println("Error: Nuevo valor para el coste no puede ser negativo.");
            }
        } while (nuevoPrecio <= 0);
        Perro.setPrecio(nuevoPrecio);

        System.out.println("\nValor actual del limite de ingresos: " + Perro.getLimite());
        do {
            System.out.print("Nuevo valor para el limite de ingresos: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida");
                sc.nextLine();
                System.out.print("\nNuevo valor para el limite de ingresos: ");
            }
            nuevoLimite = sc.nextInt();
            sc.nextLine();

            if (nuevoLimite <= 0) {
                System.out.println("Error: Nuevo valor para el limite de ingresos no puede ser negativo.");
            }
        } while (nuevoLimite <= 0);
        Perro.setLimite(nuevoLimite);
        System.out.println("Valores reasignados correctamente.");
    }

}
