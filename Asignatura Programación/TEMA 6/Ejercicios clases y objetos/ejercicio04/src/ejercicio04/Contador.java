/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author zerkje
 */
class Contador {

    private int cont;

    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    public Contador(Contador c) {
        this.cont = c.cont;
    }

    public Contador() {
    }

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
        this.cont += 1;
    }

    public void decrementar() {
        if (this.cont > 0) {
            this.cont -= 1;
        }
    }

}
