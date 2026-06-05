import model.*;
import service.InventarioService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventarioService inventario = new InventarioService();

        int opcion;
        String nombre = "";
        String codigo = "";
        double precio = 0.0;
        int stock = 0;


        do {

            System.out.println("\n===== PIXEL KINGDOM STORE =====");
            System.out.println("1. Agregar videojuego");
            System.out.println("2. Agregar figura");
            System.out.println("3. Agregar tarjeta");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1 || opcion == 2 || opcion == 3) {
                System.out.println("Nombre:");
                nombre = sc.nextLine();

                System.out.println("Código:");
                codigo = sc.nextLine();

                System.out.println("Precio:");
                precio = sc.nextDouble();

                System.out.println("Stock:");
                stock = sc.nextInt();
                sc.nextLine();
            }

            switch (opcion) {

                case 1:

                    System.out.println("Plataforma:");
                    String plataforma = sc.nextLine();

                    System.out.println("Género:");
                    String genero = sc.nextLine();

                    System.out.println("Clasificación:");
                    String clasificacion = sc.nextLine();

                    Videojuego videojuego = new Videojuego(
                            nombre,
                            codigo,
                            precio,
                            stock,
                            plataforma,
                            genero,
                            clasificacion
                    );

                    inventario.agregarProducto(videojuego);

                    break;

                case 2:
                    
                    System.out.println("Rareza:");
                    String rareza = sc.nextLine();

                    System.out.println("Tipo Carta:");
                    String tipoCarta = sc.nextLine();

                    System.out.println("Cantidad Paquete:");
                    int cantidadPaquete = sc.nextInt();
                    sc.nextLine();

                    TarjetaColeccion tarjetaColeccion = new TarjetaColeccion(
                            nombre,
                            codigo,
                            precio,
                            stock,
                            rareza,
                            tipoCarta,
                            cantidadPaquete
                    );

                    inventario.agregarProducto(tarjetaColeccion);

                    break;

                case 3:

                    System.out.println("Altura en centimétros:");
                    double alturaCm = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Material:");
                    String material = sc.nextLine();

                    System.out.println("Edicion limitada (true/false):");
                    boolean edicionLimitada = sc.nextBoolean();
                    sc.nextLine();

                    FiguraColeccion figuraColeccion = new FiguraColeccion(
                            nombre,
                            codigo,
                            precio,
                            stock,
                            alturaCm,
                            material,
                            edicionLimitada
                    );

                    inventario.agregarProducto(figuraColeccion);
                    break;

                case 4:

                    inventario.mostrarInventario();
                    break;

            }

        } while (opcion != 5);

        System.out.println("Sistema finalizado.");
    }
}