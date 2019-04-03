package test;
import java.util.GregorianCalendar;

import dao.HibernateUtil;
import negocio.ClienteABM;


public class TestAgregarCliente {
	public static void main(String[] args) throws Exception {
		
		String apellido="Perez";
		String nombre="Josesito";
		int documento=123;
		GregorianCalendar fechaDeNacimiento=new GregorianCalendar(1998,12,22);
		ClienteABM abm=new ClienteABM();
		long ultimoIdCliente;
		try {
			ultimoIdCliente = abm.agregar(apellido, nombre, documento,
			fechaDeNacimiento);
			System.out.println("Cliente Añadido : "+ultimoIdCliente);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			 HibernateUtil.getSessionFactory().close();
		}
		
	}
}
