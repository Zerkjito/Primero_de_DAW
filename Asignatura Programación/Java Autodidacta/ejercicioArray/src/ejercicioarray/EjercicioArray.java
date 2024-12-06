/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarray;

/**
 *
 * @author zerkje
 */
public class EjercicioArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] coches = {"Mazda", "Opel", "Seat", "Porsche", "Dacia", "Volkswagen",};
        
        coches[2] = "Ferrari";
        
        for (int i = 0; i < coches.length; i++) {
            System.out.println(coches[i]);
        }
        
        /* Y aqui esta la alternativa para hacer exactamente lo mismo:
        String[] coches = new String[3]; 
        
        coches[0] = "Mazda"; 
        coches[1] = "Opel"; 
        coches[2] = "Seat"; 
        
        for (int i = 0; i < coches.length; i++) {
            System.out.println(coches[i]);
        }
        */
    }
    
}
