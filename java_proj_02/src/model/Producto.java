package model;

public class Producto {

    protected String nombre;
    protected String codigo;
    protected double precio;
    protected int stock;

    public Producto(String nombre, String codigo, double precio, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }

    public double calcularPrecio() {
        return precio * 1.16; // IVA
    }

    public void actualizarStock(int cantidad) {
        stock += cantidad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Precio base: $" + precio);
        System.out.println("Precio final: $" + calcularPrecio());
        System.out.println("Stock: " + stock);
    }
}