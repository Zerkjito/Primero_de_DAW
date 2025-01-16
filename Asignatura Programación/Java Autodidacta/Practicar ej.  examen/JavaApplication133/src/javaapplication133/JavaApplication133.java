/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication133;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class JavaApplication133 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ejercicio01
        int filas, columnas;
        System.out.print("Introduce filas: ");
        filas = sc.nextInt();
        System.out.print("Introduce columnas: ");
        columnas = sc.nextInt();
        
        
        for (int i = 1; i <= filas; i++) {
            for(int j = 1; j <= columnas; j++) {
                System.out.print(" * ");
            }
            System.out.println();
            
        }
         */

 /* ejercicio02
        int filas, columnas;
        int contador = 0;
        System.out.print("Introduce filas: ");
        filas = sc.nextInt();
        System.out.print("Introduce columnas: ");
        columnas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print(contador % 10 + " ");
                contador++;
            }
            System.out.println();

        }
         */
 /* ejercicio03
        int filas, columnas;
        char relleno;
        System.out.print("Introduce filas: ");
        filas = sc.nextInt();
        System.out.print("Introduce columnas: ");
        columnas = sc.nextInt();
        System.out.print("Introduce el caracter de relleno: ");
        relleno = sc.next().charAt(0);

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print(relleno);
            }
            System.out.println();

        }
         */
 /* ejercicio04
        int filas, columnas;
        int contador = 1;
        System.out.print("Introduce filas: ");
        filas = sc.nextInt();
        System.out.print("Introduce columnas: ");
        columnas = sc.nextInt();

        System.out.println("Figura 1:");
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (j == i) {
                    System.out.print(contador + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
        System.out.print("\n");
        int centro = filas / 2 + 1;
        System.out.println("Figura 2:");
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (j == centro) {
                    System.out.print(contador + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.print("\n");
        System.out.println("Figura 3:");
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                if (i == centro) {
                    System.out.print(contador + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
         */
 /* ejercicio05
        int filas, contador;
        System.out.print("Introduce filas: ");
        filas = sc.nextInt();
        System.out.print("Introduce valor inicial: ");
        contador = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                    if (contador == 0) {
                        contador = 10;
                    }
                    System.out.print(contador % 10 + " ");
                    contador--;
                
            }
            System.out.println();
        }
         */
 /* ejercicio06
        int filas;
        int contador = 1;
        System.out.print("Introduce filas: ");
        filas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = filas; j >= i; j--) {
                    System.out.print(contador % 10 + " ");
                    contador++;
                
            }
            System.out.println();
        }
         */
 /*
        int filas, contador;
        System.out.print("Introduce filas: ");
        filas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            contador = i;
            for (int j = filas; j >= i; j--) {
                    System.out.printf("%2d ", contador++);        
            }
            System.out.println();
        }
         */
 /* ejercicio08
        int filas;
        int contador = 1;
        System.out.print("Introduce filas: ");
        filas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = filas; j >= i; j--) {
                    if (j == i) {
                        System.out.print(contador++);
                    } else {
                        System.out.print(". ");
                    } 
            }
            System.out.println();
        }
         */
 /* ejercicio09
        int altura, base;
        System.out.print("Introduce la altura: ");
        altura = sc.nextInt();
        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {
                if (i == 1 || i == altura || j == 1 || j == base) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         */
 /* ejercicio10
        int altura, base;
        boolean esB = false;
        System.out.print("Introduce la altura: ");
        altura = sc.nextInt();
        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            esB = !esB;
            for (int j = 1; j <= base; j++) {
                if (esB) {
                    System.out.print("B ");
                } else {
                    System.out.print("N ");
                }
                esB = !esB;
            }
            System.out.println();
        }
         */
 /* ejercicio11
        int filas;
        int contador = 1;
        System.out.print("Introduce filas: ");
        filas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }
         */
 /* ejercicio12
         int filas;
         int contador = 1;
         
         System.out.print("iNTRODUCE filas: ");
         filas = sc.nextInt();
         
         for (int i = 1; i <= filas; i++) {
             for (int j = 1; j <= filas; j++) {
                 if (j == filas - i + 1) {
                     System.out.print(contador++ + " ");
                 } else {
                     System.out.print(". ");
                 }
             }
             System.out.println();
         }
         */
 /* ejercicio13
         int filas, digito;
         System.out.print("Introduce filas: ");
         filas = sc.nextInt();
         System.out.print("Introduce digito: ");
         digito = sc.nextInt();
         
         for (int i = 1; i <= filas; i++) {
             int numero = digito;
             for (int j = 1; j <= i; j++) {
                 System.out.print(numero % 10 + " ");
                 numero++;
             }
             digito++;
             System.out.println();
         }
         */
 /* ejercicio14
         int filas;
         int contador = 1;
         System.out.print("Introduce filas: ");
         filas = sc.nextInt();
         
         for (int i = 1; i <= filas; i++) {
             for (int j = 1; j <= filas; j++) {
                 if (j <= i) {
                     System.out.print(contador++ % 10 + " ");
                 } else {
                     System.out.print("* ");
                 }
             }
             System.out.println();
         }
         */
 /* ejercicio15
         int filas, columnas;
         System.out.print("Introduce filas: ");
         filas = sc.nextInt();
         System.out.print("Introduce columnas: ");
         columnas = sc.nextInt();
         
         int centro = filas / 2;
         for (int i = 1; i <= filas; i ++) {
             for (int j = 1; j <= columnas; j++) {
                 if (j == columnas && i <= centro) {
                     System.out.print("*");
                 } else if (j == 1 && i >= centro) {
                     System.out.print("*");
                 } else if (i == 1 || i == centro || i == filas) {
                     System.out.print("#");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
         */
 
         int filas, columnas;
         System.out.print("Introduce filas: ");
         filas = sc.nextInt();
         System.out.print("Introduce columnas: ");
         columnas = sc.nextInt();
         
         int centroCol = columnas / 2 + 1;
         int centroFil = filas / 2 + 1;
         int contador = 2;
         for (int i = 1; i <= filas; i++) {
             for (int j = 1; j <= columnas; j++) {
                 if (i == centroFil) {
                     System.out.print("- ");
                 } else if (j == centroCol) {
                     System.out.print("| ");
                 } else {
                     System.out.print(contador % 10 + " ");
                     contador+=2;
                 }
             }
             System.out.println();
         }
         
    }

}
