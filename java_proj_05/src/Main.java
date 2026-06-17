
import service.PreguntaService;
import util.Consola;


public class Main {
    public static void main(String[] args) throws Exception {
        PreguntaService service = new PreguntaService();

        int opcion;

        do { 
            mostrarMenu();

            opcion = Consola.leerEntero("\nSeleccione una opción: ");
            
        } while (true);
    }

    private static void mostrarMenu() {

        System.out.println("\n===============================");
        System.out.println(" BIENVENIDO A JAVA CHALLENGE 3000");
        System.out.println("===============================");
        System.out.println("1. Registrar pregunta");
        System.out.println("2. Responder Cuestionario (5 preguntas)");
        System.out.println("3. Mostrar todas las preguntas (Pendiente))");
        System.out.println("4. Mostrar usuarios(Pentiente)");
        System.out.println("5. Salir");
    }
}
