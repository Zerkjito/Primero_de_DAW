/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

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
    
    private void leeer() {
        int dni;
        Pattern pattern = Pattern.compile("[0-9]{6}");
        System.out.print("Introduce el numero de DNI: ");
        
    }
    
}
