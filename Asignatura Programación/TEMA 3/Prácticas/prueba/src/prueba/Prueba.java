/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */


public class Prueba {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int resultado, numMax = 0, numIntentos = 0, contadorGanadas = 0, contadorPerdidas = 0;
        int partidas = 0, modoJuego = 0, contadorLogros = 0;
        boolean ganado = false;
        char respuesta = 'S', respuestaConfig;
        
        boolean esPrimerJuego = true;  // Variable para verificar si es el primer juego
        boolean esPrimerJuegoLibre = true;  // Variable para verificar si es la primera vez en modo libre

        do {
            ganado = false;

            // Preguntar si es el primer juego y preguntar modo solo si es la primera vez
            if (esPrimerJuego || modoJuego == 0) {
                System.out.println("--------------------------------------------------------");
                System.out.println("ADIVINA EL NÚMERO");
                System.out.println("--------------------------------------------------------");
                System.out.println("Elige el modo de juego");
                System.out.println("1: Libre, 2: Fácil, 3: Normal, 4: Difícil, 5: Imposible, 6: CO-OP local");

                // Validación del modo de juego
                while (true) {
                    modoJuego = sc.nextInt();
                    if (modoJuego >= 1 && modoJuego <= 6) {
                        break;
                    } else {
                        System.out.println("Modo de juego inválido. Por favor, elige un modo entre 1-6.");
                    }
                }

                // Para el primer juego en cualquier modo
                esPrimerJuego = false;
            }

            // Si el modo es "Libre", preguntar por los parámetros solo la primera vez
            if (modoJuego == 1) {
                if (esPrimerJuegoLibre) {
                    System.out.print("Introduce el número máximo a adivinar: ");
                    numMax = sc.nextInt();
                    System.out.print("Introduce el número máximo de intentos: ");
                    numIntentos = sc.nextInt();

                    esPrimerJuegoLibre = false;  // Después de la primera vez, no se vuelve a preguntar
                } else {
                    // Si no es el primer juego en modo libre, preguntar si desea cambiar los parámetros
                    System.out.println("¿Deseas mantener los mismos parámetros (número máximo: " + numMax + ", intentos: " + numIntentos + ") o elegir nuevos?");
                    System.out.print("Elige 'S' para mantener los mismos parámetros o 'N' para establecer nuevos: ");
                    respuestaConfig = sc.next().toUpperCase().charAt(0);
                    
                    if (respuestaConfig == 'N') {
                        System.out.print("Introduce el nuevo número máximo a adivinar: ");
                        numMax = sc.nextInt();
                        System.out.print("Introduce el nuevo número máximo de intentos: ");
                        numIntentos = sc.nextInt();
                    }
                }
            } else {
                // Para otros modos, no se preguntan parámetros de configuración
                switch (modoJuego) {
                    case 2:
                        numMax = 20;
                        numIntentos = 10;
                        break;
                    case 3:
                        numMax = 100;
                        numIntentos = 8;
                        break;
                    case 4:
                        numMax = 500;
                        numIntentos = 5;
                        break;
                    case 5:
                        numMax = 100;
                        numIntentos = 2;
                        break;
                    case 6:
                        System.out.print("Introduce el número máximo a adivinar: ");
                        numMax = sc.nextInt();
                        System.out.print("Introduce el número máximo de intentos: ");
                        numIntentos = sc.nextInt();
                        break;
                }
            }

            int numAdiv = rnd.nextInt(1, numMax + 1);

            // Lógica para el juego según el modo
            if (modoJuego == 6) {
                System.out.println("[Modo Coopearativo] Jugador 1 y Jugador 2 deben batirse a duelo y adivinar el número.");
                for (int i = 1; i <= numIntentos; i++) {
                    System.out.print("Turno de Jugador 1 (Intento " + i + " ): ");
                    resultado = sc.nextInt();
                    if (resultado == numAdiv) {
                        System.out.println("Jugador 1 humilló a Jugador 2");
                        ganado = true;
                        break;
                    } else {
                        System.out.println(resultado < numAdiv ? "Más alto" : "Más bajo");
                    }

                    System.out.print("Turno de Jugador 2 (Intento " + i + " ): ");
                    resultado = sc.nextInt();
                    if (resultado == numAdiv) {
                        System.out.println("Jugador 2 humilló a Jugador 1");
                        ganado = true;
                        break;
                    } else {
                        System.out.println(resultado < numAdiv ? "Más alto" : "Más bajo");
                    }

                }
            } else {
                System.out.println("Adivina el número entre 1 y " + numMax + ". Tienes " + numIntentos + " intentos.");
                for (int i = 1; i <= numIntentos; i++) {
                    if (i == numIntentos - 1) {
                        System.out.println("Penúltimo intento");
                    }
                    if (i == numIntentos) {
                        System.out.println("Último intento");
                    }
                    System.out.print("Intento " + i + ": ");
                    resultado = sc.nextInt();
                    if (i == 1 && resultado == numAdiv) {
                        System.out.println("[Logro 'Imposible' Conseguido]");
                        System.out.println("ENHORABUENA!! HAS ACERTADO EL NÚMERO A LA PRIMERA");
                        ganado = true;
                        contadorLogros++;
                        break;
                    } else if (resultado == numAdiv) {
                        System.out.println("ENHORABUENA!! HAS ACERTADO EL NÚMERO");
                        ganado = true;
                        break;
                    } else if (i == numIntentos && resultado == numAdiv) {
                        System.out.println("[Logro 'Por los pelos' Conseguido]");
                        System.out.println("ENHORABUENA!! HAS ACERTADO EL NÚMERO AL ÚLTIMO INTENTO");
                        ganado = true;
                        contadorLogros++;
                        break;
                    } else {
                        System.out.println(resultado < numAdiv ? "Más alto" : "Más bajo");
                        System.out.println("");
                    }
                }
            }

            if (ganado) {
                contadorGanadas++;
            } else {
                contadorPerdidas++;
                System.out.println("Has perdido, aunque no es de extrañar...");
                System.out.println("El numero era: " + numAdiv);
            }

            partidas++;
            if (contadorGanadas == 5) {
                System.out.println("[Logro 'Acaparador de victorias' Conseguido]");
                contadorLogros++;
            }
            if (contadorGanadas == 10) {
                System.out.println("[Logro 'Maestro Jinn' Conseguido]");
                contadorLogros++;
            }

            if (partidas == 5) {
                System.out.println("[Logro 'Jugador persistente' Conseguido]");
                contadorLogros++;
            }

            System.out.println("Partidas jugadas: " + partidas + " - Ganadas -> " + contadorGanadas + " | Perdidas -> " + contadorPerdidas);
            System.out.println("Logros ocultos conseguidos " + contadorLogros + " / 5");

            // Preguntar si desea continuar
            System.out.print("¿Deseas redimirte o volver a ganar? (S/N): ");
            respuesta = sc.next().toUpperCase().charAt(0);
            if (respuesta == 'S') {
                // Preguntar si desea cambiar de modo
                System.out.print("¿Deseas cambiar el modo de juego? (S/N): ");
                char cambiarModo = sc.next().toUpperCase().charAt(0);
                if (cambiarModo == 'S') {
                    modoJuego = 0;  // Reiniciar el modo para pedir de nuevo
                }
            }

        } while (respuesta == 'S');

        System.out.println("Fin del juego. Esperamos que hayas disfrutado!");
    }
}
