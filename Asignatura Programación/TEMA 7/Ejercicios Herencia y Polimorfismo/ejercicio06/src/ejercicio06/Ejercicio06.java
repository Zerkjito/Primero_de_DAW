/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejercicio06 {

    static ArrayList<Poligono> poligonos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static void leerPoligonos() {
        int tipo;
        do {
            do {
                System.out.print("Tipo de poligono 1->Rectangulo 2->Triangulo 0-> FIN >>> ");
                tipo = sc.nextInt();
            } while (tipo < 0 || tipo > 2);
            if (tipo != 0) {
                switch (tipo) {
                    case 1:
                        leerRectangulo();
                        break;
                    case 2:
                        leerTriangulo();
                        break;
                }
            }
        } while (tipo != 0);
    }

    public static void leerRectangulo() {
        double l1, l2;
        System.out.println("Introduzca datos del Rectángulo");
        do {
            System.out.print("Longitud del lado 1: ");
            l1 = sc.nextDouble();
        } while (l1 <= 0);
        do {
            System.out.print("Longitud del lado 2: ");
            l2 = sc.nextDouble();
        } while (l2 <= 0);
        Rectangulo r = new Rectangulo(l1, l2);
        poligonos.add(r);
    }

    public static void leerTriangulo() {
        double l1, l2, l3;
        System.out.println("Introduzca datos del Triangulo");
        do {
            System.out.print("Longitud del lado 1: ");
            l1 = sc.nextDouble();
        } while (l1 <= 0);
        do {
            System.out.print("Longitud del lado 2: ");
            l2 = sc.nextDouble();
        } while (l2 <= 0);
        do {
            System.out.print("Longitud del lado 3: ");
            l3 = sc.nextDouble();
        } while (l3 <= 0);
        Triangulo t = new Triangulo(l1, l2, l3);
        poligonos.add(t);
    }

    public static void mostrarPoligonos() {
        for (Poligono p : poligonos) {
            p.mostrar();
            System.out.printf(" area: %.2f %n", p.area());
        }
    }

    public static void mayorRectangulo() {
        if (poligonos.isEmpty()) {
            System.out.println("No hay poligonos que mostrar actualmente.");
            return;
        }

        Rectangulo mayorRect = null;
        double maxArea = 0;
        for (Poligono p : poligonos) {
            if (p instanceof Rectangulo r) {
                double area = p.area();
                if (mayorRect == null || area > maxArea) {
                    mayorRect = r;
                    maxArea = area;
                }
            }
        }

        if (mayorRect != null) {
            System.out.println("Rectangulo con mayor area:");
            mayorRect.mostrar();
            System.out.printf("Area: %.2f%n", maxArea);
        }
    }

    public static void mayorTriangulo() {
        if (poligonos.isEmpty()) {
            System.out.println("No hay poligonos que mostrar actualmente.");
            return;
        }

        Triangulo mayorTriangulo = null;
        double maxArea = 0;
        for (Poligono p : poligonos) {
            if (p instanceof Triangulo t) {
                double area = p.area();
                if (mayorTriangulo == null || area > maxArea) {
                    mayorTriangulo = t;
                    maxArea = area;
                }
            }
        }

        if (mayorTriangulo != null) {
            System.out.println("Triangulo con mayor area:");
            mayorTriangulo.mostrar();
            System.out.printf("Area: %.2f%n", maxArea);
        }
    }

    public static void mayorPoligono() {
        if (poligonos.isEmpty()) {
            System.out.println("No hay poligonos que mostrar actualmente.");
            return;
        }

        Poligono mayorPoligono = null;
        double maxArea = 0;
        for (Poligono p : poligonos) {
            double area = p.area();
            if (mayorPoligono == null || area > maxArea) {
                mayorPoligono = p;
                maxArea = area;
            }

        }

        if (mayorPoligono != null) {
            System.out.println("Poligono con mayor area:");
            mayorPoligono.mostrar();
            System.out.printf("Area: %.2f%n", maxArea);
        }
    }
}
