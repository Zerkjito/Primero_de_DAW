/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio17 {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta = "";
        String[] equipos = generarEquipos();
        int[] partidos = generarPartidos();
        int[] niveles = generarNiveles();
        double[] tiers = generarTiers();
        System.out.print("Introduce el nombre del club deportivo: ");
        while (!sc.hasNext("[A-Za-z]+( [A-Za-z]+)*")) {
            System.out.println("Error. Entrada invalida, introduce solo texto.");
            sc.nextLine();
            System.out.print("Introduce el nombre del club deportivo: ");
        }
        respuesta = sc.nextLine().trim();
        System.out.println();
        mostrarDatos(respuesta, equipos, partidos, niveles, tiers);

    }

    public static String[] generarEquipos() {
        String[] eq = {
            "Real Madrid", "FC Barcelona", "Valencia", "Sevilla", "Real Betis", "Villareal", "Osasuna", "Vigo", "Real Sociedad", "Athletic Club",
            "Ateltico de Madrid", "Getafe", "Espanyol", "Alaves", "Real Mallorca", "Girona", "Leganes", "Valladolid", "Vallecano", "Las Palmas"
        };
        return eq;
    }

    public static int[] generarPartidos() {
        int[] p = new int[20];
        for (int i = 0; i < p.length; i++) {
            p[i] = rnd.nextInt(1, 20 + 1);
        }
        return p;
    }

    public static int[] generarNiveles() {
        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = rnd.nextInt(1, 3 + 1);
        }
        return n;
    }

    public static double[] generarTiers() {
        return new double[]{65000, 250000, 175000};
    }

    public static void mostrarDatos(String input, String[] equipos, int[] partidos, int[] niveles, double[] tiers) {
        DecimalFormat formato = new DecimalFormat("#,###.00");
        boolean encontrado = false;
        for (int i = 0; i < equipos.length; i++) {
            if (input.equals(equipos[i])) {
                System.out.println("Numero de partidos jugados del equipo: " + partidos[i]);
                System.out.println("Tier al que pertenece: " + niveles[i]);
                if (niveles[i] == 1) {
                    System.out.printf("Importe a pagar por partido a los equipos de nivel %d: %s$\n", niveles[i], formato.format(tiers[0]));
                } else if (niveles[i] == 2) {
                    System.out.printf("Importe a pagar por partido a los equipos de nivel %d: %s$\n", niveles[i], formato.format(tiers[1]));
                } else if (niveles[i] == 3) {
                    System.out.printf("Importe a pagar por partido a los equipos de nivel %d: %s$\n", niveles[i], formato.format(tiers[2]));
                }
                double total = partidos[i] * tiers[niveles[i] - 1];
                System.out.printf("Importe total a pagar al equipo: %d * %s -> %s$%n", partidos[i], formato.format(tiers[niveles[i] - 1]), formato.format(total));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El equipo no se encuentra en la base de datos.");
        }

    }

}
