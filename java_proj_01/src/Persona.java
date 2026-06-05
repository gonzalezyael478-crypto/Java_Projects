public class Persona {
    //Propiedades o atributos
    private String nombre;
    private int edad;
    private double peso;
    private double estatura;
    private double imc;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Métodos
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public void calcularImc(){
        this.imc = this.peso/(this.estatura * this.estatura);
    }

    public double getImc() {
        return imc;
    }
    
}
