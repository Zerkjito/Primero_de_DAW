/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacine;

import java.time.DayOfWeek;
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
    static String[] peliculas = new String[2];

    /*
     Pido disculpas por tener los métodos algo desordenados sin seguir un orden muy lineal, para cuando me di cuenta ya era un poco tarde...
     */
    public static void main(String[] args) {
        int input;
        int[][] sesiones = new int[2][2];
        String[][][][] salas = new String[2][2][][]; // creo un array de 4 dimensiones basándome en: 2 salas, 2 sesiones, filas, butacas
        mostrarConfiguracionHora();

        for (int sala = 0; sala < 2; sala++) { // configuro las 4 salas directamente al principio 
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
        String[] duraciones = generarHoraAleatoria(peliculas); // genero duraciones ficticias de las películas para mostrarlo en mostrarInfoPelis()

        do {
            input = elegirOpcion();
            switch (input) {
                case 1 ->
                    mostrarTodasLasSalas(salas, peliculas, sesiones);
                case 2 ->
                    venderEntrada(salas, peliculas, sesiones);
                case 3 ->
                    mostrarPrecioDia();
                case 4 ->
                    mostrarInfoPelis(duraciones, peliculas);
                case 5 ->
                    consultarAforo(salas);
                case 0 ->
                    System.out.println("\nFin programa, gracias por usarme!");
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

    public static String obtenerFechaActual() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        return fechaActual.format(formatear);
    }

    public static String obtenerFechaComprimida() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaActual.format(formatear);
    }

    public static void mostrarConfiguracionHora() {
        System.out.println("️Configuración de las salas para hoy");
        System.out.println(obtenerFechaActual());
        System.out.println();
    }

    public static void mostrarSesiones() { /* método para mostrar las sesiones disponibles a través de un array que contiene los valores de las horas
        aún sin 'traducir'. Luego, se formeatean correctamente recorriéndolas mediante un forEach. Elijo este formato por si hubiera que hacer
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

    public static int elegirSesion(int[] sesionesSala) { /* método que se encarga de elegir una opción de las sesiones, sin embargo 
        ésta aún no es representativa puesto que el método traducirSesion es el que realmente va a transformarlo en un valor real formeteado
        tipo String para saber la hora
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
            } else if (sesionesSala[0] == n || sesionesSala[1] == n) { // verifico que la opción no haya sido seleccionada anteriormente
                System.out.println("[Error. Esta hora ya ha sido seleccionada para otra sesión]");
                n = -1; // reseteo su valor para volver a preguntar
            }
        } while (n < 1 || n > 2);
        return n;
    }

    public static String[][] generarSala(int filas, int butacas) { // método que se encarga de generar las dimensiones de las salas
        String[][] sala = new String[filas][butacas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < butacas; j++) {
                sala[i][j] = "_";
            }
        }
        return sala;
    }

    public static void mostrarTodasLasSalas(String[][][][] s, String[] peliculas, int[][] sesiones) { /* método que recibe una array de 4 dimensiones
         y se encarga de mostrar todas las salas ya configuradas 
         */
        for (int sala = 0; sala < 2; sala++) {
            for (int sesion = 0; sesion < 2; sesion++) {
                String horaSesion = traducirSesion(sesiones[sala][sesion]);
                mostrarSala(s[sala][sesion], sala + 1, peliculas[sala], horaSesion);
            }
        }
    }

    public static void mostrarSala(String[][] sala, int numSala, String peli, String horaSesion) { //método para distribuir correctamente las salas
        int cont = 1;
        System.out.println("\n");
        System.out.println("Sala " + numSala + " - " + peli + " - " + horaSesion);
        int centro = sala[0].length / 2;
        for (int i = 0; i < sala.length; i++) {
            System.out.printf("%-3d", cont++);
            for (int j = 0; j < sala[i].length; j++) {
                if (j == centro) {
                    System.out.print("  ");
                }
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }

        cont = 1;
        System.out.print("   ");

        for (int j = 0; j < sala[0].length + 1; j++) {
            if (j == centro) {
                System.out.print("  ");
            } else {
                System.out.print((cont++) % 10 + " ");
            }
        }
        System.out.println();

        cont = 1;
        System.out.print("   ");
        for (int j = 0; j < sala[0].length + 1; j++) {
            if (j == centro) {
                System.out.print("  ");
            } else if (cont % 10 == 0) {
                System.out.print(cont / 10 + " ");
            } else {
                System.out.print("  ");
            }
            if (j != centro) {
                cont++;
            }
        }
        System.out.println();
    }

    public static String definirPelicula(int sala) { /* método para elegir el nombre de la película y veriificar que realmente es válido gracias
        a la llamada al método validarNombrePelicula(), que entrará en bucle mientras ésta no cumpla los requisitos
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

    public static boolean validarNombrePelicula(String nombre) { /* método que recibe el nombre de una película para validarlo mediante una serie de filtros.
        Primero, creo un String regex en el que decido la serie de filtros que quiero aplicar. Esta expresión regular traducida sería: quiero que el
        nombre únicamente comience por una letra(A-Z || a-z) o números(0-9). Seguido de esto, puede contener letras (A-Z || a-z) e incluso caracteres
        especiales como -':,. y espacios (el carácter especial \\- escapado se debe a que, si se encuentra en el medio, sí se ha de expresar con \\).
        Por último, quiero que contenga entre 0-99 y carcteres, sin contar el primero que ya se está siendo evaluado aparte con [A-Za-z0-9].
        Todo esto a través de los métodos Pattern y Matcher que comprueban el nombre y devuelven un boolean
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
            System.out.println("3. Mostrar precio por día");
            System.out.println("4. Mostrar información de cada película");
            System.out.println("5. Mostrar el aforo actual de cada sala");
            System.out.println("0. FIN");
            System.out.print("Elige una opción: ");
            while (!sc.hasNextInt()) {
                System.out.println("[Error. Entrada invalida]");
                sc.nextLine();
                System.out.print("Elige una opción: ");
            }
            n = sc.nextInt();
            sc.nextLine();
            if (n < 0 || n > 5) {
                System.out.println("[Error. Opción fuera de rango.]");
            }
        } while (n < 0 || n > 5);
        return n;
    }

    public static void venderEntrada(String[][][][] s, String[] peliculas, int[][] sesiones) { /* método que recibe todos los 
         parámetros necesarios para procesar la venta de la entrada, el cual a su vez recurre a la llamada de otros métodos para terminar de ejecutarse
         */
        System.out.println("\nVenta de entradas");
        int sala = pedirNumero("Introduce sala (1-2): ", 1, 2);
        int sesion = pedirNumero("Introduce sesión (1 -> 20:00 //// 2 -> 22:30): ", 1, 2) - 1;

        if (sala == 1) {
            procesarVenta(s[0][sesion], sala, peliculas[0], traducirSesion(sesiones[0][sesion]));
        } else {
            procesarVenta(s[1][sesion], sala, peliculas[1], traducirSesion(sesiones[1][sesion]));
        }
    }

    public static void procesarVenta(String[][] s, int numSala, String peli, String horaSesion) { /* método que ayuda a reducir código excesivo en
        venderEntrada() y vefifica la disponibilidad de las butacas. Finalmente genera la entrada y procede con el pago en procesarPago()
         */
        int fila = 0, butaca = 0;
        int entradas = pedirNumero("Elegir cantidad de entradas: ", 1, 10);
        for (int i = 1; i <= entradas; i++) {
            mostrarSala(s, numSala, peli, horaSesion);
            fila = pedirNumero("Elegir fila de la entrada " + i + " -> ", 1, s.length);
            butaca = pedirNumero("Elegir butaca de la entrada " + i + " -> ", 1, s[0].length);
            if (s[fila - 1][butaca - 1].equals("_")) {
                s[fila - 1][butaca - 1] = "X";
                generarEntrada(numSala, peli, horaSesion, fila, butaca);
            } else {
                System.out.println("[Error. Butaca no disponible]");
                i = i - 1; // reseteo el valor para volver a preguntar fila y butaca
            }
        }
        double total = calcularTotal(entradas);
        procesarPago(total);
    }

    public static int pedirNumero(String mensaje, int min, int max) { // método que recibe un mensaje, rango mín. y máx.  y verifica el rango válido 
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

    public static void generarEntrada(int sala, String nombrePeli, String sesion, int fila, int butaca) {
        String idEntrada = generarIdEntrada();
        System.out.println("\n");
        System.out.println("Su entrada");
        System.out.println("\nSala " + sala + " - " + nombrePeli);
        System.out.println(obtenerFechaComprimida() + "  Sesión " + sesion);
        System.out.println("Fila " + fila + " Butaca " + butaca);
        System.out.println("ID entrada: " + idEntrada);
        System.out.println();
    }

    public static String generarIdEntrada() { // método que genera un ID único para cada entrada
        int n = rnd.nextInt(10000, 100000);
        char letra = (char) (rnd.nextInt('A', 'Z' + 1));
        return n + String.valueOf(letra);
    }

    public static String[] generarHoraAleatoria(String[] peliculas) { //método que genera una duración ficticia  y lo plasma en mostrarInfoPelis()
        String[] duracion = new String[2];
        System.out.println("\n");
        for (int i = 0; i < duracion.length; i++) {
            int duracionEnMinutos = rnd.nextInt(55, 110 + 1);
            int horas = duracionEnMinutos / 60;
            int minutos = duracionEnMinutos % 60;
            duracion[i] = String.format("%d horas y %d minutos", horas, minutos);
        }
        return duracion;
    }

    public static void mostrarInfoPelis(String[] duraciones, String[] peliculas) {
        int[] restricciones = {12, 16, 18};
        System.out.println("\n----------------------------------------------");
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("Duración de " + peliculas[i] + " -> " + duraciones[i]);
            System.out.println("Restricciones de edad -> +" + restricciones[rnd.nextInt(0, 2 + 1)]);
            if (i < peliculas.length - 1) {
                System.out.println();
            }
        }
        System.out.print("----------------------------------------------");
    }

    public static void mostrarMetodosPago() {
        System.out.println("\nMétodos de pago");
        System.out.println("----------------");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
    }

    public static void procesarPagoEfectivo(double total) { // método que procesa un pago en metálico y calcula el monto a devolver
        double cantRecibida = 0;
        do {
            System.out.print("Cantidad recibida: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Error. Entrada inválida.");
                sc.nextLine();
                System.out.print("Cantidad recibida: ");
            }
            cantRecibida = sc.nextDouble();
            if (cantRecibida < total) {
                System.out.println("Error. Cantidad inválida.");
            }
        } while (cantRecibida < total);
        double cantDevolver = cantRecibida - total;
        System.out.printf("\nCantidad recibida: %.2f€%n", cantRecibida);
        System.out.printf("Cantidad a devolver: %.2f€%n", cantDevolver);
    }

    public static void procesarPago(double total) { /* método que se encarga de calcular el total a pagar y simula el pago mediante tarjeta o efectivo
        gracias a currentTimeMillis(), que me permite averiguar el tiempo actual del sistema en milisegundos (dado que esta cantidad es sumamente grande
        y se empieza a contar desde el 1 de enero de 1970, he de usar un long), lo almacena en una variable y se crea un while que no termina hasta que la
        diferencia no sea de 5000ms (5 segundos), por lo que durante ese tiempo se detiene el programa aunque sigue usando recursos de la CPU
         */
        String metodoPago = "";
        mostrarMetodosPago();
        int opcion = pedirNumero("Seleccione una opción: ", 1, 2);
        if (opcion == 1) {
            metodoPago = "En efectivo";
        } else if (opcion == 2) {
            metodoPago = "Tarjeta";
        }
        System.out.println("\nMétodo de pago: " + metodoPago);
        System.out.printf("Total a pagar: %.2f€%n", total);
        if (opcion == 1) {
            procesarPagoEfectivo(total);
        }
        System.out.println("Procesando pago...");

        long inicio = System.currentTimeMillis();
        while (System.currentTimeMillis() - inicio < 5000) {
        }
        System.out.println("Pago realizado con éxito.");
    }

    public static void mostrarPrecioDia() {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double[] precios = {7.90, 7.90, 5.90, 7.90, 8.30, 8.30, 6.50};
        System.out.println("\nPrecios en función del día");
        System.out.println("----------------------------------------------------------------------------------");
        for (String dia : dias) {
            System.out.printf("%-12s", dia);
        }
        System.out.println();

        for (double precio : precios) {
            System.out.printf("%-12.2f", precio);
        }
        System.out.println();
        System.out.println("\n[INFO] Todos los miércoles se aplica precio especial por ser Día del Espectador.");
        System.out.println("----------------------------------------------------------------------------------");
    }

    public static double averiguarPrecioDia() { /* establezco precios fijos en base al día de la semana gracias a LocalDate.now() y getDayOfWeek()
        y en los case del switch los pongo en inglés ya que es su valor/idioma por defecto
         */
        LocalDate fechaActual = LocalDate.now();
        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        double precio;
        switch (diaSemana) {
            case MONDAY:
                precio = 7.90;
                break;
            case TUESDAY:
                precio = 7.90;
                break;
            case WEDNESDAY:
                precio = 5.90;
                break;
            case THURSDAY:
                precio = 7.90;
                break;
            case FRIDAY:
                precio = 8.30;
                break;
            case SATURDAY:
                precio = 8.30;
                break;
            case SUNDAY:
                precio = 6.50;
                break;
            default:
                precio = 0.0;
                break;
        }
        return precio;
    }

    public static void mostrarComplementos() {
        System.out.println("\nComplementos disponibles");
        System.out.println("-------------------------");
        System.out.println("1. Refrescos");
        System.out.println("2. Comida");
    }

    public static void mostrarRefrescos() {
        System.out.println("\nRefrescos disponibles");
        System.out.println("-------------------------");
        System.out.println("1. Pepsi (50cl)");
        System.out.println("2. Sprite (50cl)");
        System.out.println("3. Agua mineral (33cl)");
    }

    public static void mostrarAperitivos() {
        System.out.println("\nAperitivos disponibles");
        System.out.println("-------------------------");
        System.out.println("1. Palomitas");
        System.out.println("2. Panini Barbacoa");
        System.out.println("3. Panini Carbonara");
        System.out.println("4. Hot dog");
    }

    public static void mostrarTamañosPalomitas() {
        System.out.println("\nTamaños disponibles");
        System.out.println("-------------------------");
        System.out.println("1. Grande");
        System.out.println("2. Mediano");
        System.out.println("3. Pequeño");
    }

    public static void mostarOpcionesVenta() {
        System.out.println("\nOpciones disponibles");
        System.out.println("---------------------");
        System.out.println("1. Agregar complemento");
        System.out.println("2. Procesar venta");
    }

    public static double calcularExtras() { /* método que se encarga de agregar todos los complementos hasta que se decida lo contrario.
        Finalmente, devuleve la cantidad de € acumulada en complementos adicionales
         */
        boolean agregarMas = true;
        double total = 0;

        while (agregarMas) {
            mostarOpcionesVenta();
            int opcion = pedirNumero("Elige una opción (1-2): ", 1, 2);
            if (opcion == 1) {
                mostrarComplementos();
                int opcionComplemento = pedirNumero("Elige la opción (1-2): ", 1, 2);
                if (opcionComplemento == 1) {
                    mostrarRefrescos();
                    int refresco = pedirNumero("Elige la bebida (1-3): ", 1, 3);
                    switch (refresco) {
                        case 1:
                            total += 2.30;
                            break;
                        case 2:
                            total += 2.15;
                            break;
                        case 3:
                            total += 1.50;
                            break;
                    }
                } else if (opcionComplemento == 2) {
                    mostrarAperitivos();
                    int aperitivo = pedirNumero("Elige el aperitivo (1-4): ", 1, 4);
                    if (aperitivo == 1) {
                        mostrarTamañosPalomitas();
                        int tamañoPalomitas = pedirNumero("Elige el tamaño de las palomitas (1-3): ", 1, 3);
                        switch (tamañoPalomitas) {
                            case 1:
                                total += 4.50;
                                break;
                            case 2:
                                total += 3.70;
                                break;
                            case 3:
                                total += 2.90;
                                break;
                        }
                    } else {
                        switch (aperitivo) {
                            case 2:
                                total += 3.50;
                                break;
                            case 3:
                                total += 2.60;
                                break;
                            case 4:
                                total += 2.80;
                                break;
                        }
                    }
                }

            } else if (opcion == 2) {
                agregarMas = false;
            }
            if (opcion != 2) {
                System.out.println("Complemento agregado exitosamente.");
            }
        }

        return total;
    }

    public static char preguntarExtras() {
        char entrada;
        do {
            System.out.print("¿Añadir extras? (S/N): ");
            entrada = sc.next().toUpperCase().charAt(0);
            if (entrada != 'S' && entrada != 'N') {
                System.out.println("[Error. Introduce únicamente 'S' o 'N']");
            }
        } while (entrada != 'S' && entrada != 'N');
        return entrada;
    }

    public static double calcularTotal(int cantEntradas) { // método que calcula el monto total final de todo lo pedido (entradas, complementos..)
        double extras = 0;
        char respuesta = preguntarExtras();
        if (respuesta == 'S') {
            extras = calcularExtras();
        }

        double precioDia = averiguarPrecioDia();
        return precioDia * cantEntradas + extras;
    }

    public static void consultarAforo(String[][][][] s) { // método que consulta el aforo en tiempo real para cada sala y sesión
        System.out.println("\n");
        for (int sala = 0; sala < s.length; sala++) {
            for (int sesion = 0; sesion < s[sala].length; sesion++) {
                String peli1 = peliculas[0];
                String peli2 = peliculas[1];
                int disponibles = 0;
                int ocupadas = 0;
                int cantButacas = s[sala][sesion].length * s[sala][sesion][0].length; // accedo a la cantidad de filas y luego a la de butacas y saco el total de butacas
                for (int i = 0; i < s[sala][sesion].length; i++) {
                    for (int j = 0; j < s[sala][sesion][i].length; j++) {
                        if (s[sala][sesion][i][j].equals("_")) {
                            disponibles++;
                        } else if (s[sala][sesion][i][j].equals("X")) {
                            ocupadas++;
                        }
                    }
                }
                String butacaDisponibleCorregida = disponibles == 1 ? " butaca disponible" : " butacas disponibles";
                String butacaOcuapadaCorregida = ocupadas == 1 ? " butaca ocupada" : " butacas ocupadas";

                System.out.println("Sala " + (sala + 1) + " - " + (sala == 0 ? peli1 : peli2)  + " - Sesión " + (sesion + 1));
                System.out.println("Actualmente hay " + disponibles + butacaDisponibleCorregida);
                System.out.println("Actualmente hay " + ocupadas + butacaOcuapadaCorregida);

                double aforo = (disponibles * 100) / cantButacas;
                System.out.printf("Capacidad de aforo actual: %.2f%%%n", aforo);
                System.out.println("-----------------------------------------------------------------");
                System.out.println();
            }
        }
    }
}