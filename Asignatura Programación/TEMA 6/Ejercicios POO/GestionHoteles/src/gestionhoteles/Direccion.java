/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionhoteles;

/**
 *
 * @author Erick
 */
public class Direccion {
    private String ciudad;
    private String pais;

    public Direccion(String ciudad, String pais) {
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public Direccion() {
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Direccion{");
        sb.append("ciudad=").append(ciudad);
        sb.append(", pais=").append(pais);
        return sb.toString();
    }
    
    
}
