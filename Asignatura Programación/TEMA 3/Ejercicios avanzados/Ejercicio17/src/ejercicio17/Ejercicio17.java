/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char seguir;
        
        do {
            String nombre = "";
            int mayor = -1;
            int n, digito = 0, posicionActual = 0, posicion = -1;
            
            System.out.print("Introduce un numero entero positivo: ");
            n = sc.nextInt();
            int numOriginal = n;
           
            while (n > 0) {
                posicionActual++;
                digito = n % 10;
                if (digito > mayor) {
                    mayor = digito;
                    posicion = posicionActual;
                }
                n/=10;
            }          
            switch (mayor) {
                case 1:
                    nombre = "uno";
                    break;
                case 2:
                    nombre = "dos";
                    break;
                case 3:
                    nombre = "tres";
                    break;
                case 4:
                    nombre = "cuatro";
                    break;
                case 5:
                    nombre = "cinco";
                    break;
                case 6:
                    nombre = "seis";
                    break;
                case 7:
                    nombre = "siete";
                    break;
                case 8:
                    nombre = "ocho";
                    break;
                case 9:
                    nombre = "nueve";
                    break;
                default:
                    nombre = "desconocido";
                    break;
            }
            System.out.println("Cifra mayor: " + nombre);
            System.out.println("Posicion de la cifra: " + posicion);
            sc.nextLine();
            do {
                System.out.print("Deseas leer mas numeros? (S/N) ");
                seguir = sc.nextLine().toUpperCase().charAt(0);
            } while (seguir != 'S' && seguir != 'N');
        } while (seguir == 'S');
        System.out.println("Fin del programa. Gracias!");
    }
    
}
