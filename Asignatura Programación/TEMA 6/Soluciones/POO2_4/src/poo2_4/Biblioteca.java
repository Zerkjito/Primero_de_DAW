package poo2_4;

import java.util.Arrays;

public class Biblioteca {

    private Libro[] libros;
    private int indice;

    //constructor por defecto
    //crea el array de 100 elementos
    public Biblioteca() {
        libros = new Libro[100];
    }

    //métodos getters-setters
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Libro[] getLibros() {
        return libros;
    }

    //método que comprueba si hay espacio en el array para más libros
    public boolean hayEspacio() {
        return indice < libros.length;
    }

    //método que comnprueba si hay libros en la biblioteca
    public boolean hayLibros() {
        return indice > 0;
    }

    //método para añadir un nuevo libro en el array
    //se debe comprobar si hay espacio para poder añadir el libro
    //el libro se añade en la siguiente posición libre del array
    //devuelve true si se ha añadido y false en caso contrario
    public boolean nuevoLibro(Libro libro) {
        if (hayEspacio()) {
            libros[indice] = new Libro(libro);
            indice++;
            return true;
        }
        return false;
    }

    //método para eliminar un libro por referencia
    //recibe la referencia del libro a eliminar
    //eliminar del array significa desplazar una posición a la izquierda 
    //todos los elementos que se encuentren a continuación del libro a eliminar
    //se debe comprobar que la referencia exista
    //devuelve true si se ha eliminado el libro. 
    //devuelve false si no se ha podido eliminar
    public boolean eliminar(String referencia) {
        int pos = posicionDe(referencia);
        if (pos == -1) {
            return false;
        } else {
            for (int i = pos; i < indice; i++) {
                libros[i] = libros[i + 1];
            }
            indice--;
            return true;
        }
    }

    //método para eliminar un libro utilizando su posición dentro del array
    //recibe la posición del libro a eliminar
    //eliminar del array significa desplazar una posición a la izquierda 
    //todos los elementos que se encuentren a continuación del libro a eliminar
    //se debe comprobar que la posición sea válida
    //devuelve true si se ha eliminado el libro. 
    //devuelve false si no se ha podido eliminar
    public boolean eliminar(int posicion) {
        int i;
        if (posicion >= 0 && posicion < indice) {
            for (i = posicion; i < indice; i++) {
                libros[i] = libros[i + 1];
            }
            indice--;
            return true;
        }
        return false;
    }

    //método que devuelve la cantidad de libros disponibles para prestar
    public int disponibles() {
        int i, cont = 0;
        for (i = 0; i < indice; i++) {
            if (libros[i].estaDisponible()) {
                cont++;
            }
        }
        return cont;
    }

    //Devuelve la posición dentro del array del libro con esa referencia. 
    //Devuelve -1 si no lo encuentra
    public int posicionDe(String referencia) {
        int i;
        for (i = 0; i < indice; i++) {
            if (libros[i].getReferencia().equalsIgnoreCase(referencia)) {
                return i;
            }
        }
        return -1;
    }

    //Devuelve true si el array contiene un libro con esa referencia.
    public boolean contiene(String referencia) {
        return posicionDe(referencia) != -1;
    }

    //Método que devuelve el libro que tiene esa referencia. 
    //Devuelve null si el libro no existe
    public Libro get(String referencia) {
        int i = posicionDe(referencia);
        if (i != -1) {
            return libros[i];
        }
        return null;
    }


    public void ordenar() {
        //ordenar el array libros por orden alfabético del título
        //Para poder utilizar Arrays.sort la clase Libro debe implementar 
        //la interface Comparable para indicar que se ordena por título
        //El array libros se ordena desde el primer elemento hasta el elemento 
        //indicado por indice que son los libros reales que contiene el array
        Arrays.sort(libros, 0, indice);
//
//--->>> También podemos ordenar el array libros utilizando un método de ordenación, por ejemplo, el burbuja
//       En ese caso no es necesario el compareTo de la clase Libro
//
//        Libro aux;
//        for (int i = 0; i < indice - 1; i++) {
//            for (int j = 0; j < indice - i - 1; j++) {
//                if (libros[j + 1].getTitulo().compareToIgnoreCase(libros[j].getTitulo()) < 0) {
//                    aux = libros[j + 1];
//                    libros[j + 1] = libros[j];
//                    libros[j] = aux;
//                }
//            }
//        }
    }

    //método para mostrar los libros disponibles en la biblioteca
    public void mostrarDisponibles() {
        for (int i = 0; i < indice; i++) {
            if (libros[i].estaDisponible()) {
                System.out.println(libros[i]);
                System.out.println();
            }
        }
    }
    
    //método que devuelve un String con todos los libros de la biblioteca
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indice; i++) {
            sb.append(libros[i]);
            sb.append("\n\n");
        }
        return sb.toString();
    }

}
