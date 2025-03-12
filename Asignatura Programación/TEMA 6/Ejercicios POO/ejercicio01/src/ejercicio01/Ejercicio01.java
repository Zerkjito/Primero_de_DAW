/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio01 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Persona> personas = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ciudad;
        leerPersonas();
        mostrar();
        mostrarPersonas();
        
        Persona personaMayorEdad = personaDeMayorEdad();
        System.out.println(personaMayorEdad);
        System.out.print("\nIntroducir una ciudad para ver cuantas personas viven alli: ");
        ciudad = sc.nextLine().trim();
        
        validarCiudad(ciudad);
        int habitantesMismaCiudad = cuantasPersonasVivenEn(ciudad);
        String singularPluralHabitantes = habitantesMismaCiudad == 1 ? " persona vive en " : " personas viven en ";
        System.out.println(habitantesMismaCiudad + singularPluralHabitantes + ciudad);

        String singularPluralMayoresEdad = personasMayoresDeEdad() == 1 ? " persona es mayor de edad." : " personas son mayores de edad.";
        System.out.println("\n" + personasMayoresDeEdad() + singularPluralMayoresEdad);

    }

    public static void leerPersonas() {
        int cantPersonas;
        Fecha fnac;
        String nombre, direccion, codigoPostal, ciudad;
        do {
            System.out.print("Introduce cuantas personas van a ser añadidas: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce cuantas personas van a ser añadidas: ");
            }
            cantPersonas = sc.nextInt();
            if (cantPersonas <= 0) {
                System.out.println("Error: Minimo de personas a leer es 1.");
            }
        } while (cantPersonas <= 0);
        sc.nextLine();

        for (int i = 1; i <= cantPersonas; i++) {
            System.out.print("\nIntroduce el nombre de la persona " + i + ": ");
            nombre = sc.nextLine().trim();
            while (!nombre.matches("^[a-zA-Z ]+$")) {
                System.out.println("Error: Nombre invalido.");
                System.out.print("Introduce el nombre de la persona " + i + ": ");
                nombre = sc.nextLine().trim();
            }
            fnac = leerFecha();

            sc.nextLine();
            System.out.print("\nIntroduce la direccion: ");
            direccion = sc.nextLine().trim();

            System.out.print("\nIntroduce el codigo postal: ");
            codigoPostal = sc.nextLine().trim();
            while (!codigoPostal.matches("^[0-9]{5}$")) {
                System.out.println("Error: Debe contener exactamente 5 digitos.");
                System.out.print("Introduce el codigo postal: ");
                codigoPostal = sc.nextLine().trim();
            }

            System.out.print("\nIntroduce la ciudad: ");
            ciudad = sc.nextLine().trim();
            while (!ciudad.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}$")) {
                System.out.println("Error: Entrada invalida.");
                System.out.print("Introduce la ciudad: ");
                ciudad = sc.nextLine().trim();
            }

            personas.add(new Persona(nombre, fnac, direccion, codigoPostal, ciudad));
        }
    }

    public static void validarCiudad(String ciudad) {
        while (!ciudad.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}$")) {
            System.out.println("Error: Entrada invalida.");
            System.out.print("Introduce la ciudad: ");
            ciudad = sc.nextLine().trim();
        }
    }

    public static Fecha leerFecha() {
        int dia, mes, anyo;
        boolean fechaValida;
        Fecha fnac;
        do {
            System.out.print("\nIntroduce el dia de nacimiento: ");
            dia = sc.nextInt();
            System.out.print("Introduce el mes de nacimiento: ");
            mes = sc.nextInt();
            System.out.print("Introduce el año de nacimiento: ");
            anyo = sc.nextInt();

            fnac = new Fecha();
            fnac.asignarFecha(dia, mes, anyo);
            fechaValida = fnac.fechaCorrecta();

            if (!fechaValida) {
                System.out.println("\nError: Fecha invalida, vuelve a intentarlo.");
            }
        } while (!fechaValida);
        return fnac;
    }

    public static void mostrar() {
        for (Persona persona : personas) {
            System.out.println("\n" + persona);
        }
    }

    public static void mostrarPersonas() {
        System.out.println("\nNumero de personas registradas: " + personas.size());
    }

    public static Persona personaDeMayorEdad() {
        LocalDate hoy = LocalDate.now();

        System.out.println("\nPersona mayor de edad:");
        for (Persona persona : personas) {
            int edad = persona.getFnac().saberEdad();
            if (edad >= 18) {
                System.out.println("Edad: " + edad + " años");
                LocalDate proximoCumple = LocalDate.of(hoy.getYear(), persona.getFnac().getMes(), persona.getFnac().getDia());

                if (proximoCumple.isBefore(hoy) || proximoCumple.isEqual(hoy)) {
                    proximoCumple = proximoCumple.plusYears(1);
                }
                long diasParaCumple = ChronoUnit.DAYS.between(hoy, proximoCumple);
                System.out.println("Le faltan " + diasParaCumple + " dias para cumplir años!");
                return persona;
            }

        }
        System.out.println("No se encontro una persona mayor de edad.");
        return null;
    }

    public static int cuantasPersonasVivenEn(String poblacion) {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getCiudad().equalsIgnoreCase(poblacion)) {
                contador++;
            }
        }
        return contador;
    }
    
    public static int personasMayoresDeEdad() {
        int cont = 0;
        for (Persona persona : personas) {
            if (persona.getFnac().saberEdad() >= 18) {
                cont++;
            }
        }
        return cont;
    }
}
