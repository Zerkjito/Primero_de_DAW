package gstiondearticulos;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha(){
        
    }
    public Fecha(Fecha f){
        dia = f.dia;
        mes = f.mes;
        año = f.año;
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = (año > 0);
        mesCorrecto = (mes >= 1) && (mes <= 12);
        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = (dia >= 1 && dia <= 29);
                } else {
                    diaCorrecto = (dia >= 1 && dia <= 28);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = (dia >= 1 && dia <= 30);
                break;
            default:
                diaCorrecto = (dia >= 1 && dia <= 31);
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }

    private boolean esBisiesto() {
        return ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0));
    }
    
     public boolean esMayorQue(Fecha f){
        if(año > f.año) {
            return true;
        }
        else if(año==f.año && mes > f.mes) {
            return true;
        }
        else if(año==f.año && mes == f.mes && dia > f.dia) {
            return true;
        }
        return false;
    }
    
    public boolean esMenorQue(Fecha f){
        if(año < f.año) {
            return true;
        }
        else if(año==f.año && mes < f.mes) {
            return true;
        }
        else if(año==f.año && mes == f.mes && dia < f.dia) {
            return true;
        }
        return false;
    }
    
    public boolean esIgualQue(Fecha f){
        if(año == f.año && mes == f.mes && dia == f.dia) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dia);
        sb.append("/");
        sb.append(mes);
        sb.append("/");
        sb.append(año);
        return sb.toString();
    }
}
