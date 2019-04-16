package test;

import negocio.ClienteABM;
import datos.Cliente;
import datos.Prestamo;

public class TestTraerClienteYPrestamo {

	public static void main(String[] args) {
		long idCliente = 1;
		ClienteABM abm = ClienteABM.getIntanciaClienteABM();
		
		Cliente c = abm.traerClienteYPrestamos(idCliente);
		System.out.println("\n---> Traer Cliente y Prestamos idCliente=" + idCliente);
		System.out.println("\n" + c);
		
//implementar Si este cliente no tiene prestamos otorgados imprima el mensaje
		
		for (Prestamo p : c.getPrestamos())
			System.out.println("\n" + p);
	}
}
