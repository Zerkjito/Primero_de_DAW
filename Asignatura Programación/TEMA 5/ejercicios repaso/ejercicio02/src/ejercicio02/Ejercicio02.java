/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author zerkje
 */
public class Ejercicio02 {

    /**
     2. Escribe un método que reciba un String que contiene NIFs y devuelva un String con los NIF ordenados de menor a
mayor. Por ejemplo, para el String: "43434321A 65473820T 33238765D 32994102X 74771234F"
El método devolverá el String: "32994102X 33238765D 43434321A 65473820T 74771234F"
     */
    public static void main(String[] args) {
        String nifs = "43434321A 65473820T 33238765D 32994102X 74771234F";
        ordenarNifs(nifs);
        System.out.println("Nifs ordenados:");
        String nifsOrd = ordenarNifs(nifs);
        System.out.println(nifsOrd);
    }
    
    public static String ordenarNifs(String nifs) {
        String[] nifsOrdenados = nifs.split(" ");
        Arrays.sort(nifsOrdenados);
        return String.join(" ", nifsOrdenados);
    }   
}
