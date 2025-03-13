/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

import java.util.Objects;

/**
 *
 * @author zerkje
 */
public class Empleado implements Comparable<Empleado>{
    private String dni;
    private String nombre;
    private double sueldoBase;
    private int horasExtras;
    private double irpf;
    private boolean casado;
    private int numHijos;
    private static double importeHoraExtra;

    public Empleado(String dni, String nombre, double sueldoBase, int horasExtras, double irpf, boolean casado, int numHijos) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.irpf = irpf;
        this.casado = casado;
        this.numHijos = numHijos;
    }

    public Empleado() {
    }

    public Empleado(String dni) {
        this.dni = dni;
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

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public static double getImporteHoraExtra() {
        return importeHoraExtra;
    }

    public static void setImporteHoraExtra(double importeHoraExtra) {
        Empleado.importeHoraExtra = importeHoraExtra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DNI: ").append(this.dni).append("\n");
        sb.append("Nombre empleado: ").append(this.nombre).append("\n");
        sb.append("Sueldo base: ").append(this.sueldoBase).append(" EUR").append("\n");
        sb.append("Horas extras del mes: ").append(this.horasExtras).append("\n");
        sb.append(String.format("Tipo IRPF: %.2f%%", this.irpf));
        String estadoCivil = this.casado ? " casado/a\n" : " soltero/a\n";
        sb.append("Estado civil: ").append(estadoCivil);
        sb.append("Numero de hijos: ").append(this.numHijos).append("\n");
        return sb.toString();
    }
    
    public double calcularHorasExtras() {
        return this.horasExtras * importeHoraExtra;
    }
    
    public double calcularSueldoBruto() {
        return this.sueldoBase + calcularHorasExtras();
    }
    
    public double calcularDescuentoIRPF() {
        double descuento = 0;
        if (this.casado) {
            descuento+=2;
        }
        
        if (this.numHijos >= 1) {
            descuento+=this.numHijos;
        }
        
        descuento = Math.max(this.irpf - descuento, 0); // buena práctica para garantizar que el valor irpf no se vuelva negativo
        return this.sueldoBase * (1 - descuento / 100);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return this.dni.equals(other.dni);
    }

    @Override
    public int compareTo(Empleado o) {
        return Double.compare(this.sueldoBase, o.getSueldoBase());
    }

}
