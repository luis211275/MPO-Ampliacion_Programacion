package gestion_biblioteca;

import gestion_biblioteca.exceptions.AnioInvalidoException;
import gestion_biblioteca.exceptions.CantidadInvalidaException;
import gestion_biblioteca.exceptions.IsbnInvalidoException;

import java.util.*;

public class Main {
    private static final MyScanner sc = new MyScanner();
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static Map<Libro, Integer> inventario = new LinkedHashMap<>();

    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        System.out.println("=== GESTION BIBLIOTECA ===");
        boolean exit;
        do {
            exit = false;
            int opcion = sc.pedirNumero("1.Registrar libro" +
                    "\n2.Mostrar Catalogo" +
                    "\n3.Gestionar ejemplares" +
                    "\n4.Salir");
            switch (opcion) {
                case 1:
                    addLibro();
                    break;
                case 2:
                    mostrarCatalogo();
                    break;
                case 3:
                    gestionarInventario();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    exit = true;
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
        } while (!exit);
    }


    /**
     * Metodo para añadir libro a la lista
     */
    public static void addLibro() {
        boolean correcto;
        String isbn = "";
        String titulo;
        String autor;
        int anioPublicacion = 0;
        do {
            correcto = true;
            try {
                isbn = sc.pideTexto("Introduce el isbn del libro: ");
                if (isbn.isEmpty()) {
                    throw new InputMismatchException("el isbn no puede estar vacio");
                } else if (isbn.length() < 5) {
                    throw new IsbnInvalidoException("Debe tener al menos 5 caracteres");
                } else {
                    for (Libro libros : libros) {
                        if (libros.getIsbn() == isbn) {
                            throw new IsbnInvalidoException("El isbn ya existe");
                        }
                    }
                }

            } catch (IsbnInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }
        } while (!correcto);
        do {
            correcto = true;
            titulo = sc.pedirSoloTexto("Introduce el titulo: ");
            if (titulo.isEmpty()) {
                System.out.println("El titulo no puede estar vacio");
                correcto = false;
            }
        }while (!correcto);

        do {
            correcto = true;
            autor = sc.pedirSoloTexto("Introduce el autor: ");
            if (autor.isEmpty()) {
                System.out.println("El autor no puede estar vacio");
                correcto = false;
            }
        }while (!correcto);

        do {
            correcto = true;
            try{
                anioPublicacion = sc.pedirNumero("Introduce el anio: ");
                if (anioPublicacion < 0) {
                    throw new AnioInvalidoException("el año no puede ser negativo");
                }
            }catch (AnioInvalidoException e) {
                System.out.println(e.getMessage());
                correcto = false;
            }
        }while (!correcto);

        libros.add(new Libro(isbn, titulo, autor, anioPublicacion));

    }


    /**
     * metodo para mostrar el catalogo de todos los libros que se han añadido a la lista
     */
    public static void mostrarCatalogo() {
        for (Libro libros : inventario.keySet()) {
            System.out.printf("%s- cantidad de libros: %s\n",  libros, inventario.get(libros));

        }
    }

    /**
     * metodo para añadir el stock de cada libro y guardarlo
     */
    public static void gestionarInventario(){
        boolean correcto;
        for  (Libro libros : libros) {
            int cantidad = 0;
            do {
                correcto = true;
                System.out.println(libros);
                cantidad = sc.pedirNumero("Introduce el cantidad de libros: ");

            }while (!correcto);

            inventario.put(libros, cantidad);
        }
    }

    }
