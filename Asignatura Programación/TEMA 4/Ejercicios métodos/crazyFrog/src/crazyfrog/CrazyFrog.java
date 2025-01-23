/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crazyfrog;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class CrazyFrog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saltos;
        System.out.print("Introduce numero de saltos: ");
        saltos = sc.nextInt();
        int resultado = calcularSalto(saltos);
        System.out.println(resultado);

    }

    public static int calcularSalto(int N) {
        int distanciaRecorrida = 0;
        int salto = 20;
        for (int i = 1; i <= N; i++) {
            distanciaRecorrida = distanciaRecorrida + salto;
            salto = salto / 2;
            if (salto < 5) {
                salto = 20;
            }
        }
        return distanciaRecorrida;
    }

}
