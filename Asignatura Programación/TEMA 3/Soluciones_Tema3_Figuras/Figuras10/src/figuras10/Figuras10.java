/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras10;

/**
 *
 * @author enrique
 */
public class Figuras10 {

    public static void main(String[] args) {
        //Se incluyen tres soluciones distintas a este ejercicio
        //Solucion 1: 
        //Se basa en que la B se muestra cuando la suma de la fila más la culumna es un número par
        //Si numero de fila + numero de columna es un valor par se muestra la B
        //sino se muestra N
        System.out.println("Solución 1\n");
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("B ");
                } else {
                    System.out.print("N ");
                }
            }
            System.out.println();
        }

        //Solución 2: 
        //Se utiliza una variable de tipo boolean para mostrar alternativamente B ó N
        System.out.println("\n\nSolución 2\n");
        boolean mostrarB = true;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (mostrarB) {
                    System.out.print("B ");
                } else {
                    System.out.print("N ");
                }
                mostrarB = !mostrarB;
            }
            System.out.println();
            mostrarB = !mostrarB;
        }

        //Solución 3: 
        //Se basa en lo siguiente:
        //Si la fila es impar -> si la columna es impar se escribe B sino se escribe N
        //Si la fila es par   -> si la columna es impar se escribe N sino se escribe B
        System.out.println("\n\nSolución 3\n");
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i % 2 != 0) { //en las filas impares
                    if (j % 2 != 0) { //en las columnas impares se escribe B y en las pares N
                        System.out.print("B ");
                    } else {
                        System.out.print("N ");
                    }
                } else {  //en las filas pares
                    if (j % 2 != 0) { //en las columnas impares se escribe N y en las pares B
                        System.out.print("N ");
                    } else {
                        System.out.print("B ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
