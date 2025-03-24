/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marketing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Marketing {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contacto> contactos = new ArrayList<>();
    static ArrayList<Contacto> llamarHoy = new ArrayList<>();
    static ArrayList<Contacto> noDisponibles = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu m = new Menu();
        int opcion;
        do {
            m.mostrar();
            opcion = m.leer();
            switch (opcion) {
                case 1:
                    nuevoContacto();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
            }
        } while (opcion != 0);

    }
    
    public static void nuevoContacto() {
        String nombre, tlf, direccion;
        int numLlamadas;
        do {
            System.out.print("\nNombre del contacto: ");
            nombre = sc.nextLine().trim();
            while (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}$")) {
                System.out.println("Error: Nombre invalido.");
                System.out.print("\nNombre del contacto: ");
                nombre = sc.nextLine();
            }
            
            if (contactoRepetido(nombre)) {
                System.out.println("Error: Nombre ya registrado.");
            }
        } while (contactoRepetido(nombre));
        
        System.out.print("Introduce el telefono: ");
        tlf = sc.nextLine();
        while (!tlf.matches("^[67][0-9]{8}$")) {
            System.out.println("Error: Telefono invalido.");
            
        }
        
    }
    
    public static boolean contactoRepetido(String nombre) {
        for (Contacto c : contactos) {
            if (c != null && c.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
}
