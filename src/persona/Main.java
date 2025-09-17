package persona;

public class Main {
    public static void main(String[] args) {
        Estudiante eu1 = new Estudiante(1234, 3.2, "Jose", "Gutierrez", 22, "Cartagena");
        profesor pr1 = new profesor(0, null, null, null, 0, null);


        eu1.MostrarDatos();
        pr1.MostrarDatosProfesor();
    }
}
