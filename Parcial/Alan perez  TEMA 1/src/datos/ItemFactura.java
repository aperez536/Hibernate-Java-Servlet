package datos;

public class ItemFactura {
	private int cantidad;
	private double precio;
	public ItemFactura(int cantidad, double precio) {
		super();
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public ItemFactura() {}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "ItemFactura [cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
}
