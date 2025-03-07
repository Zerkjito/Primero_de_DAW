/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1_06;

import java.util.Random;

public class Dados {
    private int dado1, dado2;

    //Constructor por defecto
    //Cuando se crea el objeto se asignan valores aleatorios a dado1 y dado2
    public Dados() {
        this.lanzamiento();
    }

    //Métodos get
    public int getDado1() {
        return dado1;
    }

    public int getDado2() {
        return dado2;
    }

    //---> Esta clase no tiene métodos set porque no queremos que se le pueda
    //     asignar valores a los datos mediante el método set
    //     La única forma de que los dados tomen valores es mediante
    //     el método lanzamiento()
    
    //método lanzamiento
    //Simular el lanzamiento de dos dados
    //Se obtienen dos números aleatorios entre 1 y 6
    public void lanzamiento() {
        Random rnd = new Random();
        dado1 = rnd.nextInt(1, 7);
        dado2 = rnd.nextInt(1, 7);
    }

    //devuelve la suma de los dos datos
    public int Suma() {
        return dado1 + dado2;

    }
}
