/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvideoclub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author zerkje
 */
public class VideoClub {

    private Pelicula[] peliculas = new Pelicula[100];
    private ArrayList<Alquiler> alquileres = new ArrayList<>();
    private int indice;

    public VideoClub(int indice) {
        this.indice = indice;
    }

    public VideoClub() {
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public boolean agregarPelicula(Pelicula p) {
        if (indice < peliculas.length) {
            peliculas[indice] = p;
            indice++;
            System.out.println("Pelicula agregada correctamente.");
            return true;
        }
        System.out.println("No hay espacio disponible actualmente.");
        return false;
    }

    public boolean eliminarPeliculaPorCodigo(String codigo) {
        if (indice == 0) {
            System.out.println("VideoClub vacio actualmente. ");
            return false;
        }

        int indicePelicula = -1;
        for (int i = 0; i < indice; i++) {
            if (peliculas[i].getCodigo().equals(codigo)) {
                indicePelicula = i;
                break;
            }
        }
        if (indicePelicula == -1) {
            System.out.println("No se encontro la pelicula con codigo: " + codigo);
            return false;
        }

        System.arraycopy(peliculas, indicePelicula + 1, peliculas, indicePelicula, indice - indicePelicula - 1);

        peliculas[--indice] = null;
        System.out.println("Pelicula eliminada correctamente.");
        return true;
    }

    public boolean contienePelicula(String codigo) {
        if (indice == 0) {
            System.out.println("VideoClub vacio actualmente.");
            return false;
        }

        for (Pelicula p : peliculas) {
            if (p.getCodigo().equals(codigo)) {
                System.out.println("Pelicula con codigo " + codigo + " disponible en el VideoClub");
                return true;
            }
        }
        System.out.println("Pelicula con codigo " + codigo + " no fue encontrada.");
        return false;
    }

    public Pelicula getPelicula(String codigo) {
        if (indice == 0) {
            System.out.println("VideoClub vacio actualmente.");
            return null;
        }

        for (Pelicula p : peliculas) {
            if (p.getCodigo().equals(codigo)) {
                System.out.println("Pelicula " + p.getTitulo() + " encontrada.");
                return p;
            }
        }
        System.out.println("Pelicula con codigo " + codigo + " no existe en el VideoClub.");
        return null;
    }

    public boolean realizarAlquiler(String cliente, String codPelicula, String fechaAlquiler) {
        if (indice == 0) {
            System.out.println("VideoClub vacio actualmente.");
            return false;
        }

        for (Pelicula p : peliculas) {
            if (p.getCodigo().equals(codPelicula)) {
                if (p.alquilar()) {
                    alquileres.add(new Alquiler(cliente, codPelicula, fechaAlquiler));
                    System.out.println("Alquiler de " + p.getTitulo() + " realizado correctamente.");
                    return true;
                } else {
                    System.out.println("No quedan copias disponibles de " + p.getTitulo());
                    return false;
                }
            }
        }
        System.out.println("Pelicula con codigo " + codPelicula + " no encontrada.");
        return false;
    }

    public boolean realizarDevolucion(String codPelicula, String cliente) {
        if (alquileres.isEmpty()) {
            System.out.println("Error: no hay peliculas alquiladas actualmente.");
            return false;
        }

        for (int i = 0; i < alquileres.size(); i++) {
            Alquiler a = alquileres.get(i);
            if (a.getCodigoPelicula().equals(codPelicula) && a.getNombreCliente().equals(cliente)) {
                
                for (int j = 0; j < indice; j++) {
                    if (peliculas[j].getCodigo().equals(codPelicula)) {
                        peliculas[j].devolver();
                        alquileres.remove(i);
                        System.out.println("Pelicula " + peliculas[j].getTitulo() + " devulta correctamente.");
                        return true;
                    }
                }
            }
        }
        System.out.println("No se encontro un alquiler de " + codPelicula + " a nombre de " + cliente);
        return false;
    }

    public void listarPeliculasDisponibles() {
        if (indice == 0) {
            System.out.println("VideoClub vacio actualmente.");
            return;
        }

        ArrayList<Pelicula> pelisDisponibles = new ArrayList<>();
        for (int i = 0; i < indice; i++) {
            if (peliculas[i].estaDisponible()) {
                pelisDisponibles.add(peliculas[i]);
            }
        }
        
        if (!pelisDisponibles.isEmpty()) {
            pelisDisponibles.sort(Comparator.comparing(Pelicula::getTitulo, String.CASE_INSENSITIVE_ORDER));
            System.out.println("Peliculas disponibles ordenadas alfabeticamente por titulo:");
            
            for (Pelicula pelisDisponible : pelisDisponibles) {
                System.out.println("\n" + pelisDisponible);
            }
        } else {
            System.out.println("No hay peliculas disponibles actualmente.");
        }
    }
    
    public void listarTodasLasPeliculas() {
        if (indice == 0) {
            System.out.println("Videoclub vacio actualmente.");
            return;
        }
        
        Pelicula[] pelisActivas = Arrays.copyOf(peliculas, indice);
        
        Arrays.sort(pelisActivas, Comparator.comparing(Pelicula::getTitulo, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Todas las peliculas ordenadas alfabeticamente por titulo:");
        for (Pelicula peliActiva : pelisActivas) {
            System.out.println("\n" + peliActiva);
        }
    }

}
