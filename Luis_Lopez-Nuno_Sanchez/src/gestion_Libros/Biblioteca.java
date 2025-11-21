package gestion_Libros;

import java.util.ArrayList;

/**
 * Clase Biblioteca
 * @author Alumno: Luis López-Nuño
 * @version 1.0
 */
public class Biblioteca {
    private ArrayList<Libro> libros;

    /**
     * Constructor principal de la clase Biblioteca
     *
     * Establece la lista del los parametros de la clase libro
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Getter del atributo ArrayList<Libro>
     *
     * @return Los parametros de la clase libros que se han añadido a la lista
     */

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * Setter sel atributo arrayList <Libro>
     *
     * @param libros Establece los parametros de los atributos de la clase libro
     */

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Metodo para añadir libros en el arrayList
     *
     * @param libro Establece los parametros de los atributos de la clase libro
     */

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Metodo para Mostrar los libros añadidos en el arrayList
     *
     */
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    /**
     * Metodo para buscar los libros que se han añadido previamente segun el nombre del autor
     *
     * @param autor Establece el nombre del autor de la pelicula
     */
    public void buscarPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                System.out.println(libro);
            }
        }
    }

    /**
     * Metodo para buscar por el numero de paginas del libro
     *
     * @param minimo establece el numero minimo de paginas de la busqueda
     * @param maximo establece el numero maximo de paginas de la busqueda
     */
    public void buscarPorTamaño(int minimo, int maximo) {
        for (Libro libro : libros) {
            if (libro.getLongitud() >= minimo && libro.getLongitud() <= maximo) {
                System.out.println(libro);
            }
        }
    }
}
