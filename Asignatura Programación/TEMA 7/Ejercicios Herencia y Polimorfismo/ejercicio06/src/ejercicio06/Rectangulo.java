/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Erick
 */
public class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{ " + "lado 1 = " + lado1 + ", lado 2 = " + lado2 + '}';
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }

    @Override
    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo:\n").append("Numero de lados: ").append(getNumLados());
        sb.append("\nLado 1: ").append(lado1);
        sb.append("\nLado 2: ").append(lado2);
        
    }

}
