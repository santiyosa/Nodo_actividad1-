package usuario;

public abstract class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String telefonoUsuario;
    private String correoUsuario;
    public String tipoUsuario;

    public Usuario(int idUsuario, String nombreUsuario, String telefonoUsuario, String correoUsuario,
            String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.correoUsuario = correoUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public String getTelefonoUsuario() {
        return this.telefonoUsuario;
    }

    public String getCorreoUsuario() {
        return this.correoUsuario;
    }

    public String getTipoUsuario() {
        return this.tipoUsuario;
    }

    public abstract void prestarLibro();
}