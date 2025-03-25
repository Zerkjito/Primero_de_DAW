/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

/**
 *
 * @author zerkje
 */
public class Ubicacion {
    private String ciudad;
    private String pais;

    public Ubicacion() {
    }

    public Ubicacion(String ciudad, String pais) {
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCuidad() {
        return ciudad;
    }

    public void setCuidad(String ciudad) {
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
        sb.append("Ciudad: ").append(this.ciudad).append("\n");
        sb.append("Pais: ").append(this.pais);
        return sb.toString();
    }
    
    
}
