/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carcity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class CarCity {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Coche> coches = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Menu m = new Menu();
        do {
            m.mostrar();
            opcion = m.leer();
            switch (opcion) {
                case 1:
                    nuevoCoche();
                    break;
                case 2:
                    mostrarTodos();
                    break;
                case 3:
                    circulanHoy();
                    break;
            }
        } while (opcion != 0);
    }

    public static void nuevoCoche() {
        String numeros, letras, marca;
        int añoMatriculacion;
        boolean electrico;

        System.out.print("\nDigitos de la matricula: ");
        numeros = sc.nextLine().trim();
        while (!numeros.matches("^[0-9]{4}$")) {
            System.out.println("Error: Matricula debe contener exactamente 4 digitos.");
            System.out.print("\nDigitos de la matricula: ");
            numeros = sc.nextLine().trim();
        }

        System.out.print("\nLetras de la matricula: ");
        letras = sc.nextLine().trim().toUpperCase();
        while (!letras.matches("^[A-Z]{3}$")) {
            System.out.println("Error: Matricula debe contener exactamente 3 letras.");
            System.out.print("\nLetras de la matricula: ");
            letras = sc.nextLine().trim().toUpperCase();
        }

        Matricula m = new Matricula(numeros, letras);

        if (matriculaExistente(m)) {
            System.out.println("Error: La matricula ya esta registrada.");
            return;
        }

        do {
            System.out.print("\nIntroduce el año de matriculacion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("\nIntroduce el año de matriculacion: ");
            }
            añoMatriculacion = sc.nextInt();
            sc.nextLine();

            if (añoMatriculacion < 1980 || añoMatriculacion > 2025) {
                System.out.println("Error: Año invalido, vuelve a intenarlo.");
            }
        } while (añoMatriculacion < 1980 || añoMatriculacion > 2025);

        System.out.print("\nMarca: ");
        marca = sc.nextLine().trim();
        while (!marca.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑäëïöüÄËÏÖÜ ]{1,50}$")) {
            System.out.println("Error: Marca invalida, vuelve a intenarlo.");
            System.out.print("\nMarca: ");
            marca = sc.nextLine().trim();
        }
        int opcion;
        do {
            System.out.print("\nIndica si es electrico (1 -> SI, 2 -> NO): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("\nIndica si es electrico (1 -> SI, 2 -> NO): ");
            }
            opcion = sc.nextInt();
            sc.nextLine();

        } while (opcion != 1 && opcion != 2);

        if (opcion == 1) {
            electrico = true;
        } else {
            electrico = false;
        }

        coches.add(new Coche(m, añoMatriculacion, marca, electrico));
    }

    public static void mostrarTodos() {
        if (coches.isEmpty()) {
            System.out.println("\nTodavia no hay coches que mostrar.");
            return;
        }

        Collections.sort(coches);
        for (Coche c : coches) {
            System.out.println("\n" + c);
        }
    }

    public static void circulanHoy() {
        if (coches.isEmpty()) {
            System.out.println("\nTodavia no hay coches que mostrar.");
            return;
        }
        
        
        ArrayList<Coche> cochesCirculanHoy = listaCirculanHoy();
        if (cochesCirculanHoy.isEmpty()) {
            System.out.println("\nActualmente ningun coche puede conducir hoy.");
            return;
        }
        
        System.out.println("\nCoches que pueden circular hoy:");
        for (Coche c : cochesCirculanHoy) {
            System.out.println("\n" + c);
        }

    }

    public static ArrayList<Coche> listaCirculanHoy() {
        LocalDate hoy = LocalDate.now();
        ArrayList<Coche> puedenCircularHoy = new ArrayList<Coche>();
        int dia = hoy.getDayOfMonth();

        for (Coche c : coches) {
            int primerNumero = Integer.parseInt(c.getMatricula().getNumeros());
            primerNumero /= 1000;

            if (c.isElectrico() && c.getAñoMatriculacion() == 2025) {  // los que son electricos y estan matriculados este año
                puedenCircularHoy.add(c);
            } else if ((dia % 2 == 0 && primerNumero % 2 == 0) || dia % 2 != 0 && primerNumero % 2 != 0) {
                puedenCircularHoy.add(c);
            }
        }

        Collections.sort(puedenCircularHoy, new Comparator<Coche>() {
            @Override
            public int compare(Coche c1, Coche c2) {
                int marcaCompare = c1.getMarca().compareToIgnoreCase(c2.getMarca());
                if (marcaCompare != 0) { // si las marcas no son iguales que se devuelva ya un valor ordenado alfabeticamente 
                    return marcaCompare;
                }
                return Integer.compare(c1.getAñoMatriculacion(), c2.getAñoMatriculacion()); // sino que se ordenen por año de matriculacion
            }
        });
        return puedenCircularHoy;
    }

    public static boolean matriculaExistente(Matricula matricula) {
        for (Coche c : coches) {
            if (c != null && c.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

}
