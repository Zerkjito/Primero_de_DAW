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
        
//        Cuenta cuenta3 = new Cuenta(cuenta1);
//        System.out.println("\nDatos de la cuenta 1:");
//        System.out.println("Nombre del titular: " + cuenta1.getNomCliente());
//        System.out.println("Numero de cuenta: " + cuenta1.getNumCuenta());
//        System.out.println("Tipo interes: " + cuenta1.getInteres());
//        System.out.println("Saldo: "+ cuenta1.getSaldo());
//        
//        System.out.println("\nDatos de la cuenta 2:");
//        System.out.println("Nombre del titular: " + cuenta2.getNomCliente());
//        System.out.println("Numero de cuenta: " + cuenta2.getNumCuenta());
//        System.out.println("Tipo interes: " + cuenta2.getInteres());
//        System.out.println("Saldo: "+ cuenta2.getSaldo());
//        
//        System.out.println("\nDatos de la cuenta 3:");
//        System.out.println("Nombre del titular: " + cuenta3.getNomCliente());
//        System.out.println("Numero de cuenta: " + cuenta3.getNumCuenta());
//        System.out.println("Tipo interes: " + cuenta3.getInteres());
//        System.out.println("Saldo: "+ cuenta3.getSaldo());
//        
//        System.out.println("\n");
        
        double cantIngreso, cantidadaRetirada;
        double transferencia;
        //System.out.println("Saldo de la cuenta 2 antes de hacer un ingreso: " + cuenta2.getSaldo());
        //System.out.print("Introduce la cantidad a ingresar: ");
        //cantIngreso = sc.nextDouble();
        //cuenta2.ingresarSaldo(cantIngreso);
        //System.out.println("Saldo despues de realizar el ingreso: " + cuenta2.getSaldo());
        //System.out.print("Indica la cantidad del reintegro: ");
        //cantidadaRetirada = sc.nextDouble();
        //cuenta2.realizarReintegro(cantidadaRetirada);
        //System.out.println("Saldo despues de realizar el reintegro: " + cuenta2.getSaldo());
        System.out.print("Introduce el importe de la transferencia a Cuenta 2: ");
        transferencia = sc.nextDouble();
        System.out.println("Saldo de cuenta 2 antes de transferencia: " + cuenta2.getSaldo());
        cuenta1.transferencia(cuenta2, transferencia);
        System.out.println("Saldo de cuenta 2 despues de transferencia: " + cuenta2.getSaldo());
    }

}
