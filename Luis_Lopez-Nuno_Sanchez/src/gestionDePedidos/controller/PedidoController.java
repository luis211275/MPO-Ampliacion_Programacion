package gestionDePedidos.controller;

import gestionDePedidos.exceptions.PedidoException;
import gestionDePedidos.models.Pedido;
import gestionDePedidos.service.PedidoService;
import gestion_biblioteca.MyScanner;

public class PedidoController {
    private static final MyScanner sc = new  MyScanner();
    private static final PedidoService service = new PedidoService();

    public void addPedido () {
        boolean correcto;
        do {
            correcto = true;
            String id = getCodigo();
            Pedido p = service.getPedido(id);
            if (p != null) {
                System.out.println("El id ya está asociado a un pedido.");
                correcto = false;
            } else {
                String nombreCliente = sc.pideTexto("Introduce el nombre del cliente");
                String plato = sc.pideTexto("Introduce el plato del cliente");
                double precio = sc.pedirDecimal("Introduce el percio del pedido");
                service.agregarPedido(new Pedido(id, nombreCliente, plato, precio));
                System.out.println("Pedido registrado correctamente.");
            }
        } while (!correcto);
    }

    public void mostrarPedidos(){
        for(Pedido pedido : service.getPedidos()){
            System.out.println(pedido);
        }
    }


    public void cargar() {
        service.cargar();
    }

    public void guardar() {
        service.guardar();
    }

    private String getCodigo() {
        String regex = "^[A-Z]{3}[0-9]{2}$";
        String codigo;
        do {
            codigo = sc.pideTexto("Introduce el id, 3 letras y 2 números: ").toUpperCase();
        } while (!codigo.matches(regex));
        return codigo;
    }

}
