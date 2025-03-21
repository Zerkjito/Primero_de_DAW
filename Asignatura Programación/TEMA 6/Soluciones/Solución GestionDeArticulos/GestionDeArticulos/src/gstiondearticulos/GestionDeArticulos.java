package gstiondearticulos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class GestionDeArticulos {

    static Articulo[] tienda = new Articulo[100];
    static int indice;
    static ArrayList<Articulo> ofertas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Menu menu = new Menu();
        int opcion;
        do {
            menu.mostrar();
            opcion = menu.leer();
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
                    eliminarArticulos();
                    break;
                case 5:
                    obtenerProductoEstrella();
                    break;
                case 6:
                    eliminarProductosEstrella();
                    break;
                case 7:
                    modificarDescuento();
                    break;
            }
        } while (opcion != 0);
    }

    public static void nuevoArticulo() {

        if (indice < tienda.length) {
            //se obtiene la fecha actual
            LocalDate ahora = LocalDate.now();
            //se crea un objeto Fecha y se le asigna el valor de la fecha actual
            //servirá para comprobar si la fecha de caducidad del artículo es válida
            Fecha fechaActual = new Fecha();
            fechaActual.setDia(ahora.getDayOfMonth());
            fechaActual.setMes(ahora.getMonthValue());
            fechaActual.setAño(ahora.getYear());

            String codigo;
            String descripcion;
            double precio;
            Fecha fecha = new Fecha();
            int dia, mes, año;
            Articulo articulo = new Articulo();
            boolean ok;
            do {
                System.out.print("Código: ");
                codigo = sc.nextLine();
                ok = codigoValido(codigo);
                if (!ok) {
                    System.out.println("Código no válido");
                }
            } while (!ok);
            articulo.setCodigo(codigo);
            if (existeArticulo(articulo)) {
                System.out.println("Articulo repetido");
            } else {
                System.out.print("Descripción: ");
                descripcion = sc.nextLine();
                System.out.print("Precio: ");
                precio = sc.nextDouble();
                do {
                    System.out.print("Fecha de caducidad: ");
                    System.out.print("Dia: ");
                    dia = sc.nextInt();
                    System.out.print("Mes: ");
                    mes = sc.nextInt();
                    System.out.print("Año: ");
                    año = sc.nextInt();
                    fecha.setAño(año);
                    fecha.setMes(mes);
                    fecha.setDia(dia);
                } while (!fecha.fechaCorrecta() || fecha.esMenorQue(fechaActual)); //si la fecha de caducidad no es correcta o es menor que la fecha actual
                sc.nextLine();
                articulo.setDescripcion(descripcion);
                articulo.setPrecio(precio);
                articulo.setFechaCaducidad(fecha);
                tienda[indice] = articulo;
                indice++;
            }
        } else {
            System.out.println("\n--->> No hay espacio para más artículos\n");
        }
        System.out.println();
    }

    public static void mostrarArticulos() {
        if (indice != 0) {
            System.out.println("\nArticulos ordenadas por descripción");
            Arrays.sort(tienda, 0, indice);
            for (int i = 0; i < indice; i++) {
                System.out.println(tienda[i]);
            }

            if (ofertas.isEmpty()) {
                System.out.println("\n--->> No hay artículos en oferta\n");
            } else {
                System.out.println("\nArticulos en oferta ordenados por precio");
                Collections.sort(ofertas, new Comparator<Articulo>() {

                    @Override
                    public int compare(Articulo o1, Articulo o2) {
                        if (o1.getPrecio() < o2.getPrecio()) {
                            return -1;
                        } else if (o1.getPrecio() > o2.getPrecio()) {
                            return 1;
                        } else { //// Si tienen el mismo precio se ordenan por descripción
                            return o1.getDescripcion().compareToIgnoreCase(o2.getDescripcion());
                        }
                    }
                });
                for (Articulo a : ofertas) {
                    System.out.println(a);
                }
                System.out.println();
            }
        } else {
            System.out.println("\n--->> No hay artículos en la tienda\n");
        }

    }

    public static void ponerEnOferta() {
        if (indice > 0) {
            LocalDate fechaActual = LocalDate.now();
            int mesActual = fechaActual.getMonthValue();
            int añoActual = fechaActual.getYear();
            Fecha fechaCad;
            double precio;
            int contadorOfertas = 0;
            for (int i = 0; i < indice; i++) {
                fechaCad = tienda[i].getFechaCaducidad();
                if (mesActual == fechaCad.getMes() && añoActual == fechaCad.getAño()) {
                    if (tienda[i].isProductoEstrella()) {
                        precio = tienda[i].getPrecio();
                        precio = precio * 2;
                        tienda[i].setPrecio(precio);
                        tienda[i].setProductoEstrella(false);
                        precio = tienda[i].getPrecio();
                        precio = precio - precio * Articulo.getPorcentajeDescuento() / 100;
                        tienda[i].setPrecio(precio);
                        ofertas.add(tienda[i]);
                        contadorOfertas++;
                    } else if (!ofertas.contains(tienda[i])) {
                        precio = tienda[i].getPrecio();
                        precio = precio - precio * Articulo.getPorcentajeDescuento() / 100;
                        tienda[i].setPrecio(precio);
                        ofertas.add(tienda[i]);
                        contadorOfertas++;
                    }
                }
            }
            if (contadorOfertas == 0) {
                System.out.println("\n-->> No hay productos disponibles para poner en oferta\n");
            } else {
                System.out.println("\n--> Se han puesto " + contadorOfertas + " productos en oferta\n");
            }
        } else {
            System.out.println("\n--->> No hay artículos en la tienda\n");
        }
    }

    public static void eliminarArticulos() {
        if (indice > 0) {
            LocalDate ahora = LocalDate.now();
            Fecha fechaActual = new Fecha();
            fechaActual.setDia(ahora.getDayOfMonth());
            fechaActual.setMes(ahora.getMonthValue());
            fechaActual.setAño(ahora.getYear());
            Fecha fechaCad;
            int contador = 0;
            for (int i = 0; i < indice; i++) {
                fechaCad = tienda[i].getFechaCaducidad();
                if (fechaCad.esMenorQue(fechaActual) || fechaCad.esIgualQue(fechaActual)) {

                    if (ofertas.contains(tienda[i])) {
                        ofertas.remove(tienda[i]);
                    }
                    for (int j = i; j < indice; j++) {
                        tienda[j] = tienda[j + 1];
                    }
                    i--;
                    indice--;

                    contador++; //contador de artículos eliminados
                }
            }
            if (contador != 0) {
                System.out.println("\n--->> Eliminados " + contador + " artículos caducados\n");
            } else {
                System.out.println("\n--->> No hay artículos caducados\n");
            }
        } else {
            System.out.println("\n--->> No hay artículos en la tienda\n");
        }
    }

    public static void obtenerProductoEstrella() {
        Random rnd = new Random();
        int n, contador = 0;
        double precio;
        if (indice > 1) {
            if (indice != ofertas.size()) {
                for (int i = 0; i < indice; i++) {//for para  comprobar si hay artículos que puedan ser poductos estrella
                    if (!tienda[i].isProductoEstrella() && !ofertas.contains(tienda[i])) {
                        contador++;
                    }
                }
                if (contador != 0) {
                    do {
                        n = rnd.nextInt(indice);
                    } while (tienda[n].isProductoEstrella() || ofertas.contains(tienda[n]));
                    precio = tienda[n].getPrecio();
                    precio = precio / 2;
                    tienda[n].setPrecio(precio);
                    tienda[n].setProductoEstrella(true);
                    System.out.println("\nNuevo producto estrella:\n");
                    System.out.println(tienda[n]);
                    System.out.println();
                } else {
                    System.out.println("\n--->> No es posible obtener un producto estrella\n");
                }
            } else {
                System.out.println("\n--->> Todos los artículos de la tienda están ya en oferta\n");
            }
        } else {
            System.out.println("\n--->> Debe haber al menos dos artículos\n");
        }
    }

    public static void eliminarProductosEstrella() {
        double precio;
        boolean hayProductosEstrella = false;
        for (int i = 0; i < indice; i++) {
            if (tienda[i].isProductoEstrella()) {
                tienda[i].setProductoEstrella(false);
                precio = tienda[i].getPrecio() * 2;
                tienda[i].setPrecio(precio);
                hayProductosEstrella = true;
            }
        }
        if (hayProductosEstrella) {
            System.out.println("\n--->> Productos estrella eliminados\n");
        } else {
            System.out.println("\n--->> No se han encontrado productos estrella\n");
        }
    }

    public static void modificarDescuento() {
        double n;
        System.out.printf("%nPorcentaje de descuento actual: %.2f%n", Articulo.getPorcentajeDescuento());
        do {
            System.out.print("Nuevo valor (>= 0): ");
            n = sc.nextDouble();
        } while (n < 0);
        Articulo.setPorcentajeDescuento(n);
    }

    public static boolean existeArticulo(Articulo a) {
        for (int i = 0; i < indice; i++) {
            if (tienda[i].equals(a)) {
                return true;
            }
        }
        return false;
    }

    public static boolean codigoValido(String codigo) {
        if (codigo.length() < 3) {
            return false;
        }
        if (!Character.isLetter(codigo.charAt(0))) {
            return false;
        }
        if (!Character.isLetter(codigo.charAt(1))) {
            return false;
        }
        for (int i = 2; i < codigo.length(); i++) {
            if (!Character.isDigit(codigo.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
