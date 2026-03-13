package gestionDePedidos.service;

import gestionDePedidos.models.Pedido;
import gestionDePedidos.persistence.PedidoDAO;

import java.util.ArrayList;

public class PedidoService {

    private ArrayList<Pedido> pedidos;
    private PedidoDAO dao;

    public PedidoService() {
        pedidos = new ArrayList<>();
        dao = new PedidoDAO();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public Pedido getPedido(String id) {
        for(Pedido pedido : pedidos){
            if (pedido.getId().equals(id)) {
                return pedido;
            }
        }
        return null;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void cargar(){
        pedidos = dao.cargar();
    }

    public void guardar(){
        dao.guardar(pedidos);
    }
}
