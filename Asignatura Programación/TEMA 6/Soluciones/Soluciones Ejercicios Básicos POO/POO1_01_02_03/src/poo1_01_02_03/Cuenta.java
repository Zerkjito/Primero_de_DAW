/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1_01_02_03;

/**
 *
 * @author Lliurex
 */
public class Cuenta {

    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Constructor por defecto
    public Cuenta() {
    }

    //Constructor con parámetros
    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    //Constructor copia
    public Cuenta(Cuenta c) {
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    // getters/setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //método ingreso
    public boolean ingreso(double importe) {
        if (importe < 0) {
            return false;
        }
        saldo += importe;
        return true;
    }

    //método reintegro para sacar dinero de la cuenta
    public boolean reintegro(double importe) {
        if (importe < 0 || saldo < importe) {
            return false;
        }
        saldo -= importe;
        return true;
    }

    //método transferencia
    //este método es el que se pide que se añada a la clase en el ejercicio 3
    public boolean transferencia(Cuenta c, double importe) {
        if (this.reintegro(importe)) {
            c.ingreso(importe);
            return true;
        }
        return false;
    }
}
