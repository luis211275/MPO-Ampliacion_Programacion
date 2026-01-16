package gestion_Inventario;

import gestion_Inventario.Exceptions.CodigoInvalidoException;
import gestion_Inventario.Exceptions.PrecioInvalidoException;
import gestion_Inventario.Exceptions.ProductoNoEncontradoException;

import java.util.*;

public class GestionInventario {
    private static final Scanner sc = new Scanner(System.in);
    private static Map<String, Double> productos = new HashMap<>();

    public static void main(String[] args) {
        menu();
    }


    /**
     * Metodo menu, donde se ejecutará el programa, añadiendo los otros metodos
     */
    public static void menu() {
        int opcion = 0;
        do {
            try {
                System.out.println("===GESTION DE USUARIOS===");
                System.out.println("1. Añadir producto" +
                            "\n2. Buscar producto" +
                            "\n3. Actualizar precio" +
                            "\n4. Mostrar inventario" +
                            "\n5. Salir" +
                            "\n Opcion: ");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        añadirProducto();
                        break;
                    case 2:
                        buscarProducto();
                        break;
                    case 3:
                        ActualizarPrecio();
                        break;
                    case 4:
                        mostrarInventario();
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("La opcion tiene que ser numerica");
                sc.nextLine();
            }
        }while (opcion != 5);
    }


    /**
     * Metodo el cual se introduce el producto con el precio y se añadirá al Map
     */
    public static void añadirProducto(){
        String producto = "";
        double precio = 0;
        boolean correcto;

        do {
            try {
                producto = validarProducto();
                correcto = true;
            }catch (CodigoInvalidoException e){
                System.out.println(e.getMessage());
                correcto = false;
            }
        }while (!correcto);

        do {
            try {
                precio = validarPrecio();
                correcto = true;
            }catch (PrecioInvalidoException e){
                System.out.println(e.getMessage());
                correcto = false;
            }
        }while (!correcto);
        productos.put(producto, precio);
        System.out.println("precio registrado correctamente");
    }


    /**
     * Metodo de control de la introduccion del codigo del producto
     *
     * @return Cumple las excepciones te retorna el producto valido
     * @throws CodigoInvalidoException Si no cumple las excepciones del producto
     */
    public static String validarProducto() throws CodigoInvalidoException {
        System.out.println("Introduce el nombre del producto");
        String producto = sc.nextLine();
        if (producto.length()>=3 && producto.matches("[A-Z0-9]+")) {
            return producto;
        }
        throw new CodigoInvalidoException("producto introducido no valido");
    }


    /**
     * Metodo de control de la introduccion del precio del producto
     *
     * @return Cumple las excepciones te retorna el precio valido
     * @throws PrecioInvalidoException Si no cumple las excepciones del precio
     */
    public static double validarPrecio() throws PrecioInvalidoException {
        System.out.println("Introduce el precio del producto");
        double precio = sc.nextDouble();
        if (precio>0) {
            return precio;

        }
        throw new PrecioInvalidoException("precio introducido no valido");
    }


    /**
     * Metodo en el que el usuario introduce el nombre del producto y le retorna si esta en el map añadido
     */
    public static void buscarProducto() {
        System.out.println("Introduce el nombre del producto: ");
        String nombre = sc.nextLine();
        try {
            if (productos.containsKey(nombre)) {
                System.out.println("Producto encontrado: " + nombre);
            } else {
                throw new ProductoNoEncontradoException("Producto no encontrado!");
            }
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }


    /**
     * Metodo en el que Si el producto esta en el map se puede sustituir el precio del producto
     */
    //No acabado
    public static void ActualizarPrecio() {
        String producto = "";
        boolean correcto;
        do {
            try {
                buscarProducto();
                System.out.println("Introduce el precio actualizado del producto: ");
                double actualPrecio = sc.nextInt();
                if (actualPrecio>=0 ) {
                    productos.remove(actualPrecio);
                    correcto = true;
                }else {
                    System.out.println("Precio introducido no valido");
                    correcto = false;
                }
            }catch (InputMismatchException e){
                System.out.println("Error");
                correcto = false;
            }
        }while (!correcto);
    }


    /**
     * Metodo donde Se muestra el inventario con el conjunto de productos que has añadido
     */
    public static void mostrarInventario() {
        boolean valided;
        do{
            try {
                buscarProducto();
                System.out.println("Inventario encontrado");
                System.out.println(productos);
                valided = true;
            }catch (InputMismatchException e) {
                System.out.println("Inventario no encontrado");
                valided = false;
            }
        }while (!valided);
    }



}
