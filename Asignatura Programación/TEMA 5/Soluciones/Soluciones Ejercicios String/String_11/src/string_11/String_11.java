/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_11;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class String_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        boolean correcto;
        do {
            correcto = true;
            System.out.print("Introduce un número entero: ");
            s = sc.nextLine();
            if (s.isBlank() || !numeroValido(s)) {
                System.out.println("Número entero no válido");
                correcto = false;
            }
        } while (!correcto);
        
        s = separarMiles(s);//Este método es el que pide el ejercicio
        
        System.out.println("Número modificado: " + s);
    }
    
    
    //--->>> Este es el método que pide el ejercicio
    public static String separarMiles(String s) {
        //Creamos un StringBuilder a partir del String s que se recibe como parámetro
        StringBuilder sb = new StringBuilder(s);
        //le damos la vuelta 
        sb.reverse();
        //insertamos un primer punto '.'  en la posición 3 del StringBuilder
        //y seguimos insertando puntos cada 4 posiciones mientras sea posible
        int posicion = 3;
        while (posicion < sb.length()) {
            sb.insert(posicion, '.');
            posicion += 4;
        }
        //le volvemos a dar la vuelta para 
        sb.reverse();

        //Se convierte el StringBuilder a String y se devuelve
        return sb.toString();
    }
    
    //Método para comprobar que el String solo contiene dígitos
    public static boolean numeroValido(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }

//---> Forma alternativa de realizar el método anterior
//---> Utilizando el método Character.isDigit
//---> Este método devuelve true si el carácter que se le envía es un dígito
//---> devuelve false en caso contrario
//    
//    public static boolean numeroValido(String s){
//        for(int i = 0; i < s.length(); i++){
//            if(!Character.isDigit(s.charAt(i))){
//                return false;
//            }
//        }
//        return true;
//    }
}
    
