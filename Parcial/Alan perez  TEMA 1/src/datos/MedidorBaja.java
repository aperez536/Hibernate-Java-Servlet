package datos;

public class MedidorBaja {
	private int idMedidorBaja;
	private Cliente cliente;
	private String nroSerie;
	private String domicilio;
	public MedidorBaja(Cliente cliente, String nroSerie, String domicilio) {
		super();
		this.cliente = cliente;
		this.nroSerie = nroSerie;
		this.domicilio = domicilio;
	}
	public MedidorBaja() {}
	public int getIdMedidorBaja() {
		return idMedidorBaja;
	}
	private void setIdMedidorBaja(int idMedidorBaja) {
		this.idMedidorBaja = idMedidorBaja;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getNroSerie() {
		return nroSerie;
	}
	public void setNroSerie(String nroSerie) {
		this.nroSerie = nroSerie;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	@Override
	public String toString() {
		return "MedidorBaja [idMedidorBaja=" + idMedidorBaja + ", cliente=" + cliente + ", nroSerie=" + nroSerie
				+ ", domicilio=" + domicilio + "]";
	}
	
	

}
