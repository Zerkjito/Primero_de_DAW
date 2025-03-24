/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marketing;

/**
 *
 * @author Erick
 */
public class Contacto implements Comparable<Contacto>{
    private String nombre;
    private String telefono;
    private Direccion direccion;
    private int numeroDeLlamadas = 0;
    private static int limiteLlamadas = 10;

    public Contacto(String nombre, String telefono, Direccion direccion, int numeroDeLlamadas) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.numeroDeLlamadas = numeroDeLlamadas;
    }

    public Contacto() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getNumeroDeLlamadas() {
        return numeroDeLlamadas;
    }

    public void setNumeroDeLlamadas(int numeroDeLlamadas) {
        this.numeroDeLlamadas = numeroDeLlamadas;
    }

    public static int getLimiteLlamadas() {
        return limiteLlamadas;
    }

    public static void setLimiteLlamadas(int limiteLlamadas) {
        Contacto.limiteLlamadas = limiteLlamadas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contacto{");
        sb.append("nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append(", direccion=").append(direccion);
        sb.append(", numeroDeLlamadas=").append(numeroDeLlamadas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Contacto o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
    
    
    
}
