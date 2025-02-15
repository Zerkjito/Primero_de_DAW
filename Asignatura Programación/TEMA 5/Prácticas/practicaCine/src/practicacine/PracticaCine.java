/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacine;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author zerkje
 */
public class PracticaCine {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input;
        int sala = 1;
        String peli1, peli2;
        
        mostrarConfiguracionHora();
        System.out.println("Sala " + sala);
        mostrarSesiones();
        elegirSesion();
        String[][] sala1 = generarSala();
        peli1 = definirPelicula(sala);
        sala++;
        System.out.println("\nSala " + sala);
        mostrarSesiones();
        elegirSesion();
        String[][] sala2 = generarSala();
        peli2 = definirPelicula(sala);

        do {
            input = elegirOpcion();
            switch (input) {
                case 1 -> {
                    mostrarSala(sala1, 1, peli1);
                    mostrarSala(sala2, 2, peli2);
                }
                case 0 ->
                    System.out.println("Fin programa.");
                default ->
                    System.out.println("Error. Opción inválida.");
            }
        } while (input != 0);
    }

    public static String obtenerFechaActual() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        return fechaActual.format(formatear);
    }

    public static void mostrarConfiguracionHora() {
        System.out.println("️Configuración de las salas para hoy");
        System.out.println(obtenerFechaActual());
        System.out.println();
    }

    public static void mostrarSesiones() {
        LocalTime[] sesiones = {
            LocalTime.of(17, 0),
            LocalTime.of(19, 30),
            LocalTime.of(21, 0)
        };
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Sesiones disponibles:");
        int cont = 1;
        for (LocalTime sesion : sesiones) {
            String horaFormat = sesion.format(formatear);
            System.out.println("(" + cont++ + ")" + " Hora: " + horaFormat);
        }
    }

    public static int elegirSesion() {
        int n;
        do {
            System.out.print("Elige una opción (1-3): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada inválida");
                sc.nextLine();
                System.out.print("Elige una opción (1-3): ");
            }
            n = sc.nextInt();
            if (n < 1 || n > 3) {
                System.out.println("Error. Opción fuera del rango.");
            }
        } while (n < 1 || n > 3);
        return n;
    }

    public static String[][] generarSala() {
        int filas, butacas;
        do {
            System.out.print("\nNúmero de filas (1-10): -> ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada inválida.");
                sc.nextLine();
                System.out.print("Número de filas (1-10): -> ");
            }
            filas = sc.nextInt();
            sc.nextLine();

            if (filas < 1 || filas > 10) {
                System.out.println("Error. El número de filas debe estar entre 1 y 10.");
            }
        } while (filas < 1 || filas > 10);

        do {
            System.out.print("Butacas por fila (4-30): -> ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada inválida.");
                sc.nextLine();
                System.out.print("Butacas por fila (4-30): -> ");
            }
            butacas = sc.nextInt();
            sc.nextLine();

            if (butacas < 4 || butacas > 30) {
                System.out.println("Error. El número de butacas por fila debe estar entre 4 y 30.");
            }
        } while (butacas < 4 || butacas > 30);

        int centro = butacas / 2;
        String[][] sala = new String[filas][butacas];
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (j == centro) {
                    sala[i][j] = " ";
                } else {
                    sala[i][j] = "_";
                }

            }
        }
        return sala;
    }

    public static void mostrarSala(String[][] s, int sala, String peli) {
        int cont = 1;
        System.out.println("\n");
        System.out.println("SALA " + sala + " -> " + peli);
        
        for (int i = 0; i < s.length; i++) {
            System.out.print(cont++ % 10 + "  ");
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
        cont = 1;
        System.out.print("   ");
        int centro = s[0].length / 2;
        for (int j = 0; j < s[0].length; j++) {
            if (j == centro) {
                System.out.print("  ");
            } else {
                System.out.print((cont++) % 10 + " ");
            }
        }
        System.out.println();
        
        cont = 1;
        System.out.print("   ");
        for (int j = 0; j < s[0].length; j++) {
            if (j % 10 == 0 && j > 5) {
                System.out.print(cont++ + " ");
            } else {
                System.out.print("  ");
            }
        }
    }

    public static String definirPelicula(int sala) {
        String nombrePelicula;
        do {
            System.out.print("Película en la Sala " + sala + ": ");
            nombrePelicula = sc.nextLine().trim();
            if (!validarNombrePelicula(nombrePelicula)) {
                System.out.println("Error. Nombre inválido, vuelva a intentarlo.");
            }
        } while (!validarNombrePelicula(nombrePelicula));
        return nombrePelicula;
    }

    public static boolean validarNombrePelicula(String nombre) {
        String regex = "^[A-Za-z0-9\\s\\-\\':,.]{1,100}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombre);
        return matcher.matches();
    }

    public static int elegirOpcion() {
        int n;
        do {
            System.out.println("\n");
            System.out.println("1. Mostrar salas");
            System.out.println("2. Vender entradas");
            System.out.println("0. FIN");
            System.out.print("Elige una opción: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error. Entrada invalida.");
                sc.nextLine();
                System.out.print("Elige una opción: ");
            }
            n = sc.nextInt();
            sc.nextLine();
        } while (n < 0 || n > 2);
        return n;
    }

}
