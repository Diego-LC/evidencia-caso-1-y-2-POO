import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private EmpresaNaviera empresa;
	private ArrayList<GrupoProyecto> gruposDeProyectos = new ArrayList<GrupoProyecto>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void asignarEmpleados() {
		throw new UnsupportedOperationException();
	}
}