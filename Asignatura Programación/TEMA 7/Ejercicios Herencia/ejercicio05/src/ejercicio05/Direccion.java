/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Erick
 */
public class Direccion {
    private String calle;
    private int numero;
    private String puerta;
    private String poblacion;
    private String provincia;

    public Direccion(String calle, int numero, String puerta, String poblacion, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.puerta = puerta;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        sb.append("Calle: ").append(calle).append("\n");
        sb.append("Numero: ").append(numero).append("\n");
        sb.append("Puerta: ").append(puerta).append("\n");
        sb.append("Poblacion: ").append(poblacion).append("\n");
        sb.append("Provincia: ").append(provincia);
        return sb.toString();
    }
    
    
}
