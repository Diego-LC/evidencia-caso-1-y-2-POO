import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<Persona> hermanos;
	private ArrayList<Persona> amigos;
	private Escuela escuela;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Persona> getHermanos() {
		throw new UnsupportedOperationException();
	}

	public void setHermanos(ArrayList<Persona> hermanos) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Persona> getAmigos() {
		throw new UnsupportedOperationException();
	}

	public void setAmigos(ArrayList<Persona> amigos) {
		throw new UnsupportedOperationException();
	}

	public void irAEscuela() {
		throw new UnsupportedOperationException();
	}
}