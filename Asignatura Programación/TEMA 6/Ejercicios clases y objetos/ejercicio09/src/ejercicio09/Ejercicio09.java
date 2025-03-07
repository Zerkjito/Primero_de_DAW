/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author zerkje
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Password pass1 = new Password();
        Password pass2 = new Password();
        Password pass3 = new Password();
        Password pass4 = new Password();
        Password pass5 = new Password();
        System.out.println(pass1);
        if (pass1.esFuerte(pass1.getPass())) {
            System.out.println("Es fuerte");
        } else {
            System.out.println("No es fuerte");
        }
        pass1.modificarContrasenya();
        System.out.println("Password de Usuario 1 despues de actualizarla: " + pass1.getPass());

        System.out.println("\n" + pass2);
        if (pass1.esFuerte(pass2.getPass())) {
            System.out.println("Es fuerte");
        } else {
            System.out.println("No es fuerte");
        }

        System.out.println("\n" + pass3);
        if (pass1.esFuerte(pass3.getPass())) {
            System.out.println("Es fuerte");
        } else {
            System.out.println("No es fuerte");
        }

        System.out.println("\n" + pass4);
        if (pass1.esFuerte(pass4.getPass())) {
            System.out.println("Es fuerte");
        } else {
            System.out.println("No es fuerte");
        }

        System.out.println("\n" + pass5);
        if (pass1.esFuerte(pass5.getPass())) {
            System.out.println("Es fuerte");
        } else {
            System.out.println("No es fuerte");
        }
    }

}
