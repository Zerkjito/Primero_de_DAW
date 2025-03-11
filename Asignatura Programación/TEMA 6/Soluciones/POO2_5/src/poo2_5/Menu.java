package poo2_5;

import java.util.Scanner;

public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println(" 1. Nueva cuenta al final del array");
        System.out.println(" 2. Nueva cuenta en una posición dentro del array");
        System.out.println(" 3. Mostrar Cuentas");
        System.out.println(" 4. Eliminar cuenta");
        System.out.println(" 5. Consultar cuenta");
        System.out.println(" 6. Modificar cuenta");
        System.out.println(" 7. Mostrar mayor saldo");
        System.out.println(" 8. Mostrar menor saldo");
        System.out.println(" 9. Mostrar saldo medio");
        System.out.println("10. Eliminar todas las cuentas");
        System.out.println("0. FIN");
    }

    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 10);
        return opcion;
    }
}
