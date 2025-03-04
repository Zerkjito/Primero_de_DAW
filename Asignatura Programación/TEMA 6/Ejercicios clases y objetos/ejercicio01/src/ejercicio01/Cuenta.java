/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Erick
 */
class Cuenta {

    private String nomCliente;
    private String numCuenta;
    private double interes;
    private double saldo;

    public Cuenta(String nomCliente, String numCuenta, double interes, double saldo) {
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta c) {
        this(c.nomCliente, c.numCuenta, c.interes, c.saldo);
    }
    
    public Cuenta() {
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nomCliente=" + nomCliente + ", numCuenta=" + numCuenta + ", interes=" + interes + ", saldo=" + saldo + '}';
    }
    
    

}
