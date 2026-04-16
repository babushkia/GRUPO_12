package ejercicio2;

public class EdificioDeOficinas extends Edificio {

	private int NumeroDeOficinas;
	
	public EdificioDeOficinas() {
		
	}
	
	public EdificioDeOficinas(int NumeroDeOficinas, double superficie) {
		super(superficie);
		this.NumeroDeOficinas=NumeroDeOficinas;
	}


	public int getNumeroDeOficinas() {
		return NumeroDeOficinas;
	}

	public void setNumeroDeOficinas(int numeroDeOficinas) {
		NumeroDeOficinas = numeroDeOficinas;
	}
	public String toString() {
		return "Numero de oficinas " + NumeroDeOficinas + ", superficie del edificio " + getSuperficieEdificio();
	}
	
	
	
}
