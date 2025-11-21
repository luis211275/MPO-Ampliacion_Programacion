package gestion_Libros;

/**
 * Clase Libro
 * @author Alumno: Luis López-Nuño
 * @version 1.0
 */
public class Libro {
    private String titulo;
    private String autor;
    private int longitud;

    /**
     * Constructor principal de la clase Libro
     *
     * @param titulo establece el titulo del libro
     * @param autor establece el nombre del autor
     * @param longitud establece el numero de paginas del libro
     */
    public Libro(String titulo, String autor, int longitud) {
        this.titulo = titulo;
        this.autor = autor;
        this.longitud = longitud;
    }


    /**
     * getter del atributo Titulo
     *
     * @return el titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter del atributo titulo
     *
     * @param titulo establece el titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter del atributo Autor
     *
     * @return el nombre del autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Setter del atributo Autor
     *
     * @param autor establece el Nombre del Autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Getter del atributo longitud
     *
     * @return el numero de paginas del libro
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Setter del atributo longitud
     *
     * @param longitud Establece el numero de paginas del libro
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * Metodo para mostrar los datos del libro
     *
     * @return texto formateado con los datos de la pelicula
     */
    @Override
    public String toString() {
        return String.format("Titulo: %s | Autor: %s | Longitud: %d paginas", titulo, autor,  longitud);
    }


}
