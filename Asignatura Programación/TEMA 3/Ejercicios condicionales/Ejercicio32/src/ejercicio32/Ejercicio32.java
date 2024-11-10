/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;

        System.out.print("Introduce el dia: ");
        dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        año = sc.nextInt();

        System.out.println("Fecha introducida: " + dia + "/" + mes + "/" + año);
        dia++;
        if (dia > 31) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        } else if (dia == 29 && mes == 2) {
            dia = 1;
            mes++;
        } else if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            dia = 1;
            mes++;
        }

        System.out.println("Fecha dia siguiente: " + dia + "/" + mes + "/" + año);
    }

}
