/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1_06;

import java.util.Scanner;

public class POO1_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        
        //Se crean dos objetos de tipo Dado
        Dados dados1 = new Dados();
        Dados dados2 = new Dados();
        
        //Se muestra el contenido de dados1
        System.out.println("pareja dados1: " + dados1.getDado1() + " " + dados1.getDado2());
        //Se muestra el contenido de dados2
        System.out.println("pareja dados2: " + dados2.getDado1() + " " + dados2.getDado2());
        
        //se lanzan los dados del objeto dados1
        dados1.lanzamiento();
        
        //se muestra dados1 después del lanzamiento
        System.out.println("pareja dados1: " + dados1.getDado1() + " " + dados1.getDado2());
        System.out.println("suma pareja dados1: " + dados1.Suma());
        
        //se lanzan los dados del objeto dados2
        dados2.lanzamiento();
        
        //se muestra dados2 después del lanzamiento
        System.out.println("pareja dados2: " + dados2.getDado1() + " " + dados2.getDado2());
        System.out.println("suma pareja dados2: " + dados2.Suma());
        
        //Se lanza dados1 n veces y se muestra el resultado de cada lanzamiento
        System.out.print("\nIntroduzca número de lanzamientos: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            dados1.lanzamiento();
            System.out.println("lanzamiento " + i + ": " + dados1.getDado1() + " " + dados1.getDado2());
        }
    }
    
}
