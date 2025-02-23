/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.ArrayList;

/**
 *
 * @author zerkje
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres  = {
            "Fernandez Soria, Eduardo",
            "Don Ruiz, Daniel",
            "Moreno Conde, Sergio",
            "Gilabert Hurtado, Laura",
            "Carrazco Gonzalez, Hugo",
            "Sanchez Contreras, Maria",
        };
        ArrayList<String> apellido1 = new ArrayList<>();
        ArrayList<String> apellido2 = new ArrayList<>();
        ArrayList<String> nombresList = new ArrayList<>();
        for (String nombreCompleto : nombres) {
            String[] partes = nombreCompleto.split(", ");
            String[] apellidos = partes[0].split(" ");
            
            apellido1.add(apellidos[0]);
            apellido2.add(apellidos.length > 1 ? apellidos[1] : "");
            nombresList.add(partes[1]);
        }
        System.out.printf("%-15s %-15s %-10s%n", "Apellido 1", "Apellido 2", "Nombre");
        System.out.println("===========================================================");
        for (int i = 0; i < apellido1.size(); i++) {
            System.out.printf("%-15s %-15s %-10s%n", apellido1.get(i), apellido2.get(i), nombresList.get(i));
        }
    }
    
}
