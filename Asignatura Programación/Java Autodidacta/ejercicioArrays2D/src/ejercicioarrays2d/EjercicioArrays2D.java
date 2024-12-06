/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarrays2d;

/**
 *
 * @author zerkje
 */
public class EjercicioArrays2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] coches = new String[3][3];
        coches[0][0] = "Mazda";
        coches[0][1] = "Seat";
        coches[0][2] = "Toyota";
        coches[1][0] = "Ferrari";
        coches[1][1] = "Corvette";
        coches[1][2] = "Fiat";
        coches[2][0] = "Dacia";
        coches[2][1] = "Mustang";
        coches[2][2] = "Citroen";
        
        for (int i = 0; i < coches.length; i++) {
            System.out.println();
            for (int j = 0; j < coches[i].length; j++) {
                System.out.print(coches[i][j] + " ");
            }
        } 
    }
    
}
