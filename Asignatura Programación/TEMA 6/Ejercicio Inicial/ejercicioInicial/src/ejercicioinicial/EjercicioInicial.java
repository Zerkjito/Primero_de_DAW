/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioinicial;

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
        Coche coche1 = new Coche();
        coche1.setMatricula("1234JMV");
        coche1.setMarca("Renault");
        coche1.setAño(2022);
        coche1.setElectrico(true);
        Coche coche2 = new Coche("5472KMG");
        coche2.setAño(2023);
        coche2.setMarca("Hyundai");
        coche2.setElectrico(true);
        Coche coche3 = new Coche("1934JHV", "Toyota", 2020, false);
        System.out.println(coche1.getMatricula() + " " + coche1.getMarca()
                + " " + coche1.getAño() + " Electrico: " + (coche1.isElectrico() ? "SI" : "NO"));
        System.out.println(coche2.getMatricula() + " " + coche2.getMarca()
                + " " + coche2.getAño() + " Electrico: " + (coche2.isElectrico() ? "SI" : "NO"));
        System.out.println(coche3.getMatricula() + " " + coche3.getMarca()
                + " " + coche3.getAño() + " Electrico: " + (coche3.isElectrico() ? "SI" : "NO"));

        System.out.println("\n");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);

        String matricula, marca;
        int año, tipo;
        boolean electrico;

        System.out.print("Introduce la matricula: ");
        matricula = sc.nextLine();
        System.out.print("Introduce la marca: ");
        marca = sc.nextLine();
        System.out.print("Introduce el año: ");
        año = sc.nextInt();
        System.out.print("Indica si es electrico (1 -> SI, 2 -> NO): ");
        tipo = sc.nextInt();
        sc.nextLine();

        if (tipo == 1) {
            electrico = true;
        } else {
            electrico = false;
        }
        Coche coche69 = new Coche(matricula, marca, año, electrico);
        System.out.println(coche69);
        
        Coche cocheCopia = new Coche(coche1);
        System.out.print("Introduce un valor para la matricula: ");
        matricula = sc.nextLine();
        cocheCopia.setMatricula(matricula);
        System.out.println(cocheCopia);
    }
}
