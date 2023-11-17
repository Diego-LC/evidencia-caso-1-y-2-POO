import java.util.ArrayList;

public class Escuela {
	private String nombre;
	private ArrayList<Persona> alumnos = new ArrayList<Persona>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void estudiar() {
		throw new UnsupportedOperationException();
	}
}