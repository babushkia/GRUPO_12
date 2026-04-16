package ejercicio2;

public abstract class Edificio {

	private double superficie;
	
	public Edificio(){
		
	}
	
	public Edificio(double s) {
		superficie=s;
	}

	public double getSuperficieEdificio() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
}