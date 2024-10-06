package libro;

public abstract class Libro {
    private int ISBN;
    private String nombreLibro;
    private String categoriaLibro;
    private String autorLibro;
    private String paginasLibro;


    public Libro(int ISBN, String nombreLibro, String categoriaLibro, String autorLibro, String paginasLibro) {
        this.ISBN = ISBN;
        this.nombreLibro = nombreLibro;
        this.categoriaLibro = categoriaLibro;
        this.autorLibro = autorLibro;
        this.paginasLibro = paginasLibro;
    }


    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getNombreLibro() {
        return this.nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCategoriaLibro() {
        return this.categoriaLibro;
    }

    public void setCategoriaLibro(String categoriaLibro) {
        this.categoriaLibro = categoriaLibro;
    }

    public String getAutorLibro() {
        return this.autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getPaginasLibro() {
        return this.paginasLibro;
    }

    public void setPaginasLibro(String paginasLibro) {
        this.paginasLibro = paginasLibro;
    }

    public void consultarLibro() {
        System.out.println("Los libros se encuentran disponibles");
    }
}
