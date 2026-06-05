package model;

public class MaterialBibliografico {
    protected String codigo;
    protected String titulo;
    protected boolean disponible;
    protected boolean puedePrestarse;

    public MaterialBibliografico(String codigo, String titulo,
                                 boolean disponible, boolean puedePrestarse) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponible = disponible;
        this.puedePrestarse = puedePrestarse;
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    public boolean isPuedePrestarse() { return puedePrestarse; }

    public String mostrarInfo() {
        return "MaterialBibliografico [codigo=" + codigo
            + ", titulo=" + titulo
            + ", disponible=" + disponible
            + ", puedePrestarse=" + puedePrestarse + "]";
    }
}
