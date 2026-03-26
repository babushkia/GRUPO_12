package dominio;

public class Articulo {
	
	private int id;
	private String name;
	
	//------
	
	public Articulo ()
	{
		id = 0;
		name = "Sin nombre";
	}
	
	public Articulo (String name, int id)
	{
		this.id = id;
		this.name = name;
	}
	
	//------
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//------
	
}
