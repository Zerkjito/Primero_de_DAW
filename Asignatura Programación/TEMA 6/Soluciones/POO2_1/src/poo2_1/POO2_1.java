/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class POO2_1 {

    static ArrayList<Persona> personas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        leerPersonas();
        if (numeroDePersonas() > 0) {
            System.out.println("\nPersonas introducidas: ");
            mostrar();
            System.out.println("\nPersona de mayor edad: ");
            System.out.println(personaDeMayorEdad());
            System.out.println("\nNúmero de personas que viven en Elche: " + cuantasPersonasVivenEn("Elche"));
            System.out.println("\nNúmero de personas mayores de edad : " + personasMayoresDeEdad());
        }
    }

    public static void leerPersonas() {
        String nombre, direccion, ciudad;
        Fecha fecha;
        Persona p;
        int codigoPostal, N, i, dia, mes, año;
        
        //Pedimos al total de persona a introducir
        do {
            System.out.print("Número de personas? ");
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine(); //limpiar el intro
        
        for (i = 1; i <= N; i++) { //Leer N personas
            
            //Se introducen los datos por teclado
            System.out.println("Persona " + i);
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            fecha = new Fecha(); //para cada persona se crea un objeto Fecha para guardar su fecha de nacimiento
            do {
                System.out.println("Fecha de Nacimiento: ");
                System.out.print("Dia: ");
                dia = sc.nextInt();
                System.out.print("Mes: ");
                mes = sc.nextInt();
                System.out.print("Año: ");
                año = sc.nextInt();
                fecha.asignarFecha(dia, mes, año);
            } while (!fecha.fechaCorrecta());
            sc.nextLine(); //limpiar el intro
            System.out.print("Dirección: ");
            direccion = sc.nextLine();
            System.out.print("Codigo Postal: ");
            codigoPostal = sc.nextInt();
            sc.nextLine(); //limpiar el intro
            System.out.print("Ciudad: ");
            ciudad = sc.nextLine();
            
            p = new Persona(); //se crea un nuevo objeto Persona
            
            p.setNombre(nombre); //Mediante los métodos set se asignan al objeto los valores introducidos por teclado
            p.setFechaNacimiento(fecha);
            p.setDireccion(direccion);
            p.setCodigoPostal(codigoPostal);
            p.setCiudad(ciudad);
            
            personas.add(p); //se añade el objeto al ArrayList
        }
    }

    public static void mostrar() {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }

    public static int numeroDePersonas() {
        return personas.size();
    }

    public static Persona personaDeMayorEdad() {
        Persona mayor = personas.get(0);
        for (int i = 1; i < personas.size(); i++) {
            if (personas.get(i).getFechaNacimiento().esMenorQue(mayor.getFechaNacimiento())) {
                mayor = personas.get(i);
            }
        }
        return mayor;
    }

    public static int cuantasPersonasVivenEn(String ciudad) {
        int cont = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getCiudad().equalsIgnoreCase(ciudad)) {
                cont++;
            }
        }
        return cont;
    }

    public static int personasMayoresDeEdad() {
        int cont = 0;
        for (Persona persona : personas) {
            if (persona.esMayorDeEdad()) {
                cont++;
            }
        }
        return cont;
    }
}

