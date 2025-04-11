/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrerapopular;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class CarreraPopular {

    static boolean terminado = false;
    static ArrayList<Carrera> participantes = new ArrayList<>();
    static int distanciaTotalCarrera;
    static Scanner sc = new Scanner(System.in);
    static Menu m = new Menu();
    static Random rnd = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        crearCarrera();
        do {
            m.mostrar();
            opcion = m.leerOpcion();
            switch (opcion) {
                case 1:
                    mostrarCarrera();
                    break;
                case 2:
                    avanzarParticipantes();
                case 3:
                    amonestarParticipantes();
                case 4:
                case 5:
            }
        } while (opcion != 0);
    }

    public static void crearCarrera() {
        int tipoParticipante;

        distanciaTotalCarrera = pedirDistancia();
        int numParticipantes = UtilidadesInput.leerEnteroEnRangoMin("\nCantidad participantes: ", 1, "Error: Cantidad participantes no puede ser negativa.");

        for (int i = 1; i <= numParticipantes; i++) {
            System.out.println("\nDorsal " + i + ":");
            tipoParticipante = UtilidadesInput.leerEnteroEnRango("Tipo de participante (1->Bicicleta  2->Patinete  3->Corredor): ", 1, 3, "Error: Rango opción invalido.");
            switch (tipoParticipante) {
                case 1 ->
                    leerBicicleta();
                case 2 ->
                    leerPatinete();
                case 3 ->
                    leerCorredor();
            }
        }

    }

    public static int pedirDistancia() {
        return UtilidadesInput.leerEnteroEnRangoMin("Introduzca distancia en metros (>= 100): ", 100, "Error: Distancia minima son 100 metros.");
    }

    public static void leerBicicleta() {
        String nombre = pedirNombreConductor();
        int edad = pedirEdad();
        Persona p = new Persona(nombre, edad);
        double peso = pedirPeso();
        TipoBicicleta tipo = pedirTipoBici();
        participantes.add(new Bicicleta(p, peso, tipo));
        System.out.println("Bicicleta registrada en la carrera correctamente.");
    }

    public static void leerPatinete() {
        String nombre = pedirNombreConductor();
        int edad = pedirEdad();
        Persona p = new Persona(nombre, edad);
        double peso = pedirPeso();
        int numRuedas = pedirRuedasPatinete();
        participantes.add(new Patinete(p, peso, numRuedas));
        System.out.println("Patinete registrado en la carrera correctamente.");
    }

    public static void leerCorredor() {
        String nombre = pedirNombreCorredor();
        int edad = pedirEdad();
        participantes.add(new Corredor(nombre, edad));
        System.out.println("Corredor registrado en la carrera correctamente.");
    }

    public static String pedirNombreConductor() {
        String nombre = UtilidadesInput.leerString("Nombre del conductor: ");
        while (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}")) {
            System.out.println("Error: Nombre invalido, vuelva a intentarlo.");
            nombre = UtilidadesInput.leerString("Nombre del conductor: ");
        }
        return nombre;
    }

    public static String pedirNombreCorredor() {
        String nombre = UtilidadesInput.leerString("Nombre del corredor: ");
        while (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{2,50}")) {
            System.out.println("Error: Nombre invalido, vuelva a intentarlo.");
            nombre = UtilidadesInput.leerString("Nombre del conductor: ");
        }
        return nombre;
    }

    public static int pedirEdad() {
        return UtilidadesInput.leerEnteroEnRangoMin("Edad: ", 1, "Error: Edad invalida.");
    }

    public static double pedirPeso() {
        return UtilidadesInput.leerDoubleEnRangoMin("Peso del vehiculo  en kg: ", 0, "Error: Peso invalido.");
    }

    public static int pedirRuedasPatinete() {
        return UtilidadesInput.leerEnteroEnRangoMin("Numero de ruedas: ", 2, "Error: Numero ruedas invalido.");
    }

    public static TipoBicicleta pedirTipoBici() {
        int n = UtilidadesInput.leerEnteroEnRango("Tipo bicicleta (1-> Paseo  2-> Montaña): ", 1, 2, "Error: Opcion en rango invalido.");
        return TipoBicicleta.values()[n - 1];
    }

    public static void mostrarCarrera() {
        participantes.sort(Comparator.comparing(Carrera::obtenerDistanciaRecorrida).reversed());
        System.out.println("\nSituacion de la carrera:\n");
        for (Carrera p : participantes) {
            System.out.println(p);
        }

    }

    public static void avanzarParticipantes() {
        int indice, resultado;
        if (!terminado) {
            do {
                indice = rnd.nextInt(participantes.size());
                resultado = participantes.get(indice).avanzar();
                if (resultado >= distanciaTotalCarrera) {
                    terminado = true;
                    System.out.println("Carrera finalizada, ya hay un ganador!");
                }
            } while (resultado == -1);
        } else {
            System.out.println("Error: La carrera ya ha finalizado.");
        }
    }

    public static void amonestarParticipantes() {
        if (!terminado) {
            int dorsal = UtilidadesInput.leerEnteroEnRango("Dorsal del amonestado: ", 1, participantes.size(), "Error: Dorsal fuera del rango. Debe ser entre 1 y " + participantes.size());
            dorsal--;

            Carrera participante = participantes.get(dorsal);
            boolean amonestado = participante.amonestar();

            if (!amonestado) {
                System.out.println("Error: El participante con dorsal " + (dorsal + 1) + " ya estaba eliminado o no esta en carrera.");
                return;
            }

            int participantesEnCarrera = participantesNoEliminados();

            if (participantesEnCarrera <= 1) {
                System.out.println("El participante con dorsal " + (dorsal + 1) + " fue amonestado. La carrera se da por finalizada.");
            } else {
                System.out.println("Participante con dorsal " + (dorsal + 1) + " amonestado correctamente.");
            }

        } else {
            System.out.println("Error: La carrera ya ha finalizado.");
        }
    }

    public static void mostrarGanadores() {
        if (terminado) {
            int participantesEnCarrera = participantesNoEliminados();
            participantes.sort(Comparator.comparing(Carrera::obtenerDistanciaRecorrida).reversed());

            switch (participantesEnCarrera) {
                case 3 -> {
                    System.out.println("Primer puesto:");
                    System.out.println(participantes.get(0));

                    System.out.println("Segundo puesto:");
                    System.out.println(participantes.get(1));

                    System.out.println("Tercer puesto:");
                    System.out.println(participantes.get(2));
                }

                case 2 -> {
                    System.out.println("Primer puesto:");
                    System.out.println(participantes.get(0));

                    System.out.println("Segundo puesto:");
                    System.out.println(participantes.get(1));
                }

                case 1 -> {
                    System.out.println("Primer puesto:");
                    System.out.println(participantes.get(0));
                }

                default ->
                    System.out.println("Error: No hay participantes activos para mostrar ganadores.");
            }
        } else {
            System.out.println("Error: La carrera aun sigue en curso.");
        }
    }

    public static int participantesNoEliminados() {
        int participantesEnCarrera = 0;
        for (Carrera p : participantes) {
            if (p.enCarrera()) {
                participantesEnCarrera++;
            }
        }
        return participantesEnCarrera;
    }

    public static void mostrarGanadoresPorCategorias() {
        if (terminado) {
            participantes.sort(Comparator.comparing(Carrera::obtenerDistanciaRecorrida).reversed());

            Carrera ganadorBicicleta = null;
            Carrera ganadorCorredor = null;
            Carrera ganadorPatinete = null;

            for (int i = 0; i < participantes.size(); i++) {
                Carrera participante = participantes.get(i);

                if (participante instanceof Bicicleta && ganadorBicicleta == null) {
                    ganadorBicicleta = participante;
                    System.out.println("Primera Bicicleta en la posicion " + (i + 1));
                    System.out.println(ganadorBicicleta);
                } else if (participante instanceof Patinete && ganadorPatinete == null) {
                    ganadorPatinete = participante;
                    System.out.println("Primer Patinete en la posicion " + (i + 1));
                    System.out.println(ganadorPatinete);
                } else if (participante instanceof Corredor && ganadorCorredor == null) {
                    ganadorCorredor = participante;
                    System.out.println("Primer Corredor en la posicion " + (i + 1));
                    System.out.println(ganadorCorredor);
                }

                if (ganadorBicicleta != null && ganadorCorredor != null && ganadorPatinete != null) {
                    break;
                }
            }

            if (ganadorBicicleta == null) {
                System.out.println("No hay ganador de la categoria Bicicleta.");
            }
            if (ganadorCorredor == null) {
                System.out.println("No hay ganador de la categoria Corredor.");
            }

            if (ganadorPatinete == null) {
                System.out.println("No hay ganador de la categoria Patinete.");
            }

        } else {
            System.out.println("Error: La carrera aun sigue en curso.");
        }
    }

    public static void mostrarPosicionMasJoven() {
        if (terminado) {
            Carrera participanteMasJoven = null;

            for (Carrera p : participantes) {
            }

        } else {
            System.out.println("Error: La carrera aun sigue en curso.");
        }
    }

}
