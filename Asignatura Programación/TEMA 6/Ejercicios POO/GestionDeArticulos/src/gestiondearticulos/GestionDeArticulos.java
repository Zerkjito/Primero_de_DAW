/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondearticulos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class GestionDeArticulos {

    static Articulo[] tienda = new Articulo[100];
    static int indice;
    static ArrayList<Articulo> ofertas = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu m = new Menu();
        int opcion;
        do {
            m.mostrar();
            opcion = m.leer();
            switch (opcion) {
                case 1:
                    nuevoArticulo();
                    break;
                case 2:
                    mostrarArticulos();
                    break;
                case 3:
                    ponerEnOferta();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
            }
        } while (opcion != 0);

    }

    public static void nuevoArticulo() {
        String codigo, descripcion;
        double precio;
        int dia, mes, año;

        System.out.print("\nCodigo del articulo: ");
        codigo = sc.nextLine().trim().toUpperCase();
        while (!codigo.matches("^[A-Z]{2}\\d+$")) {
            System.out.println("Error: Formato de codigo invalido, vuelve a intentarlo.");
            System.out.print("\nCodigo del articulo: ");
            codigo = sc.nextLine().trim().toUpperCase();
        }

        if (codigoRepetido(codigo)) {
            System.out.println("Error: El articulo ya existe en la tienda.");
            return;
        }

        System.out.print("\nDecripcion: ");
        descripcion = sc.nextLine();
        while (!descripcion.matches("^[a-z-A-Z0-9áéíóúÁÉÍÓÚñÑ ]{1,100}$")) {
            System.out.println("Error Formato de descripcion invalido, vuelve a intentarlo.");
            System.out.print("\nDecripcion del articulo: ");
            descripcion = sc.nextLine();
        }
        String descripcionFormateada = descripcionBonita(descripcion);
        do {
            System.out.print("\nPrecio: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Error: Entrada invalida, introduce digitos numericos.");
                sc.nextLine();
                System.out.print("\nPrecio: ");
            }
            precio = sc.nextDouble();
            sc.nextLine();

            if (precio <= 0) {
                System.out.println("Error: Precio no puede ser negativo.");
            }
        } while (precio <= 0);

        Fecha f = new Fecha();

        do {
            System.out.println("\nIntroduce la fecha de caducidad");
            System.out.print("\nDia: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("\nDia: ");
            }
            dia = sc.nextInt();

            System.out.print("Mes: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("\nMes: ");
            }
            mes = sc.nextInt();

            System.out.print("Año: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("\nAño: ");
            }
            año = sc.nextInt();
            sc.nextLine();

            f.asignarFecha(dia, mes, año);

            if (!f.fechaCorrecta()) {
                System.out.println("Error: Formato incorrecto.");
            }
            if (f.caducado()) {
                System.out.println("Error: Producto caducado, vuelve a intentarlo.");
            }
        } while (!f.fechaCorrecta() || f.caducado());

        tienda[indice] = new Articulo(codigo, descripcionFormateada, precio, f);
        System.out.println("Articulo agregado correctamente.");
        indice++;
    }

    public static void mostrarArticulos() {
        if (tienda == null || indice == 0) {
            System.out.println("Error: Tienda vacia actualmente.");
            return;
        }

        Articulo[] articulosValidos = Arrays.copyOf(tienda, indice);

        Arrays.sort(articulosValidos, Comparator.comparing(Articulo::getDescripcion));

        System.out.println("\nArticulos ordenados alfabeticamente:");
        for (Articulo art : articulosValidos) {
            if (art.isProductoEstrella()) {
                System.out.println("PRODUCTO ESTRELLA:");
            }
            System.out.println("\n" + art);
        }

        if (ofertas.isEmpty()) {
            System.out.println("\nNo hay articulos en oferta actualmente.");
            return;
        }

        Arrays.sort(articulosValidos, Comparator.comparing(Articulo::getPrecio)
                .thenComparing(Articulo::getDescripcion));

        System.out.println("Articulos en OFERTA ordenados por precio:");
        for (Articulo art : articulosValidos) {
            System.out.println("\n" + art);
        }
    }

    public static boolean codigoRepetido(String cod) {
        for (Articulo articulo : tienda) {
            if (articulo != null && articulo.getCodigo().equals(cod)) {
                return true;
            }
        }
        return false;
    }

    public static void ponerEnOferta() {

        if (tienda == null || indice == 0) {
            System.out.println("Error: Tienda vacia.");
            return;
        }

        for (int i = 0; i < indice; i++) {
            if (tienda[i].getFechaCaducidad().caducaEsteMes()) {
                if (tienda[i].isProductoEstrella()) {
                    tienda[i].restaurarPrecio();
                    tienda[i].setProductoEstrella(false);
                }

                if (!ofertas.contains(tienda[i])) {
                    tienda[i].setPrecio(tienda[i].aplicarDescuento());
                    ofertas.add(tienda[i]);
                }
            }
            System.out.println("Productos puestos en oferta correctamente.");
        }

    }

    public static String descripcionBonita(String descripcion) {
        return descripcion.substring(0, 1).toUpperCase() + descripcion.substring(1);
    }

}
