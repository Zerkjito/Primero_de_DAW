/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;


/**
 *
 * @author Erick
 */
public class Persona {
    private String nombre;
    private Fecha fnac;
    private String direccion;
    private String codigoPostal;
    private String ciudad;

    public Persona(String nombre, Fecha fnac, String direccion, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.fnac = fnac;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFnac() {
        return fnac;
    }

    public void setFnac(Fecha fnac) {
        this.fnac = fnac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.nombre).append("\n");
        sb.append("Fecha nacimiento: ").append(this.fnac.fechaCorta()).append("\n");
        sb.append("Direccion: C/ ").append(this.direccion).append("\n");
        sb.append(this.codigoPostal).append(" ").append(this.ciudad);
        return sb.toString();
    }
    
    
    
}


