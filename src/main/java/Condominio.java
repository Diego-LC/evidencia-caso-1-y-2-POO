import java.util.ArrayList;

public class Condominio {
	private String nombre;
	private String direccion;
	private ArrayList<Casa> casas = new ArrayList<Casa>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void gestionarCasas() {
		throw new UnsupportedOperationException();
	}
}