import java.util.ArrayList;

public class Empleado extends Persona {
	private Departamento departamento;
	private GrupoProyecto grupoDeProyecto;
	private EmpresaNaviera empresa;
	private ArrayList<Empleado> colegas = new ArrayList<Empleado>();
	private GrupoProyecto grupoProyecto;

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public GrupoProyecto getGrupoDeProyecto() {
		return this.grupoDeProyecto;
	}

	public void setGrupoDeProyecto(GrupoProyecto grupoDeProyecto) {
		this.grupoDeProyecto = grupoDeProyecto;
	}
}