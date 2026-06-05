package model;

public class Periodico extends MaterialBibliografico{
    private String fechaPub;
    private String nombre;
    private String seccion;

    public Periodico(String codigo, String titulo, boolean disponible, String fechaPub, String nombre, String seccion) {
        super(codigo, titulo, disponible, false);
        this.fechaPub = fechaPub;
        this.nombre = nombre;
        this.seccion = seccion;
    }

    public String getFechaPub() {return fechaPub;}
    public String getNombre() {return nombre;}
    public String getSeccion() {return seccion;}

    @Override
    public String mostrarInfo() {
        return "Periodico [codigo=" + codigo + ", titulo=" + titulo
            + ", disponible=" + disponible + ", fechaPub=" + fechaPub
            + ", nombre=" + nombre + ", seccion=" + seccion
            + ", puedePrestarse=" + puedePrestarse + "]";
    }
}
