package gestionDePedidos;

import gestionDePedidos.controller.PedidoController;
import gestionDePedidos.exceptions.PedidoException;
import gestion_biblioteca.MyScanner;

//Practica6 Luis López-Nuño Sánchez
public class Main {
    private static final MyScanner sc = new MyScanner();
    private static final PedidoController controller = new PedidoController();

    public static void main(String[] args) throws PedidoException {
        int opcion;
        do {
            opcion = sc.pedirNumero("==== GESTION DE PEDIDIOS ====" +
                    "\n1. Registrar pedido" +
                    "\n2. Mostrar pedido" +
                    "\n3. Guardar pedidos en fichero" +
                    "\n4. Cargar pedidos desde fichero" +
                    "\n5. Salir" +
                    "\nOpcion: ");
            switch (opcion) {
                case 1:
                    controller.addPedido();
                    break;
                case 2:
                    controller.mostrarPedidos();
                    break;
                case 3:
                    controller.guardar();
                    break;
                case 4:
                    controller.cargar();
                    break;
                case 5:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);

    }
}

