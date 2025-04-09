/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio04 {

    static Scanner sc = new Scanner(System.in);
    static Vehiculo[] garaje = new Vehiculo[100];
    static int indice = 0;
    static Menu m = new Menu();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            m.mostrarMenu();
            opcion = m.opcionMenu();
            switch (opcion) {
                case 1 ->
                    alquilarPlaza();
                case 2 ->
                    mostrarVehiculos();
                case 3 ->
                    calcularCuota();
            }
        } while (opcion != 0);
    }

    public static void alquilarPlaza() {
        int opcionAlquilar;
        m.mostrarVehiculos();
        opcionAlquilar = m.opcionVehiculo();
        switch (opcionAlquilar) {
            case 1:
                alquilarPlazaCoche();
                break;
            case 2:
                alquilarPlazaMoto();
                break;
            case 0:
                System.out.println("Volviendo...");
        }

    }

    public static void alquilarPlazaCoche() {
        if (garajeLleno()) {
            System.out.println("Error: Todas las plazas estan ocupadas actualmente.");
            return;
        }

        String matricula = pedirMatricula();
        if (esMatriculaRepetida(matricula)) {
            System.out.println("Error: Matricula " + matricula + " ya registrada.");
            return;
        }
        
        int potencia = pedirPotencia();
        int plazas = pedirPlazasCoche();
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] == null) {
                garaje[i] = new Coche(matricula, potencia, plazas);
                indice++;
                System.out.println("Coche alquilado correctamente en la plaza " + (i + 1));
                break;
            }
        }
    }

    public static void alquilarPlazaMoto() {
        if (garajeLleno()) {
            System.out.println("Error: Todas las plazas estan ocupadas actualmente.");
            return;
        }

        String matricula = pedirMatricula();
        if (esMatriculaRepetida(matricula)) {
            System.out.println("Error: Matricula " + matricula + " ya registrada.");
            return;
        }
        int potencia = pedirPotencia();
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] == null) {
                garaje[i] = new Moto(matricula, potencia);
                indice++;
                System.out.println("Moto alquilada correctamente en la plaza " + (i + 1));
                break;
            }
        }
    }

    public static String pedirMatricula() {
        System.out.print("Matricula (4 digitos y 2 letras): ");
        String matricula = sc.nextLine().trim();
        while (!matricula.matches("^[0-9]{4}[A-Z]{3}$")) {
            System.out.println("Error: Matricula invalida.");
            System.out.print("Matricula (4 digitos y 2 letras): ");
            matricula = sc.nextLine().trim();
        }
        return matricula;
    }

    public static boolean esMatriculaRepetida(String matricula) {
        for (int i = 0; i < indice; i++) {
            if (garaje[i] != null && garaje[i].getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    public static int pedirPotencia() {
        int potencia = -1;
        do {
            System.out.print("Introduce CV del vehiculo: ");
            try {
                potencia = sc.nextInt();
                sc.nextLine();
                if (potencia <= 0) {
                    System.out.println("Error: Potencia no puede ser negativa.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero.");
                sc.nextLine();
            }
        } while (potencia <= 0);
        return potencia;
    }

    public static int pedirPlazasCoche() {
        int plazas = -1;
        do {
            System.out.print("Plazas: ");
            try {
                plazas = sc.nextInt();
                sc.nextLine();
                if (plazas < 1) {
                    System.out.println("Error: Minimo de plazas debe ser 1.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero.");
                sc.nextLine();
            }
        } while (plazas < 1);
        return plazas;
    }

    public static void mostrarVehiculos() {
        if (indice == 0) {
            System.out.println("Error: Garaje vacio actualmente.");
            return;
        }

        ArrayList<Vehiculo> vehiculosOrdenados = new ArrayList<>();
        for (int i = 0; i < indice; i++) {
            if (garaje[i] != null) {
                vehiculosOrdenados.add(garaje[i]);
            }
        }

        System.out.println("\nVehiculos en su estado original de llegada: ");
        for (Vehiculo v : vehiculosOrdenados) {
            v.mostrarInfo();
        }

        System.out.println("\nVehiculos ordenados por matricula ascendentemente: ");
        vehiculosOrdenados.sort(Comparator.comparing(Vehiculo::getMatricula));
        for (Vehiculo v : vehiculosOrdenados) {
            v.mostrarInfo();
        }
    }

    public static void calcularCuota() {
        if (indice == 0) {
            System.out.println("Error. Garaje vacio actualmente.");
            return;
        }
        int plaza = -1;
        do {
            System.out.print("Plaza a buscar: ");
            try {
                plaza = sc.nextInt();
                sc.nextLine();

                if (plaza < 1 || plaza > 100) {
                    System.out.println("Error: Plaza invalida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce un numero valido.");
                sc.nextLine();
            }
        } while (plaza < 1 || plaza > 100);
        plaza--;

        if (garaje[plaza] != null) {
            System.out.printf("Cuota: %.2f EUR%n", garaje[plaza].calcularCuota());
        } else  {
            System.out.println("Error: Plaza " + (plaza + 1) + " vacia.");
        }
    }

    public static boolean garajeLleno() {
        for (Vehiculo v : garaje) {
            if (v == null) return false;
        }
        return true;
    }
}
