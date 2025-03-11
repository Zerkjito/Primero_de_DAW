package poo2_3;

import java.util.Scanner;

public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println("1. Nuevo alumno");
        System.out.println("2. Mostrar alumnos");
        System.out.println("3. Buscar alumnos");
        System.out.println("4. Bajas de alummnos");
        System.out.println("5. Modificar Alumnos");
        System.out.println("6. Calcular la media de todos los alumnos");
        System.out.println("7. Modificar el límite de faltas graves");
        System.out.println("8. Mostrar alumnos con faltas graves");
        System.out.println("9. Mostrar los alumnos expulsados");
        System.out.println("0. FIN");
    }

    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 9);
        return opcion;
    }
}
