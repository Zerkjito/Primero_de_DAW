package gstiondearticulos;

import java.util.Scanner;

public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println(" 1. Nuevo artículo");
        System.out.println(" 2. Mostrar artículos");
        System.out.println(" 3. Poner en oferta");
        System.out.println(" 4. Eliminar artículos");
        System.out.println(" 5. Producto estrella");
        System.out.println(" 6. Eliminar productos estrella");
        System.out.println(" 7. Modificar descuento");
        System.out.println(" 0. FIN");
    }

    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 7);
        sc.nextLine(); //limpiar el buffer
        return opcion;
    }
}
