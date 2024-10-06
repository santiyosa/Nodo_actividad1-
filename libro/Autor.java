package libro;

public abstract class Autor {
    private int idAutor;
    private String nombreAutor;
    private String correoAutor;


    public Autor(int idAutor, String nombreAutor, String correoAutor) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
        this.correoAutor = correoAutor;
    }

    public int getIdAutor() {
        return this.idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreAutor() {
        return this.nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getCorreoAutor() {
        return this.correoAutor;
    }

    public void setCorreoAutor(String correoAutor) {
        this.correoAutor = correoAutor;
    }

}
