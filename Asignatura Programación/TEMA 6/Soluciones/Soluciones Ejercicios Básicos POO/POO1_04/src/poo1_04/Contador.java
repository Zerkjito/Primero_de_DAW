/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1_04;

public class Contador {
    private int cont;

    //constructor por defecto
    public Contador() {
    }

    //constructor con parámetros
    public Contador(int n) {
        this.setCont(n);
    }

    //constructor copia
    public Contador(Contador c) {
        cont = c.cont;
    }

    //métodos get/set
    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    public void incrementar() {
        cont++;
    }

    public void decrementar() {
        cont--;
        if (cont < 0) {
            cont = 0;
        }
    }
}
