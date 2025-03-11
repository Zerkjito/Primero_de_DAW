package poo2_6;

import java.util.ArrayList;

public class Pila {

    private ArrayList<Libro> array;

    //Constructor por defecto.
    public Pila() {
        this.array = new ArrayList<>();
    }

    //añadir un elemento a la pila
    public void push(Libro a) {
        array.add(a);
    }

    //extraer un elemento a la pila
    public Libro pop() {
        if (array.isEmpty()) {
            return null;
        }
        Libro libro = array.remove(array.size() - 1);
        return libro;
    }

    //devuelve el elemento de la cima de la pila sin extraerlo
    public Libro cima() {
        if (array.isEmpty()) {
            return null;
        }
        return array.get(array.size() - 1);
    }

    //número de elementos de la pila
    public int size() {
        return array.size();
    }


    //eliminar todos los elementos de la pila
    public void clear() {
        array.clear();
    }

    //muestra todos los libros contenidos en la pila
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = array.size() - 1; i >= 0; i--) {
            sb.append(array.get(i));
            sb.append("\n\n");
        }
        return sb.toString();
    }
}
