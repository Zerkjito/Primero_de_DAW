/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Restaurante {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Mesa> mesas = new ArrayList<>();
    static ArrayList<Reserva> reservas = new ArrayList<>();

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
                case 2:
                case 3:
                case 4:
                case 5:
            }
        } while (opcion != 0);
    }

    public static boolean nuevaReserva() {
        String nombreCliente, fechaReserva;
        int numeroMesa, capacidad;
        
        if (mesas.isEmpty()) {
            System.out.println("Error: No hay mesas disponibles para reservar.");
            return false;
        }

        nombreCliente = pedirNombre();
        fechaReserva = pedirFechaReserva();
        numeroMesa = pedirNumeroMesa();
        Mesa mesaABuscar = new Mesa(numeroMesa);
        
        if (!mesas.contains(mesaABuscar)) {
            System.out.println("Error: No se encontro la mesa con numero " + numeroMesa);
            return false;
        }
        
        for (Mesa m : mesas) {
            if (m.equals(mesaABuscar)) {
                if (!m.isReservada()) {
                    m.reservar();
                    reservas.add(new Reserva(nombreCliente, fechaReserva, m));
                    System.out.println("Mesa con numero " + numeroMesa + " reservada correctamente.");
                    return true;
                } else {
                    System.out.println("Error: La mesa " + numeroMesa + " ya esta reservada.");
                    return false;
                }
            }
        }
        return false;
    }
    
    public static void agregarMesa() {
        int numeroMesa, capacidad;
        numeroMesa = pedirNumeroMesa();
        capacidad = pedirCapacidad();
        mesas.add(new Mesa(numeroMesa, capacidad));
    }

    public static String pedirNombre() {
        String nombreCliente;
        System.out.print("Nombre cliente: ");
        nombreCliente = sc.nextLine().trim();
        while (!nombreCliente.matches("^[a-zA-ZáéíóúÁÉÍÓÚ ]{2,50}$")) {
            System.out.println("Error: Nombre invalido.");
            System.out.print("Nombre cliente: ");
            nombreCliente = sc.nextLine().trim();
        }
        return nombreCliente;
    }

    public static String pedirFechaReserva() {
        String fechaReserva;
        System.out.print("Fecha de reserva (dia-mes-año): ");
        fechaReserva = sc.nextLine().trim();
        while (!esFechaValida(fechaReserva)) {
            System.out.println("Error: Fecha invalida, vuelve a intentarlo.");
            System.out.print("Fecha de reserva (dia-mes-año): ");
            fechaReserva = sc.nextLine().trim();
        }
        return fechaReserva;
    }

    public static int pedirNumeroMesa() {
        int numeroMesa;
        do {
            System.out.print("Introduce el numero de mesa: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el numero de mesa: ");
            }
            numeroMesa = sc.nextInt();
            sc.nextLine();

            if (numeroMesa <= 0) {
                System.out.println("Error: Numero de mesa invalido.");
            }
        } while (numeroMesa <= 0);
        return numeroMesa;
    }

    public static int pedirCapacidad() {
        int capacidad;
        do {
            System.out.print("Introduce la capacidad: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce la capacidad: ");
            }
            capacidad = sc.nextInt();
            sc.nextLine();

            if (capacidad <= 0) {
                System.out.println("Error: Numero de mesa invalido.");
            }
        } while (capacidad <= 0);
        return capacidad;
    }

    public static boolean esFechaValida(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        formatoFecha.setLenient(false);

        Date fechaParseada = formatoFecha.parse(fecha, new java.text.ParsePosition(0));
        return fechaParseada != null && formatoFecha.format(fechaParseada).equals(fecha);
    }
}
