package datos;

import java.time.LocalDate;

public class Lectura {
	private int idLectura;
	private LocalDate fecha;
	private MedidorBaja medidor;
	private Inspector inspector;
	private int consumo;
	public Lectura(LocalDate fecha, MedidorBaja medidor, Inspector inspector, int consumo) {
		super();
		this.fecha = fecha;
		this.medidor = medidor;
		this.inspector = inspector;
		this.consumo = consumo;
	}
	public Lectura() {}
	public int getIdLectura() {
		return idLectura;
	}
	private void setIdLectura(int idLectura) {
		this.idLectura = idLectura;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public MedidorBaja getMedidor() {
		return medidor;
	}
	public void setMedidor(MedidorBaja medidor) {
		this.medidor = medidor;
	}
	
	public int getConsumo() {
		return consumo;
	}
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	public Inspector getInspector() {
		return inspector;
	}
	public void setInspector(Inspector inspector) {
		this.inspector = inspector;
	}
	@Override
	public String toString() {
		return "Lectura [idLectura=" + idLectura + ", fecha=" + fecha + ", medidor=" + medidor + ", consumo=" + consumo
				+ "]";
	}
	

}
