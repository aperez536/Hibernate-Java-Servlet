package test;
import java.util.GregorianCalendar;

import org.hibernate.Session;

import dao.HibernateUtil;
import negocio.ClienteABM;

public class TestAgregarCliente {
	public static void main(String[] args) throws Exception {
		/*
		String apellido="Dominguez";
		String nombre="Juan";
		int documento=35000000;
		GregorianCalendar fechaDeNacimiento=new GregorianCalendar(1995,04,22);
		*/
		Session session = HibernateUtil.getSessionFactory().openSession();
		String apellido="Përez";
		String nombre="Alan";
		int documento=123456789;
		GregorianCalendar fechaDeNacimiento=new GregorianCalendar(1995,04,22);
		ClienteABM abm=new ClienteABM();
		try {
		long ultimoIdCliente = abm.agregar(apellido, nombre, documento,
				fechaDeNacimiento);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.getSessionFactory().close();
		}
	}
}
