/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feedbackgpt;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */


public class FeedbackGPT {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int resultado, numMax = 0, numIntentos = 0, contadorGanadas = 0, contadorPerdidas = 0;
        int partidas = 0;
        boolean ganado = false;
        char respuesta = 'S', respuestaConfig;
        int modoJuego = 0;

        do {
            // Menú de selección de modo de juego
            System.out.println("Elige el modo de juego (1: Libre, 2: Fácil, 3: Normal, 4: Difícil, 5: Imposible, 6: Cooperativo): ");
            modoJuego = sc.nextInt();

            // Configuración según el modo de juego con switch
            switch (modoJuego) {
                case 1:  // Modo libre
                    numMax = 3000;
                    numIntentos = 10;
                    break;
                case 2:  // Modo fácil
                    numMax = 20;
                    numIntentos = 10;
                    break;
                case 3:  // Modo normal
                    numMax = 100;
                    numIntentos = 8;
                    break;
                case 4:  // Modo difícil
                    numMax = 500;
                    numIntentos = 3;
                    break;
                case 5:  // Modo imposible
                    numMax = 100;
                    numIntentos = 1;
                    break;
                case 6:  // Modo cooperativo
                    numMax = 100;
                    numIntentos = 5;  // O cualquier número de intentos que quieras
                    break;
                default:
                    System.out.println("Modo no válido, por favor elige un modo válido.");
                    continue;  // Si el modo es inválido, vuelve a pedir la selección
            }

            // Número aleatorio a adivinar
            int numAdiv = rnd.nextInt(1, numMax + 1);

            // Si es cooperativo, dos jugadores alternan sus intentos
            if (modoJuego == 6) {
                System.out.println("Modo Cooperativo. Jugador 1 y Jugador 2 deben adivinar el número.");
                for (int i = 1; i <= numIntentos; i++) {
                    // Turno del Jugador 1 
                    System.out.print("Jugador 1, intenta adivinar el número (Intento " + i + "): ");
                    resultado = sc.nextInt();
                    if (resultado == numAdiv) {
                        System.out.println("Jugador 1 adivinó correctamente el número.");
                        ganado = true;
                        break;
                    } else {
                        System.out.println(resultado < numAdiv ? "Más alto" : "Más bajo");
                    }

                    // Turno del Jugador 2
                    System.out.print("Jugador 2, intenta adivinar el número (Intento " + i + "): ");
                    resultado = sc.nextInt();
                    if (resultado == numAdiv) {
                        System.out.println("Jugador 2 adivinó correctamente el número.");
                        ganado = true;
                        break;
                    } else {
                        System.out.println(resultado < numAdiv ? "Más alto" : "Más bajo");
                    }
                }
            } else {
                // Para otros modos (no cooperativo)
                System.out.println("Adivina el número entre 1 y " + numMax + ". Tienes " + numIntentos + " intentos.");
                for (int i = 1; i <= numIntentos; i++) {
                    System.out.print("Intento " + i + ": ");
                    resultado = sc.nextInt();
                    if (resultado == numAdiv) {
                        System.out.println("¡Has adivinado el número!");
                        ganado = true;
                        break;
                    } else {
                        System.out.println(resultado < numAdiv ? "Más alto" : "Más bajo");
                    }
                }
            }

            if (ganado) {
                contadorGanadas++;
                System.out.println("¡Felicidades! Has ganado.");
            } else {
                contadorPerdidas++;
                System.out.println("¡Has perdido! El número era: " + numAdiv);
            }

            partidas++;
            System.out.println("Partidas jugadas: " + partidas + " - Ganadas: " + contadorGanadas + " - Perdidas: " + contadorPerdidas);

            // Preguntar si quiere jugar otra vez
            System.out.print("¿Quieres jugar otra partida? (S/N): ");
            respuesta = sc.next().toUpperCase().charAt(0);
            if (respuesta == 'S') {
                // Preguntar si quiere modificar la configuración
                System.out.print("¿Quieres modificar la configuración del juego? (S/N): ");
                respuestaConfig = sc.next().toUpperCase().charAt(0);
                if (respuestaConfig == 'S') {
                    modoJuego = 0;
                }
            }

        } while (respuesta == 'S');

        System.out.println("Fin del juego. ¡Hasta la próxima!");
    }
}
