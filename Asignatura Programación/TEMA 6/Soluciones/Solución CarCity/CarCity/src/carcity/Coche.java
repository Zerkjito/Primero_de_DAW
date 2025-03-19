package carcity;

import java.util.Objects;

public class Coche implements Comparable<Coche> {

    private Matricula matricula;
    private int añoMatriculacion;
    private String marca;
    private boolean electrico;

    public Coche() {
        matricula = new Matricula(); ///los atributos de la clase que son objetos se crean en el constructor
    }

    public Coche(Matricula matricula, int añoMatriculacion, boolean electrico, String marca) {
        this.matricula = new Matricula(matricula);   ///se crea un nuevo objeto Matrícula con el constructor copia y se asigna la dirección de memoria al atributo matricula
        this.añoMatriculacion = añoMatriculacion;
        this.electrico = electrico;
        this.marca = marca;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public int getAñoMatriculacion() {
        return añoMatriculacion;
    }

    public void setAñoMatriculacion(int añoMatriculacion) {
        this.añoMatriculacion = añoMatriculacion;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coche other = (Coche) obj;
        if (!this.matricula.equals(other.matricula)) { //se llama al métod equals de la clase Matricula
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Coche t) { //ordenado de mayor a menor año de matriculación
        return t.añoMatriculacion - this.añoMatriculacion;
        
///----->>    La instrucción return anterior es equivalente a escribir esto:
//            if(this.añoMatriculacion < t.añoMatriculacion){
//                return 1;
//            }else if(this.añoMatriculacion > t.añoMatriculacion){
//                return -1;
//            }else{
//                return 0;
//            }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(matricula);
        sb.append(" ");
        sb.append(marca);
        sb.append(" ");
        sb.append(añoMatriculacion);
        sb.append(" ");
        if (electrico) {
            sb.append("eléctrico");
        } else {
            sb.append("combustible");
        }
        return sb.toString();
    }

}
