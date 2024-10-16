/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.roma.v1;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class PracticaRomaV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        String nombre, direccion, telefono, tamañoEnGrande = "";
        int numeroPizzas, ingrExtra;
        double diferencia, importeInicial, importeFinal;
        boolean cupon = false;  // Booleano para gestionar el descuento

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
                    System.out.println("Error. La cantidad de pizzas indicada sobrepasa el límite establecido.");
                } else if (numeroPizzas < 1) {
                    System.out.println("Error. La cantidad de pizzas mínima para realizar el pedido es 1.");
                } else {
                    sc.nextLine();
                    System.out.print("¿Posee un cupón de descuento? (SI / NO): ");
                    String cuponDisponible = sc.nextLine().toUpperCase();

                    if (cuponDisponible.equals("SI")) {
                        cupon = true;
                    } else if (cuponDisponible.equals("NO")) {
                        cupon = false;
                    } else {
                        System.out.println("Error. Por favor, especifique únicamente SI o NO.");  
                    }

                    if (cuponDisponible.equals("SI") || cuponDisponible.equals("NO")) {
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

                        double precioBase = 0;
                        double precioIngrediente = 0;
                        double porcentajeDescuento = 0;

                        if (tamaño == 'G') {
                            precioBase = 12;
                            precioIngrediente = 3;
                            porcentajeDescuento = 0.2;
                        } else if (tamaño == 'M') {
                            precioBase = 8;
                            precioIngrediente = 2;
                            porcentajeDescuento = 0.1;
                        } else if (tamaño == 'P') {
                            precioBase = 5;
                            precioIngrediente = 1;
                            porcentajeDescuento = 0.05;
                        }

                        importeInicial = precioBase * numeroPizzas + (precioIngrediente * ingrExtra);

                        if (cupon == true) {
                            diferencia = importeInicial * porcentajeDescuento;
                            importeFinal = importeInicial - diferencia;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.printf("Descuento: %.1f%% -> %.2f€ \n", porcentajeDescuento * 100, diferencia);
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);
                        } else {
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.println("Descuento: NO");
                            System.out.println("Precio final: " + importeInicial + "€");
                        }
                    }
                }
            }
        } 
    }
    
}
