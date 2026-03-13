package gestionDePedidos.models;

public class Pedido {
    /**
     * Clase Pedido para hacer el registro de pedidos
     * @author Alumno - Luis López-Nuño Sánchez
     * @version 1.0
     */
    private String id;
    private String NombreCliente;
    private String plato;
    private double precio;

    /**
     * Constructor principal de la clase Pedido
     *
     * @param id establece el id del pedido
     * @param nombreCliente establece el nombre del cliente del pedido
     * @param plato establece el plato del pedido
     * @param precio establece el precio del pedido
     */
    public Pedido(String id, String nombreCliente, String plato, double precio) {
        this.id = id;
        NombreCliente = nombreCliente;
        this.plato = plato;
        this.precio = precio;
    }

    /**
     * getter del atributo id
     *
     * @return el id del pedido
     */
    public String getId() {
        return id;
    }

    /**
     * getter del atributo nombreCliente
     *
     * @return el nombre del cliente que ha hecho el pedido
     */
    public String getNombreCliente() {
        return NombreCliente;
    }

    /**
     * getter del atributo plato
     *
     * @return el nombre del plato del pedido
     */

    public String getPlato() {
        return plato;
    }

    /**
     * getter del atributo precio
     *
     * @return el precio del pedido
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * metodo para mostrar los datos del pedido
     *
     * @return texto formateado con los datos del pedido
     */
    @Override
    public String toString() {
            return String.format("id: %s - Nombre del cliente: %s - Plato: %s - Precio: %.2f",
                    id,
                    NombreCliente,
                    plato,
                    precio);
    }
}
