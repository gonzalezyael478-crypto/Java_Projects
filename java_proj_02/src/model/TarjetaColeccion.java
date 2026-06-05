package model;

public class TarjetaColeccion extends Producto {

    private String rareza;
    private String tipoCarta;
    private int cantidadPaquete;

    public TarjetaColeccion(String nombre, String codigo,
                            double precio, int stock,
                            String rareza,
                            String tipoCarta,
                            int cantidadPaquete) {

        super(nombre, codigo, precio, stock);

        this.rareza = rareza;
        this.tipoCarta = tipoCarta;
        this.cantidadPaquete = cantidadPaquete;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();

        System.out.println("Rareza: " + rareza);
        System.out.println("Tipo: " + tipoCarta);
        System.out.println("Cantidad paquete: " + cantidadPaquete);
    }
}