package persona;

import javax.swing.JOptionPane;

public class profesor extends persona {
    private int id_docente;
    private String materia;

    public profesor (int id_docente, String materia, String nombre, String apellido, int edad, String ciudad) {
        super(nombre, apellido, edad, ciudad);
        this.id_docente = Integer.parseInt(JOptionPane.showInputDialog("Digita el ID del profesor: "));
        this.materia = JOptionPane.showInputDialog("Digita la materia que ensenia el docente: ");
        
    }

    public void MostrarDatosProfesor() {
        JOptionPane.showMessageDialog(null, "Querido " + getNombre()+ " "+ getApellido() + " su edad es " + getEdad() + " y reside en la ciudad de " + getCiudad() + "\n"+
                            " su id asignada es " + id_docente + " y la materia que dicta es " + materia);
    }
}
