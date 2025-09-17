package persona;

import javax.swing.JOptionPane;

public class Estudiante extends persona{
    //Atributos
    private int codigo_estudiante;
    private double calificacion;

    //Metodo constructor
    public Estudiante(int codigo_estudiante, double calificacion, String nombre, String apellido, int edad, String ciudad) {
        super(nombre, apellido, edad, ciudad);
        this.codigo_estudiante = Integer.parseInt(JOptionPane.showInputDialog("Digita el id del estudiante: "));
        this.calificacion = Double.parseDouble(JOptionPane.showInputDialog("¿Cual fue su nota final?: "));
    }

    public void MostrarDatos() {
       JOptionPane.showMessageDialog(null, "Nombre: " + getNombre() +
                            "\nApellido: " + getApellido()+
                            "\nedad: " + getEdad()+
                            "\nEstudiante: " + codigo_estudiante +
                            "\nNota: " + calificacion);
     
    }
}
