public class Moto {
	private String modelo;
	private Persona dueño;

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void arrancar() {
		throw new UnsupportedOperationException();
	}
}