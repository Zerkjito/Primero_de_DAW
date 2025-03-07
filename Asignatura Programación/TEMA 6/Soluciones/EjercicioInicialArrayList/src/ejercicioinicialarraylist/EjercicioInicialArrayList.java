/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioinicialarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class EjercicioInicialArrayList {

    //1. Crea un ArrayList de tipo Coche. La clase Coche es la que se creó en el ejercicio inicial.
    static ArrayList<Coche> coches = new ArrayList<>();

    public static void main(String[] args) {
        //2. Añade al Arraylist objetos de tipo Coche. Los datos de los coches se introducen por teclado.
        añadirCoches();
        //4. Muestra por pantalla un listado de todos los coches ordenado alfabéticamente por marca.
        mostrarCoches();
    }

    public static void añadirCoches() {
        Scanner sc = new Scanner(System.in);
        String matricula, marca;
        int N, año, tipo;
        boolean electrico, repetido;
        do {
            System.out.print("Número de coches: ");
            N = sc.nextInt();
        } while (N < 1);
        for (int i = 1; i <= N; i++) {
            sc.nextLine(); //limpiar buffer 
            System.out.println("Coche " + i);
            Coche c = new Coche(); //creamos un objeto Coche
            //se piden los datos del coche por teclado
            do {
                //primero la matrícula
                System.out.print("Matricula: ");
                matricula = sc.nextLine();

                //3. Comprobamos que ningún coche del ArrayList tenga esa matrícula
                //Asignamos esta matrícula al coche creado
                c.setMatricula(matricula);

                repetido = false; //variable que nos sirve para volver a pedir la matrícula o no

                //utilizamos el método contains de ArrayList para comprobar si el ArrayList contiene el objeto
                //Lo que hace contains es comprobar si algún objeto del ArrayList tiene la misma matrícula que el objeto c
                //para eso necesita que la clase Coche contenga el método equals donde indicaremos que dos coches son iguales
                //si tienen la misma matrícula
                if (coches.contains(c)) {
                    System.out.println("Coche repetido");
                    repetido = true;
                }

            } while (repetido);

            //Leemos el resto de datos del coche
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
            //asignamos el resto de datos al objeto
            c.setMarca(marca);
            c.setAñoMatriculacion(año);
            c.setElectrico(electrico);

            //se añade el objeto al ArrayList
            coches.add(c);
        }
    }

    public static void mostrarCoches() {
        //Para ordenar el ArrayList se puede utilizar la instrucción Collections.sort(coches).
        //Para que el método sort sepa que debe ordenar por el atributo marca, la clase Coche debe
        //implementar la interface Comparable y debe indicar en el método compareTo que la ordenación es
        //por el atributo marca.
        Collections.sort(coches);
        for (Coche c : coches) {
            System.out.println(c);
        }

    }
}
