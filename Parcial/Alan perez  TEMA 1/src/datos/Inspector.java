package datos;

public class Inspector extends Persona {
	private String zona;

	public Inspector(String nombre, String apellido, long dni, String zona) {
		super(nombre, apellido, dni);
		this.zona = zona;
	}
	public Inspector() {}
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	@Override
	public String toString() {
		return super.toString()+"Inspector [zona=" + zona + "]";
	}
	
	
}
