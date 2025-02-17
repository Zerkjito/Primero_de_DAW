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

    /*
     Pido disculpas de antemano por tener los métodos relativamente desordenados sin un orden exigente/lógico. No quise desplazarlos por miedo a
     perder el flujo original del programa y causar algún error de sintaxis o eliminar alguna variable sin querer
     */
    public static void main(String[] args) {
        int input;
        String[] peliculas = new String[2];
        int[][] sesiones = new int[2][2];
        String[][][][] salas = new String[2][2][][]; // creo un array de 4 dimensiones basandome en: 2 salas, 2 sesiones, filas, butacas
        mostrarConfiguracionHora();

        for (int sala = 0; sala < 2; sala++) {
            System.out.println("\nSala " + (sala + 1));
            peliculas[sala] = definirPelicula(sala + 1);
            int[] sesionesSala = new int[2];

            for (int sesion = 0; sesion < 2; sesion++) {
                System.out.println("\nSesión " + (sesion + 1));
                mostrarSesiones();
                sesionesSala[sesion] = elegirSesion(sesionesSala);
                sesiones[sala][sesion] = sesionesSala[sesion];
                int filas = pedirNumero("Número de filas (1-10): -> ", 1, 10);
                int butacas = pedirNumero("Butacas por fila (4-30): -> ", 4, 30);
                salas[sala][sesion] = generarSala(filas, butacas);
            }
        }

        do {
            input = elegirOpcion();
            switch (input) {
                case 1 ->
                    mostrarTodasLasSalas(salas, peliculas, sesiones);
                case 2 ->
                    venderEntrada(salas, peliculas, sesiones);
                case 0 ->
                    System.out.println("[Fin programa]");
            }
        } while (input != 0);
    }

    public static String traducirSesion(int opcion) { // método para averiguar a qué hora pertenece realmente la opción seleccionada en elegirSesion()
        String hora = "Hora inválida";
        LocalTime[] sesiones = {
            LocalTime.of(20, 0),
            LocalTime.of(22, 30),};
        if (opcion >= 1 && opcion <= 2) {
            hora = sesiones[opcion - 1].toString();
        }
        return hora;
    }

    public static String obtenerFechaActual() { // método que devuelve la fecha actual en formato "EEEE d 'de' MMMM 'de' yyyy"
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        return fechaActual.format(formatear);
    }

    public static String obtenerFechaComprimida() { // método que devuelve la fecha actual en formato "dd/MM/yyyy"
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaActual.format(formatear);
    }

    public static void mostrarConfiguracionHora() { // método que se ejecuta al principio del programa y muestra la fecha actual
        System.out.println("️Configuración de las salas para hoy");
        System.out.println(obtenerFechaActual());
        System.out.println();
    }

    public static void mostrarSesiones() {
        /* método para mostrar las sesiones disponibles a través de un array que contiene los valores de las horas
        aún sin 'traducir'. Luego se formeatean correctamente recorriendelas mediante un forEach. Elijo este formato por si hubiera que hacer
        operaciones posteriores con las horas como duración de películas, tiempo entre sesiones etc...
         */
        LocalTime[] sesiones = {
            LocalTime.of(20, 0),
            LocalTime.of(22, 30),};
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Sesiones disponibles:");
        int cont = 1;
        for (LocalTime sesion : sesiones) {
            String horaFormat = sesion.format(formatear);
            System.out.println("(" + cont++ + ")" + " Hora: " + horaFormat);
        }
    }

    public static int elegirSesion(int[] sesionesSala) {
        /* método que se encarga de elegir una opción de las sesiones, aunque esta aún no es representativa puesto que el
        método traducirSesion es el que realmente va a transformarlo en un valor real representativo en forma de String para saber la hora
         */
        int n;
        do {
            System.out.print("Elige una opción (1-2): ");
            while (!sc.hasNextInt()) {
                System.out.println("[Error. Entrada inválida]");
                sc.nextLine();
                System.out.print("Elige una opción (1-2): ");
            }
            n = sc.nextInt();
            if (n < 1 || n > 2) {
                System.out.println("[Error. Opción fuera del rango]");
            } else if (sesionesSala[0] == n || sesionesSala[1] == n) {
                System.out.println("[Error. Esta hora ya ha sido seleccionada para otra sesión]");
                n = -1;
            }
        } while (n < 1 || n > 2);
        return n;
    }

    public static String[][] generarSala(int filas, int butacas) { // método que se encarga de generar las dimensiones de las salas en base a las preferencias elegidas mediante matrices
        int centro = butacas % 2 == 0 ? butacas / 2 : butacas / 2 + 1;
        String[][] sala = new String[filas][butacas + 1];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < butacas + 1; j++) {
                if (j == centro) {
                    sala[i][j] = " ";
                } else {
                    sala[i][j] = "_";
                }
            }
        }
        return sala;
    }

    public static void mostrarTodasLasSalas(String[][][][] s, String[] peliculas, int[][] sesiones) {
        /* método que recibe una array de 4 dimensiones y se encarga de terminar de distribuirla
        correctamente con los últimos retoques de enumeraciones para las filas y butacas así como del pasillo central
         */
        for (int sala = 0; sala < 2; sala++) {
            for (int sesion = 0; sesion < 2; sesion++) {
                String horaSesion = traducirSesion(sesiones[sala][sesion]);
                mostrarSala(s[sala][sesion], sala + 1, peliculas[sala], horaSesion);
            }
        }
    }

    public static void mostrarSala(String[][] sala, int numSala, String peli, String horaSesion) {
        int cont = 1;
        System.out.println("\n");
        System.out.println("Sala " + numSala + " - " + peli + " - " + horaSesion);

        for (int i = 0; i < sala.length; i++) {
            System.out.printf("%-3d", cont++);
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }

        cont = 1;
        System.out.print("   ");
        int centro = sala[0].length / 2;
        for (int j = 0; j < sala[0].length; j++) {
            if (j == centro) {
                System.out.print("  ");
            } else {
                System.out.print((cont++) % 10 + " ");
            }
        }
        System.out.println();

        cont = 1;
        System.out.print("   ");
        for (int j = 0; j < sala[0].length; j++) {
            if (sala[0][j].equals(" ")) {
                System.out.print("  ");
            } else if (cont % 10 == 0) {
                System.out.print(cont / 10 + " ");
            } else {
                System.out.print("  ");
            }
            if (!sala[0][j].equals(" ")) {
                cont++;
            }
        }
        System.out.println();
    }

    public static String definirPelicula(int sala) {
        /* método para elegir el nombre de la película y verificar que realmente es válido gracias
        a la llamada al método validarNombrePelicula(), que entrará en bucle mientras esta no cumpla los filtros
         */
        String nombrePelicula;
        do {
            System.out.print("Película en la Sala " + sala + ": ");
            nombrePelicula = sc.nextLine().trim();
            if (!validarNombrePelicula(nombrePelicula)) {
                System.out.println("[Error. Nombre inválido, vuelva a intentarlo]");
            }
        } while (!validarNombrePelicula(nombrePelicula));
        return nombrePelicula;
    }

    public static boolean validarNombrePelicula(String nombre) {
        /* método que recibe el nombre de una película para validarlo mediante una serie de filtros.
        Primero, creo un String regex en el que decido la serie de filtros que quiero aplicar. Esta expresión regular traducida sería: quiero que el
        nombre únicamente comience por una letra(A-Z || a-z) o números(0-9). Seguido de esto, puede contener letras (A-Z || a-z) e incluso caracteres
        especiales como -':,. y espacios (el carácter especial \\- escapado se debe a que, si se encuentra en el medio, sí se ha de expresar con \\).
        Por último, quiero que contenga entre 0-99 y carcteres, sin contar el primero que ya se está siendo evaluado aparte con [A-Za-z0-9].
        Todo esto a través de los métodos Pattern y Matcher, permitiendo comprobar si reúnen los requisitos de regex o no devolviendo un valor boolean
         */
        String regex = "^[A-Za-z0-9][A-Za-z0-9 \\-':,.]{0,99}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombre);
        return matcher.matches();
    }

    public static int elegirOpcion() { // método que valida la opción del menú principal elegida en el flujo del main
        int n;
        do {
            System.out.println("\n");
            System.out.println("1. Mostrar salas");
            System.out.println("2. Vender entradas");
            System.out.println("0. FIN");
            System.out.print("Elige una opción: ");
            while (!sc.hasNextInt()) {
                System.out.println("[Error. Entrada invalida]");
                sc.nextLine();
                System.out.print("Elige una opción: ");
            }
            n = sc.nextInt();
            sc.nextLine();
            if (n < 0 || n > 2) {
                System.out.println("[Error. Opción fuera de rango.]");
            }
        } while (n < 0 || n > 2);
        return n;
    }

    public static void venderEntrada(String[][][][] s, String[] peliculas, int[][] sesiones) {
        /* método que recibe todos los 
        parámetros necesarios para procesar la venta de la entrada, el cual recurre a la llamada de otros métodos para ejecutarse correctamente
         */
        System.out.println("\nVenta de entradas");
        int sala = pedirNumero("Introduce sala: ", 1, 2);
        int sesion = pedirNumero("Introduce sesión(1-2): ", 1, 2) - 1;

        if (sala == 1) {
            procesarVenta(s[0][sesion], sala, peliculas[0], traducirSesion(sesiones[0][sesion]));
        } else {
            procesarVenta(s[1][sesion], sala, peliculas[1], traducirSesion(sesiones[1][sesion]));
        }
    }

    public static void procesarVenta(String[][] s, int numSala, String peli, String horaSesion) {
        /* método que me ayuda a reducir código en
        venederEntrada(), de modo que hace las comprobaciones pertinentes con la llamada a pedirNumero() y finalmente muestra la entrada generada con
        todos los datos
         */
        mostrarSala(s, numSala, peli, horaSesion);
        System.out.println();
        int fila = pedirNumero("Elegir fila -> ", 1, s.length);
        int butaca = pedirNumero("Elegir butaca -> ", 1, s[0].length - 1);
        int centro = s[0].length % 2 == 0 ? s[0].length / 2 : s[0].length / 2 + 1;

        if (s[fila - 1][butaca - 1].equals("_") && butaca - 1 < centro) {
            s[fila - 1][butaca - 1] = "X";
            generarEntrada(numSala, peli, horaSesion, fila, butaca);
        } else if (butaca == centro) {
            s[fila - 1][butaca] = "X";
            generarEntrada(numSala, peli, horaSesion, fila, butaca);
        } else if (s[fila - 1][butaca].equals("_") && butaca > centro) {
            s[fila - 1][butaca] = "X";
            generarEntrada(numSala, peli, horaSesion, fila, butaca);
        } else {
            System.out.println("[Error. Butaca no disponible]");
        }
    }

    public static int pedirFila(int numFilas) { // método para pedir el número de fila y verificar que realmente se encuentra dentro de un rango válido
        int fila;
        do {
            System.out.print("\nElegir fila -> ");
            while (!sc.hasNextInt()) {
                System.out.println("[Error. Entrada inválida]");
                sc.nextLine();
                System.out.print("Elegir fila -> ");
            }
            fila = sc.nextInt();
            sc.nextLine();

            if (fila < 1 || fila > numFilas) {
                System.out.println("[Error. Posición de fila inválida]");
            }
        } while (fila < 1 || fila > numFilas);
        return fila;
    }

    public static int pedirNumero(String mensaje, int min, int max) {
        /* método que verifica el rango válido de los parámetros que recibe así como
        su respectivo mensaje para solicitar la información requereida
         */
        int num;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("[Error. Entrada inválida]");
                sc.nextLine();
                System.out.print(mensaje);
            }
            num = sc.nextInt();
            sc.nextLine();
            if (num < min || num > max) {
                System.out.println("[Error. Valor fuera de rango]");
            }
        } while (num < min || num > max);
        return num;
    }

    public static int pedirButaca(int numButacas) { // método para pedir el número de butaca y verificar que realmente se encuentra dentro de un rango válido
        int butaca;
        do {
            System.out.print("Elegir butaca -> ");
            while (!sc.hasNextInt()) {
                System.out.println("[Error. Entrada inválida]");
                sc.nextLine();
                System.out.print("Elegir butaca -> ");
            }
            butaca = sc.nextInt();
            sc.nextLine();

            if (butaca < 1 || butaca > numButacas - 1) {
                System.out.println("[Error. Posición de butaca inválida]");
            }
        } while (butaca < 1 || butaca > numButacas - 1);
        /* resto 1 por el pasillo que ha sido almacenado en la matriz, de lo contrario
        la numeración sería incorrecta y causaría errores de posicionamiento
         */
        return butaca;
    }

    public static void generarEntrada(int sala, String nombrePeli, String sesion, int fila, int butaca) {
        /* muestro la información relevante de la compra
        de la entrada en base a las preferencias que ha introducido el usuario
         */
        String idEntrada = generarIdEntrada();
        System.out.println("\nSu entrada");
        System.out.println("\nSala " + sala + " - " + nombrePeli);
        System.out.println(obtenerFechaComprimida() + "  Sesión " + sesion);
        System.out.println("Fila " + fila + " Butaca " + butaca);
        System.out.println("ID entrada: " + idEntrada);
    }

    public static String generarIdEntrada() {
        /* método para generar un ID aleatorio para el ticket de la entrada entre 10.000 y 100.000, más una letra
        aleatoria al final, la cual devuelvo concatenada con el número aleatorio y el String usando el método String.valueOf()
         */
        int n = rnd.nextInt(10000, 100000);
        char letra = (char) (rnd.nextInt('A', 'Z' + 1));
        return n + String.valueOf(letra);
    }
}
