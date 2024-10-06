
import usuario.*;

public class Main {

    public static void main(String[] args) {

        Estudiante profesional = new Estudiante("Ingenieria", "ITM");
        Profesor magister = new Profesor("Sistemas Operativos", "Completo");

        System.out.printf("El usuario es un %d\n", profesional.getIdUsuario());
        System.out.printf("El usuario es un %d\n", magister.getIdUsuario());

        profesional.prestarLibro();
        magister.prestarLibro();

    }
}
