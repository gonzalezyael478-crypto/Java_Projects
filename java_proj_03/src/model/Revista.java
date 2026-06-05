package model;

public class Revista extends MaterialBibliografico{
    private String edicion;
    private String mesPub;
    private String categoria;

    public Revista(String codigo, String titulo, boolean disponible,
                   String edicion, String mesPub, String categoria) {
        super(codigo, titulo, disponible, false);
        this.edicion = edicion;
        this.mesPub = mesPub;
        this.categoria = categoria;
    }

    public String getEdicion() {return edicion;}
    public String getMesPub() {return mesPub;}
    public String getCategoria() {return categoria;}

    @Override
    public String mostrarInfo(){
        return "Revista [codigo=" + codigo + ", titulo=" + titulo
            + ", disponible=" + disponible + ", edicion=" + edicion
            + ", mesPub=" + mesPub + ", categoria=" + categoria
            + ", puedePrestarse=" + puedePrestarse + "]";
    }
}
