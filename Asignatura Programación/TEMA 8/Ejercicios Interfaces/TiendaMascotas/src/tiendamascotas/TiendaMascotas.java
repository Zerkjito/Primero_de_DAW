/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendamascotas;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author zerkje
 */
public class TiendaMascotas {

    static int indice = 0;
    static Tienda[] tiendaMascotas;
    static Menu m = new Menu();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            leerDatos();
            m.mostrar();
            opcion = m.leerOpcion();
            switch (opcion) {
                case 1:
                    mostrar();
                    break;
                case 2:
                case 3:
            }
        } while (opcion != 0);
    }

    public static void leerDatos() {
        int capacidadTienda = UtilidadesInput.leerEnteroEnRangoMin("Capacidad maxima articulos: ", "Error: Capacidad maxima no puede ser negativa.", 1);
        tiendaMascotas = new Tienda[capacidadTienda];

        int gatosQueLeer = UtilidadesInput.leerEnteroEnRango("Cantidad de gatos a registrar: ", "Error: Cantidad de gatos debe ser entre 1 y " + tiendaMascotas.length, 0, tiendaMascotas.length);
        for (int i = 0; i < gatosQueLeer; i++) {
            if (indice < tiendaMascotas.length) {
                Gato g = leerGato();
                System.out.println("Gato leido correctamente.");
                tiendaMascotas[indice] = g;
                indice++;
            }
        }

        int perrosQueLeer = UtilidadesInput.leerEnteroEnRango("Cantidad de perros a registrar: ", "Error: Cantidad de gatos debe ser entre 0 y " + tiendaMascotas.length, 0, tiendaMascotas.length);
        for (int i = 0; i < perrosQueLeer; i++) {
            if (indice < tiendaMascotas.length) {
                Perro p = leerPerro();
                System.out.println("Perro leido correctamente.");
                tiendaMascotas[indice] = p;
                indice++;
            }
        }

        int articulosQueLeer = UtilidadesInput.leerEnteroEnRango("Cantidad de articulos a registrar: ", "Error: Cantidad de gatos debe ser entre 0 y " + tiendaMascotas.length, 0, tiendaMascotas.length);
        for (int i = 0; i < articulosQueLeer; i++) {
            if (indice < tiendaMascotas.length) {
                Articulo art = leerArticulo();
                System.out.println("Articulo leido correctamente.");
                tiendaMascotas[indice] = art;
                indice++;
            }
        }
    }

    public static void mostrar() {
        if (!hayAlgunaOferta()) {
            System.out.println("No hay ofertas disponibles.");
        }

        Arrays.sort(tiendaMascotas, 0, indice, Comparator.comparing(Tienda::enOferta).reversed()
                .thenComparing(Tienda::obtenerPrecio));
        for (int i = 0; i < indice; i++) {
            System.out.println(tiendaMascotas[i]);
        }
    }

    public static boolean hayAlgunaOferta() {
        for (int i = 0; i < indice; i++) {
            if (tiendaMascotas[i].enOferta()) {
                return true;
            }
        }
        return false;
    }

    public static Gato leerGato() {
        int codigo = pedirCodValido();
        double precioGato = pedirPrecio();
        RazaGato raza = pedirRazaG();
        return new Gato(codigo, precioGato, raza);
    }

    public static Perro leerPerro() {
        int codigo = pedirCodValido();
        double precioPerro = pedirPrecio();
        RazaPerro raza = pedirRazaP();
        return new Perro(codigo, precioPerro, raza);
    }

    public static Articulo leerArticulo() {
        int codigo = pedirCodValido();
        String descripcion = pedirDescripcion();
        double precioArt = pedirPrecio();
        return new Articulo(codigo, descripcion, precioArt);
    }

    public static int pedirCodValido() {
        int cod;
        do {
            cod = UtilidadesInput.leerEnteroEnRangoMin("Introduce patron de digitos: ", "Error: Debe estar formado por al menos 1 digito.", 1);
            if (existeCodigo(cod)) {
                System.out.println("Error: El codigo ya esta registrado.");
            }
        } while (existeCodigo(cod));
        return cod;
    }

    public static double pedirPrecio() {
        return UtilidadesInput.leerDoubleEnRangoMin("Precio: ", "Error: Precio no puede ser negativo", 1.);
    }

    public static RazaGato pedirRazaG() {
        int n = UtilidadesInput.leerEnteroEnRango("Raza gato (1-> Persa  2-> Bobtail  3-> Siames  4-> Siberiano)", "Error: Opcion fuera de rango", 1, 4);
        return RazaGato.values()[n - 1];
    }

    public static RazaPerro pedirRazaP() {
        int n = UtilidadesInput.leerEnteroEnRango("Raza perro(1-> Chihuahua  2-> Boxer  3-> Pastor Aleman  4-> Labrador)", "Error: Opcion fuera de rango", 1, 4);
        return RazaPerro.values()[n - 1];
    }

    public static String pedirDescripcion() {
        String des = UtilidadesInput.leerString("Descripcion: ");
        while (!des.matches("[\\p{L}\\p{N},._\\s]{1,50}")) {
            System.out.println("Error: Entrada no valida. Intenta de nuevo.");
            des = UtilidadesInput.leerString("Descripcion: ");
        }
        return des;
    }

    public static boolean existeCodigo(int cod) {
        for (int i = 0; i < indice; i++) {
            switch (tiendaMascotas[i]) {
                case Perro p -> {
                    if (p.getCodigo() == cod) {
                        return true;
                    }
                }
                case Gato g -> {
                    if (g.getCodigo() == cod) {
                        return true;
                    }
                }
                case Articulo a -> {
                    if (a.getCodigo() == cod) {
                        return true;
                    }
                }
                default -> {
                }
            }
        }
        return false;
    }

}
