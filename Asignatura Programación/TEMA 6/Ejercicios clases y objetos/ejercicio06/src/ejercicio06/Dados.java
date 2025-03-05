/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

import java.util.Random;

/**
 *
 * @author zerkje
 */
class Dados {

    Random rnd = new Random();
    private int n1;
    private int n2;

    public Dados() {
        this.n1 = rnd.nextInt(1, 7);
        this.n2 = rnd.nextInt(1, 7);
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void lanzamiento() {
        int resultado = suma();
        resultadoN1();
        resultadoN2();
        System.out.println("Resultado de la tirada: " + resultado);
    }

    public int suma() {
        return n1 + n2;
    }

    public void resultadoN1() {
        System.out.println("Resultado del dado 1: " + this.n1);
    }

    public void resultadoN2() {
        System.out.println("Resultado del dado 2: " + this.n2);
    }
}
