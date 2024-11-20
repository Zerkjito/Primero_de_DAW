/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados15;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Avanzados15 {

    public static void main(String[] args) {
        double n1, n2;
        int opcion;
        char continuar;
        Scanner sc = new Scanner(System.in);
        do {   //se repite todo el proceso hasta que continuar == 'N'
            System.out.print("Introduce primer numero: ");
            n1 = sc.nextDouble();
            System.out.print("Introduce segundo numero: ");
            n2 = sc.nextDouble();

            do {  //se repiten operaciones con los mismos números tantas veces como se quiera

                do {  //se introduce la operación a realizar y se comprueba que la opción introducida sea correcta
                    System.out.println("1 -> Suma");
                    System.out.println("2 -> Resta");
                    System.out.println("3 -> Multiplicacion");
                    System.out.println("4 -> Division");
                    System.out.print("Elige opcion: ");
                    opcion = sc.nextInt();
                    if (opcion < 1 || opcion > 4) {
                        System.out.println("Opción no válida");
                    }
                } while (opcion < 1 || opcion > 4);

                switch (opcion) {//según la opción introducida realizamos la operación correspondiente
                    case 1 -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    case 2 -> System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    case 3 -> System.out.println(n1 + " * " + n2 + " = " + n1 * n2);
                    case 4 -> {
                        if (n2 != 0) {
                            System.out.println(n1 + " / " + n2 + " = " + n1 / n2);
                        } else {
                            System.out.println("Error. No se puede dividir por cero");
                        }
                    }
                }

                sc.nextLine();//limpiamos el buffer. Es necesario hacerlo aquí antes de hacer la lectura
                //del carácter para poder eliminar los intro que quedan en el buffer.
                //Si no lo limpiamos nos tomará como carácter estos intro que han quedado después
                //de introducir los números enteros anteriores y el programa no funcionará correctamente

                do { //preguntamos si quiere realizar otra operación con los mismos números
                    System.out.print("Otra operacion con los mismos números(S/N)?: ");
                    continuar = sc.nextLine().charAt(0);
                    continuar = Character.toUpperCase(continuar);//pasamos el carácter leído a mayúsculas
                } while (continuar != 'S' && continuar != 'N'); //se controla que solo sean válidos los caracteres S o N

            } while (continuar == 'S'); //si continuar es igual a 'S' se vuelve a hacer otra operación con los mismos números

            do {//se pregunta si queremos volver a introducir otros dos números
                System.out.print("Leer mas numeros (S/N)?: ");
                continuar = sc.nextLine().charAt(0);
                continuar = Character.toUpperCase(continuar);//pasamos el carácter leído a mayúsculas
            } while (continuar != 'S' && continuar != 'N'); //se controla que solo sean válidos los caracteres S o N

        } while (continuar == 'S'); //si continuar es igual a 'S' se vuelven a leer dos números y se repite todo el proceso
    }
}
