package gestion_Libros;
/*
Alumno - Luis López-Nuño
Asignatura - Ampliacion de programacion DAW 1
Fecha - 21/11/25
 */
public class Libreria {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("El Quijote", "Cervantes", 1000);
        Libro libro2 = new Libro("Grandes esperanzas", "Dickens", 1500);
        Libro libro3 = new Libro("Odisea", "Homero", 2000);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);


            System.out.println("===TODOS DE LIBROS===");
        biblioteca.mostrarLibros();

        System.out.println("===BUSCAR POR AUTOR: Homero===");
        biblioteca.buscarPorAutor("Homero");

        System.out.println("===FILTRAR POR NUMERO DE PAGINAS: Entre 1200 y 2500===");
        biblioteca.buscarPorTamaño (1200, 2500);
    }
}
