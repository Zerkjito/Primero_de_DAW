/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1_07;

import java.util.Scanner;

public class POO1_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se crea un objeto Fecha
        Fecha fecha = new Fecha();

        //Se introduce por teclado un valor para el dia, mes y año
        int d, m, a;
        System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        d = sc.nextInt();
        System.out.print("mes: ");
        m = sc.nextInt();
        System.out.print("año: ");
        a = sc.nextInt();

        //se asignan los valores introducidos por teclado al objeto
        fecha.asignarFecha(d, m, a);

        if (fecha.fechaCorrecta()) {//Si la fecha que contiene el objeto es correcta
            //Se muestra en formato d/m/yyyy
            System.out.println(fecha.getDia() + "/" + fecha.getMes() + "/" + fecha.getAño());
            System.out.println(fecha.fechaCorta()); //se muestra en formato dd-mm-aaaa
            System.out.println(fecha.fechaLarga()); //se muestra la fecha en formato completo
            System.out.println();
            for (int i = 1; i <= 10; i++) { //se obtienen y muestran las fechas de los 10 dias siguientes
                fecha.diaSiguiente();
                System.out.println(fecha.fechaLarga());
            }
        } else {
            System.out.println("Fecha no valida");
        }
    }

}
