/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioinicial;

import java.util.Scanner;

public class EjercicioInicial {

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.setMatricula("1234JMV");
        coche1.setMarca("Renault");
        coche1.setAñoMatriculacion(2022);
        coche1.setElectrico(true);
        Coche coche2 = new Coche("5472KMG");
        coche2.setAñoMatriculacion(2023);
        coche2.setMarca("Hyundai");
        coche2.setElectrico(true);
        Coche coche3 = new Coche("1904JNP", "Nissan", 2017, false);
        
        //Punto 2 del ejercicio
        System.out.println(coche1.getMatricula() + " " + coche1.getMarca() + " " + coche1.getAñoMatriculacion() + " Electrico: " + (coche1.isElectrico() ? "SI" : "NO"));
        System.out.println(coche2.getMatricula() + " " + coche2.getMarca() + " " + coche2.getAñoMatriculacion() + " Electrico: " + (coche2.isElectrico() ? "SI" : "NO"));
        System.out.println(coche3.getMatricula() + " " + coche3.getMarca() + " " + coche3.getAñoMatriculacion() + " Electrico: " + (coche3.isElectrico() ? "SI" : "NO"));

        //3. Crear en la clase Coche el método toString
        //Una vez creado podemos mostrar los coches de esta forma:
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
        
        //4. Crear un nuevo coche. Los datos se introducen por teclado
        
        //se piden los datos del coche por teclado
        String matricula, marca;
        int año, tipo;
        boolean electrico;
        Scanner sc = new Scanner(System.in);
        System.out.print("Matricula: ");
        matricula = sc.nextLine();
        System.out.print("Marca: ");
        marca = sc.nextLine();
        System.out.print("Año de matriculación: ");
        año = sc.nextInt();
        do {
            System.out.print("Electrico? 1-> SI 2-> NO: ");
            tipo = sc.nextInt();
        } while (tipo != 1 && tipo != 2);
        if (tipo == 1) {
            electrico = true;
        } else {
            electrico = false;
        }
        sc.nextLine();
        //se crea un nuevo coche con el constructor con parámetros
        Coche coche4 = new Coche(matricula, marca, año, electrico);
        //se muestra el coche utilizando el método toString
        System.out.println(coche4);
        
        //5. Crear un nuevo coche copia del coche anterior. Después modificar la matrícula
        //se crea un nuevo coche con el constructor copia
        Coche coche5 = new Coche(coche4);
        //se introduce una matrícula por teclado
        System.out.print("Matricula: ");
        matricula = sc.nextLine();
        //se asigna la matrícula al coche
        coche5.setMatricula(matricula);
        //se muestran los datos del coche utilizando el método toString
        System.out.println(coche5);
    }
}
