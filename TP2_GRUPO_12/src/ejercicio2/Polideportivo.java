package ejercicio2;

public class Polideportivo extends Edificio implements IInstalacionDeportiva {

	private String nombre;
	private int TipoDeInstalacion;

	public Polideportivo() {
		
	}
	
	public Polideportivo(String nombre, double superficie, int TipoDeInstalacion) {
		super(superficie);
		this.nombre= nombre;
		this.TipoDeInstalacion=TipoDeInstalacion;
	}

	public void setTipoInstalacion(int tipoInstalacion) {
	    this.TipoDeInstalacion = tipoInstalacion;
	}
	
	public int getTipodeInstalacionDeportiva() {
		return TipoDeInstalacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String toString() {
		return  nombre + ", tipo de instalacion " + TipoDeInstalacion + ", superficie " + getSuperficieEdificio();
	}

	
}
