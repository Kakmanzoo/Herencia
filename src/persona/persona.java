package persona;

import javax.swing.JOptionPane;

public class persona {
    //Atributos
    private String nombre, apellido, ciudad;
    private int edad;

    public persona (String nombre, String apellido, int edad, String ciudad) {
        this.nombre = JOptionPane.showInputDialog("Digita tu nombre: ");;
        this.apellido = JOptionPane.showInputDialog("Digita tu apellido: ");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Digita tu edad: "));
        this.ciudad = JOptionPane.showInputDialog("Digita la ciudad donde reside: ");
    }
    //Metodos accesores
    //Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }
}
