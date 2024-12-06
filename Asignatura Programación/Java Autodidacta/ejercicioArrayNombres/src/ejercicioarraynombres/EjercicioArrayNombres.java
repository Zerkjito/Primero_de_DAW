/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarraynombres;
import java.util.Random;

/**
 *
 * @author zerkje
 */
public class EjercicioArrayNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        String[] nombres = {"Erick", "Sofia", "Juan", "Alberto", "Jose", "Nerea", "David", "Alex", "Ernesto", "Mateo",};
        
        int randomIndex = rnd.nextInt(nombres.length);
        String nombreAleatorio = nombres[randomIndex];
        
        System.out.println(nombreAleatorio);
    }
    
}
