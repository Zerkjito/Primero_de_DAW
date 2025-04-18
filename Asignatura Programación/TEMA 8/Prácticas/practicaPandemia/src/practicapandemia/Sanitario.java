/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapandemia;

import static practicapandemia.TipoSanitario.MEDICO;

/**
 *
 * @author zerkje
 */
public class Sanitario extends Persona {

    public Sanitario(String id, int añoNacimiento, Genero genero, boolean sintomatico, TipoSanitario tipo) {
        super(id, añoNacimiento, genero, sintomatico);
        this.tipo = tipo;
    }

    private TipoSanitario tipo;

    public TipoSanitario getTipo() {
        return tipo;
    }

    public void setTipo(TipoSanitario tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sanitario{");
        sb.append("tipo=").append(tipo);
        return sb.toString();
    }

    @Override
    public String obtenerTipo() {
        return switch (this.tipo) {
            case MEDICO ->
                "MED";
            case ENFERMERO ->
                "ENF";
            case CELADOR ->
                "CEL";
            default ->
                "ERROR";
        };
    }

}
