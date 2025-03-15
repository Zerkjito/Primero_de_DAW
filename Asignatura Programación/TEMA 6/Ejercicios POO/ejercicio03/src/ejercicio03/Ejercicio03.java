/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio03 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Alumno> alumnos = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            mostrarOpcionesMenu();
            System.out.print("Introduzca opcion [1-9]: ");
            while (!sc.hasNextInt()) {
                System.out.println("[Error: Entrada invalida, introduce un numero valido] ");
                sc.nextLine();
                System.out.print("Introduzca opcion [1-9]: ");
            }
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
            }
        } while (opcion != 0);

    }

    public static void mostrarOpcionesMenu() {
        System.out.println("\n1. Nuevo alumno");
        System.out.println("2. Mostrar alumnos");
        System.out.println("3. Buscar alumnos");
        System.out.println("4. Bajas de alumnos");
        System.out.println("5. Modificar alumnos");
        System.out.println("6. Calcular la media de todos los alumnos");
        System.out.println("7. Modificar el limite de las faltas graves");
        System.out.println("8. Mostrar alumnos con faltas graves");
        System.out.println("9. Mostrar los alumnos expulsados");
        System.out.println("0. FIN");
    }

    public static void agregarAlumno() {
        int nia;
        boolean alumnoExistente;
        do {
            alumnoExistente = false;
            do {
                System.out.print("\nIntroduce el NIA (8 digitos): ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Entrada invalida, introduce un numero valido.");
                    sc.next();
                    System.out.print("Introduce el NIA: ");
                }
                nia = sc.nextInt();
                sc.nextLine();

                if (nia <= 10000000 || nia > 99999999) {
                    System.out.println("Error: El NIA debe tener 8 digitos.");
                }
            } while (nia <= 10000000 || nia > 99999999);

            for (Alumno a : alumnos) {
                if (a.getNia() == nia) {
                    alumnoExistente = true;
                    break;
                }
            }

            if (alumnoExistente) {
                System.out.println("Error: El alumno con nia " + nia + " ya esta registrado.");
            } else {
                Alumno a = new Alumno();
                a.setNia(nia);
                a.leer();
                alumnos.add(a);
                System.out.println("Alumno(a) " + a.getNombre() + " agregado(a) exitosamente.");
            }
        } while (alumnoExistente);
    }

}
