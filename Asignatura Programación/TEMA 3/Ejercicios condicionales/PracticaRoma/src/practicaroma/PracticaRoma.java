/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaroma;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class PracticaRoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, direccion, telefono, cuponDisponible, tamañoEnGrande = "";
        int numeroPizzas, ingrExtra;
        double diferencia, importeInicial, importeFinal;
        boolean cupon = false;

        System.out.println("  _ __   _  ____ ____ __ _    __| | _   _ __ ___    __ _  _ __ ___    __ _ \n"
                + " | '_ \\ | ||_  /|_  // _` |  / _` || | | '_ ` _ \\  / _` || '_ ` _ \\  / _` |\n"
                + " | |_) || | / /  / /| (_| | | (_| || | | | | | | || (_| || | | | | || (_| |\n"
                + " | .__/ |_|/___|/___|\\__,_|  \\__,_||_| |_| |_| |_| \\__,_||_| |_| |_| \\__,_|\n"
                + " | |                                                                       \n"
                + " |_|    « ROMA » ");
        System.out.println("=======================");
        System.out.print("Nombre cliente: ");
        nombre = sc.nextLine();
        System.out.print("Dirección: ");
        direccion = sc.nextLine();
        System.out.print("Teléfono: ");
        telefono = sc.nextLine();
        System.out.print("Por favor, indique el tamaño de la pizza (G - M - P): ");
        char tamaño = sc.nextLine().toUpperCase().charAt(0);
        if (tamaño != 'G' && tamaño != 'M' && tamaño != 'P') {
            System.out.println("Tamaño erróneo. Por favor, elija una opción correcta.");
        } else {
            System.out.print("Por favor, indique la cantidad de ingredientes extra (Máximo 3):  ");
            ingrExtra = sc.nextInt();
            if (ingrExtra > 3) {
                System.out.println("Error. La cantidad de ingredientes indicada sobrepasa el límite establecido.");
            } else {
                System.out.print("Por favor, indique la cantidad de pizzas deseada (Máximo 20): ");
                numeroPizzas = sc.nextInt();
                if (numeroPizzas > 20) {
                    System.out.println("Error. La cantidad de pizzas indicada sobrepasa el límite establecido");
                } else if (numeroPizzas < 1) {
                    System.out.println("Error. La cantidad de pizzas mínima para realizar el pedido es 1");
                } else {
                    sc.nextLine();
                    System.out.print("¿Posee un cupón de descuento? (SI / NO): ");
                    cuponDisponible = sc.nextLine().toUpperCase();
                    if (!cuponDisponible.equalsIgnoreCase("sí") && !cuponDisponible.equalsIgnoreCase("si") && !cuponDisponible.equalsIgnoreCase("no")) {
                        System.out.println("Eror. Por favor, especifique únicamente SI o NO.");
                    } else {

                        System.out.println();
                        System.out.println("PizzaRoma");
                        System.out.println();
                        System.out.println("-------------------------------");
                        System.out.println("CLIENTE");
                        System.out.println("-------------------------------");
                        System.out.println(nombre);
                        System.out.println(direccion);
                        System.out.println(telefono);
                        System.out.println();
                        System.out.println("-------------------------------");
                        System.out.println("Pedido");
                        System.out.println("-------------------------------");

                        if (tamaño == 'G') {
                            tamañoEnGrande = "grande";
                        } else if (tamaño == 'M') {
                            tamañoEnGrande = "mediano";
                        } else if (tamaño == 'P') {
                            tamañoEnGrande = "pequeño";
                        }

                        System.out.println(numeroPizzas + " Pizzas " + " Tamaño " + tamañoEnGrande);
                        System.out.println("Numero de ingredientes extra: " + ingrExtra);
                    }
                    if (tamaño == 'G') {
                        if (cuponDisponible.equalsIgnoreCase("sí") || cuponDisponible.equalsIgnoreCase("si")) {
                            cupon = true;
                            importeInicial = 12 * numeroPizzas + (3 * ingrExtra);
                            double descuento = 20;
                            diferencia = importeInicial * 0.2;
                            importeFinal = importeInicial - diferencia;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.printf("Descuento: %.1f%% -> %.2f€ \n", descuento, diferencia);
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);

                        } else {

                            importeInicial = 12 * numeroPizzas + (3 * ingrExtra);
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.println("Descuento: NO");
                            System.out.println("Precio final: " + "€" + importeInicial);
                        }

                    } else if (tamaño == 'M') {
                        if (cuponDisponible.equalsIgnoreCase("sí") || cuponDisponible.equalsIgnoreCase("si")) {
                            cupon = true;
                            importeInicial = 8 * numeroPizzas + (2 * ingrExtra);
                            double descuento = 10;
                            diferencia = importeInicial * 0.1;
                            importeFinal = importeInicial - diferencia;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.printf("Descuento: %.1f%% -> %.2f€ \n", descuento, diferencia);
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);
                        } else {

                            importeInicial = 8 * numeroPizzas + (2 * ingrExtra);
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.println("Descuento: NO");
                            System.out.println("Precio final: " + "€" + importeInicial);
                        }
                    } else if (tamaño == 'P') {
                        if (cuponDisponible.equalsIgnoreCase("sí") || cuponDisponible.equalsIgnoreCase("si")) {
                            cupon = true;
                            importeInicial = 5 * numeroPizzas + (1 * ingrExtra);
                            double descuento = 5;
                            diferencia = importeInicial * 0.05;
                            importeFinal = importeInicial - diferencia;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.printf("Descuento: %.1f%% -> %.2f€ \n", descuento, diferencia);
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);
                        } else {

                            importeInicial = 5 * numeroPizzas + (1 * ingrExtra);
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.println("Descuento: NO");
                            System.out.println("Precio final: " + "€" + importeInicial);
                        }
                    }
                }

            }
        }

    }

}
