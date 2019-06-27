package datos;

import java.time.LocalDate;
import java.util.Set;

public class Factura {
	private LocalDate fecha;
	private long nroCliente;
	private int nroMedidor;
	private Set<ItemFactura> items;
	public Factura() {}
	public Factura(LocalDate fecha, long nroCliente, int nroMedidor) {
		super();
		this.fecha = fecha;
		this.nroCliente = nroCliente;
		this.nroMedidor = nroMedidor;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public long getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(long nroCliente) {
		this.nroCliente = nroCliente;
	}
	public int getNroMedidor() {
		return nroMedidor;
	}
	public void setNroMedidor(int nroMedidor) {
		this.nroMedidor = nroMedidor;
	}
	public Set<ItemFactura> getItems() {
		return items;
	}
	public void setItems(Set<ItemFactura> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Factura [fecha=" + fecha + ", nroCliente=" + nroCliente + ", nroMedidor=" + nroMedidor + ", items="
				+ items + "]";
	}
	
}

