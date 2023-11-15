import java.util.ArrayList;

public class Casa {
	private String ubicacion;
	private int numero;
	private Condominio condominio;
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void habitar() {
		throw new UnsupportedOperationException();
	}
}