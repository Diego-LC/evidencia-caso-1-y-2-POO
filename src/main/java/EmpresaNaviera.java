import java.util.ArrayList;

public class EmpresaNaviera {
	private String nombre;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}