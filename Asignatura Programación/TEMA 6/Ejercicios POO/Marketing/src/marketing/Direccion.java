/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marketing;

/**
 *
 * @author Erick
 */
public class Direccion {
    private String poblacion;
    private String provincia;

    public Direccion(String poblacion, String provincia) {
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    public Direccion() {
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Poblacion -> ").append(this.poblacion).append("\n");
        sb.append("Provincia -> ").append(this.provincia);
        return sb.toString();
    }
    
    
}
