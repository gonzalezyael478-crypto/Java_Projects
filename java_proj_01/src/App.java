import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Ejemplos de instancias de objetos
        Persona p01 = new Persona("Isaac", 18);
        //Como ingreso un dato del teclado usando la clase Scanner

        Scanner lector = new Scanner(System.in);
    
        System.out.println("¿Cuánto pesa la persona?");
        p01.setPeso(lector.nextDouble());
        
        p01.setEstatura(1.85);
        p01.calcularImc();

        System.out.println("Nombre: " + p01.getNombre() + "\nEdad: " +
         p01.getEdad() + "\nPeso: " + p01.getPeso() + "\nEstatura: " +
         p01.getEstatura() + "\nImc: " + p01.getImc());
    }
}
