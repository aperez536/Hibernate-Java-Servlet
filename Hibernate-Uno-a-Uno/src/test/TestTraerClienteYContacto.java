package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerClienteYContacto {
	public static void main(String[] args) {
		ClienteABM abmCliente = ClienteABM.getIntanciaClienteABM();
		long idCliente = 1;
		Cliente c = abmCliente.traerClienteYContacto(idCliente);
		System.out.println("\ntraer Cliente y contacto\n" + c + "\n" + c.getContacto());
	}
}