package model;

public class FiguraColeccion extends Producto {

    private double alturaCm;
    private String material;
    private boolean edicionLimitada;

    public FiguraColeccion(String nombre, String codigo,
                           double precio, int stock,
                           double alturaCm,
                           String material,
                           boolean edicionLimitada) {

        super(nombre, codigo, precio, stock);

        this.alturaCm = alturaCm;
        this.material = material;
        this.edicionLimitada = edicionLimitada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //Llama al método de la clase Padre

        System.out.println("Altura: " + alturaCm + " cm");
        System.out.println("Material: " + material);
        System.out.println("Edición limitada: " + edicionLimitada);
    }
}