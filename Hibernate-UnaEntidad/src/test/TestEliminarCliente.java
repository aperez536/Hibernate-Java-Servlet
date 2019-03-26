package test;
import negocio.ClienteABM;
import java.util.GregorianCalendar;

import org.hibernate.Session;

import dao.HibernateUtil;
import negocio.ClienteABM;

public class TestEliminarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ClienteABM a = new ClienteABM();
	Session session = HibernateUtil.getSessionFactory().openSession();

	
	try {
	a.eliminar(2);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	} finally {
		session.getSessionFactory().close();
	}
	}

}
