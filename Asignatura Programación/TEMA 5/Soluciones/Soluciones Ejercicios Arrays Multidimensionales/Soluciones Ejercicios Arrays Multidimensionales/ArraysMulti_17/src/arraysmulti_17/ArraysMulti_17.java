/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_17;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class ArraysMulti_17 {

    public static void main(String[] args) {
        final int N = 3; //declaramos N como una constante de tipo int con valor 20
                          //también se puede resolver sin declarar N y asignar el tamaño de forma directa al crear los arrays
                          //pero de esta forma si queremos probar el programa con menos equipos basta con cambiar el valor de N
        //crear los arrays
        String equipos[] = new String[N];
        int[] partidos = new int[N];
        int[] niveles = new int[N];
        double[] importes = new double[3];
        //lectura
        lecturaDeDatos(equipos, partidos, niveles, importes);
        //calculo
        calcularImportes(equipos, partidos, niveles, importes);
    }

    public static void lecturaDeDatos(String[] equipos, int[] partidos, int[] niveles, double[] importes) {
        //lectura de datos de los equipos
        leerEquipos(equipos, partidos, niveles);
        //lectura de los importes
        leerImportes(importes);
    }

    public static void leerEquipos(String[] equipos, int[] partidos, int[] niveles) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Introduzca datos de los equipos");
        for (i = 0; i < equipos.length; i++) {
            System.out.print("Equipo " + (i + 1) + ": ");
            equipos[i] = sc.nextLine();
            do {
                System.out.print("Numero de partidos retransmitidos: ");
                partidos[i] = sc.nextInt();
            } while (partidos[i] < 0);
            do {
                System.out.print("Nivel del equipo (entre 1 y 3): ");
                niveles[i] = sc.nextInt();
            } while (niveles[i] < 1 || niveles[i] > 3);
            sc.nextLine();
        }
    }

    public static void leerImportes(double[] importes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los importes a pagar por partido, segun nivel");
        for (int i = 0; i < importes.length; i++) {
            System.out.print("Importe para el nivel " + (i + 1) + ": ");
            importes[i] = sc.nextDouble();
        }
    }

    public static void calcularImportes(String[] equipos, int[] partidos, int[] niveles, double[] importes) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int i;
        double total;
        System.out.println("Equipo para calcular importe a pagar (FIN para acabar): ");
        nombre = sc.nextLine();
        while (!nombre.equalsIgnoreCase("FIN")) {
            i = 0;
            while (i < equipos.length && !equipos[i].equalsIgnoreCase(nombre)) { //buscar equipo en el array
                i++;
            }
            if (i < equipos.length) {
                total = partidos[i] * importes[niveles[i] - 1];
                System.out.printf("Total a pagar al equipo: %.2f%n" , total);
            } else {
                System.out.println("Equipo no existe");
            }
            System.out.println("Equipo para calcular importe a pagar (FIN para acabar): ");
            nombre = sc.nextLine();
        }
    }
}
