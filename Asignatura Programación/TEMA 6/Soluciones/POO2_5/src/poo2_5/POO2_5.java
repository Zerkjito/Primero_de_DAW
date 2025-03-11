/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2_5;

import java.util.Scanner;

public class POO2_5 {

    static miArrayList cuentas = new miArrayList();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        int opcion;
        do {
            menu.mostrar();
            opcion = menu.leer();
            switch (opcion) {
                case 1 -> nuevaCuentaAlFinal();
                case 2 -> nuevaCuenta();
                case 3 -> mostrarCuentas();
                case 4 -> eliminarCuenta();
                case 5 -> consultarCuenta();
                case 6 -> modificarCuenta();
                case 7 -> mayorSaldo();
                case 8 -> menorSaldo();
                case 9 -> saldoMedio();
                case 10 -> eliminarTodas();
            }
        } while (opcion != 0);
    }

    public static void nuevaCuentaAlFinal() {

        System.out.println("\nAñadir una cuenta nueva al final del array");

        String nombre, numero;
        double tipo, saldo;

        Cuenta cuenta = new Cuenta();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        cuenta.setNumeroCuenta(numero);
        if (cuentas.contains(cuenta)) {
            System.out.println("Número de cuenta ya existe");
        } else {
            System.out.print("Nombre : ");
            nombre = sc.nextLine();
            System.out.print("Tipo de interes : ");
            tipo = sc.nextDouble();
            System.out.print("Saldo: ");
            saldo = sc.nextDouble();
            sc.nextLine();

            cuenta.setNombre(nombre);
            cuenta.setNumeroCuenta(numero);
            cuenta.setTipoInteres(tipo);
            cuenta.setSaldo(saldo);

            cuentas.add(cuenta);
        }
    }

    public static void nuevaCuenta() {

        System.out.println("\nAñadir una cuenta nueva en una posición del array");
        String nombre, numero;
        double tipo, saldo;
        int posicion;

        Cuenta cuenta = new Cuenta();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        cuenta.setNumeroCuenta(numero);
        if (cuentas.contains(cuenta)) {
            System.out.println("Número de cuenta ya existe");
        } else {
            System.out.print("Nombre : ");
            nombre = sc.nextLine();

            System.out.print("Tipo de interes : ");
            tipo = sc.nextDouble();
            System.out.print("Saldo: ");
            saldo = sc.nextDouble();

            cuenta.setNombre(nombre);
            cuenta.setNumeroCuenta(numero);
            cuenta.setTipoInteres(tipo);
            cuenta.setSaldo(saldo);

            do {
                System.out.print("Introduzca posición: ");
                posicion = sc.nextInt();
            } while (posicion < 0);
            sc.nextLine();

            cuentas.add(posicion, cuenta);
        }

    }

    public static void mostrarCuentas() {
        if (cuentas.size() == 0) {
            System.out.println("\nNo hay cuentas");
        } else {
            cuentas.sort();
            System.out.println("\nCuentas ordenadas por saldo de mayor a menor");
            System.out.println(cuentas);
        }
    }

    public static void eliminarCuenta() {
        if (cuentas.size() == 0) {
            System.out.println("\nNo hay cuentas");
        } else {
            String numero;
            System.out.println("\nEliminar una cuenta: ");
            System.out.print("Número de cuenta a eliminar: ");
            numero = sc.nextLine();

            Cuenta cuenta = new Cuenta();
            cuenta.setNumeroCuenta(numero);
            if (cuentas.remove(cuenta)) {
                System.out.println("\nCuenta eliminada");
            } else {
                System.out.println("\nCuenta no encontrada");
            }
        }
    }

    public static void consultarCuenta() {
        if (cuentas.size() == 0) {
            System.out.println("\nNo hay cuentas");
        } else {
            String numero;
            System.out.println("\nConsultar una cuenta: ");
            System.out.print("Número de cuenta a consultar: ");
            numero = sc.nextLine();
            Cuenta cuenta = new Cuenta();
            cuenta.setNumeroCuenta(numero);
            int posicion = cuentas.indexOf(cuenta);
            if (posicion != -1) {
                System.out.println(cuentas.get(posicion));
            } else {
                System.out.println("\nCuenta no encontrada");
            }
        }
    }

    public static void modificarCuenta() {
        if (cuentas.size() == 0) {
            System.out.println("\nNo hay cuentas");
        } else {
            String nombre, numero;
            double tipo, saldo;

            System.out.println("\nModificar una cuenta: ");
            System.out.print("Número de cuenta a modificar: ");
            numero = sc.nextLine();
            Cuenta cuenta = new Cuenta();
            cuenta.setNumeroCuenta(numero);
            int posicion = cuentas.indexOf(cuenta);
            if (posicion != -1) {
                System.out.println(cuentas.get(posicion));
                System.out.println("\nIntroduzca los nuevos datos de la cuenta\n");
                System.out.print("Nombre : ");
                nombre = sc.nextLine();
                System.out.print("Tipo de interes : ");
                tipo = sc.nextDouble();
                System.out.print("Saldo: ");
                saldo = sc.nextDouble();
                sc.nextLine();
                cuenta.setNombre(nombre);
                cuenta.setTipoInteres(tipo);
                cuenta.setSaldo(saldo);
                cuentas.set(posicion, cuenta);
            } else {
                System.out.println("\nCuenta no encontrada");
            }
        }
    }

    public static void mayorSaldo() {
        if (cuentas.size() > 0) {
            System.out.println("\nCuenta con mayor saldo:");
            System.out.println(calcularMayorSaldo());
        } else {
            System.out.println("\nNo hay cuentas");
        }
    }

    public static Cuenta calcularMayorSaldo() {
        Cuenta mayor = cuentas.get(0);
        for (int i = 1; i < cuentas.size(); i++) {
            if (cuentas.get(i).getSaldo() > mayor.getSaldo()) {
                mayor = cuentas.get(i);
            }
        }
        return mayor;
    }

    public static void menorSaldo() {
        if (cuentas.size() > 0) {
            System.out.println("\nCuenta con menor saldo:");
            System.out.println(calcularMenorSaldo());
        } else {
            System.out.println("\nNo hay cuentas");
        }
    }

    public static Cuenta calcularMenorSaldo() {
        Cuenta menor = cuentas.get(0);
        for (int i = 1; i < cuentas.size(); i++) {
            if (cuentas.get(i).getSaldo() < menor.getSaldo()) {
                menor = cuentas.get(i);
            }
        }
        return menor;
    }

    public static void saldoMedio() {
        if (cuentas.size() > 0) {
            System.out.printf("\nSaldo medio de todas las cuentas: %.2f€\n", calcularSaldoMedio());
        } else {
            System.out.println("\nNo hay cuentas");
        }
    }

    public static double calcularSaldoMedio() {
        double media = 0;
        for (int i = 0; i < cuentas.size(); i++) {
            media = media + cuentas.get(i).getSaldo();
        }
        return media / cuentas.size();
    }

    public static void eliminarTodas() {
        String respuesta;
        if (cuentas.size() == 0) {
            System.out.println("\nNo hay cuentas");
        } else {
            do {
                System.out.print("\nTODAS LAS CUENTAS SE ELIMINARÁN. ESTÁ SEGURO? (SI/NO) ");
                respuesta = sc.nextLine();
            } while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO"));
            if (respuesta.equalsIgnoreCase("SI")) {
                cuentas.clear();
            }
        }

    }
}
