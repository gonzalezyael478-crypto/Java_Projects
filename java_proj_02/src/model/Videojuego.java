package model;

public class Videojuego extends Producto {

    private String plataforma;
    private String genero;
    private String clasificacion;

    public Videojuego(String nombre, String codigo,
                       double precio, int stock,
                       String plataforma,
                       String genero,
                       String clasificacion) {

        super(nombre, codigo, precio, stock);

        this.plataforma = plataforma;
        this.genero = genero;
        this.clasificacion = clasificacion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //Llama al método de la clase padre

        System.out.println("Plataforma: " + plataforma);
        System.out.println("Género: " + genero);
        System.out.println("Clasificación: " + clasificacion);
    }
}