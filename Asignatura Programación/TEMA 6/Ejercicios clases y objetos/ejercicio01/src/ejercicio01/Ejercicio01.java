/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio01 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, numCuenta;
        double saldo, interes;
        Cuenta cuenta1 = new Cuenta();
        System.out.print("Nombre del titular: ");
        nombre = sc.nextLine();
        System.out.print("Numero de cuenta: ");
        numCuenta = sc.nextLine();
        System.out.print("Tipo de interes: ");
        interes = sc.nextDouble();
        System.out.print("Saldo: ");
        saldo = sc.nextDouble();

        cuenta1.setNomCliente(nombre);
        cuenta1.setNumCuenta(numCuenta);
        cuenta1.setInteres(interes);
        cuenta1.setSaldo(saldo);

        Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
        
        Cuenta cuenta3 = new Cuenta(cuenta1);
        System.out.println("\nDatos de la cuenta 1:");
        System.out.println("Nombre del titular: " + cuenta1.getNomCliente());
        System.out.println("Numero de cuenta: " + cuenta1.getNumCuenta());
        System.out.println("Tipo interes: " + cuenta1.getInteres());
        System.out.println("Saldo: "+ cuenta1.getSaldo());
        
        System.out.println("\nDatos de la cuenta 2:");
        System.out.println("Nombre del titular: " + cuenta2.getNomCliente());
        System.out.println("Numero de cuenta: " + cuenta2.getNumCuenta());
        System.out.println("Tipo interes: " + cuenta2.getInteres());
        System.out.println("Saldo: "+ cuenta2.getSaldo());
        
        System.out.println("\nDatos de la cuenta 3:");
        System.out.println("Nombre del titular: " + cuenta3.getNomCliente());
        System.out.println("Numero de cuenta: " + cuenta3.getNumCuenta());
        System.out.println("Tipo interes: " + cuenta3.getInteres());
        System.out.println("Saldo: "+ cuenta3.getSaldo());
    }

}
