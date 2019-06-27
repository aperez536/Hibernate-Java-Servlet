package datos;

public class Cliente extends Persona{

	private long nroCliente;

	public Cliente(String nombre, String apellido, long dni, long nroCliente) {
		super(nombre, apellido, dni);
		this.nroCliente = nroCliente;
	}
	public Cliente() {}
	public long getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(long nroCliente) {
		this.nroCliente = nroCliente;
	}
	@Override
	public String toString() {
		return super.toString()+"Cliente [nroCliente=" + nroCliente + "]";
	}
	
}
