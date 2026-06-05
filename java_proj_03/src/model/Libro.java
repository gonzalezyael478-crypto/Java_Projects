package model;

public class Libro extends MaterialBibliografico {
    private String autor;
    private String isbn;
    private String editorial;
    private int paginas;

    public Libro(String codigo, String titulo, boolean disponible,
                 String autor, String isbn, String editorial, int paginas) {
        super(codigo, titulo, disponible, true); // libros SÍ se pueden prestar
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public String getEditorial() { return editorial; }
    public int getPaginas() { return paginas; }

    @Override
    public String mostrarInfo() {
        return "Libro [codigo=" + codigo + ", titulo=" + titulo
            + ", autor=" + autor + ", disponible=" + disponible
            + ", isbn=" + isbn + ", editorial=" + editorial
            + ", paginas=" + paginas + ", puedePrestarse=" + puedePrestarse + "]";
    }
}
