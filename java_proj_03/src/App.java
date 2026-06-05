import java.util.Scanner;
import model.*;
import service.BibliotecaService;

public class App {

    static Scanner sc = new Scanner(System.in);
    static BibliotecaService biblioteca = new BibliotecaService();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║     SISTEMA DE BIBLIOTECA    ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║ 1. Agregar material          ║");
            System.out.println("║ 2. Mostrar materiales        ║");
            System.out.println("║ 3. Registrar alumno          ║");
            System.out.println("║ 4. Mostrar alumnos           ║");
            System.out.println("║ 5. Realizar préstamo         ║");
            System.out.println("║ 6. Mostrar préstamos         ║");
            System.out.println("║ 0. Salir                     ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Elige una opción: ");
            opcion = leerEntero();

            switch (opcion) {
                case 1 -> menuAgregarMaterial();
                case 2 -> biblioteca.mostrarMateriales();
                case 3 -> menuRegistrarAlumno();
                case 4 -> biblioteca.mostrarAlumnos();
                case 5 -> menuRealizarPrestamo();
                case 6 -> biblioteca.mostrarPrestamos();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    // ── Menú: agregar material ───────────────────────────────────
    static void menuAgregarMaterial() {
        System.out.println("\n-- Tipo de material --");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. Tesis");
        System.out.println("4. Periódico");
        System.out.print("Elige tipo: ");
        int tipo = leerEntero();

        System.out.print("Código: ");        String codigo  = sc.nextLine();
        System.out.print("Título: ");        String titulo  = sc.nextLine();
        System.out.print("¿Disponible? (s/n): ");
        boolean disponible = sc.nextLine().equalsIgnoreCase("s");

        switch (tipo) {
            case 1 -> {
                System.out.print("Autor: ");       String autor      = sc.nextLine();
                System.out.print("ISBN: ");        String isbn        = sc.nextLine();
                System.out.print("Editorial: ");   String editorial   = sc.nextLine();
                System.out.print("Páginas: ");     int paginas        = leerEntero();
                biblioteca.agregarMaterial(
                    new Libro(codigo, titulo, disponible, autor, isbn, editorial, paginas));
            }
            case 2 -> {
                System.out.print("Edición: ");     String edicion    = sc.nextLine();
                System.out.print("Mes publicación: "); String mesPub = sc.nextLine();
                System.out.print("Categoría: ");   String categoria  = sc.nextLine();
                biblioteca.agregarMaterial(
                    new Revista(codigo, titulo, disponible, edicion, mesPub, categoria));
            }
            case 3 -> {
                System.out.print("Autor: ");       String autor      = sc.nextLine();
                System.out.print("Carrera: ");     String carrera    = sc.nextLine();
                System.out.print("Director: ");    String director   = sc.nextLine();
                System.out.print("Año: ");         int anio          = leerEntero();
                biblioteca.agregarMaterial(
                    new Tesis(codigo, titulo, disponible, autor, carrera, director, anio));
            }
            case 4 -> {
                System.out.print("Fecha publicación: "); String fechaPub = sc.nextLine();
                System.out.print("Nombre periódico: ");  String nombre   = sc.nextLine();
                System.out.print("Sección: ");           String seccion  = sc.nextLine();
                biblioteca.agregarMaterial(
                    new Periodico(codigo, titulo, disponible, fechaPub, nombre, seccion));
            }
            default -> System.out.println("Tipo no válido.");
        }
    }

    // ── Menú: registrar alumno ───────────────────────────────────
    static void menuRegistrarAlumno() {
        System.out.println("\n-- Datos del alumno --");
        System.out.print("Matrícula: ");     String matricula    = sc.nextLine();
        System.out.print("Nombre: ");        String nombre       = sc.nextLine();
        System.out.print("Carrera: ");       String carrera      = sc.nextLine();
        System.out.print("Cuatrimestre: ");  String cuatrimestre = sc.nextLine();
        System.out.print("Correo: ");        String correo       = sc.nextLine();
        biblioteca.registrarAlumno(
            new Alumno(matricula, nombre, carrera, cuatrimestre, correo));
    }

    // ── Menú: realizar préstamo ──────────────────────────────────
    static void menuRealizarPrestamo() {
        System.out.println("\n-- Datos del préstamo --");
        System.out.print("Matrícula del alumno: "); String matricula = sc.nextLine();
        System.out.print("Código del material: ");  String codigo    = sc.nextLine();
        System.out.print("Fecha préstamo (dd/mm/aaaa): ");    String fPrestamo   = sc.nextLine();
        System.out.print("Fecha devolución (dd/mm/aaaa): ");  String fDevolucion = sc.nextLine();
        biblioteca.realizarPrestamo(matricula, codigo, fPrestamo, fDevolucion);
    }

    // ── Utilidad: leer entero sin romper el Scanner ──────────────
    static int leerEntero() {
        int valor = -1;
        try {
            valor = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida, se usará 0.");
            valor = 0;
        }
        return valor;
    }
}
