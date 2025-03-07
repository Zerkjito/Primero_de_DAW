/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1_08;

import java.util.Scanner;

public class Nif {

    private int dni;
    private char letra;

    //Constructor por defecto
    public Nif() {
    }

    //Constructor con parámetros
    //recibe los números del DNI y obtiene la letra correspondiente
    public Nif(int dni) {
        this.dni = dni;
        letra = calcularLetra();
    }

    //Método que calcula la letra que corresponde según los dígitos del DNI
    private char calcularLetra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[dni % 23];
    }

    //Método para leer las cifras del DNI por teclado. La letra se calcula según las cifras introducidas.
    public void leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce dni: ");
            dni = sc.nextInt();
        } while (dni <= 0);
        letra = calcularLetra();
    }

    //Método para mostrar el NIF por pantalla en formato XXXXXXXX-L
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dni);
        sb.append("-");
        sb.append(letra);
        return sb.toString();
    }
}
