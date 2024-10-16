/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double longitudRadio, volumenEsfera;
        System.out.print("Por favor, introduzca la longitud del radio: ");
        longitudRadio = sc.nextDouble();
        volumenEsfera = 4.0/3 * Math.PI * Math.pow(longitudRadio, 3);
        System.out.print("El volumen de la esfera es --> " + volumenEsfera);
        
        
    }
    
}
