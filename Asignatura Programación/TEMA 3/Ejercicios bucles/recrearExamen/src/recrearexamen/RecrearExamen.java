/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recrearexamen;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class RecrearExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos, edad, contador30 = 0, contador18principio = 0, contador18alFinal = 0, suma = 0, contador18 = 0;
        boolean tiene18 = false;
        
        do {
            System.out.print("Introduce la cantidad de alumnos (Minimo 5): ");
            alumnos = sc.nextInt();
        } while (alumnos < 5);
        for (int i = 1; i <= alumnos; i++) {
            System.out.print("Introduce la edad del alumno " + i + ": ");
            edad = sc.nextInt();
            while (edad < 15) {
                System.out.print("Introduce la edad correcta para el alumno " + i + ": ");
                edad = sc.nextInt();
            }
            suma = suma + edad;
            if (edad >= 18) {
                contador18++;
            }
            
            if (i <= 5 && edad == 18) {
                contador18principio++;
            } else if (i < alumnos && i >= alumnos - 5 && edad == 18) {
                contador18alFinal++;
            }
            
            if (edad > 30) {
                contador30++;
            }
        }
        System.out.println("La media de las edades introducidas es: " + suma / alumnos);
        if (contador30 > 0) {
            System.out.println("Hay personas de mas de 30 años");
        } else {
            System.out.println("No hay nadie de mas de 30 años");
        }
        if (contador18principio > 0) {
            System.out.println("Entre los 5 primeros alumnos introducidos hay alguien que tiene 18 años");
        } else if (contador18alFinal > 0) {
            System.out.println("Entre los 5 ultimos alumnos introducidos hay alguien que tiene 18 años");
        } else {
            System.out.println("Ni entre los 5 primeros ni 5 ultimos hay alumnos que tienen 18 años");
        }
        if (contador18 > 0) {
            System.out.println("Hay alumnos que tienen mas de 18 años");
        } else {
            System.out.println("Ningun alumno es mayor de edad");
        }
        if (contador18 == alumnos) {
            System.out.println("Todos los alumnos son mayores de edad");
        }
    }
    
}
