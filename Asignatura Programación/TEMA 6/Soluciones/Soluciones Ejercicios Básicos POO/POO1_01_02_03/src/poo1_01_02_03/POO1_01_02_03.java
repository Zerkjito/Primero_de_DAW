/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1_01_02_03;

import java.util.Scanner;

public class POO1_01_02_03 {
    
    /*
     * EJERCICIOS 1, 2 Y 3
     * 
     * En el main de este ejercicio se prueba el funcionamiento de la clase Cuenta
     * Puedes añadir más instrucciones o modificar éstas para probar la clase 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        //se crea objeto cuenta1 con el constructor por defecto
        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Tipo de interes : ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        //Se asignan los valores leídos a cuenta1 mediante los métodos set
        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoInteres(tipo);
        cuenta1.setSaldo(importe);

        //se crea el objeto cuenta2 con el constructor con parámetros
        Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

        //se crea cuenta3 como copia de cuenta1
        //se utiliza el constructor copia
        Cuenta cuenta3 = new Cuenta(cuenta1);

        //Mostrar las tres cuentas
        //Se utilizan los métodos get para acceder a los datos de cada objeto
        System.out.println("\nDatos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getNombre());
        System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre del titular: " + cuenta3.getNombre());
        System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

        //Ejercicio 2: añadimos operaciones de ingreso y reintegro sobre las cuentas
        //Se realiza un ingreso de 200€ en la cuenta1.
        //Se muestra el saldo antes y después de realizar el ingreso
        System.out.println("Saldo inicial de la cuenta 1: " + cuenta1.getSaldo());
        if (cuenta1.ingreso(200)) {
            System.out.println("Saldo actual de la cuenta 1 después del ingreso de 200€: " + cuenta1.getSaldo());
        } else {
            System.out.println("El ingreso no se ha podido realizar");
        }

        //Se realiza un ingreso de 50€ en la cuenta3.
        //Se muestra el saldo antes y después de realizar el ingreso
        System.out.println("\nSaldo inicial de la cuenta 3: " + cuenta3.getSaldo());
        if (cuenta3.ingreso(50)) {
            System.out.println("Saldo actual de la cuenta 3 después del ingreso de 50€: " + cuenta3.getSaldo());
        } else {
            System.out.println("El ingreso no se ha podido realizar");
        }

        //Se realiza un reintegro de 250€ de cuenta2.
        //Se muestra el saldo antes y después de realizar el reintegro
        //Se muestra un mensaje si no se ha podido realizar el reintegro
        System.out.println("\nSaldo inicial de la cuenta 2: " + cuenta2.getSaldo());
        if (cuenta2.reintegro(250)) {
            System.out.println("Saldo actual de la cuenta 2 después del reintegro de 250€: " + cuenta2.getSaldo());
        } else {
            System.out.println("El reintegro de 250€ no se ha podido realizar");
        }

        //Se realiza un nuevo reintegro de 250€ de cuenta2.
        //Se muestra el saldo antes y después de realizar el reintegro
        //Se muestra un mensaje si no se ha podido realizar el reintegro
        System.out.println("\nSaldo inicial de la cuenta 2: " + cuenta2.getSaldo());
        if (cuenta2.reintegro(250)) {
            System.out.println("Saldo actual de la cuenta 2 después del reintegro de 250€: " + cuenta2.getSaldo());
        } else {
            System.out.println("El reintegro de 250€ no se ha podido realizar");
        }

        //Ejercicio 3: realizar transferencias
        //realizar una transferencia de 10€ desde cuenta3 a cuenta2
        System.out.println("\nSaldo inicial de cuenta 2: " + cuenta2.getSaldo());
        System.out.println("Saldo inicial de cuenta 3: " + cuenta3.getSaldo());
        if (cuenta3.transferencia(cuenta2, 10)) {
            System.out.println("Saldo de cuenta 2 después de recibir una transferencia de 10€ desde cuenta 3: " + cuenta2.getSaldo());
            System.out.println("Saldo de cuenta 3 después de enviar una transferencia de 10€ a cuenta 2: " + cuenta3.getSaldo());
        } else {
            System.out.println("La transferencia de 10€ desde cuenta3 a cuenta2 no se ha podido realizar");
        }

        //realizar una transferencia de 100€ desde cuenta2 a cuenta3
        System.out.println("\nSaldo inicial de cuenta 2: " + cuenta2.getSaldo());
        System.out.println("Saldo inicial de cuenta 3: " + cuenta3.getSaldo());
        if (cuenta2.transferencia(cuenta3, 100)) {
            System.out.println("Saldo de cuenta 3 después de recibir una transferencia de 100€ desde cuenta 2: " + cuenta3.getSaldo());
            System.out.println("Saldo de cuenta 2 después de enviar una transferencia de 100€ a cuenta 3: " + cuenta2.getSaldo());
        } else {
            System.out.println("La transferencia de 100€ desde cuenta2 a cuenta3 no se ha podido realizar");
        }
    }
    
}
