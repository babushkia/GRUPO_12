package ejercicio1;

public class ExVerificarDNI extends RuntimeException{
	
	public ExVerificarDNI ()
	{
		
	}

	@Override
	public String getMessage() {
		return "El dni debe contener 8 numeros";
	}
}
