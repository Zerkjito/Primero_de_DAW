/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication152;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class JavaApplication152 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1 -> rectangulo();
                case 2 -> circulo();
                case 3 -> trapecio();
            }
        } while (opcion != 0);

    }

    public static int leerOpcion() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una opcion: ");
        while (!sc.hasNextInt() || (n = sc.nextInt()) < 0 || n > 3) {
            System.out.println("ERROR. Numero invalido");
            sc.nextLine();
            System.out.print("Introduce una opcion: ");
        }
        return n;
    }

    public static double leerDouble() {
        Scanner sc = new Scanner(System.in);
        double dbl;
        System.out.print("-> ");
        while (!sc.hasNextDouble() || (dbl = sc.nextDouble()) <= 0) {
            System.out.println("ERROR. Debe ser double positivo");
            sc.nextLine();
            System.out.print("-> ");
        }
        return dbl;
    }
    
    public static double calcularArea (double base, double altura) {
        return base * altura;
    }
    
    public static double calcularArea (double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public static double calcularArea (double baseMayor, double baseMenor, double altura) {
        return (baseMayor + baseMenor) / 2 * altura; 
    }
    
    public static void rectangulo () {
        System.out.print("Base ");
        double base = leerDouble();
        System.out.println("Altura ");
        double altura = leerDouble();
        double area = calcularArea(base, altura);
        mostrarArea(area);
    }
    
    public static void circulo () {
        System.out.print("Radio ");
        double radio = leerDouble();
        double area = calcularArea(radio);
        mostrarArea(area);
    }
    
    public static void trapecio () {
        System.out.print("Base mayor ");
        double baseMayor = leerDouble();
        System.out.print("Base menor ");
        double baseMenor = leerDouble();
        System.out.print("Altura ");
        double altura = leerDouble();
        double area = calcularArea(baseMayor, baseMenor, altura);
        mostrarArea(area);
        
    }

    public static int mostrarMenu() {
        int opcion;
        System.out.println("1.Area del rectangulo");
        System.out.println("2.Area del ciruclo");
        System.out.println("3.Area del trapecio");
        System.out.println("0.FIN");
        opcion = leerOpcion();
        return opcion;
    }
    
    public static void mostrarArea(double area) {
        System.out.printf("Area: %.2f\n", area);
        System.out.println();
    }

    /* METODO PA MULTIPLICAR XD
    public static int calcularProductos(int a, int b) {
        int n1 = Math.abs(a);
        int n2 = Math.abs(b);
        int resultado = 0;
        for (int i = 1; i <= n2; i++) {
            resultado += n1;
        }

        if (a < 0 && b >= 0 || a >= 0 && b < 0) {
            resultado = -resultado;
        }
        return resultado;
    } */
}
