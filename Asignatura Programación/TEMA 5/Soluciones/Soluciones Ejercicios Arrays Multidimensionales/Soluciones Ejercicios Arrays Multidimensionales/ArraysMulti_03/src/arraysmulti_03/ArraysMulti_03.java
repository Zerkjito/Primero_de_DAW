/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysmulti_03;

/**
 *
 * @author enrique
 */
public class ArraysMulti_03 {

    public static void main(String[] args) {
        //se crea un array de 5 filas y 5 columnas
        int[][] A = new int[5][5];

        //cada elementos del array contiene la suma del número de su fila + número de su columna
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = i + j;
            }
        }

        //mostrar array
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
    }
    
}
