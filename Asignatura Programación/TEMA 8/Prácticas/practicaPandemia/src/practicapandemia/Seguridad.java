/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapandemia;

import static practicapandemia.TipoSanitario.CELADOR;
import static practicapandemia.TipoSanitario.ENFERMERO;
import static practicapandemia.TipoSanitario.MEDICO;

/**
 *
 * @author zerkje
 */
public class Seguridad extends Persona {

    public Seguridad(String id, int añoNacimiento, Genero genero, boolean sintomatico, TipoSeguridad tipo) {
        super(id, añoNacimiento, genero, sintomatico);
        this.tipo = tipo;
    }

    private TipoSeguridad tipo;

    public TipoSeguridad getTipo() {
        return tipo;
    }

    public void setTipo(TipoSeguridad tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Seguridad{");
        sb.append("tipo=").append(tipo);
        return sb.toString();
    }

    @Override
    public String obtenerTipo() {
        return switch (this.tipo) {
            case POLICIANACIONAL ->
                "PN";
            case POLICIALOCAL ->
                "PL";
            case GUARDIACIVIL ->
                "GC";
            default ->
                "ERROR";
        };
    }

}
