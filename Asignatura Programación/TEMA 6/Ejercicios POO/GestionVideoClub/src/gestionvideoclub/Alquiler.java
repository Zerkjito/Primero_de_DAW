/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvideoclub;

/**
 *
 * @author zerkje
 */
public class Alquiler {
    private String nombreCliente;
    private String codigoPelicula;
    private String fechaAlquiler;

    public Alquiler(String nombreCliente, String codigoPelicula, String fechaAlquiler) {
        this.nombreCliente = nombreCliente;
        this.codigoPelicula = codigoPelicula;
        this.fechaAlquiler = fechaAlquiler;
    }

    public Alquiler() {
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCodigoPelicula() {
        return codigoPelicula;
    }

    public void setCodigoPelicula(String codigoPelicula) {
        this.codigoPelicula = codigoPelicula;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("nombreCliente=").append(nombreCliente);
        sb.append(", codigoPelicula=").append(codigoPelicula);
        sb.append(", fechaAlquiler=").append(fechaAlquiler);
        return sb.toString();
    }
    
    
}
