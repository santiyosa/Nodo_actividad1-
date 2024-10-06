package usuario;

public class Estudiante extends Usuario {
    private String carreraEstudiante;
    private String universidadEstudiante;


    public Estudiante(String carreraEstudiante, String universidadEstudiante) {
        super(2, "Manuel", "4568956", "usuario1@correo.com.co", "Estudiante");
        this.carreraEstudiante = "Ingenieria";
        this.universidadEstudiante = "ITM";
    }

    public String getCarreraEstudiante() {
        return this.carreraEstudiante;
    }

    public String getUniversidadEstudiante() {
        return this.universidadEstudiante;
    }

    @Override
    public void prestarLibro() {
        System.out.println("El estudiante puede prestar 5 libros");
    }

}
