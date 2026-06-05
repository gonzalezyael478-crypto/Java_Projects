package model;

public class Alumno {
    private String matricula;
    private String nombre;
    private String carrera;
    private String cuatrimestre;
    private String correo;

    public Alumno(String matricula, String nombre, String carrera,
                  String cuatrimestre, String correo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.cuatrimestre = cuatrimestre;
        this.correo = correo;
    }

    public String getMatricula() { return matricula; }
    public String getNombre() { return nombre; }
    public String getCarrera() { return carrera; }
    public String getCuatrimestre() { return cuatrimestre; }
    public String getCorreo() { return correo; }

    @Override
    public String toString() {
        return "Alumno [matricula=" + matricula + ", nombre=" + nombre
            + ", carrera=" + carrera + ", cuatrimestre=" + cuatrimestre
            + ", correo=" + correo + "]";
    }
}
