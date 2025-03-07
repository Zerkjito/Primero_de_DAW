/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1_08;

public class POO1_08 {

    public static void main(String[] args) {
        //Se crea un NIF usando el constructor por defecto
        Nif nif1 = new Nif();
        //Se leen los dígitos del NIF por teclado
        nif1.leer();
        //Se muestra el NIF completo
        System.out.println(nif1);

        //Se crea un NIF usando el constructor con parámetros
        Nif nif2 = new Nif(12345678);
        //Se muestra el NIF completo
        System.out.println(nif2);
    }
    
}
