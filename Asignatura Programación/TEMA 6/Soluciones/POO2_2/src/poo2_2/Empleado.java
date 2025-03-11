package poo2_2;

import java.util.Objects;

public class Empleado implements Comparable<Empleado>{

    private static double pagoPorHoraExtra; //atributo static o de clase
    private String dni;
    private String nombre;
    private double sueldoBase;
    private int horasExtras;
    private double tipoIRPF;
    private char casado;  // S ó N
    private int numeroHijos;

    //constructor por defecto
    public Empleado() {
    }

    //constructor con el parámetro dni
    public Empleado(String dni) {
        this.dni = dni;
    }

    //getters-setters
    public static double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        Empleado.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public char getCasado() {
        return casado;
    }

    public void setCasado(char casado) {
        this.casado = casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    //método para calcular el importe a cobrar por las horas extras
    public double calcularImporteHorasExtras() {
        return horasExtras * pagoPorHoraExtra;
    }

    //método para calcular el sueldo bruto
    public double calcularSueldoBruto() {
        return sueldoBase + calcularImporteHorasExtras();
    }

    //método para calcular la retención por IRPF
    public double calcularRetencionIrpf() {
        double tipo = tipoIRPF;
        if (casado == 's' || casado == 'S') {
            tipo = tipo - 2;
        }
        tipo = tipo - numeroHijos;
        if (tipo < 0) {
            tipo = 0;
        }
        return calcularSueldoBruto() * tipo / 100;
    }

    //método para calcular el importe a cobrar por el empleado
    public double calcularSueldo() {
        return calcularSueldoBruto() - calcularRetencionIrpf();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dni);
        sb.append(" ");
        sb.append(nombre);
        sb.append("\nSueldo Base: ");
        sb.append(sueldoBase);
        sb.append("\nHoras Extras: ");
        sb.append(horasExtras);
        sb.append("\nTipo IRPF: ");
        sb.append(tipoIRPF);
        sb.append("\nCasado: ");
        sb.append(casado);
        sb.append("\nNúmero de Hijos: ");
        sb.append(numeroHijos);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return this.dni.equalsIgnoreCase(other.dni);
    }

    @Override
    public int compareTo(Empleado o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    

}
