package model;

public class Tesis extends MaterialBibliografico {
    private String autor;
    private String carrera;
    private String director;
    private int anio;
    
    public Tesis(String codigo, String titulo, boolean disponible, 
                 String autor, String carrera, String director, int anio) {
        super(codigo, titulo, disponible, false);

        this.autor = autor;
        this.carrera = carrera;
        this.director = director;
        this.anio = anio;
    }

    public String getAutor() {return autor;}
    public String getCarrera() {return carrera;}
    public String getDirector() {return director;}
    public int getAnio() {return anio;}

    @Override
    public String mostrarInfo() {
        return "Tesis [codigo=" + codigo + ", titulo=" + titulo
            + ", disponible=" + disponible + ", autor=" + autor
            + ", carrera=" + carrera + ", director=" + director
            + ", anio=" + anio + ", puedePrestarse=" + puedePrestarse + "]";
    }

}
