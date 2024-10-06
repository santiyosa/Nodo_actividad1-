package usuario;

public class Profesor extends Usuario {
    private String materiaProfesor;
    private String convenioProfesor;


    public Profesor(String materiaProfesor, String convenioProfesor) {
        super(1, "Pedro", "5698745", "usuario1@correo.com.co", "Profesor");
    }

    public String getMateriaProfesor() {
        return this.materiaProfesor;
    }

    public String getConvenioProfesor() {
        return this.convenioProfesor;
    }

    @Override
    public void prestarLibro() {
        System.out.println("El profesor puede prestar 10 libros");
    }

}