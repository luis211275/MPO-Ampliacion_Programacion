package gestion_biblioteca;

/**
 * clase Libro
 * @author Alumno: Luis López-Nuño
 * @version 1.0
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     * Constructor principal de la clase Libro
     *
     * @param isbn            establece el isbn del libro
     * @param titulo          establece el titu lo del libro
     * @param anioPublicacion establece el año de publicacion del libro
     */

    public Libro(String isbn, String titulo, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * getter del atributo isbn
     *
     * @return el isbn del libro
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     *setter del atributo isbn
     *
     * @param isbn establece el isbn del libro
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * getter del atributo titulo
     *
     * @return el titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }


    /**
     * setter del atriburo titulo
     *
     * @param titulo establece el titulo dol libro
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * getter del atributo autor
     *
     * @return el autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * setter del atributo autor
     *
     * @param autor establece el autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * getter del atributo anio de publicacion
     *
     * @return el anño de publicacion del libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * setter del atributo anio de publicacion
     *
     * @param anioPublicacion establece el año de publicacion del libro
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * metodo para mostrar los datos del libro
     *
     * @return texto formateado con los datos del libro
     */
    @Override
    public String toString() {
        return String.format("Titulo: %d, %s, | Autor: %s | Anio: %d", isbn, titulo, autor, anioPublicacion);
    }

    /**
     * metodo para identificar correctamente la clave
     *
     * @param obj   the reference object with which to compare.
     * @return identifica y conoce la clave
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Libro libro = (Libro) obj;

        return this.isbn != null ? this.isbn.equals(libro.isbn) : libro.isbn == null;
    }


    /**
     * metodo para identificar correctamente la clave
     * @return identifica y conoce la clave
     */
    @Override
    public int hashCode() {
        return isbn != null ? isbn.hashCode() : 0;
    }
}
