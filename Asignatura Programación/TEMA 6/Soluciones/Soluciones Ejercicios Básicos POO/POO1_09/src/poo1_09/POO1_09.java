/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1_09;

public class POO1_09 {

    public static void main(String[] args) {
        //Se crea una contraseña de longitud 12
        Password pass = new Password(12);
        //se muestra por pantalla
        System.out.println("Contraseña creada: " + pass.getContraseña());
        //Se muestra si es fuerte o no
        System.out.println(pass.esFuerte() ? "Es fuerte" : "No es fuerte");
        //Se introduce una nueva contraseña para modificar la anterior
        //Se muestra el resultado de la modificación
        if(pass.modificarContraseña()){
            System.out.println("Nueva contraseña: " + pass.getContraseña());
        }else{
            System.out.println("La contraseña introducida no es fuerte, la contraseña original no ha sido modificada: " + pass.getContraseña());
        }
    }
    
}
