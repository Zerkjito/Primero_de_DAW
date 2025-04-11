package carrerapopular;

import java.util.Scanner;

public class Menu {

    private int opcion;

    public void mostrar() {
        System.out.println("1. Mostrar carrera");
        System.out.println("2. Avanzar");
        System.out.println("3. Amonestar");
        System.out.println("4. Mostrar ganadores");
        System.out.println("5. Mostrar ganadores por categorías");
        System.out.println("6. Mostrar posición final del participante más joven");
        System.out.println("0. FIN");
    }

    public int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 6);
        sc.nextLine(); //limpiar el intro
        return opcion;
    }
}
