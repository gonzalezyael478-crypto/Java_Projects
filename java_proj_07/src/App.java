import model.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        Persona per01 = new Persona("Juan");
        per01.setPeso(70);
        per01.setEst(1.70);
        per01.definiEst(); // Hay algún error??

        System.out.println("La persona se llama " + per01.getNombre());

        System.out.println(per01); // Otro error

    }
}
