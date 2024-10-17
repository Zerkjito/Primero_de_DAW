/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapracticaroma;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class PRUEBAPRACTICAROMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, direccion, telefono, tamañoEnGrande = "";
        int numeroPizzas, ingrExtra;
        double diferencia, diferencia2, importeInicial, importeFinal, precioRestante;
        boolean cupon = false;
        boolean primeraCompraDescuento = false;

        System.out.println("  _ __   _  ____ ____ __ _    __| | _   _ __ ___    __ _  _ __ ___    __ _ \n"
                + " | '_ \\ | ||_  /|_  // _` |  / _` || | | '_ ` _ \\  / _` || '_ ` _ \\  / _` |\n"
                + " | |_) || | / /  / /| (_| | | (_| || | | | | | | || (_| || | | | | || (_| |\n"
                + " | .__/ |_|/___|/___|\\__,_|  \\__,_||_| |_| |_| |_| \\__,_||_| |_| |_| \\__,_|\n"
                + " | |                                                                       \n"
                + " |_|    « Pizza originale nel forno di mamma, dal 1894 » ");
        System.out.println("===============================");
        System.out.print("Nombre cliente: ");
        nombre = sc.nextLine();
        System.out.print("Dirección: ");
        direccion = sc.nextLine();
        System.out.print("Teléfono: ");
        telefono = sc.nextLine();
        System.out.print("Por favor, indique el tamaño de la pizza (G - M - P): ");
        char tamaño = sc.nextLine().toUpperCase().charAt(0);

        if (tamaño != 'G' && tamaño != 'M' && tamaño != 'P') {
            System.out.println("Tamaño erróneo. Por favor, elija una opción correcta (G si desea grande, M si desea mediana o P si desea pequeña).");
        } else {
            System.out.print("Por favor, indique la cantidad de ingredientes extra deseada (Máximo 3): ");
            ingrExtra = sc.nextInt();
            if (ingrExtra > 3) {
                System.out.println("Error. La cantidad de ingredientes indicada sobrepasa el límite establecido.");
            } else if (ingrExtra < 0) {
                System.out.println("Error. La cantidad de ingredientes no puede ser negativa. ¿O sí? Quién sabe...");
            } else {
                System.out.print("Por favor, indique la cantidad de pizzas deseada (Máximo 20): ");
                numeroPizzas = sc.nextInt();
                if (numeroPizzas > 20) {
                    System.out.println("Error. La cantidad de pizzas indicada sobrepasa el límite establecido (Máximo 20). Nuestra pizzería fomenta los valores saludables ante todo :)");

                } else if (numeroPizzas < 1) {
                    System.out.println("Error. La cantidad de pizzas mínima para realizar el pedido es 1. Por favor, ingrese un número válido.");
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
                        System.out.print("¿Es su primer pedido con nosotros? (Por favor, recuerde que podemos verificar dicha información): ");
                        String primeraCompra = sc.nextLine().toUpperCase();
                        if (primeraCompra.equals("SI")) {
                            primeraCompraDescuento = true;
                        } else if (primeraCompra.equals("NO")) {
                            primeraCompraDescuento = false;
                        }
                    }

                    if (cuponDisponible.equals("SI") || cuponDisponible.equals("NO")) {
                        System.out.println();
                        System.out.println("PizzaDiMama");
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
                        double precioEnvio = 0;

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

                        importeInicial = precioBase * numeroPizzas + ((precioIngrediente * ingrExtra) * numeroPizzas);

                        if (cupon == true && primeraCompraDescuento == true && importeInicial > 20) {
                            diferencia = importeInicial * porcentajeDescuento;
                            importeFinal = importeInicial - diferencia;
                            diferencia2 = importeFinal * 0.05;
                            importeFinal = importeFinal - diferencia2;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.printf("Descuento por pizza tamaño " + tamañoEnGrande + " %.1f%% -> %.2f€ \n", porcentajeDescuento * 100, diferencia);
                            System.out.printf("Descuento por primera compra 5%% -> %.2f€ \n", diferencia2);
                            System.out.println("Gastos de envío: exento por compra superior a 20€");
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);

                        } else if (cupon == true && primeraCompraDescuento == true && importeInicial < 20) {
                            diferencia = importeInicial * porcentajeDescuento;
                            importeFinal = importeInicial - diferencia;
                            diferencia2 = importeFinal * 0.05;
                            importeFinal = (importeFinal - diferencia2) + 4.50;
                            precioRestante = 20 - importeInicial;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.printf("Descuento por pizza tamaño " + tamañoEnGrande + " %.1f%% -> %.2f€ \n", porcentajeDescuento * 100, diferencia);
                            System.out.printf("Descuento por primera compra 5%% -> %.2f€ \n", diferencia2);
                            System.out.printf("Gastos de envío: 4.50€ (Le faltan %.2f€ para disfrutar de gastos de envío gratis). \n", precioRestante);
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);

                        } else if (cupon == true && primeraCompraDescuento == false && importeInicial > 20) {
                            diferencia = importeInicial * porcentajeDescuento;
                            importeFinal = importeInicial - diferencia;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.printf("Descuento por pizza tamaño " + tamañoEnGrande + " %.1f%% -> %.2f€ \n", porcentajeDescuento * 100, diferencia);
                            System.out.println("Gastos de envío: exento por compra superior a 20€");
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);

                        } else if (cupon == true && primeraCompraDescuento == false && importeInicial < 20) {
                            diferencia = importeInicial * porcentajeDescuento;
                            importeFinal = (importeInicial - diferencia) + 4.50;
                            precioRestante = 20 - importeInicial;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.printf("Descuento por pizza tamaño " + tamañoEnGrande + " %.1f%% -> %.2f€ \n", porcentajeDescuento * 100, diferencia);
                            System.out.printf("Gastos de envío: 4.50€ (Le faltan %.2f€ para disfrutar de gastos de envío gratis). \n", precioRestante);
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);

                        } else if (cupon == false && primeraCompraDescuento == true && importeInicial > 20) {
                            diferencia2 = importeInicial * 0.05;
                            importeFinal = importeInicial - diferencia2;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.println("Descuento: No disponible ");
                            System.out.printf("Descuento por primera compra 5%% -> %.2f€ \n", diferencia2);
                            System.out.println("Gastos de envío: exento por compra superior a 20€");
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);

                        } else if (cupon == false && primeraCompraDescuento == true && importeInicial < 20) {
                            diferencia2 = importeInicial * 0.05;
                            importeFinal = (importeInicial - diferencia2) + 4.50;
                            precioRestante = 20 - importeInicial;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.println("Descuento: No disponible ");
                            System.out.printf("Descuento por primera compra 5%% -> %.2f€ \n", diferencia2);
                            System.out.printf("Gastos de envío: 4.50€ (Le faltan %.2f€ para disfrutar de gastos de envío gratis). \n", precioRestante);
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);

                        } else if (cupon == false && primeraCompraDescuento == false && importeInicial > 20) {
                            importeFinal = importeInicial;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.println("Descuento: No disponible ");
                            System.out.println("Descuento por primera compra : No disponible");
                            System.out.println("Gastos de envío: exento por compra superior a 20€");
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);

                        } else if (cupon == false && primeraCompraDescuento == false && importeInicial < 20) {
                            importeFinal = importeInicial + 4.50;
                            precioRestante = 20 - importeInicial;
                            System.out.println("Precio: " + importeInicial + "€");
                            System.out.println("Descuento: No disponible ");
                            System.out.println("Descuento por primera compra : No disponible");
                            System.out.printf("Gastos de envío: 4.50€ (Le faltan %.2f€ para disfrutar de gastos de envío gratis). \n", precioRestante);
                            System.out.printf("Precio final: %.2f€ \n", importeFinal);
                        }
                    }
                }
            }
        }

    }

}
