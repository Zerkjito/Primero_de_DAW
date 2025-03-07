/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1_05;

import java.util.Scanner;

public class POO1_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;

        //Se crea un objeto de tipo Libro con el constructor con parámetros
        Libro libro1 = new Libro("Programacion Java", "Ceballos", 1);
        //Se muestran los datos del objeto por pantalla
        System.out.println(libro1); //Se llama al método toString() de la clase Libro

        //Se crea un nuevo Libro con el constructor por defecto
        Libro libro2 = new Libro();
        //Se introducen los datos por teclado
        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = sc.nextInt();

        //Se asignan los datos introducidos por tecldo a los atributos del objeto
        //Se utilizan los métodos set
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);

        //Se muestran los datos de libro1 utilizando los métodos get
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();

        //Se realiza un préstamo de libro1
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }

        //Se realiza una devolución de libro1
        if (libro1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
        }

        //Se realiza un préstamo de libro1
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }

        //Se realiza un préstamo de libro1
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }

        //Se muestran los datos de libro1 utilizando los métodos get
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();

        //Se muestran los datos de libro1 utilizando los métodos get
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplares());
        System.out.println("Prestados: " + libro2.getPrestados());
        System.out.println();
    }

}
