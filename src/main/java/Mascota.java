public class Mascota {
	private String nombre;
	private String color;
	private String tipo;

	public void comer() {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}