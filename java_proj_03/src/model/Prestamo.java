package model;

public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Alumno alumno;
    private MaterialBibliografico material;

    public Prestamo(String fechaPrestamo, String fechaDevolucion,
                    Alumno alumno, MaterialBibliografico material) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.alumno = alumno;
        this.material = material;
    }

    public String getFechaPrestamo() { return fechaPrestamo; }
    public String getFechaDevolucion() { return fechaDevolucion; }
    public Alumno getAlumno() { return alumno; }
    public MaterialBibliografico getMaterial() { return material; }

    @Override
    public String toString() {
        return "Prestamo [alumno=" + alumno.getNombre()
            + ", material=" + material.getTitulo()
            + ", fechaPrestamo=" + fechaPrestamo
            + ", fechaDevolucion=" + fechaDevolucion + "]";
    }
}
