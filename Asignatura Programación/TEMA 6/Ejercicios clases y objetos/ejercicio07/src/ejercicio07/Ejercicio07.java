/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha f = new Fecha();
        int d, m, a;
        boolean ok;
        do {
            ok = true;
            System.out.println("Introduce fecha"); //Se introduce una fecha por teclado
            System.out.print("dia: ");
            d = sc.nextInt();
            System.out.print("mes: ");
            m = sc.nextInt();
            System.out.print("año: ");
            a = sc.nextInt();
            f.asignarFecha(d, m, a); //se asigna la fecha introducida al objeto
            if (!f.fechaCorrecta()) { //se comprueba si la fecha es válida
                System.out.println("Fecha no válida");
                ok = false;
            }
        } while (!ok); //si la fecha no es válida se vuelve a pedir
        System.out.println(f.getDia() + "/" + f.getMes() + "/" + f.getAño());
        
        System.out.println("Fecha corta -> " + f.fechaCorta());
        System.out.println("Fecha larga -> " + f.fechaLarga());
        System.out.println("\nSimulacion de paso del tiempo de 10 dias");
        for (int i = 0; i < 10; i++) {
            f.diaSiguiente();
            System.out.println(f.fechaLarga());
        }
    }

}
