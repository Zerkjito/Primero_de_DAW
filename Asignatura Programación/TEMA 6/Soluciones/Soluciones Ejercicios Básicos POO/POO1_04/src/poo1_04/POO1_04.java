/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1_04;

import java.util.Scanner;

public class POO1_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        //Se crea un objeto de tipo Contador con el constructor por defecto
        //El objeto se crea con el atributo cont = 0
        Contador contador1 = new Contador();

        //Introducimos un nuevo valor inicial para el contador
        System.out.print("Introduce valor para inicializar el contador: ");
        n = sc.nextInt();
        //se asigna el valor introducido al contador
        contador1.setCont(n);

        //se muestra el valor de contador1
        System.out.println("Contador1: " + contador1.getCont());
        //se incrementa contador1        
        contador1.incrementar();
        //se muestra el valor del contador
        System.out.println("Contador1 incrementado una vez: " + contador1.getCont());
        //se incrementa contador1
        contador1.incrementar();
        //se incrementa contador1
        contador1.incrementar();
        //se muestra el valor del contador
        System.out.println("Contador1 incrementado dos veces: " + contador1.getCont());
        //se decrementa contador1
        contador1.decrementar();
        //se muestra el valor del contador
        System.out.println("Contador1 decrementado una vez: " + contador1.getCont());

        //Se crea otro objeto de tipo Contador utilizando el constructor con parámetros
        //Ene ste caso se crea un contador con el valor inicial 10
        Contador contador2 = new Contador(10);
        //se muestra el valor de contador2
        System.out.println("Contador2: " + contador2.getCont());
        //se incrementa contador2
        contador2.incrementar();
        //se muestra contador2
        System.out.println("Contador2 incrementado una vez: " + contador2.getCont());

        //bucle para ver el funcionamiento de contador2
        //se decrementa contador2 15 veces
        System.out.println("Decrementando contador2 15 veces:");
        for (int i = 1; i <= 15; i++) {
            contador2.decrementar();
            System.out.print(contador2.getCont() + " ");
        }

        //se crea un nuevo objeto de tipo Contador como copia de contador2
        //Se utiliza el constructor copia
        Contador contador3 = new Contador(contador2);
        //se muestra el contenido de contador3
        System.out.println("\nContador3 copia de contador 2: " + contador3.getCont());
    }

}
