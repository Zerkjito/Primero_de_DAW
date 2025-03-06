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

    public boolean ingresarSaldo(double cantidadIngresada) {
        if (cantidadIngresada <= 0) {
            System.out.println("\nError: No puedes ingresar una cantidad negativa.");
            return false;
        }
        this.saldo += cantidadIngresada;
        System.out.println("\nSaldo ingresado correctamente: " + cantidadIngresada);
        return true;
    }

    public boolean realizarReintegro(double cantidadRetirada) {
        if (cantidadRetirada > saldo) {
            System.out.println("\nError: Saldo insuficiente. Tu saldo actual es " + this.saldo);
            return false;
        }
        this.saldo -= cantidadRetirada;
        System.out.println("\nRetiro exitoso: " + cantidadRetirada);
        return true;
    }

    public boolean transferencia(Cuenta cuenta, double importe) {
        if (cuenta == null || importe <= 0 || importe > this.saldo) {
            System.out.println(
                    cuenta == null ? "Error: Cuenta no valida"
                            : importe <= 0 ? "Error: El importe debe ser mayor a 0."
                                    : "Error: Saldo insuficiente para realizar la transferencia."
            );
            return false;
        }

        this.saldo -= importe;
        cuenta.ingresarSaldo(importe);

        System.out.println("Transferencia de " + importe + " EUR realizada exitosamente.");
        return true;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nomCliente=" + nomCliente + ", numCuenta=" + numCuenta + ", interes=" + interes + ", saldo=" + saldo + '}';
    }

}
