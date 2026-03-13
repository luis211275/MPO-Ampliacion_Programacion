package gestionDePedidos.persistence;

import gestionDePedidos.models.Pedido;
import utilidades.Utilidades;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class PedidoDAO {

    private final String RUTA = System.getProperty("user.home")+"/Desktop/DAW/Practica6";
    private final File FILE = new File(RUTA+File.separator+"pedidos.txt");

    public void guardar(ArrayList<Pedido> pedidos){
        if(comprobarDirectorio(RUTA)){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE))){
                for (Pedido pedido : pedidos) {
                    String linea =
                            pedido.getId() + ";" + pedido.getNombreCliente() + ";" + pedido.getPlato() + ";" + pedido.getPrecio();
                    bw.write(linea);
                    bw.newLine();
                }
                System.out.println("Pedidos guardados con exito");
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

    }


    public ArrayList<Pedido> cargar(){
        ArrayList<Pedido> pedidos = new ArrayList<>();
        if(FILE.exists()){
            try (BufferedReader br = new BufferedReader(new FileReader(FILE))){
                String linea;
                while ((linea = br.readLine()) != null){
                    String[] datos = linea.split(";");
                    String id = datos[0];
                    String nombreCliente = datos[1];
                    String plato = datos[2];
                    double precio = Double.parseDouble(datos[3]);
                    pedidos.add(new Pedido(id, nombreCliente, plato, precio));
                }
                System.out.println("Pedidos cargados con exito");
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

        return pedidos;
    }



    private static boolean comprobarDirectorio(String ruta) {
        if (Utilidades.existDirectory(ruta)) {
            return true;
        } else {
            return Utilidades.crearDirectorio(ruta);
        }
    }
}
