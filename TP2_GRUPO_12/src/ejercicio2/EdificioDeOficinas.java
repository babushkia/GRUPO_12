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
	
	
	
}
