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
        Scanner sc = new Scanner (System.in);
        int nums;
        
        do {
            do {
                System.out.print("Introduce numero entero positivo (0 para finalizar): ");
                nums = sc.nextInt();
                if (nums < 0) {
                    System.out.println("Numero no valido");
                }
            } while (nums < 0);
            
            if (nums == 0) {
                break;
            }
            
            int divisor = 1;
            int aux = nums;
            while ((aux / divisor >= 10)) {
                divisor*=10;
            }
            
            while (divisor > 0) {
                int digito = aux / divisor;
                aux = aux % divisor;
                divisor/=10;
                
                switch (digito) {
                    case 0:
                        System.out.print("cero");
                        break;
                    case 1:
                        System.out.print("uno");
                        break;    
                    case 2:
                        System.out.print("dos");
                        break;
                    case 3:
                        System.out.print("tres");
                        break;
                    case 4:
                        System.out.print("cuatro");
                        break;
                    case 5:
                        System.out.print("cinco");
                        break;
                    case 6:
                        System.out.print("seis");
                        break;
                    case 7:
                        System.out.print("siete");
                        break;
                    case 8:
                        System.out.print("ocho");
                        break;
                    case 9:
                        System.out.print("nueve");
                        break;
                }
                
                if (divisor != 0) {
                    System.out.print(" - ");
                }   
            }
            System.out.println();
        } while (nums > 0);
        System.out.println();
        System.out.println("Fin programa. Gracias!");
        sc.close();
    }
    
}
