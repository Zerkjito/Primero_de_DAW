/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioinicial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class EjercicioInicial {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<Coche>();
        int cant;
        do {
            System.out.print("Introduce la cantidad de coches a introducir: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce la cantidad de coches a introducir: ");
            }
            cant = sc.nextInt();
            if (cant <= 0) {
                System.out.println("Error: Debe ser 1 como minimo.");
            }
        } while (cant <= 0);

        sc.nextLine();
        for (int i = 1; i <= cant; i++) {
            String matricula = "", marca;
            int año, tipo;
            boolean electrico;
            boolean matriculaValida = false;
            while (!matriculaValida) {
                System.out.print("\nIntroduce la matricula del vehiculo " + i + ": ");
                matricula = sc.nextLine();
                if (!matricula.matches("^\\d{4}[A-Z]{3}$")) {
                    System.out.println("Error: Matricula invalida.");
                } else {
                    boolean repetido = false;
                    for (Coche c : coches) {
                        if (c.getMatricula().equals(matricula)) {
                            repetido = true;
                            System.out.println("Error: Matricula repetida.");
                            break;
                        }
                    }
                    if (!repetido) {
                        matriculaValida = true;
                    } else {
                        System.out.println("Por favor, introduce una matricula diferente.");
                    }
                }
            }

            do {
                System.out.print("\nIntroduce la marca del vehiculo " + i + ": ");
                marca = sc.nextLine();
                if ((!marca.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+"))) {
                    System.out.println("Error: Introduce una marca valida.");
                }
            } while (!marca.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+"));

            System.out.print("\nIntroduce el año del vehiculo " + i + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce el año del vehiculo " + i + ": ");
            }
            año = sc.nextInt();
            sc.nextLine();
            do {
                System.out.print("Indica si es electrico (1 -> SI, 2 -> NO): ");
                tipo = sc.nextInt();
                if (tipo != 1 && tipo != 2) {
                    System.out.println("Error: Opcion debe ser 1 o 2.");
                }
            } while (tipo != 1 && tipo != 2);

            if (tipo == 1) {
                electrico = true;
            } else {
                electrico = false;
            }
            coches.add(new Coche(matricula, marca, año, electrico));
            sc.nextLine();
        }
        System.out.println("\nCoches introducidos:");
        for (Coche coche : coches) {
            System.out.println("\n" + coche);
        }
    }
}
