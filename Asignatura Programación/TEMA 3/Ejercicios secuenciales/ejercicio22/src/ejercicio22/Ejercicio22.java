/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, numeroSuerte, sumaFechas;
        System.out.print("Por favor, introduzca su dia de nacimiento: ");
        dia = sc.nextInt();
        System.out.print("Por favor, introduzca su mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.print("Por favor, introduzca su año de nacimiento: ");
        año = sc.nextInt();
        sumaFechas = dia + mes + año;
        numeroSuerte = (sumaFechas / 1000) + (sumaFechas / 100 % 10) + (sumaFechas / 10 % 10) + (sumaFechas % 10);
        System.out.println(dia + "/" + mes + "/" + año + " --> Nº de la suerte: " + numeroSuerte);
        
        
        
        
      
    }
    
}
