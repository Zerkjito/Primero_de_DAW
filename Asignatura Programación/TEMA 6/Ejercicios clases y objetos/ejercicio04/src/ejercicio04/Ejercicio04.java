/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author zerkje
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contador c1 = new Contador(5);
        System.out.print("Valor inicial del contador 1: " + c1.getCont());
        c1.incrementar();
        System.out.print("\nValor despues de incrementar a contador 1: " + c1.getCont());
        c1.decrementar();
        System.out.print("\nValor despues de decrementar a contador 1: " + c1.getCont());
        Contador c2 = new Contador();
        c2.setCont(-5);
        System.out.print("\nValor de contador 2 al haberle asignado numero negativo mediante setter(deberia ser 0): " + c2.getCont());
        Contador c3 = new Contador(c1);
        System.out.print("\nValor del contador 3 (copia de contador 1): " + c3.getCont());
    }
}
