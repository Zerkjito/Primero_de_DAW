/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Erick
 */
public class Nif {

    Scanner sc = new Scanner(System.in);
    private int numeros;
    private char letra;

    public Nif(int numeros) {
        this.numeros = numeros;
    }

    public Nif() {
        leer();
        calcularLetra();
    }

    private void leer() {
        int dni;
        do {
            System.out.print("Introduce 8 digitos del NIF: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida.");
                sc.nextLine();
                System.out.print("Introduce 8 digitos del DNI: ");
            }
            dni = sc.nextInt();
            if (dni > 99999999 || dni < 10000000) {
                System.out.println("Error: Debe estar formado por 8 digitos.");
            }
        } while (dni > 99999999 || dni < 10000000);
        this.numeros = dni;
        /*
        Lógica empleada para poder usarlo mediante Regex:
        String dni;
        Pattern pattern = Pattern.compile(^\\d{8}[A-Z]$); ^ -> Inicio, \\d -> un digito, {8} -> x repeticiones exactas, [A-Z] -> letras mayusculas, $ -> fin
        dowhile(!pattern.matcher(dni)); -> aqui se pide el dni y se compila con Matcher matcher = pattern.matcher(dni); , y se evalua el patron
        */
    }
    
    private void calcularLetra() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        this.letra = letras.charAt(numeros % 23);
    }

    @Override
    public String toString() {
        return "NIF: " + numeros + letra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.numeros;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Nif other = (Nif) obj;
        return this.numeros == other.numeros;
    }
    
    
    
    

}
