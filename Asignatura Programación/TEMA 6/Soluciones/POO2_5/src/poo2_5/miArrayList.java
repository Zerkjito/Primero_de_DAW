package poo2_5;

import java.util.Arrays;
import java.util.Comparator;

public class miArrayList {

    private Cuenta[] array;
    private int indice;

    //Constructor por defecto.
    //Crea un array de 20 elementos
    public miArrayList() {
        this.array = new Cuenta[20];
    }

    //Constructor que crea un array de n elementos
    public miArrayList(int n) {
        if (n < 1) {
            n = 20;
        }
        this.array = new Cuenta[n];
    }

    //constructor copia
    public miArrayList(miArrayList a) {
        this.array = new Cuenta[a.array.length + 20];
        this.indice = a.indice;
        for (int i = 0; i < indice; i++) {
            array[i] = new Cuenta(a.get(i));
        }
    }

    //insertar un elemento al final
    //si no hay espacio se aumenta el array
    public void add(Cuenta a) {
        if (indice == array.length) {
            aumentarElementos();
        }
        array[indice] = new Cuenta(a);
        indice++;
    }

    //aumentar el tamaño del array en 20 elementos
    //método privado
    private void aumentarElementos() {
        Cuenta[] aux = new Cuenta[array.length + 20];
        for (int i = 0; i < indice; i++) {
            aux[i] = array[i];
        }
        array = aux;
    }

    //insertar un elemento en una posición.
    public void add(int posicion, Cuenta a) {
        if (indice == array.length) { //aumentar tamaño si no hay espacio
            aumentarElementos();
        }
        if (posicion > indice) {//si la posición a insertar es mayor que la última posición se añade al final
            array[indice] = new Cuenta(a);
            indice++;
        } else {
            for (int i = indice; i > posicion; i--) {
                array[i] = array[i - 1];
            }
            array[posicion] = new Cuenta(a);
            indice++;
        }
    }

    //comprobar si el array contiene un elemento
    public boolean contains(Cuenta a) {
        for (int i = 0; i < indice; i++) {
            if (array[i].equals(a)) {
                return true;
            }
        }
        return false;
    }

    //eliminar un elemento del array
    public boolean remove(Cuenta a) {
        int posicion = indexOf(a);
        if (posicion != -1) {
            for (int i = posicion; i < indice; i++) {
                array[i] = array[i + 1];
            }
            indice--;
            return true;
        }
        return false;
    }

    //posición de un elemento
    public int indexOf(Cuenta a) {
        for (int i = 0; i < indice; i++) {
            if (array[i].equals(a)) {
                return i;
            }
        }
        return -1;

    }

    //número de elementos del array
    public int size() {
        return indice;
    }

    //eliminar todos los elementos del array
    public void clear() {
        indice = 0;
    }

    //asignar un valor a una posición
    public boolean set(int posicion, Cuenta a) {
        if (posicion >= 0 && posicion < indice) {
            array[posicion].setNombre(a.getNombre());
            array[posicion].setNumeroCuenta(a.getNumeroCuenta());
            array[posicion].setSaldo(a.getSaldo());
            array[posicion].setTipoInteres(a.getTipoInteres());
            return true;
        }
        return false;
    }

    //devolver el elemento que se encuentra en una posicion
    //si la posición no es válida devuelve el último elemento.
    public Cuenta get(int posicion) {
        if (posicion >= 0 && posicion < indice) {
            return array[posicion];
        } else {
            return array[indice - 1];
        }
    }

    //Ordenar las cuentas por saldo de mayor a menor
    public void sort() {
        
        
        Arrays.sort(array, 0, indice, new Comparator<Cuenta>(){
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                return Double.compare(o2.getSaldo(), o1.getSaldo());               
//------->>> la instrucción anterior es equivalente a este if   
//
//                if(o2.getSaldo() > o1.getSaldo()){
//                    return 1;
//                }else if(o2.getSaldo() < o1.getSaldo()){
//                    return -1;
//                }else{
//                    return 0;
//                }
//
////////////////////////////////////////////////////////////////////
            }           
        });
//////////////////////////////////////////////////////////////////////////////        
//--->>>> También podemos ordenador por el método de la burbuja       
//        Cuenta aux;
//        for (int i = 0; i < indice; i++) {
//            for (int j = 0; j < indice - i - 1; j++) {
//                if (array[j + 1].getSaldo() > array[j].getSaldo()) {
//                    aux = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = aux;
//                }
//            }
//        }
        
    }

    //Devuelve un String que contiene todas las cuentas
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indice; i++) {
            sb.append(array[i]);
            sb.append("\n");
        }
        return sb.toString();
    }
}
