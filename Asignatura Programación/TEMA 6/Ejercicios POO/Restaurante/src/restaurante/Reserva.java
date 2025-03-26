/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author Erick
 */
public class Reserva {
    private String nombreCliente;
    private String fecha;
    private Mesa mesa;

    public Reserva(String nombreCliente, String fecha, Mesa mesa) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.mesa = mesa;
    }

    public Reserva() {
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva{");
        sb.append("nombreCliente=").append(nombreCliente);
        sb.append(", fecha=").append(fecha);
        sb.append(", mesa=").append(mesa);
        return sb.toString();
    }
    
    
    
}
