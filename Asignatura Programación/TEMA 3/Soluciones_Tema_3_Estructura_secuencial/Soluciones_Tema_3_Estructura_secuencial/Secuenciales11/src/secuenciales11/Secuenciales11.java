/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciales11;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Secuenciales11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, volumen;

        System.out.print("Introduzca radio de la esfera: ");
        radio = sc.nextDouble();

        volumen = 4.0 / 3 * Math.PI * Math.pow(radio, 3);
        //!!!Ojo!!!!!! con la división 4/3 Si lo hacemos así da 1 (uno) por que dividimos dos enteros
        //por eso se debe poner al menos uno de los números como double por ejemplo 4.0 para
        //que el resultado sea de tipo double. También podríamos poner 4/3.0

        System.out.println("Volumen de la esfera de radio " + radio + " = " + volumen);
    }

}
