/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaadvinanumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class PracticaAdvinaNumero {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        
        int resultado = 0, numMax = 0, numIntentos = 0, contadorGanadas = 0, contadorPerdidas = 0;
        int partidas = 0, modoJuego = 0, contadorLogros = 0;
        boolean ganado, logroPorLosPelos = false, logroAdivinaPrimera = false;
        char respuesta = 'S', respuestaConfig;

        do {
            ganado = false;
            if (modoJuego == 0) {
                System.out.println("--------------------------------------------------------");
                System.out.println("ADIVINA EL NÚMERO");
                System.out.println("--------------------------------------------------------");
                System.out.println("Elige el modo de juego:");
                System.out.print("1: Libre, 2: Fácil, 3: Normal, 4: Difícil, 5: Imposible, 6: CO-OP local: ");
                
                while (true) {
                    modoJuego = sc.nextInt();
                    if (modoJuego >= 1 && modoJuego <= 6) {
                        break;
                    } else {
                        System.out.println("Modo de juego inválido. Por favor, elige un modo entre 1-6.");
                    }
                }
            }

            if (modoJuego == 1 && partidas > 0) {
                System.out.print("¿Deseas mantener la configuración anterior? (S/N): ");
                respuestaConfig = sc.next().toUpperCase().charAt(0);
                if (respuestaConfig == 'N') {
                    System.out.print("Introduce el número máximo a adivinar: ");
                    numMax = sc.nextInt();
                    System.out.print("Introduce el número máximo de intentos: ");
                    numIntentos = sc.nextInt();
                }
            } else {
                switch (modoJuego) {
                    case 1:
                        System.out.println("");
                        System.out.println("[MODO LIBRE] El jugador elige los parámetros libremente");
                        System.out.print("Introduce el número máximo a adivinar: ");
                        numMax = sc.nextInt();
                        System.out.print("Introduce el número máximo de intentos: ");
                        numIntentos = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("[MODO FÁCIL] Pensado para adivinar sin esfuerzo");
                        numMax = 20;
                        numIntentos = 10;
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("[MODO NORMAL] Enfocado para el jugador promedio");
                        numMax = 100;
                        numIntentos = 8;
                        break;
                    case 4:
                        System.out.println("");
                        System.out.println("[MODO DIFÍCIL] Ideado para sufrir");
                        numMax = 500;
                        numIntentos = 5;
                        break;
                    case 5:
                        System.out.println("");
                        System.out.println("[MODO IMPOSIBLE] El jugador ha de acertar el número mediante 3 intentos");
                        numMax = 100;
                        numIntentos = 3;
                        break;
                    case 6:
                        System.out.println("");
                        System.out.println("[Modo Cooperativo Local] Jugador 1 y Jugador 2 deben batirse a duelo");
                        System.out.print("Introduce el número máximo a adivinar: ");
                        numMax = sc.nextInt();
                        System.out.print("Introduce el número máximo de intentos: ");
                        numIntentos = sc.nextInt();
                        break;
                }
            }
            
            int numAdiv = rnd.nextInt(1, numMax + 1);

            if (modoJuego == 6) {
                for (int i = 1; i <= numIntentos; i++) {
                    if (i != numIntentos) {
                        System.out.print("Turno de Jugador 1 (Intento " + i + "): ");
                        resultado = sc.nextInt();
                    } else {
                        System.out.print("Turno de Jugador 1 (Último intento): ");
                        resultado = sc.nextInt();
                    }

                    if (resultado == numAdiv) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Jugador 1 ha humillado a Jugador 2!");
                        ganado = true;
                        break;
                    } else {
                        System.out.println(resultado < numAdiv ? "Más alto (+)" : "Más bajo (-)");
                        System.out.println("");
                    } 

                    if (i != numIntentos) {
                        System.out.print("Turno de Jugador 2 (Intento " + i + "): ");
                        resultado = sc.nextInt();
                    } else {
                        System.out.print("Turno de Jugador 2 (Último intento): ");
                        resultado = sc.nextInt();
                        
                    }
                    if (resultado == numAdiv) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Jugador 2 ha humillado a Jugador 1!");
                        ganado = true;
                        break;
                    } else {
                        System.out.println(resultado < numAdiv ? "Más alto (+)" : "Más bajo (-)");
                        System.out.println("");
                    }
                }
            } else {
                System.out.println("Adivina el número entre 1 y " + numMax + ". Tienes " + numIntentos + " intentos.");
                for (int i = 1; i <= numIntentos; i++) {
                    if (i != numIntentos) {
                        System.out.print("Intento " + i + ": ");
                        resultado = sc.nextInt();
                    } else {
                        System.out.print("Último intento: ");
                        resultado = sc.nextInt();
                    }

                    if (i == 1 && resultado == numAdiv && !logroAdivinaPrimera) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("[Logro 'Imposible' Conseguido] ENHORABUENA!! HAS ACERTADO EL NÚMERO A LA PRIMERA");
                        contadorLogros++;
                        logroAdivinaPrimera = true;
                        ganado = true;
                        break;
                    } else if (resultado == numAdiv && i != numIntentos) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("ENHORABUENA!! HAS ACERTADO EL NÚMERO");
                        ganado = true;
                        break;
                    } else if (i == numIntentos && resultado == numAdiv && !logroPorLosPelos) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("[Logro 'Por los pelos' Conseguido] ENHORABUENA!! HAS ACERTADO EL NÚMERO AL ÚLTIMO INTENTO");
                        contadorLogros++;
                        logroPorLosPelos = true;
                        ganado = true;
                        break;
                    } else {
                        System.out.println(resultado < numAdiv ? "Más alto (+)" : "Más bajo (-)");
                        System.out.println("");
                    }
                }
            }

            if (ganado) {
                contadorGanadas++;
            } else if (modoJuego == 6) {
                contadorPerdidas++;
                System.out.println("--------------------------------------------------------");
                System.out.println("Habéis perdido! El número era el " + numAdiv);
            } else {
                contadorPerdidas++;
                System.out.println("--------------------------------------------------------");
                System.out.println("Has perdido! El número era el " + numAdiv);
            }

            partidas++;
            if (contadorGanadas == 5) {
                System.out.println("[Logro 'Acaparador de victorias' Conseguido] Gana 5 partidas");
                contadorLogros++;
            }
            if (contadorGanadas == 10) {
                System.out.println("[Logro 'Maestro Djinn' Conseguido] Gana 10 partidas" );
                contadorLogros++;
            }
            if (partidas == 5) {
                System.out.println("[Logro 'Jugador persistente' Conseguido] Juega 5 partidas seguidas");
                contadorLogros++;
            }

            System.out.println("Partidas jugadas: (" + partidas + ") Ganadas -> " + contadorGanadas + " | Perdidas -> " + contadorPerdidas);
            System.out.println("Logros conseguidos " + contadorLogros + "/5");
            
            System.out.print("¿Deseas redimirte o volver a ganar? (S/N): ");
            respuesta = sc.next().toUpperCase().charAt(0);
            if (respuesta == 'S') {
                System.out.print("¿Deseas modificar el modo de juego? (S/N): ");
                respuestaConfig = sc.next().toUpperCase().charAt(0);
                if (respuestaConfig == 'S') {
                    modoJuego = 0;
                }
            }
            
        } while (respuesta == 'S');
        
        System.out.println("Fin del programa. ¡Gracias por jugar!");
    }
}
