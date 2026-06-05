package service;

import model.Producto;

import java.util.ArrayList;

public class InventarioService {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarInventario() {

        System.out.println("\n===== INVENTARIO =====");

        for (Producto p : productos) {

            p.mostrarInfo();

            System.out.println("----------------------");
        }
    }
}